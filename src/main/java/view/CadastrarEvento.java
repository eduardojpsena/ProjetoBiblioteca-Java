
package view;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.entity.Evento;
import model.entity.Espaco;
import model.service.EspacoService;
import model.service.EventoService;

/**
 *
 * @author eduardoSena
 */
public class CadastrarEvento extends javax.swing.JInternalFrame {

    EventoService eventoService = new EventoService();
    EspacoService espacoService = new EspacoService();
    
    public CadastrarEvento() {
        initComponents();
        
        try { //Importando dados de eventos
            List<Evento> eventos = eventoService.importarArquivo("src/main/java/files/eventos.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try { //Importando dados de espaços
            List<Espaco> espacos = espacoService.importarArquivo("src/main/java/files/espaco.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        List<Evento> eventos = eventoService.listarEvento();
        List<Espaco> espacos = espacoService.listarEspaco();
        long id = eventos.get(eventos.size()-1).getId() + 1;
        long id2 = espacos.get(espacos.size()-1).getId() + 1;
        txtID1.setText(Long.toString(id2));
        txtID2.setText(Long.toString(id));
        
        DefaultListModel dlm = new DefaultListModel();
        for (Espaco espaco : espacos) {
            dlm.addElement("ID: " + espaco.getId() + " /Nome: " + espaco.getNomeLocal() 
                    + " /Capacidade: " + espaco.getCapacidade());
        }
        txtList.setModel(dlm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNomeEspaço = new javax.swing.JTextField();
        txtCapacidade = new javax.swing.JTextField();
        txtNomeEvento = new javax.swing.JTextField();
        txtData = new javax.swing.JFormattedTextField();
        txtHora = new javax.swing.JFormattedTextField();
        txtID1 = new javax.swing.JLabel();
        txtID2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtList = new javax.swing.JList<>();
        btnGerarEspaço = new javax.swing.JButton();
        btnGerarEvento = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(736, 515));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cadastro de Eventos");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Espaço");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Evento");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ID");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nome");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Capacidade");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ID");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nome");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Data");

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Hora");

        txtNomeEspaço.setBackground(new java.awt.Color(0, 0, 0));
        txtNomeEspaço.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtNomeEspaço.setForeground(new java.awt.Color(255, 255, 255));

        txtCapacidade.setBackground(new java.awt.Color(0, 0, 0));
        txtCapacidade.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtCapacidade.setForeground(new java.awt.Color(255, 255, 255));

        txtNomeEvento.setBackground(new java.awt.Color(0, 0, 0));
        txtNomeEvento.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtNomeEvento.setForeground(new java.awt.Color(255, 255, 255));
        txtNomeEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeEventoActionPerformed(evt);
            }
        });

        txtData.setBackground(new java.awt.Color(0, 0, 0));
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtHora.setBackground(new java.awt.Color(0, 0, 0));
        txtHora.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtID1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txtID1.setForeground(new java.awt.Color(0, 0, 0));

        txtID2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txtID2.setForeground(new java.awt.Color(0, 0, 0));

        txtList.setBackground(new java.awt.Color(0, 0, 0));
        txtList.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtList.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(txtList);

        btnGerarEspaço.setBackground(new java.awt.Color(0, 0, 0));
        btnGerarEspaço.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        btnGerarEspaço.setForeground(new java.awt.Color(255, 255, 255));
        btnGerarEspaço.setText("Gerar Espaço");
        btnGerarEspaço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarEspaçoActionPerformed(evt);
            }
        });

        btnGerarEvento.setBackground(new java.awt.Color(0, 0, 0));
        btnGerarEvento.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        btnGerarEvento.setForeground(new java.awt.Color(255, 255, 255));
        btnGerarEvento.setText("Gerar Evento");
        btnGerarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarEventoActionPerformed(evt);
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
                        .addComponent(btnGerarEspaço))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtID1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeEspaço)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCapacidade))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jScrollPane1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtID2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNomeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnGerarEvento))
                                .addGap(0, 1, Short.MAX_VALUE)))))
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtNomeEspaço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGerarEspaço)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(txtNomeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtID2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(btnGerarEvento)
                .addContainerGap(78, Short.MAX_VALUE))
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

    private void txtNomeEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeEventoActionPerformed

    private void btnGerarEspaçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarEspaçoActionPerformed
        
        List<Espaco> espacos = espacoService.listarEspaco();
        
        DefaultListModel dlm = new DefaultListModel();

        long id = espacos.get(espacos.size()-1).getId() + 1;
        String nome = txtNomeEspaço.getText();
        int capacidade = Integer.parseInt(txtCapacidade.getText());
        espacoService.cadastrarEspaco(id, nome, capacidade);
        
        for (Espaco espaco : espacos) {
            
            dlm.addElement("ID: " + espaco.getId() + " /Nome: " + espaco.getNomeLocal() 
                    + " /Capacidade: " + espaco.getCapacidade());
        }
        txtList.setModel(dlm);
        
        try {
            espacoService.exportarEspaco(espacos);
        } catch (IOException ex) {
            Logger.getLogger(CadastrarEvento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        long id2 = espacos.get(espacos.size()-1).getId() + 1;
        txtID1.setText(Long.toString(id2));
        txtNomeEspaço.setText("");
        txtCapacidade.setText("");
    }//GEN-LAST:event_btnGerarEspaçoActionPerformed

    private void btnGerarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarEventoActionPerformed
        
        List<Espaco> espacos = espacoService.listarEspaco();
        List<Evento> eventos = eventoService.listarEvento();
        
        //Separando a String da area de espaços selecionada em partes para construir o objeto Espaco
        String [] sep = txtList.getSelectedValue().split(" /");
        String [] sep1 = sep[0].split(": ");
        String [] sep2 = sep[1].split(": ");
        String [] sep3 = sep[2].split(": ");
        
        //Construção do objeto Espaco
        long id = Long.parseLong(sep1[1]);
        String nomeEspaco = sep2[1];
        int capacidade = Integer.parseInt(sep3[1]);
        Espaco espaco = new Espaco(id, nomeEspaco, capacidade);
        //Construção do objeto Evento
        long id2 = eventos.get(eventos.size()-1).getId() + 1;
        String nomeEvento = txtNomeEvento.getText();
        String data = txtData.getText();
        String hora = txtHora.getText();
        eventoService.cadastrarEvento(id2, nomeEvento, espaco, data, hora);
        try {
            eventoService.exportarEvento(eventos);
        } catch (IOException ex) {
            Logger.getLogger(CadastrarEvento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null, "Evento " + nomeEvento + " gerado com sucesso!");
        
        long id3 = eventos.get(eventos.size()-1).getId() + 1;
        txtID2.setText(Long.toString(id3));
        txtNomeEvento.setText("");
        txtData.setText("");
        txtHora.setText("");
    }//GEN-LAST:event_btnGerarEventoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerarEspaço;
    private javax.swing.JButton btnGerarEvento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCapacidade;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JFormattedTextField txtHora;
    private javax.swing.JLabel txtID1;
    private javax.swing.JLabel txtID2;
    private javax.swing.JList<String> txtList;
    private javax.swing.JTextField txtNomeEspaço;
    private javax.swing.JTextField txtNomeEvento;
    // End of variables declaration//GEN-END:variables
}
