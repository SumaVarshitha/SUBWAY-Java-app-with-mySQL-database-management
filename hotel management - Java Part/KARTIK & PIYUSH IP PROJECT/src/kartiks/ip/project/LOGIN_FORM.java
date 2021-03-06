/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kartiks.ip.project;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author KARTIK NIGHANIA
 */
public class LOGIN_FORM extends javax.swing.JFrame {
  

    /**
     * Creates new form LOGIN_FORM
     */
    public LOGIN_FORM() {
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

        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        subwayBtn = new javax.swing.JButton();
        usernameTf = new javax.swing.JTextField();
        pwdTf = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        becomeamemberBtn = new javax.swing.JButton();
        ownersloginBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fgtpwdBtn = new javax.swing.JButton();
        time = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 255, 51));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("YOUR USERNAME CODE");
        jLabel21.setOpaque(true);
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 160, -1));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 255, 51));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("CLICK IF YOU FORGOT");
        jLabel20.setOpaque(true);
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 130, -1));

        subwayBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/MAIN LOGO.JPG"))); // NOI18N
        subwayBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(subwayBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 170, 80));

        usernameTf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 51), 2, true));
        usernameTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usernameTfKeyTyped(evt);
            }
        });
        getContentPane().add(usernameTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 180, 20));

        pwdTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51), 2));
        getContentPane().add(pwdTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 180, 20));

        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/LOGIN BUTTON.JPG"))); // NOI18N
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 70, 20));

        becomeamemberBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/become a member.JPG"))); // NOI18N
        becomeamemberBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        becomeamemberBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                becomeamemberBtnActionPerformed(evt);
            }
        });
        getContentPane().add(becomeamemberBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 140, 70));

        ownersloginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/OWNERS LOGIN.JPG"))); // NOI18N
        ownersloginBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ownersloginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ownersloginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ownersloginBtnMouseEntered(evt);
            }
        });
        ownersloginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ownersloginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ownersloginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 180, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("FOR");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("MEMBERS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 80, 20));

        fgtpwdBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/FgtPwD SMALL ICON.jpg"))); // NOI18N
        fgtpwdBtn.setToolTipText("IF YOU FORGOT YOUR USERNAME...\n    THEN CLICK ME!");
        fgtpwdBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        fgtpwdBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fgtpwdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fgtpwdBtnActionPerformed(evt);
            }
        });
        getContentPane().add(fgtpwdBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 50, -1));
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 230, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/LOGIN-001.JPG"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
String ID=usernameTf.getText().trim().toLowerCase();
String pwd=new String(pwdTf.getPassword());



try {
            Class.forName("java.sql.Driver");
       
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/subway","root","123");
Statement stmt=con.createStatement();

String check_ID="select password from members where ID='"+ID+"';";
ResultSet rs=stmt.executeQuery(check_ID);
while(rs.next()){
    String pwd_from_mysql=rs.getString("password");

    
    if(pwd.equals(pwd_from_mysql)){
 String set_offline="update members set status='offline';";
 String set_offline1="update contact_info set status='offline';";
 String set_offline2="update orders set logged_in='offline';";

String set_online="update members set status='online' where ID="+ID;
String set_online1="update contact_info set status='online' where ID="+ID;
String set_online2="update orders set logged_in='online' where ID="+ID;
Calendar c=Calendar.getInstance();
String set_date="update members set date_last_logged_in='"+(c.get(Calendar.YEAR))+"-"+(c.get(Calendar.MONTH)+1)+"-"+(c.get(Calendar.DATE))+"' where ID="+ID+" ;";

Statement stmt1=con.createStatement();
Statement stmt2=con.createStatement();
Statement stmt3=con.createStatement();
Statement stmt4=con.createStatement();
Statement stmt5=con.createStatement();
Statement stmt6=con.createStatement();
Statement stmt7=con.createStatement();


stmt1.executeUpdate(set_offline);
stmt2.executeUpdate(set_offline1);
stmt6.executeUpdate(set_offline2);

stmt3.executeUpdate(set_online);
stmt4.executeUpdate(set_online1);
stmt5.executeUpdate(set_online2);
stmt7.executeUpdate(set_date);
new user_dashboard().setVisible(true);
dispose();
}

else{
    JOptionPane.showMessageDialog(null, "Incorrect password. Please try again.");
    pwdTf.setText("");
            }
}
  rs.close();
stmt.close();
con.close();  

}
        
    
catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
}

    }//GEN-LAST:event_loginBtnActionPerformed

    private void becomeamemberBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_becomeamemberBtnActionPerformed
  new terms_and_conditions().setVisible(true);
  dispose();
    }//GEN-LAST:event_becomeamemberBtnActionPerformed

    private void fgtpwdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fgtpwdBtnActionPerformed
  String mobile=(JOptionPane.showInputDialog(null, "enter your mobile number that you entered during sign up!")).toLowerCase().trim();
  try{
    Class.forName("java.sql.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/subway","root","123");
Statement stmt=con.createStatement();
String query="select ID from contact_info where mobile_no='"+mobile+"';";
ResultSet rs=stmt.executeQuery(query);
    while(rs.next()){
        String mysql_username=rs.getString("ID");
        JOptionPane.showMessageDialog(null,"your username is: "+mysql_username);
    }
}
catch (Exception e)
       {
 
       }
  
  
  
  
  
  
  
  
  
  
  
    }//GEN-LAST:event_fgtpwdBtnActionPerformed

    private void usernameTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTfKeyTyped
   char ch= evt.getKeyChar();
   if( ((ch>='a') && (ch<='z')) || ((ch>='A') && (ch<='Z')) ){
        evt.consume();
    }
    }//GEN-LAST:event_usernameTfKeyTyped

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
  Calendar c=Calendar.getInstance();

time.setText("" +c.getTime());
    }//GEN-LAST:event_formWindowGainedFocus

    private void ownersloginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ownersloginBtnActionPerformed
try {
            Class.forName("java.sql.Driver");
       
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/subway","root","123");
Statement stmt=con.createStatement();

String get_owner_password="select password from members where ID=101 ;";
ResultSet rs=stmt.executeQuery(get_owner_password);
while(rs.next()){
    String username_mysql=(rs.getString("password"));
  String pwd=JOptionPane.showInputDialog(null, "PLEASE ENTER PASSWORD - password is "+ username_mysql );

if(pwd.equals(username_mysql)){
        new owners_dashboard().setVisible(true);
dispose();
}
else
    JOptionPane.showMessageDialog(null, "SORRY WRONG PASSWORD- password is "+ username_mysql);
}
}
 catch(Exception e){
     
 }
    }//GEN-LAST:event_ownersloginBtnActionPerformed

    private void ownersloginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ownersloginBtnMouseEntered
   
              
    }//GEN-LAST:event_ownersloginBtnMouseEntered

  
    
    
    
    
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
            java.util.logging.Logger.getLogger(LOGIN_FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN_FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN_FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN_FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN_FORM().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton becomeamemberBtn;
    private javax.swing.JButton fgtpwdBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton ownersloginBtn;
    private javax.swing.JPasswordField pwdTf;
    private javax.swing.JButton subwayBtn;
    private javax.swing.JLabel time;
    private javax.swing.JTextField usernameTf;
    // End of variables declaration//GEN-END:variables
}
