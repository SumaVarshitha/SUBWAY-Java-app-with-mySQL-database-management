/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kartiks.ip.project;

/**
 *
 * @author KARTIK NIGHANIA
 */
public class terms_and_conditions extends javax.swing.JFrame {

    /**
     * Creates new form terms_and_conditions
     */
    public terms_and_conditions() {
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

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        cb = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        next = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("\n\nAttention: Please Read These TCarefully Before Using This  software.\n\n By Using This  software, Including Any\n Services Provided On Or Through This\n  software (The \"software\"), You Indicate\n That You Accept These Terms. If You\n Do Not Accept These Terms, Do Not\n Use This software.\n\nsoftware CONTENT\nAll material on the software including,\n but not limited to, pictures, illustrations,\n designs, icons, text, audio clips, and video \nclips (collectively, the \"Content\") and all \nintellectual property rights therein, are owned,\n operated, controlled, or licensed by Doctor's\n Associates Inc. (\"DAI\") and/or SFAFT BV or \nother individuals or organizations and are\n protected by worldwide copyright laws. You may\n use software Content for your personal use for\n non-commercial purposes but no modification or\n further reproduction of content is permitted. \nThe software Content may not otherwise be copied,\n downloaded, uploaded, reproduced, reposted, \ntransmitted, deleted, modified, republished, \nretransmitted, reused, displayed, distributed,\n used outside the scope of normal  browsing or \nused to create derivative works or performances\n without the express written permission of DAI \nor the copyright owners. All other rights reserved.\nNames, trademarks, service marks, trade names,\n trade dress, logos and products appearing on \nthis software are protected in the United States\n and internationally and may not be used for \nadvertising or publicity purposes, or to indicate\n any affiliation with or endorsement by DAI\n and/or their respective owners, except with the\n express written permission of DAI and/or those\n respective owners. Nothing contained herein shall\n be construed as conferring by implication, \nestoppel or otherwise any patent or trademark of\n DAI or any third party. Except as expressly \nprovided above, nothing contained herein shall\n be construed as conferring any license or right \nunder any DAI copyright or trademark. Other \nproduct, service and company names mentioned \non the software are for identification purposes\n only and may be trademarks of their respective owners.\n\nYou are solely responsible for all content \nincluding, but not limited to text, photographs,\n caricatures, illustrations, designs, icons, articles,\n audio clips, and video clips \n(collectively, \"User Content\") that you post,\n e-mail, or otherwise transmit via this software.\n SFAFT BV does not control User Content posted or\n otherwise transmitted via this software and SFAFT \nBV does not guarantee the accuracy, integrity, or \nquality of such User Content. Any communications you\n send to this Internet software or otherwise to\n SFAFT BV by electronic mail with the exception\n of personally identifiable information as defined\n in the www.subway.co.in Internet Privacy Policy \nshall be deemed to be non-confidential and we shall \nhave no obligation of any kind with respect to such\n information and shall be free to reproduce, use, \ndisclose, and distribute the information to others\n without limitation. We shall be free to use any\n ideas, concepts, expression, know-how or techniques\n contained in such information for any purpose \nwhatsoever, including but not limited to developing,\n manufacturing and marketing products incorporating\n such information.\n\nOBLIGATIONS OF software VISITORS OR USERS.\nYou agree not to do any of the following while \nvisiting or using the software or any services provided\n by or through the software:\n\nrestrict or inhibit any other user from using and \nenjoying the software;\nimpersonate any person or entity or falsely state \nor otherwise misrepresent your professional or other\n affiliation with any person or entity or indicate\n that you are an employee or representative of \nSFAFT BV, DAI or any SUBWAY® restaurant;\npost or transmit unlawful, offensive, threatening, \nabusive, libelous, defamatory, obscene, profane or\n indecent information of any kind, including, without\n limitation, any images.");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 470, 210));

        cb.setBackground(new java.awt.Color(0, 0, 0));
        cb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cb.setForeground(new java.awt.Color(255, 255, 255));
        cb.setText("I ACCEPT THE ABOVE AGREEMENT");
        cb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbItemStateChanged(evt);
            }
        });
        cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActionPerformed(evt);
            }
        });
        getContentPane().add(cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 310, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 310, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/cancel button.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 60, 60));

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/next button.jpg"))); // NOI18N
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 100, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/MENU LOGO.JPG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 170, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/subway_sandwich_background.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 470, 250));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/subway_sandwich_background.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -110, 510, 360));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbItemStateChanged
if(cb.isSelected()){
  next.setEnabled(true);
}
else
     next.setEnabled(false);
    
    }//GEN-LAST:event_cbItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      new LOGIN_FORM().setVisible(true);
      dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
next.setEnabled(false);
    }//GEN-LAST:event_formWindowGainedFocus

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
     new become_a_member().setVisible(true);
     dispose();
    }//GEN-LAST:event_nextActionPerformed

    private void cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbActionPerformed

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
            java.util.logging.Logger.getLogger(terms_and_conditions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(terms_and_conditions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(terms_and_conditions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(terms_and_conditions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new terms_and_conditions().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton next;
    // End of variables declaration//GEN-END:variables
}