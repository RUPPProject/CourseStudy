
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class FrmRegister extends javax.swing.JPanel {
    Connection con;
    ResultSet rst;
    Statement stm;
    PreparedStatement ps;
    DefaultTableModel mode =new DefaultTableModel();
    String sql="register";
    public FrmRegister() {
        initComponents();
        setSize(646, 555);
        setLocation(500, 100);
        btnDelete.setEnabled(false);
        try{
            con=DalinConnectSql.getDalinConnection();
        }catch(Exception e){}
        MainForm.type.autoID(sql, lblno);
        //edSCStaffID();
        edScStudentID();
        edScCourseID();
        edShowData();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblno = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cboPayment = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbostudent_id = new javax.swing.JComboBox<>();
        cbocourse_id = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRegister = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel2.setLayout(null);

        lblno.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(lblno);
        lblno.setBounds(160, 10, 260, 31);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("Course ID");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(10, 110, 130, 31);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setText("Student ID");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(10, 60, 130, 31);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("Payment");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(10, 160, 130, 31);

        cboPayment.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cboPayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semester I", "Semester II", "Both" }));
        jPanel2.add(cboPayment);
        cboPayment.setBounds(160, 160, 260, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("ID");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(12, 13, 150, 31);

        cbostudent_id.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(cbostudent_id);
        cbostudent_id.setBounds(160, 60, 260, 30);

        cbocourse_id.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(cbocourse_id);
        cbocourse_id.setBounds(160, 110, 260, 30);

        add(jPanel2);
        jPanel2.setBounds(10, 60, 430, 210);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);

        btnDelete.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-trash-25.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel5.add(btnDelete);
        btnDelete.setBounds(10, 50, 100, 32);

        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-22.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel5.add(btnSave);
        btnSave.setBounds(10, 10, 100, 32);

        add(jPanel5);
        jPanel5.setBounds(450, 170, 120, 100);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        tbRegister.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Student ID", "Course ID", "Payment", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRegisterMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbRegister);
        if (tbRegister.getColumnModel().getColumnCount() > 0) {
            tbRegister.getColumnModel().getColumn(0).setResizable(false);
            tbRegister.getColumnModel().getColumn(1).setResizable(false);
            tbRegister.getColumnModel().getColumn(2).setResizable(false);
            tbRegister.getColumnModel().getColumn(3).setResizable(false);
            tbRegister.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 596, 180);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Schedule");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(10, 10, 90, 31);

        jTextField10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel3.add(jTextField10);
        jTextField10.setBounds(130, 10, 257, 30);

        add(jPanel3);
        jPanel3.setBounds(10, 270, 630, 240);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel1);
        jLabel1.setBounds(150, 10, 180, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        switch(btnSave.getText()){
            case"Save":
                edSave();
                break;
            case"Update":
                edUpdate();
                break;
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tbRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRegisterMouseClicked
        if(evt.getClickCount()==2){
            int index=tbRegister.getSelectedRow();
            lblno.setText(tbRegister.getValueAt(index,0).toString());
            cbostudent_id.setSelectedItem(tbRegister.getValueAt(index,1).toString());
            cbocourse_id.setSelectedItem(tbRegister.getValueAt(index,2).toString());
            cboPayment.setSelectedItem(tbRegister.getValueAt(index,3).toString());
            btnSave.setText("Update");
            btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-available-updates-25.png")));
            btnDelete.setEnabled(true);
        }
    }//GEN-LAST:event_tbRegisterMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       edDelete();
    }//GEN-LAST:event_btnDeleteActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cboPayment;
    private javax.swing.JComboBox<String> cbocourse_id;
    private javax.swing.JComboBox<String> cbostudent_id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JLabel lblno;
    private javax.swing.JTable tbRegister;
    // End of variables declaration//GEN-END:variables
    
   
//    public void edSCStaffID(){
//        try{
//          stm=con.createStatement();
//          rst=stm.executeQuery("select ID from staff");
//            cbostaff_id.removeAllItems();
//          while(rst.next()){
//              String id=rst.getString("ID");
//              cbostaff_id.addItem(id);
//          }
//        }catch(SQLException e){JOptionPane.showMessageDialog(this,e);}
//    }
    public void edScStudentID(){
        try{
            stm=con.createStatement();
            rst=stm.executeQuery("select ID from student");
            cbostudent_id.removeAllItems();
            while(rst.next()){
              String id=rst.getString("ID");
              cbostudent_id.addItem(id);
            }
            //JOptionPane.showMessageDialog(null, nameStu);
            }catch(SQLException e){}
    }
      public void edScCourseID(){
        try{
            stm=con.createStatement();
            rst=stm.executeQuery("select id from course");
            cbocourse_id.removeAllItems();
            while(rst.next()){
              String id=rst.getString("id");
              cbocourse_id.addItem(id);
            }
            //JOptionPane.showMessageDialog(null, nameStu);
            }catch(SQLException e){}
    }
    public void edSave(){
        try {
            ps=con.prepareCall("insert into register values(?,?,?,?,?)");
            ps.setInt(1,Integer.parseInt(lblno.getText()));
            ps.setInt(2, Integer.parseInt(cbostudent_id.getSelectedItem().toString()));
            ps.setInt(3,Integer.parseInt(cbocourse_id.getSelectedItem().toString()));
            ps.setString(4,cboPayment.getSelectedItem().toString());
            ps.setString(5,MainForm.date.getText());
            ps.execute();
            MainForm.type.autoID(sql, lblno);
            edShowData();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,ex);
        }
    }
    public void edUpdate(){
        try{
            ps=con.prepareCall("update register set course_id=?,student_id=?,pay=? where no=?");
            ps.setInt(1,Integer.parseInt(cbocourse_id.getSelectedItem().toString()));
            ps.setInt(2,Integer.parseInt(cbostudent_id.getSelectedItem().toString()));
            ps.setString(3,cboPayment.getSelectedItem().toString());
            ps.setInt(4,Integer.parseInt(lblno.getText()));
            ps.execute();
            btnSave.setText("Save");
            btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-22.png")));
            edShowData();
            MainForm.type.autoID(sql, lblno);
            btnDelete.setEnabled(false);
        }catch(NumberFormatException | SQLException e){JOptionPane.showMessageDialog(this,e);}
        
    }
    public void edDelete(){
        try{
            ps=con.prepareCall("delete from register where no=?");
            ps.setInt(1,Integer.parseInt(lblno.getText()));
            ps.execute();
            MainForm.type.autoID(sql, lblno);
            btnSave.setText("Save");
            btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-22.png")));
            edShowData();
            btnDelete.setEnabled(false);
        }catch(NumberFormatException | SQLException e){JOptionPane.showMessageDialog(this,e);}
    }
    public void edShowData(){
        try{
            while(mode.getRowCount()>0)
                mode.removeRow(0);
                mode=(DefaultTableModel)tbRegister.getModel();
                stm=con.createStatement();
                rst=stm.executeQuery("select * from register");
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
}
