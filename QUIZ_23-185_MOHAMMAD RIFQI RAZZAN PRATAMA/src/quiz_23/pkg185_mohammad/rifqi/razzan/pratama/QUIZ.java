/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quiz_23.pkg185_mohammad.rifqi.razzan.pratama;
import javax.swing.JOptionPane;
/**
 *
 * @author ZAN
 */
public class QUIZ extends javax.swing.JFrame {

    /**
     * Creates new form QUIZ
     */
    public QUIZ() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pTop = new javax.swing.JPanel();
        lTitle = new javax.swing.JLabel();
        pForm = new javax.swing.JPanel();
        lNama = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        lNilai = new javax.swing.JLabel();
        tfNilai = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfDisplay = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pTop.setBackground(new java.awt.Color(30, 145, 189));
        pTop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 6));

        lTitle.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        lTitle.setText("PENILAIAN MAHASISWA");

        javax.swing.GroupLayout pTopLayout = new javax.swing.GroupLayout(pTop);
        pTop.setLayout(pTopLayout);
        pTopLayout.setHorizontalGroup(
            pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTopLayout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addComponent(lTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        pTopLayout.setVerticalGroup(
            pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTopLayout.createSequentialGroup()
                .addComponent(lTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(pTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        pForm.setBackground(new java.awt.Color(30, 214, 204));
        pForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 6));

        lNama.setFont(new java.awt.Font("The Texterius", 0, 18)); // NOI18N
        lNama.setForeground(new java.awt.Color(0, 0, 0));
        lNama.setText("Nama Mahasiswa :");

        lNilai.setFont(new java.awt.Font("The Texterius", 0, 18)); // NOI18N
        lNilai.setForeground(new java.awt.Color(0, 0, 0));
        lNilai.setText("Nilai                      :");

        btnSave.setText("SIMPAN NILAI");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pFormLayout = new javax.swing.GroupLayout(pForm);
        pForm.setLayout(pFormLayout);
        pFormLayout.setHorizontalGroup(
            pFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFormLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(pFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pFormLayout.createSequentialGroup()
                        .addGroup(pFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lNilai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNama, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(tfNilai))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        pFormLayout.setVerticalGroup(
            pFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFormLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(pFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNama)
                    .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNilai)
                    .addComponent(tfNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(pForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 661, 250));

        jPanel1.setBackground(new java.awt.Color(30, 228, 183));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 6));

        jLabel1.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("RESULT");

        tfDisplay.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(tfDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 660, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String tfNama = tfDisplay.getText();
        int tfNilai = tfDisplay.Integer.valueOf(tfNilai);
        
        
        if(tfNilai <=100){
            
        }
        
        
        
        if(tfNama.length()==0){
            JOptionPane.showMessageDialog(this,"Nama mahasiswa tidak boleh kosong","DISCLAIMER", JOptionPane.WARNING_MESSAGE);
        }else if(tfNilai%1 === 0){
            JOptionPane.showMessageDialog(this,"Nilai harus berupa angka", "DISCLAIMER", JOptionPane.WARNING_MESSAGE);
        }else{
            System.out.println("");
        }
        
                
        
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(QUIZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QUIZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QUIZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QUIZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QUIZ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lNama;
    private javax.swing.JLabel lNilai;
    private javax.swing.JLabel lTitle;
    private javax.swing.JPanel pForm;
    private javax.swing.JPanel pTop;
    private javax.swing.JTextField tfDisplay;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNilai;
    // End of variables declaration//GEN-END:variables
}
