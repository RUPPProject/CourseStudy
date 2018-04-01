
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CreateAccount extends javax.swing.JPanel {
    
    String sql="createaccount";
    public CreateAccount() {
        initComponents();
        setSize(667, 657);
        setLocation(400,95);
        try{
            con=DalinConnectSql.getDalinConnection();
        }catch(Exception e){}
        edShowData();
        edSCStaffID();
        MainForm.type.autoID(sql, lblid);
        btnDelete.setEnabled(false);
        btnCancel.setEnabled(false);
        //MainForm.ref.account.autoID();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblstaff_naemm = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbostaff_id = new javax.swing.JComboBox<>();
        txtEmail = new javax.swing.JTextField();
        lblRepas = new javax.swing.JLabel();
        txtRepass = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();
        lblid = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCreateAccount = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel2.setLayout(null);

        lblstaff_naemm.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblstaff_naemm.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(lblstaff_naemm);
        lblstaff_naemm.setBounds(130, 100, 260, 31);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Staff ID");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 60, 90, 31);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Password");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 180, 90, 31);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Staff Name");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 100, 90, 31);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Email");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 140, 90, 31);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Repassword");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 220, 90, 31);

        cbostaff_id.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbostaff_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbostaff_idFocusLost(evt);
            }
        });
        cbostaff_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbostaff_idActionPerformed(evt);
            }
        });
        jPanel2.add(cbostaff_id);
        cbostaff_id.setBounds(130, 60, 260, 30);

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel2.add(txtEmail);
        txtEmail.setBounds(130, 140, 257, 30);

        lblRepas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblRepas.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(lblRepas);
        lblRepas.setBounds(160, 250, 180, 20);

        txtRepass.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtRepass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRepassFocusLost(evt);
            }
        });
        txtRepass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRepassKeyTyped(evt);
            }
        });
        jPanel2.add(txtRepass);
        txtRepass.setBounds(130, 220, 260, 30);

        txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });
        jPanel2.add(txtPassword);
        txtPassword.setBounds(130, 180, 260, 30);

        lblid.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(lblid);
        lblid.setBounds(130, 20, 260, 30);

        add(jPanel2);
        jPanel2.setBounds(10, 70, 430, 270);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Account");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel1);
        jLabel1.setBounds(110, 10, 280, 40);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel3.setLayout(null);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel20.setText("Repassword");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(10, 10, 90, 31);

        jTextField13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField13);
        jTextField13.setBounds(130, 10, 257, 30);

        tbCreateAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Staff ID", "Staff Name", "Email", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCreateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCreateAccountMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCreateAccount);
        if (tbCreateAccount.getColumnModel().getColumnCount() > 0) {
            tbCreateAccount.getColumnModel().getColumn(1).setResizable(false);
            tbCreateAccount.getColumnModel().getColumn(2).setResizable(false);
            tbCreateAccount.getColumnModel().getColumn(3).setResizable(false);
            tbCreateAccount.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 610, 240);

        add(jPanel3);
        jPanel3.setBounds(10, 340, 630, 310);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);

        btnCancel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-cancel-25.png"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnCancel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel5.add(btnCancel);
        btnCancel.setBounds(10, 90, 110, 32);

        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-22.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel5.add(btnSave);
        btnSave.setBounds(10, 10, 110, 32);

        btnDelete.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-trash-25.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel5.add(btnDelete);
        btnDelete.setBounds(10, 50, 110, 32);

        add(jPanel5);
        jPanel5.setBounds(470, 170, 130, 130);
    }// </editor-fold>//GEN-END:initComponents

    private void cbostaff_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbostaff_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbostaff_idActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
       
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        MainForm.type.autoID(sql, lblid);
        btnCancel.setEnabled(false);
        btnDelete.setEnabled(false);
        btnSave.setText("Save");
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-22.png")));
    }//GEN-LAST:event_btnCancelActionPerformed
    String pos;
    private void cbostaff_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbostaff_idFocusLost
        try{
            stm=con.createStatement();
            rst=stm.executeQuery("select Name,Position from staff where ID="+cbostaff_id.getSelectedItem().toString());
            while(rst.next()){
                lblstaff_naemm.setText(rst.getString("Name"));
                pos=rst.getString("Position");
                JOptionPane.showMessageDialog(this,pos);
            }
        }catch(HeadlessException | SQLException e){JOptionPane.showMessageDialog(this,e);}
    }//GEN-LAST:event_cbostaff_idFocusLost
    int index;
    private void tbCreateAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCreateAccountMouseClicked
         if(evt.getClickCount()==2){
             index=tbCreateAccount.getSelectedRow();
             lblid.setText(tbCreateAccount.getValueAt(index,0).toString());
             cbostaff_id.setSelectedItem(tbCreateAccount.getValueAt(index,1).toString());
             lblstaff_naemm.setText(tbCreateAccount.getValueAt(index,2).toString());
             txtEmail.setText(tbCreateAccount.getValueAt(index, 3).toString());
             txtPassword.setText(tbCreateAccount.getValueAt(index,4).toString());
             txtRepass.setText(tbCreateAccount.getValueAt(index,4).toString());
             btnSave.setText("Update");
             btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-available-updates-25.png")));
             btnCancel.setEnabled(true);
             btnDelete.setEnabled(true);
         }
    }//GEN-LAST:event_tbCreateAccountMouseClicked

    private void txtRepassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRepassFocusLost
        pas=txtPassword.getText();
        repas=txtRepass.getText();
        if(!pas.equalsIgnoreCase(repas)){
            lblRepas.setText("your repassword is incorrect!");
           
        }
    }//GEN-LAST:event_txtRepassFocusLost

    private void txtRepassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRepassKeyTyped
        lblRepas.setText("");
    }//GEN-LAST:event_txtRepassKeyTyped

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
       lblRepas.setText("");
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        switch(btnSave.getText()){
            
            case"Save":
                if(pos.equalsIgnoreCase("Cleaner")||pos.equalsIgnoreCase("Security")){
                    JOptionPane.showMessageDialog(null,"This position not need use account");
                }
                else{
                     edSave();
                   
                }
            break;
            case"Update":
            edUpdate();
            break;
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int use=JOptionPane.showConfirmDialog(null,"Do you want to delete this record?","Delete Record",JOptionPane.YES_NO_OPTION);
        if(use==JOptionPane.YES_OPTION){
        edDelete();
        }
        else{}
    }//GEN-LAST:event_btnDeleteActionPerformed
    String pas;
    String repas;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbostaff_id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JLabel lblRepas;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblstaff_naemm;
    private javax.swing.JTable tbCreateAccount;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRepass;
    // End of variables declaration//GEN-END:variables
    PreparedStatement ps;
    ResultSet rst;
    Statement stm;
    Connection con;
    DefaultTableModel mode=new DefaultTableModel();
  
    private void edSave(){
          try{
              con=DalinConnectSql.getDalinConnection();
        ps=con.prepareCall("insert into createaccount values(?,?,?,?,?)");
        ps.setInt(1,Integer.parseInt(lblid.getText()));
        ps.setInt(2,Integer.parseInt(cbostaff_id.getSelectedItem().toString()));
        ps.setString(3,lblstaff_naemm.getText());
        ps.setString(4,txtEmail.getText());
        ps.setString(5,txtPassword.getText());
        ps.execute();
        edShowData();
        autoID();
            MainForm.type.autoID(sql, lblid);
    }catch(NumberFormatException | SQLException e){JOptionPane.showMessageDialog(this,e);}
    }
    private void edDelete(){
        try{
            con=DalinConnectSql.getDalinConnection();
             int id=Integer.parseInt(tbCreateAccount.getValueAt(index,0).toString());
            ps=con.prepareCall("delete from createaccount where no=?");
            ps.setInt(1, Integer.parseInt(lblid.getText()));
            ps.execute();
            edShowData();
             btnSave.setText("Save");
             btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-22.png")));
             btnDelete.setEnabled(false);
             btnCancel.setEnabled(false);
             MainForm.type.autoID(sql, lblid);
            //JOptionPane.showMessageDialog(this,"deleted");
        }catch(HeadlessException | NumberFormatException | SQLException e){JOptionPane.showMessageDialog(this,e);}
    }
    private void edUpdate(){
          try{
              con=DalinConnectSql.getDalinConnection();
        ps=con.prepareCall("update createaccount set staff_name=?,email=?,password=?,staff_id=? where no=?");        
        ps.setInt(4,Integer.parseInt(cbostaff_id.getSelectedItem().toString()));
        ps.setString(1,lblstaff_naemm.getText());
        ps.setString(2,txtEmail.getText());
        ps.setString(3,txtPassword.getText());
        ps.setInt(5,Integer.parseInt(lblid.getText()));
        ps.execute();
        edShowData();
        btnSave.setText("Save");
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-22.png")));
            
        btnDelete.setEnabled(false);
        btnCancel.setEnabled(false);
        con.close();
        
    }catch(NumberFormatException | SQLException e){}
    }
    
    private void edShowData(){
        try{
        while(mode.getRowCount()>0)
          mode.removeRow(0);
          mode=(DefaultTableModel) tbCreateAccount.getModel();
          stm=con.createStatement();
          rst=stm.executeQuery("select * from createaccount");
          while(rst.next()){
          mode.addRow(new String[]{
              rst.getString(1),
              rst.getString(2),
              rst.getString(3),
              rst.getString(4),
              rst.getString(5)
          
          });
          }
        }catch(SQLException e){}
    }
    public void edSCStaffID(){
        try{
          stm=con.createStatement();
          rst=stm.executeQuery("select ID from staff");
            cbostaff_id.removeAllItems();
          while(rst.next()){
              String id=rst.getString("ID");
              cbostaff_id.addItem(id);
          }
        }catch(SQLException e){JOptionPane.showMessageDialog(this,e);}
    }
    private void autoID(){
        try{
           con=DalinConnectSql.getDalinConnection();
           stm=con.createStatement();
           rst=stm.executeQuery("select max(right(No,2)) as no from createaccount");
           while(rst.next()){
               if(rst.first()==false){
                   lblid.setText("100001");
               }
               else {
             
                   rst.last();
                         int set_id=rst.getInt(1)+1;
                         String no=String.valueOf(set_id);
                         int next_id=no.length();
                         for(int i=0;i<2-next_id;i++){
                             no="10000"+no;
                         }
                         lblid.setText(no);
               }
           }
       }catch(SQLException e){JOptionPane.showMessageDialog(this,e+"Create account");}
    }
}
