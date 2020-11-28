/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import model.entity.Livro;
import model.entity.Usuario;
import model.service.LivroService;
import model.service.UsuarioService;

/**
 *
 * @author eduardoSena
 */
public class ReservarLivro extends javax.swing.JInternalFrame {
    
    LivroService livroService = new LivroService();
    UsuarioService usuarioService = new UsuarioService();
    
    public ReservarLivro() {
        initComponents();
        
        try { //Importando dados do arquivo contendo os livros cadastradas
            List<Livro> livros = livroService.importarArquivo("src/main/java/files/livros.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
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

        jLabel1 = new javax.swing.JLabel();
        jpReservarLivro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        btnReservar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Buscar Livro");

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(736, 515));

        jpReservarLivro.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Reservar Livro");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Titulo");

        txtTitulo.setBackground(new java.awt.Color(0, 0, 0));
        txtTitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Usuario");

        txtUsuario.setBackground(new java.awt.Color(0, 0, 0));
        txtUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));

        btnVoltar.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        btnVoltar.setText("Voltar");

        btnReservar.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        btnReservar.setText("Reservar");
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });

        txtArea.setBackground(new java.awt.Color(0, 0, 0));
        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        txtArea.setForeground(new java.awt.Color(255, 255, 255));
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        javax.swing.GroupLayout jpReservarLivroLayout = new javax.swing.GroupLayout(jpReservarLivro);
        jpReservarLivro.setLayout(jpReservarLivroLayout);
        jpReservarLivroLayout.setHorizontalGroup(
            jpReservarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpReservarLivroLayout.createSequentialGroup()
                .addContainerGap(194, Short.MAX_VALUE)
                .addGroup(jpReservarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpReservarLivroLayout.createSequentialGroup()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                        .addComponent(btnReservar))
                    .addComponent(jLabel3)
                    .addComponent(txtUsuario)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpReservarLivroLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel2))
                    .addComponent(txtTitulo))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jpReservarLivroLayout.setVerticalGroup(
            jpReservarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpReservarLivroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpReservarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReservar)
                    .addComponent(btnVoltar))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpReservarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpReservarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed

        List<Livro> livros = livroService.listarLivro();
        List<Usuario> usuarios = usuarioService.listarUsuario();
        String nomeLivro = livroService.nomeTitle(txtTitulo.getText());
        for (Livro livro : livros) {
            if (nomeLivro.equals(livro.getTitulo())){
                if (livro.getQuantidade() <= 1){
                    txtArea.setText("Livro " + livro.getTitulo() + " não pode ser reservado");
                    break;
                }
                for (Usuario usuario : usuarios) {
                    if (usuario.getLogin().equals(txtUsuario.getText()) && usuario.getTipo().equals("Interno")){
                        livroService.alugarLivro(livro.getTitulo());
                        txtArea.setText("•      Reservado com sucesso      •"
                                + "\n- Livro: " + livro.getTitulo()
                                + "\n- Aluno: " + usuario.getNome());
                        break;
                    }
                    if (usuario.getLogin().equals(txtUsuario.getText()) && usuario.getTipo().equals("Professor")){
                        livroService.alugarLivro(livro.getTitulo());
                        txtArea.setText("•      Reservado com sucesso      •"
                                + "\n- Livro: " + livro.getTitulo()
                                + "\n- Professor: " + usuario.getNome());
                        break;
                    } 
                    if (usuario.getLogin().equals(txtUsuario.getText()) && usuario.getTipo().equals("Externo")){
                        livroService.alugarLivro(livro.getTitulo());
                        txtArea.setText("•      Reservado com sucesso      •"
                                + "\n- Livro: " + livro.getTitulo()
                                + "\n- Usuário externo: " + usuario.getNome());
                        break;
                    } 
                    if (usuario.getLogin().equals(txtUsuario.getText()) == false){
                        txtArea.setText("Usuario inválido");
                        
                    }
                }
                break;
            } else if (nomeLivro.equals(livro.getTitulo()) == false){
                txtArea.setText("Livro não encontrado");
 
            }
        }
        txtUsuario.setText("");
        txtTitulo.setText("");
       
    }//GEN-LAST:event_btnReservarActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReservar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpReservarLivro;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
