
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmSchedule extends javax.swing.JPanel {
    String sql="sc";
    public FrmSchedule() {
       initComponents();
       setSize(634, 484);
       setLocation(400,120);
       try{
        con=DalinConnectSql.getDalinConnection();
       }catch(Exception e){}
       edShowData();
       MainForm.type.autoID(sql, lblno);
       edScCourseID();
       edScInstructorID();
       btnDelete.setEnabled(false);
       btnCancel.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblno = new javax.swing.JLabel();
        cboInstructorID = new javax.swing.JComboBox<>();
        cboCourse_id = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtclassname = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("ID");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(12, 13, 150, 31);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Instuctor ID");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 50, 130, 31);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("Course ID");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(10, 90, 130, 31);

        lblno.setBackground(new java.awt.Color(204, 204, 204));
        lblno.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(lblno);
        lblno.setBounds(160, 10, 250, 30);

        cboInstructorID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cboInstructorID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cboInstructorIDFocusLost(evt);
            }
        });
        jPanel2.add(cboInstructorID);
        cboInstructorID.setBounds(160, 50, 260, 30);

        cboCourse_id.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(cboCourse_id);
        cboCourse_id.setBounds(160, 90, 260, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Class Name");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 130, 140, 31);

        txtclassname.setFont(new java.awt.Font("Khmer Serif", 0, 18)); // NOI18N
        jPanel2.add(txtclassname);
        txtclassname.setBounds(160, 130, 260, 30);

        add(jPanel2);
        jPanel2.setBounds(0, 60, 430, 180);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);

        btnDelete.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-trash-25.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel5.add(btnDelete);
        btnDelete.setBounds(10, 50, 110, 32);

        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-22.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel5.add(btnSave);
        btnSave.setBounds(10, 10, 110, 32);

        btnCancel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-cancel-25.png"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCancel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel5.add(btnCancel);
        btnCancel.setBounds(10, 90, 110, 32);

        add(jPanel5);
        jPanel5.setBounds(440, 100, 130, 130);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        tb.setFont(new java.awt.Font("Khmer Serif", 0, 11)); // NOI18N
        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Instructor ID", "Course ID", "Class  Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb);
        if (tb.getColumnModel().getColumnCount() > 0) {
            tb.getColumnModel().getColumn(0).setResizable(false);
            tb.getColumnModel().getColumn(1).setResizable(false);
            tb.getColumnModel().getColumn(2).setResizable(false);
            tb.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 596, 180);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Search there");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(20, 10, 90, 31);

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtSearch);
        txtSearch.setBounds(130, 10, 257, 30);

        add(jPanel1);
        jPanel1.setBounds(0, 240, 630, 240);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Schedule");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel2);
        jLabel2.setBounds(70, 10, 290, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
         switch(btnSave.getText()){
             case"Save":
                 if(txtclassname.getText().equals("")){
                     JOptionPane.showMessageDialog(null,"Input Class Name");
                     return;
                 }
                 edSave();
                 break;
             case"Update":
                 edUpdate();
                 break;
         }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int ask=JOptionPane.showConfirmDialog(null,"Do you want to delete data?","Delete Data",JOptionPane.YES_NO_OPTION);
        if(ask==JOptionPane.YES_OPTION){     

        edDelete();
        }
        else{}
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMouseClicked
        if(evt.getClickCount()==2){
            int index=tb.getSelectedRow();
            lblno.setText(tb.getValueAt(index,0).toString());
            cboInstructorID.setSelectedItem(tb.getValueAt(index,1).toString());
            cboCourse_id.setSelectedItem(tb.getValueAt(index,2).toString());
            txtclassname.setText(tb.getValueAt(index,3).toString());
            btnSave.setText("Update");
            btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-available-updates-25.png")));
            btnDelete.setEnabled(true);
        }
    }//GEN-LAST:event_tbMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        btnSave.setText("Save");
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-22.png")));
        btnDelete.setEnabled(false);
        btnCancel.setEnabled(false);

    }//GEN-LAST:event_btnCancelActionPerformed

    private void cboInstructorIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cboInstructorIDFocusLost
        try{
            ps=con.prepareCall("select ");
        }catch(Exception e){JOptionPane.showMessageDialog(this,e);}
    }//GEN-LAST:event_cboInstructorIDFocusLost

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
       try{
           while(mode.getRowCount()>0)
               mode.removeRow(0);
               mode=(DefaultTableModel)tb.getModel();
               String sql="select * from sc where instructor_id=?";
               ps=con.prepareCall(sql);
               ps.setInt(1,Integer.parseInt(txtSearch.getText()));
               rst=ps.executeQuery();
               if(rst.first()){
                   do{
                        mode.addRow(new String[]{
                        rst.getString(1),
                        rst.getString(2),
                        rst.getString(3),
                        rst.getString(4)
                        });
                   }while(rst.next());
               }
               else 
                   edShowData();
       }catch(Exception e){}
    }//GEN-LAST:event_txtSearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cboCourse_id;
    private javax.swing.JComboBox<String> cboInstructorID;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblno;
    private javax.swing.JTable tb;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtclassname;
    // End of variables declaration//GEN-END:variables
    PreparedStatement ps;
    Connection con;
    ResultSet rst;
    Statement stm;
    DefaultTableModel mode=new DefaultTableModel();
    public void edScCourseID(){
        try{
            stm=con.createStatement();
            rst=stm.executeQuery("select id from course");
            cboCourse_id.removeAllItems();
            while(rst.next()){
              String id=rst.getString("id");
              cboCourse_id.addItem(id);
            }
            }catch(SQLException e){}
    }
    public void edScInstructorID(){
        try{
            stm=con.createStatement();
            rst=stm.executeQuery("select ID from instructor");
            cboInstructorID.removeAllItems();
            while(rst.next()){
              String id=rst.getString("ID");
              cboInstructorID.addItem(id);
            }
            }catch(SQLException e){}
    }
    public void edSave(){
        try{
            ps=con.prepareCall("insert into sc values(?,?,?,?)");
            ps.setInt(1,Integer.parseInt(lblno.getText()));
            ps.setInt(2,Integer.parseInt(cboInstructorID.getSelectedItem().toString()));
            ps.setInt(3,Integer.parseInt(cboCourse_id.getSelectedItem().toString()));
            ps.setString(4,txtclassname.getText());
            ps.execute();
            edShowData();
            MainForm.type.autoID(sql, lblno);
        }catch(NumberFormatException | SQLException e){JOptionPane.showMessageDialog(this,e);}
    }
    public void edUpdate(){
        try{
            ps=con.prepareCall("update sc set instructor_id=?,cuorse_id=?,class_name=? where no=?");            
            ps.setInt(1,Integer.parseInt(cboInstructorID.getSelectedItem().toString()));
            ps.setInt(2,Integer.parseInt(cboCourse_id.getSelectedItem().toString()));
            ps.setString(3,txtclassname.getText());
            ps.setInt(4,Integer.parseInt(lblno.getText()));
            ps.execute();
            btnSave.setText("Save");
            btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-22.png")));
            edShowData();
            MainForm.type.autoID(sql, lblno);
            btnDelete.setEnabled(false);
            btnCancel.setEnabled(false);
        }catch(NumberFormatException | SQLException e){JOptionPane.showMessageDialog(this,e);}
    }
    private void edDelete(){
        try{
            ps=con.prepareCall("delete from sc where no=?");
            ps.setInt(1,Integer.parseInt(lblno.getText()));
            ps.execute();
            MainForm.type.autoID(sql, lblno);
            btnSave.setText("Save");
            btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-22.png")));
            edShowData();
            btnDelete.setEnabled(false);
        }catch(NumberFormatException | SQLException e){JOptionPane.showMessageDialog(this,e);}
    }
    private void edShowData() {
        try{
            while(mode.getRowCount()>0)
                mode.removeRow(0);
                mode=(DefaultTableModel)tb.getModel();
                stm=con.createStatement();
                rst=stm.executeQuery("select * from sc");
                while(rst.next()){
                    mode.addRow(new String[]{
                        rst.getString(1),
                        rst.getString(2),
                        rst.getString(3),
                        rst.getString(4)
                    });
                }
        }catch(Exception e){}
    }
    }
