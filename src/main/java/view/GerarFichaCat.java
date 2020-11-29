package view;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.entity.FichaCatalografica;
import model.service.FichaCatalograficaService;

/**
 *
 * @author eduardoSena
 */

public class GerarFichaCat extends javax.swing.JInternalFrame {

    FichaCatalograficaService fichasService = new FichaCatalograficaService();
    
    public GerarFichaCat() {
        initComponents();
        
        try { //Importando dados das fichas catalograficas
            List<FichaCatalografica> fichasCat = fichasService.importarArquivo("src/main/java/files/fichasCat.txt");            
        } catch (Exception e) {
                e.printStackTrace();
        }
        
        List<FichaCatalografica> fichasCat = fichasService.listarFichas();
        long id = fichasCat.get(fichasCat.size()-1).getId() + 1;
        txtID.setText(Long.toString(id));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        txtPaginas = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtPalavraChave1 = new javax.swing.JTextField();
        txtPalavraChave2 = new javax.swing.JTextField();
        txtPalavraChave3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtID = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JFormattedTextField();

        jTextField3.setText("jTextField3");

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(736, 515));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Gerar Ficha Catalográfica");

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Titulo");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Ano");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ISBN");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Palavras Chave");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Paginas");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Autor");

        txtAutor.setBackground(new java.awt.Color(0, 0, 0));
        txtAutor.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtAutor.setForeground(new java.awt.Color(255, 255, 255));

        txtPaginas.setBackground(new java.awt.Color(0, 0, 0));
        txtPaginas.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtPaginas.setForeground(new java.awt.Color(255, 255, 255));

        txtAno.setBackground(new java.awt.Color(0, 0, 0));
        txtAno.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtAno.setForeground(new java.awt.Color(255, 255, 255));

        txtTitulo.setBackground(new java.awt.Color(0, 0, 0));
        txtTitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));

        txtPalavraChave1.setBackground(new java.awt.Color(0, 0, 0));
        txtPalavraChave1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtPalavraChave1.setForeground(new java.awt.Color(255, 255, 255));

        txtPalavraChave2.setBackground(new java.awt.Color(0, 0, 0));
        txtPalavraChave2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtPalavraChave2.setForeground(new java.awt.Color(255, 255, 255));

        txtPalavraChave3.setBackground(new java.awt.Color(0, 0, 0));
        txtPalavraChave3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtPalavraChave3.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Voltar");

        txtID.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txtID.setForeground(new java.awt.Color(0, 0, 0));

        txtIsbn.setBackground(new java.awt.Color(0, 0, 0));
        txtIsbn.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtIsbn.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-#####-##-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIsbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIsbnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(223, 223, 223))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTitulo)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtPaginas)
                                                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel4))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtAno, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                            .addComponent(txtIsbn)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPalavraChave2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPalavraChave1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPalavraChave3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPalavraChave1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPalavraChave2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPalavraChave3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(56, 56, 56))
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

    private void txtIsbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIsbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIsbnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        List<FichaCatalografica> fichasCat = fichasService.listarFichas();
        
        long id = fichasCat.get(fichasCat.size()-1).getId() + 1;
        String titulo = fichasService.fichaTitle(txtTitulo.getText());
        String autor = fichasService.fichaTitle(txtAutor.getText());
        String ano = fichasService.fichaTitle(txtAno.getText());
        int qtdPaginas = Integer.parseInt(txtPaginas.getText());
        String isbn = txtIsbn.getText();
        String palavraChave1 = fichasService.fichaTitle(txtPalavraChave1.getText());
        String palavraChave2 = fichasService.fichaTitle(txtPalavraChave2.getText());
        String palavraChave3 = fichasService.fichaTitle(txtPalavraChave3.getText());
        String palavraChave = palavraChave1 +"-"+ palavraChave2 +"-"+ palavraChave3;
        
        fichasService.cadastrarFicha(id, titulo, autor, ano, qtdPaginas, isbn, palavraChave);
        try {
            fichasService.exportarFichas(fichasCat);
        } catch (IOException ex) {
            Logger.getLogger(GerarFichaCat.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        long id2 = fichasCat.get(fichasCat.size()-1).getId() + 1;
        txtID.setText(Long.toString(id2));
        txtTitulo.setText("");
        txtAutor.setText("");
        txtAno.setText("");
        txtPaginas.setText("");
        txtIsbn.setText("");
        txtPalavraChave1.setText("");
        txtPalavraChave2.setText("");
        txtPalavraChave3.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JLabel txtID;
    private javax.swing.JFormattedTextField txtIsbn;
    private javax.swing.JTextField txtPaginas;
    private javax.swing.JTextField txtPalavraChave1;
    private javax.swing.JTextField txtPalavraChave2;
    private javax.swing.JTextField txtPalavraChave3;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}