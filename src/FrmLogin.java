

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class FrmLogin extends javax.swing.JPanel {
    public FrmLogin() {
        initComponents();
        setSize(432, 313);
        setLocation(600,200);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblShowPas = new javax.swing.JLabel();
        lblShowID1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 204));
        setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Staff ID");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(12, 13, 120, 31);

        txtID.setBackground(new java.awt.Color(51, 153, 255));
        txtID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIDFocusLost(evt);
            }
        });
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDKeyReleased(evt);
            }
        });
        jPanel2.add(txtID);
        txtID.setBounds(160, 10, 200, 30);

        lblName.setBackground(new java.awt.Color(51, 153, 255));
        lblName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(lblName);
        lblName.setBounds(160, 60, 200, 31);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setText("Password");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(10, 110, 130, 31);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Staff Name");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 60, 140, 31);
        jPanel2.add(txtPassword);
        txtPassword.setBounds(160, 110, 200, 30);

        lblShowPas.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(lblShowPas);
        lblShowPas.setBounds(170, 140, 170, 20);

        lblShowID1.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(lblShowID1);
        lblShowID1.setBounds(180, 40, 170, 20);

        add(jPanel2);
        jPanel2.setBounds(10, 60, 380, 160);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Schedule");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel1);
        jLabel1.setBounds(60, 10, 290, 40);

        btnLogin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 0, 51));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-shutdown-25.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        add(btnLogin);
        btnLogin.setBounds(210, 230, 100, 32);

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-cancel-25.png"))); // NOI18N
        jButton3.setText("Exit");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(80, 230, 100, 32);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
      if(txtPassword.getText().equals(pass)){
             MainForm.setStaff_id(id+"");
             MainForm.setStaff_name(name);
             MainForm.setStaff_pos(pos);
             JOptionPane.showMessageDialog(null,MainForm.staff_id+"ID(M)"+MainForm.staff_name+",name(M)"+MainForm.staff_pos+"Position(M)");
             
             if(MainForm.staff_pos.equalsIgnoreCase("Administrator")||MainForm.staff_pos.equalsIgnoreCase("Manager")){
                MainForm.ref.setEnableJButton(true);
                MainForm.ref.swapFrm(MainForm.information,btnLogin);
                MainForm.userlogin.setText(MainForm.staff_name);
                //MainForm.infor.setForeground(Color.red);
                setClear();
              }
            else if(MainForm.staff_pos.equalsIgnoreCase("Receptionish")){
                    MainForm.ref.setEnableJButtonReceptionish(true);
                    MainForm.ref.swapFrm(MainForm.information,btnLogin);
                    MainForm.userlogin.setText(MainForm.staff_name);
                   // MainForm..setForeground(Color.red);
                    setClear();
            }
            }
      else{JOptionPane.showMessageDialog(null,"not ok");}
    }//GEN-LAST:event_btnLoginActionPerformed
    static String pass;
    static int id;
    static String name;
    static String pos;
    private void txtIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusLost
        if(txtID.getText().equals("")){
            lblShowID1.setText("Please Input your id!");
            txtID.requestFocus();
            
            return;
        }
        try{
                con=DalinConnectSql.getDalinConnection();
                stm=con.createStatement();
                rst=stm.executeQuery("select staff_name,staff_id,password from createaccount where staff_id='"+Integer.parseInt(txtID.getText())+"'");
                while(rst.next()){
                    name=rst.getString("staff_name");
                    id=Integer.parseInt(rst.getString("staff_id"));
                    pass=rst.getString("password");
                  
                    lblName.setText(name);
                }
                
             
         }catch(SQLException e){JOptionPane.showMessageDialog(this,e);}
        try{
            stm=con.createStatement();
            rst=stm.executeQuery("select Position from staff where ID="+txtID.getText());
            while(rst.next()){
                pos=rst.getString("position");
            }
        }catch(SQLException e){}
        JOptionPane.showMessageDialog(null,pass+",name="+name+",id="+id+",pose="+pos);
      
    }//GEN-LAST:event_txtIDFocusLost

    private void txtIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyReleased
         lblShowID1.setText("");
    }//GEN-LAST:event_txtIDKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         int ask=JOptionPane.showConfirmDialog(null,"Do you want exit?","Exit Form",JOptionPane.YES_NO_OPTION);
            if(ask==JOptionPane.YES_OPTION){
                System.exit(0);
            }
            else{}
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblShowID1;
    private javax.swing.JLabel lblShowPas;
    private javax.swing.JTextField txtID;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
    Statement stm;
    ResultSet rst;
    Connection con;
    PreparedStatement ps;
    
    void setClear(){
        txtID.setText(null);
        lblName.setText(null);
        txtPassword.setText(null);
    }
}
