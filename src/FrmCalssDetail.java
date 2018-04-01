
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmCalssDetail extends javax.swing.JPanel {
    
    String sql="roomdetail";
    public FrmCalssDetail() {
        initComponents();
        setSize(662, 492);
        setLocation(500,100);
        try{
            con=DalinConnectSql.getDalinConnection();
        }catch(Exception e){}
        MainForm.ref.type.autoID(sql, lblNo);
        edScClass();
        edScStaffID();
        edShowData();
        btnDelete.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblNo = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cboClassID = new javax.swing.JComboBox<>();
        cboStudentID = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClassDetail = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();

        setLayout(null);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Class Detail");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel1);
        jLabel1.setBounds(100, 10, 290, 40);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel2.setLayout(null);

        lblNo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblNo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(lblNo);
        lblNo.setBounds(160, 10, 250, 31);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Class ID");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 60, 140, 31);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Student ID");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 110, 130, 31);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Auto_ID");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(12, 13, 140, 31);

        cboClassID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cboClassIDFocusLost(evt);
            }
        });
        jPanel2.add(cboClassID);
        cboClassID.setBounds(160, 60, 250, 30);

        cboStudentID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cboStudentIDFocusLost(evt);
            }
        });
        jPanel2.add(cboStudentID);
        cboStudentID.setBounds(160, 110, 250, 30);

        add(jPanel2);
        jPanel2.setBounds(30, 60, 430, 190);

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
        btnDelete.setBounds(10, 50, 110, 32);

        btnNew.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-22.png"))); // NOI18N
        btnNew.setText("Save");
        btnNew.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel5.add(btnNew);
        btnNew.setBounds(10, 10, 110, 32);

        add(jPanel5);
        jPanel5.setBounds(470, 120, 130, 100);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        tbClassDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Auto ID", "Class Name", "Student Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbClassDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClassDetailMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbClassDetail);
        if (tbClassDetail.getColumnModel().getColumnCount() > 0) {
            tbClassDetail.getColumnModel().getColumn(0).setResizable(false);
            tbClassDetail.getColumnModel().getColumn(1).setResizable(false);
            tbClassDetail.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 596, 180);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Schedule");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(10, 10, 90, 31);

        jTextField10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField10);
        jTextField10.setBounds(130, 10, 257, 30);

        add(jPanel1);
        jPanel1.setBounds(30, 250, 630, 240);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void cboClassIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cboClassIDFocusLost
        edGetNameClass();
    }//GEN-LAST:event_cboClassIDFocusLost

    private void cboStudentIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cboStudentIDFocusLost
         edGetNameStudent();
    }//GEN-LAST:event_cboStudentIDFocusLost

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
         switch(btnNew.getText()){
            
             case"Save":
                 edSave();
                 break;
             case"Update":
                 edUdpate();
                 
                 break;
         }
    }//GEN-LAST:event_btnNewActionPerformed

    private void tbClassDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClassDetailMouseClicked
         if(evt.getClickCount()==2){
             int index=tbClassDetail.getSelectedRow();
             lblNo.setText(tbClassDetail.getValueAt(index,0).toString());
             btnNew.setText("Update");
             btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-available-updates-25.png")));
             btnDelete.setEnabled(true);
         }
    }//GEN-LAST:event_tbClassDetailMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        edDelete();
        btnNew.setText("Save");
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-22.png")));
        btnDelete.setEnabled(false);
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JComboBox<String> cboClassID;
    private javax.swing.JComboBox<String> cboStudentID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JLabel lblNo;
    private javax.swing.JTable tbClassDetail;
    // End of variables declaration//GEN-END:variables
    PreparedStatement ps;
    Connection con;
    ResultSet rst;
    Statement stm;
    DefaultTableModel mode=new DefaultTableModel();
    //query id from tb classroom
    public void edScClass(){
        try{
            con=DalinConnectSql.getDalinConnection();
            stm=con.createStatement();
            rst=stm.executeQuery("select ID from classroom");
            cboClassID.removeAllItems();
            while(rst.next()){
                String no=rst.getString("ID");
                cboClassID.addItem(no);
            }
        }catch(SQLException e){JOptionPane.showMessageDialog(this, e);}
    }
    //query id from tb student
    public void edScStaffID(){
        try{
            stm=con.createStatement();
            rst=stm.executeQuery("select ID from student");
            cboStudentID.removeAllItems();
            while(rst.next()){
                String id=rst.getString("ID");
                cboStudentID.addItem(id);
            }
        }catch(SQLException e){}
    }
    // get name 
   static String name;
    public void edGetNameClass(){
        try{
            stm=con.createStatement();
            rst=stm.executeQuery("select Name from classroom where ID="+cboClassID.getSelectedItem());
            while(rst.next()){
                name=rst.getString("Name");
            }
            //JOptionPane.showMessageDialog(null,name);
        }catch(SQLException e){}
    }
    //get Name from tb student
   static String nameStu;
    public void edGetNameStudent(){
        try{
            stm=con.createStatement();
            rst=stm.executeQuery("select Name from student where ID="+cboStudentID.getSelectedItem());
            while(rst.next()){
               nameStu=rst.getString("Name");
            }
            //JOptionPane.showMessageDialog(null, nameStu);
            }catch(SQLException e){}
    }
    
    public void edSave(){
        try{
            ps=con.prepareCall("insert into roomdetail values(?,?,?)");
            ps.setInt(1, Integer.parseInt(lblNo.getText()));
            ps.setString(2,name);
            ps.setString(3,nameStu);
            ps.execute();
            edShowData();
           MainForm.ref.type.autoID(sql, lblNo);
        }catch(NumberFormatException | SQLException e){JOptionPane.showMessageDialog(this,e);}
    }
     private void edUdpate() {
         try{
             ps=con.prepareCall("update roomdetail set name_class=?,student_name=? where no=?");
             ps.setString(1,name);
             ps.setString(2, nameStu);
             ps.setInt(3, Integer.parseInt(lblNo.getText()));
             ps.execute();
             edShowData();
             btnNew.setText("Save");
             btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-22.png")));
             MainForm.type.autoID(sql, lblNo);
         }catch(NumberFormatException | SQLException e){}
    }
    public void edShowData(){
        try{
            while(mode.getRowCount()>0)
                mode.removeRow(0);
                mode=(DefaultTableModel)tbClassDetail.getModel();
                stm=con.createStatement();
                rst=stm.executeQuery("select * from roomdetail");
                while(rst.next()){
                    mode.addRow(new String[]{
                        rst.getString(1),
                        rst.getString(2),
                        rst.getString(3)
                    });
                }
        }catch(SQLException e){}
    }
    
        public void edDelete(){
            try{
             ps=con.prepareCall("delete from roomdetail where no=?");
             ps.setInt(1,Integer.parseInt(lblNo.getText()));
             ps.execute();
             edShowData();
            }catch(NumberFormatException | SQLException e){JOptionPane.showMessageDialog(this,e);
        
            }  
}
}
