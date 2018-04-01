
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmAssigment extends javax.swing.JPanel {
    String sql="assignment";
    public FrmAssigment() {
        initComponents();
        setSize(643, 562);
        setLocation(400,90);
        
        try{
        con=DalinConnectSql.getDalinConnection();
        }catch(Exception e){}
        btnDelete.setEnabled(false);
         edSCClassID();
         edSCStudentID();
         edScInSTID();
         edScCourseID();
         edShowData();
         MainForm.type.autoID(sql, lblno);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cboCourseID = new javax.swing.JComboBox<>();
        cboClassID = new javax.swing.JComboBox<>();
        cboStudentID = new javax.swing.JComboBox<>();
        cboIstructorID = new javax.swing.JComboBox<>();
        lblno = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAssingment = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("ID");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 20, 150, 31);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Class ID");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 60, 140, 31);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Instuctor ID");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 160, 130, 31);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("Course ID");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(10, 210, 130, 31);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setText("Student ID");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(10, 110, 130, 31);

        cboCourseID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(cboCourseID);
        cboCourseID.setBounds(160, 210, 260, 30);

        cboClassID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(cboClassID);
        cboClassID.setBounds(160, 60, 260, 30);

        cboStudentID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(cboStudentID);
        cboStudentID.setBounds(160, 110, 260, 30);

        cboIstructorID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(cboIstructorID);
        cboIstructorID.setBounds(160, 160, 260, 30);

        lblno.setBackground(new java.awt.Color(204, 204, 204));
        lblno.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(lblno);
        lblno.setBounds(160, 20, 260, 30);

        add(jPanel2);
        jPanel2.setBounds(10, 60, 430, 260);

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
        jPanel5.setBounds(450, 210, 120, 100);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        tbAssingment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Name Building", "Capacity", "Decription"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbAssingment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAssingmentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbAssingment);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 596, 180);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Schedule");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(10, 10, 90, 31);

        jTextField10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(jTextField10);
        jTextField10.setBounds(130, 10, 257, 30);

        add(jPanel1);
        jPanel1.setBounds(10, 320, 630, 240);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Assignment");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel2);
        jLabel2.setBounds(100, 10, 290, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void tbAssingmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAssingmentMouseClicked
         if(evt.getClickCount()==2){
             int index=tbAssingment.getSelectedRow();
             lblno.setText(tbAssingment.getValueAt(index,0).toString());
             cboClassID.setSelectedItem(tbAssingment.getValueAt(index,1).toString());
             cboStudentID.setSelectedItem(tbAssingment.getValueAt(index,2).toString());
             cboIstructorID.setSelectedItem(tbAssingment.getValueAt(index,3).toString());
             cboCourseID.setSelectedItem(tbAssingment.getValueAt(index,4).toString());
              btnSave.setText("Update");
            btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-available-updates-25.png")));
            btnDelete.setEnabled(true);
         }
    }//GEN-LAST:event_tbAssingmentMouseClicked

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

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
         edDelete();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cboClassID;
    private javax.swing.JComboBox<String> cboCourseID;
    private javax.swing.JComboBox<String> cboIstructorID;
    private javax.swing.JComboBox<String> cboStudentID;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JLabel lblno;
    private javax.swing.JTable tbAssingment;
    // End of variables declaration//GEN-END:variables
    Connection con;
    ResultSet rst;
    Statement stm;
    DefaultTableModel mode=new DefaultTableModel();
    PreparedStatement ps;
    public void edSCClassID(){
        try{
            
            stm=con.createStatement();
            rst=stm.executeQuery("select ID from classroom");
            cboClassID.removeAllItems();
            while(rst.next()){
                String id=rst.getString("ID");
                cboClassID.addItem(id);
            }
        }catch(SQLException e){JOptionPane.showMessageDialog(this, e);}
    }
    public void edSCStudentID(){
        try{
            con=DalinConnectSql.getDalinConnection();
            stm=con.createStatement();
            rst=stm.executeQuery("select ID from student");
            cboStudentID.removeAllItems();
            while(rst.next()){
                String no=rst.getString("ID");
                cboStudentID.addItem(no);
            }
        }catch(SQLException e){JOptionPane.showMessageDialog(this, e);}
    }
    
    public void edScInSTID(){
        try{
            con=DalinConnectSql.getDalinConnection();
            stm=con.createStatement();
            rst=stm.executeQuery("select ID from instructor");
            cboIstructorID.removeAllItems();
            while(rst.next()){
                String n=rst.getString("ID");
                cboIstructorID.addItem(n);
            }
        }catch(SQLException e){JOptionPane.showMessageDialog(this, e);}
    }
    public void edScCourseID(){
        try{
            stm=con.createStatement();
            rst=stm.executeQuery("select id from course");
            cboCourseID.removeAllItems();
            while(rst.next()){
                String id=rst.getString("id");
                cboCourseID.addItem(id);
            }
        }catch(SQLException e){JOptionPane.showMessageDialog(this, e);}
    }
    private void edSave(){
        try{
            ps=con.prepareCall("insert into assignment values(?,?,?,?,?)");
            ps.setInt(1,Integer.parseInt(lblno.getText()));
            ps.setInt(2,Integer.parseInt(cboClassID.getSelectedItem().toString()));
            ps.setInt(3,Integer.parseInt(cboStudentID.getSelectedItem().toString()));
            ps.setInt(4,Integer.parseInt(cboIstructorID.getSelectedItem().toString()));
            ps.setInt(5,Integer.parseInt(cboCourseID.getSelectedItem().toString()));
            ps.execute();
            edShowData();
            MainForm.type.autoID(sql, lblno);
        }catch(NumberFormatException | SQLException e){JOptionPane.showMessageDialog(this,e);}
    }
     private void edUpdate(){
        try{
            ps=con.prepareCall("update assignment set class_id=?,student_id=?,instructor_id=?,course_id=? where no=?");            
            ps.setInt(1,Integer.parseInt(cboClassID.getSelectedItem().toString()));
            ps.setInt(2,Integer.parseInt(cboStudentID.getSelectedItem().toString()));
            ps.setInt(3,Integer.parseInt(cboIstructorID.getSelectedItem().toString()));
            ps.setInt(4,Integer.parseInt(cboCourseID.getSelectedItem().toString()));
            ps.setInt(5,Integer.parseInt(lblno.getText()));
            ps.execute();
            edShowData();
            btnSave.setText("Save");
            btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-22.png")));
            btnDelete.setEnabled(false);
            MainForm.type.autoID(sql, lblno);
        }catch(NumberFormatException | SQLException e){JOptionPane.showMessageDialog(this,e);}
    }
     private void edDelete(){
         try{
             ps=con.prepareCall("delete from assignment where no=?");
             ps.setInt(1,Integer.parseInt(lblno.getText()));
             ps.execute();
             edShowData();
             btnSave.setText("Save");
             btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-22.png")));
            btnDelete.setEnabled(false);
            MainForm.type.autoID(sql, lblno);
         }catch(NumberFormatException | SQLException e){}
     }
    private void edShowData() {
        try{
            while(mode.getRowCount()>0)
                mode.removeRow(0);
                mode=(DefaultTableModel)tbAssingment.getModel();
                stm=con.createStatement();
                rst=stm.executeQuery("select * from assignment");
                while(rst.next()){
                    mode.addRow(new String[]{
                        rst.getString(1),
                        rst.getString(2),
                        rst.getString(3),
                        rst.getString(4),
                        rst.getString(5),
                        
                    });
                }
        }catch(SQLException e){}
    }
    
}
