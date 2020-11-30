/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.util.List;
import javax.swing.JOptionPane;
import model.entity.Livro;
import model.entity.SalaEstudo;
import model.service.LivroService;
import model.service.SalaEstudoService;

import view.BuscaLivro;

/**
 *
 * @author eduardoSena
 */
public class TelaMainUsuario extends javax.swing.JFrame {
    SalaEstudoService salaService = new SalaEstudoService();
    LivroService livroService = new LivroService();
    
    public TelaMainUsuario() {
        initComponents();
        lbIcon.setIcon(new javax.swing.ImageIcon("src/main/java/images/ImageBack.jpg"));
        
        btnVisualizarFicha.setText("<html>Visualizar Ficha<br>  Catalografica</html>");
        
        try { //Importando dados do arquivo contendo as salas de estudos cadastradas
            List<SalaEstudo> salasEstudo = salaService.importarArquivo("src/main/java/files/salasEstudo.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
                
        try { //Importando dados do arquivo contendo os livros cadastradas
            List<Livro> livros = livroService.importarArquivo("src/main/java/files/livros.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        imgMenu = new javax.swing.JPanel();
        btnBuscarLivro = new javax.swing.JButton();
        btnReservarLivro = new javax.swing.JButton();
        btnVisualizarFicha = new javax.swing.JButton();
        btnReservarSala = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        lbIcon = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Morais Library");
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        imgMenu.setBackground(new java.awt.Color(102, 102, 102));
        imgMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), null, null));
        imgMenu.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                imgMenuAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        btnBuscarLivro.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        btnBuscarLivro.setText("Buscar  Livro");
        btnBuscarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLivroActionPerformed(evt);
            }
        });

        btnReservarLivro.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        btnReservarLivro.setText("Reservar Livro");
        btnReservarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarLivroActionPerformed(evt);
            }
        });

        btnVisualizarFicha.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        btnVisualizarFicha.setText("Visualizar Ficha");
        btnVisualizarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarFichaActionPerformed(evt);
            }
        });

        btnReservarSala.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        btnReservarSala.setText("Reservar Sala");
        btnReservarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarSalaActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout imgMenuLayout = new javax.swing.GroupLayout(imgMenu);
        imgMenu.setLayout(imgMenuLayout);
        imgMenuLayout.setHorizontalGroup(
            imgMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imgMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(imgMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReservarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVisualizarFicha, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(btnReservarSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        imgMenuLayout.setVerticalGroup(
            imgMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imgMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReservarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVisualizarFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReservarSala, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));

        jDesktopPane1.setLayer(lbIcon, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(imgMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addComponent(imgMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLivroActionPerformed
        
        BuscaLivro telaBuscaLivro = new BuscaLivro();
        jDesktopPane1.add(telaBuscaLivro);
        telaBuscaLivro.setVisible(true);
    }//GEN-LAST:event_btnBuscarLivroActionPerformed

    private void btnVisualizarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarFichaActionPerformed
        
        VisualizarFichaCat telaVisualizarFicha = new VisualizarFichaCat();
        jDesktopPane1.add(telaVisualizarFicha);
        telaVisualizarFicha.setVisible(true);
    }//GEN-LAST:event_btnVisualizarFichaActionPerformed

    private void imgMenuAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_imgMenuAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_imgMenuAncestorAdded

    private void btnReservarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarLivroActionPerformed
        
        ReservarLivro telaReservarLivro = new ReservarLivro();
        jDesktopPane1.add(telaReservarLivro);
        telaReservarLivro.setVisible(true);
    }//GEN-LAST:event_btnReservarLivroActionPerformed

    private void btnReservarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarSalaActionPerformed
        
        ReservarSalas telaReservarSala = new ReservarSalas();
        jDesktopPane1.add(telaReservarSala);
        telaReservarSala.setVisible(true);
        
    }//GEN-LAST:event_btnReservarSalaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Volte Sempre!");
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaMainUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMainUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMainUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMainUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMainUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarLivro;
    private javax.swing.JButton btnReservarLivro;
    private javax.swing.JButton btnReservarSala;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVisualizarFicha;
    private javax.swing.JPanel imgMenu;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbIcon;
    // End of variables declaration//GEN-END:variables
}
