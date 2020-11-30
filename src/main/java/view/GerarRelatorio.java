/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.entity.Evento;
import model.entity.Usuario;
import model.service.EventoService;
import model.service.UsuarioService;

/**
 *
 * @author eduardoSena
 */
public class GerarRelatorio extends javax.swing.JInternalFrame {

    EventoService eventoService = new EventoService();
    UsuarioService usuarioService = new UsuarioService();
    
    public GerarRelatorio() {
        initComponents();
        
        try { //Importando dados de eventos
            List<Evento> eventos = eventoService.importarArquivo("src/main/java/files/eventos.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try { //Importando dados de usuarios do arquivo de usuarios
            List<Usuario> usuarios = usuarioService.importarArquivo("src/main/java/files/usuarios.txt");
            
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

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFileUser = new javax.swing.JTextField();
        txtNameUser = new javax.swing.JTextField();
        txtNameEvt = new javax.swing.JTextField();
        btnFIleUser = new javax.swing.JButton();
        btnRelatorioUser = new javax.swing.JButton();
        txtFileEvt = new javax.swing.JTextField();
        btnFileEvt = new javax.swing.JButton();
        btnRelatorioEvt = new javax.swing.JButton();

        jButton2.setText("Gerar Relatório");

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(736, 515));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Gerar Relatórios");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Usuários");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Eventos");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Caminho");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nome do Arquivo");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Caminho");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nome do Arquivo");

        txtFileUser.setBackground(new java.awt.Color(0, 0, 0));
        txtFileUser.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtFileUser.setForeground(new java.awt.Color(255, 255, 255));

        txtNameUser.setBackground(new java.awt.Color(0, 0, 0));
        txtNameUser.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtNameUser.setForeground(new java.awt.Color(255, 255, 255));

        txtNameEvt.setBackground(new java.awt.Color(0, 0, 0));
        txtNameEvt.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtNameEvt.setForeground(new java.awt.Color(255, 255, 255));

        btnFIleUser.setBackground(new java.awt.Color(0, 0, 0));
        btnFIleUser.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnFIleUser.setForeground(new java.awt.Color(255, 255, 255));
        btnFIleUser.setText("Arquivo");
        btnFIleUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFIleUserActionPerformed(evt);
            }
        });

        btnRelatorioUser.setBackground(new java.awt.Color(0, 0, 0));
        btnRelatorioUser.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnRelatorioUser.setForeground(new java.awt.Color(255, 255, 255));
        btnRelatorioUser.setText("Gerar Relatório");
        btnRelatorioUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioUserActionPerformed(evt);
            }
        });

        txtFileEvt.setBackground(new java.awt.Color(0, 0, 0));
        txtFileEvt.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtFileEvt.setForeground(new java.awt.Color(255, 255, 255));

        btnFileEvt.setBackground(new java.awt.Color(0, 0, 0));
        btnFileEvt.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnFileEvt.setForeground(new java.awt.Color(255, 255, 255));
        btnFileEvt.setText("Arquivo");
        btnFileEvt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileEvtActionPerformed(evt);
            }
        });

        btnRelatorioEvt.setBackground(new java.awt.Color(0, 0, 0));
        btnRelatorioEvt.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnRelatorioEvt.setForeground(new java.awt.Color(255, 255, 255));
        btnRelatorioEvt.setText("Gerar Relatório");
        btnRelatorioEvt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioEvtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRelatorioEvt))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel1)
                        .addGap(0, 203, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRelatorioUser))
                            .addComponent(txtNameEvt)
                            .addComponent(txtNameUser, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFileEvt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFileEvt))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFileUser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFIleUser)))))
                .addGap(98, 98, 98))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFileUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFIleUser, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(11, 11, 11)
                .addComponent(txtNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRelatorioUser)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(21, 21, 21)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFileEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtFileEvt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNameEvt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRelatorioEvt)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFIleUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFIleUserActionPerformed

        JFileChooser fileChooseUser = new JFileChooser();
        fileChooseUser.setDialogTitle("Relatório de usuarios");
        fileChooseUser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int retorno = fileChooseUser.showOpenDialog(this);
        
        if (retorno == JFileChooser.APPROVE_OPTION) {
            File file = fileChooseUser.getSelectedFile();
            txtFileUser.setText(file.getPath());
        }
        
    }//GEN-LAST:event_btnFIleUserActionPerformed

    private void btnFileEvtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileEvtActionPerformed
   
        JFileChooser fileChooseEvt = new JFileChooser();
        fileChooseEvt.setDialogTitle("Relatório de eventos");
        fileChooseEvt.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int retorno = fileChooseEvt.showOpenDialog(this);
        
        if (retorno == JFileChooser.APPROVE_OPTION) {
            File file = fileChooseEvt.getSelectedFile();
            txtFileEvt.setText(file.getPath());
        }
        
    }//GEN-LAST:event_btnFileEvtActionPerformed

    private void btnRelatorioUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioUserActionPerformed
        List<Usuario> usuarios = usuarioService.listarUsuario();
        
        try {
            usuarioService.gerarRelatorio(usuarios, txtFileUser.getText(), txtNameUser.getText());
        } catch (IOException ex) {
            Logger.getLogger(GerarRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null, "Relatório de usuários gerado com sucesso!");
        
        txtFileUser.setText("");
        txtNameUser.setText("");
    }//GEN-LAST:event_btnRelatorioUserActionPerformed

    private void btnRelatorioEvtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioEvtActionPerformed
        List<Evento> eventos = eventoService.listarEvento();
        
        try {
            eventoService.gerarRelatorio(eventos, txtFileEvt.getText(), txtNameEvt.getText());
        } catch (IOException ex) {
            Logger.getLogger(GerarRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null, "Relatório de eventos gerado com sucesso!");
        
        txtFileEvt.setText("");
        txtNameEvt.setText("");
    }//GEN-LAST:event_btnRelatorioEvtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFIleUser;
    private javax.swing.JButton btnFileEvt;
    private javax.swing.JButton btnRelatorioEvt;
    private javax.swing.JButton btnRelatorioUser;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtFileEvt;
    private javax.swing.JTextField txtFileUser;
    private javax.swing.JTextField txtNameEvt;
    private javax.swing.JTextField txtNameUser;
    // End of variables declaration//GEN-END:variables
}
