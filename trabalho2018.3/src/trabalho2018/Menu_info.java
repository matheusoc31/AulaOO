/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho2018;

/**
 *
 * @author Home
 */
public class Menu_info extends javax.swing.JFrame {

    /** Creates new form Menu_info */
    public Menu_info() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_info = new javax.swing.JLabel();
        txt_nome = new javax.swing.JLabel();
        txt_desc1 = new javax.swing.JLabel();
        txt_desc2 = new javax.swing.JLabel();
        txt_desc3 = new javax.swing.JLabel();
        txt_matricula = new javax.swing.JLabel();
        txt_materia = new javax.swing.JLabel();
        bt_voltar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        txt_info.setBackground(new java.awt.Color(255, 0, 0));
        txt_info.setText("INFORMAÇÃO:");

        txt_nome.setText("Feito por Matheus de Oliveira Carvalho");

        txt_desc1.setText(" Esse jogo é uma simulação das batalhas de ginásio de Pokemon. Nele você escolhe 2");

        txt_desc2.setText("pokemons e desafia os 8 líderes de ginásio da região de Kanto. A cada vitória você ");

        txt_desc3.setText("ganha uma insígnia e ao juntar as 8 você ganha o jogo. DIVIRTA-SE!!");

        txt_matricula.setText("Matricula: 201665568C");

        txt_materia.setText("Orientacão a Objetos 2018.3 -- UFJF");

        bt_voltar.setBackground(new java.awt.Color(204, 204, 204));
        bt_voltar.setForeground(new java.awt.Color(255, 0, 0));
        bt_voltar.setText("VOLTAR");
        bt_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pokébola1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_info)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_desc3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txt_desc1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                            .addComponent(txt_desc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nome)
                            .addComponent(txt_matricula)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(txt_materia)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_info)
                    .addComponent(txt_desc1))
                .addGap(0, 0, 0)
                .addComponent(txt_desc2)
                .addComponent(txt_desc3)
                .addGap(25, 25, 25)
                .addComponent(txt_nome)
                .addGap(10, 10, 10)
                .addComponent(txt_matricula)
                .addGap(10, 10, 10)
                .addComponent(txt_materia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(bt_voltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarActionPerformed
        Menu obj = new Menu();
        obj.setVisible(true);
        dispose();         
    }//GEN-LAST:event_bt_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_voltar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel txt_desc1;
    private javax.swing.JLabel txt_desc2;
    private javax.swing.JLabel txt_desc3;
    private javax.swing.JLabel txt_info;
    private javax.swing.JLabel txt_materia;
    private javax.swing.JLabel txt_matricula;
    private javax.swing.JLabel txt_nome;
    // End of variables declaration//GEN-END:variables

}