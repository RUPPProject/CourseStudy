
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class FrmCourse extends javax.swing.JPanel {
    public FrmCourse() {
        initComponents();
        setSize(648, 667);
        setLocation(500,95);
        try{
            con=DalinConnectSql.getDalinConnection();
        }catch(Exception e){}
        edShowData();
        edSCPeriodID();
        btnDelete.setEnabled(false);
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEndCourse = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        txtCName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtStartCuorse = new com.toedter.calendar.JDateChooser();
        cboPrID = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtCredit = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCourse = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("ID");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(12, 13, 90, 31);

        txtID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(txtID);
        txtID.setBounds(130, 10, 257, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Period ID");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 50, 90, 31);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("End course");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 220, 90, 31);

        txtEndCourse.setDateFormatString("dd-MM-yyyy");
        jPanel2.add(txtEndCourse);
        txtEndCourse.setBounds(130, 220, 260, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Course Name");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 90, 110, 31);

        txtCName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtCName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCNameFocusLost(evt);
            }
        });
        jPanel2.add(txtCName);
        txtCName.setBounds(130, 90, 257, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Start course");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 170, 90, 31);

        txtStartCuorse.setDateFormatString("dd-MM-yyyy");
        txtStartCuorse.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(txtStartCuorse);
        txtStartCuorse.setBounds(130, 170, 260, 30);

        cboPrID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(cboPrID);
        cboPrID.setBounds(130, 50, 260, 30);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Credit");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 130, 110, 31);

        txtCredit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(txtCredit);
        txtCredit.setBounds(130, 130, 257, 30);

        add(jPanel2);
        jPanel2.setBounds(10, 60, 450, 270);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Course");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel1);
        jLabel1.setBounds(100, 10, 290, 40);

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
        jPanel5.setBounds(480, 190, 120, 100);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        tbCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Proriod ID", "Name", "Credit", "Start Course", "End Course"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCourseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCourse);
        if (tbCourse.getColumnModel().getColumnCount() > 0) {
            tbCourse.getColumnModel().getColumn(0).setResizable(false);
            tbCourse.getColumnModel().getColumn(1).setResizable(false);
            tbCourse.getColumnModel().getColumn(2).setResizable(false);
            tbCourse.getColumnModel().getColumn(3).setResizable(false);
            tbCourse.getColumnModel().getColumn(4).setResizable(false);
            tbCourse.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 596, 215);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Schedule");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(10, 10, 90, 31);

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(txtSearch);
        txtSearch.setBounds(130, 10, 257, 30);

        add(jPanel1);
        jPanel1.setBounds(10, 330, 630, 280);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
         edDelete();
    }//GEN-LAST:event_btnDeleteActionPerformed
    static String time;
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

    private void tbCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCourseMouseClicked
        if(evt.getClickCount()==2){
            int index=tbCourse.getSelectedRow();
            txtID.setText(tbCourse.getValueAt(index,0).toString());
            cboPrID.setSelectedItem(tbCourse.getValueAt(index,1).toString());
            txtCName.setText(tbCourse.getValueAt(index,2).toString());
            txtCredit.setText(tbCourse.getValueAt(index,3).toString());
             try {
            String start=tbCourse.getValueAt(index,4).toString();
            SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
                Date date1;
                date1=sdf.parse(start);
               txtStartCuorse.setDate(date1);
            String end=tbCourse.getValueAt(index,5).toString();
               Date date=sdf.parse(end);
                txtEndCourse.setDate(date);
            } catch (ParseException ex) {
               
            }
            btnSave.setText("Update");
            btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-available-updates-25.png")));
            btnDelete.setEnabled(true);
        }
    }//GEN-LAST:event_tbCourseMouseClicked

    private void txtCNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCNameFocusLost
        DalinType.edUperCase(txtCName);
    }//GEN-LAST:event_txtCNameFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cboPrID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCourse;
    private javax.swing.JTextField txtCName;
    private javax.swing.JTextField txtCredit;
    private com.toedter.calendar.JDateChooser txtEndCourse;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtSearch;
    private com.toedter.calendar.JDateChooser txtStartCuorse;
    // End of variables declaration//GEN-END:variables
    Connection con;
    PreparedStatement ps;
    ResultSet rst;
    Statement stm;
    DefaultTableModel mode=new DefaultTableModel();
    public void edSCPeriodID(){
        try{
            con=DalinConnectSql.getDalinConnection();
            stm=con.createStatement();
            rst=stm.executeQuery("select ID from period");
            cboPrID.removeAllItems();
            while(rst.next()){
                String id=rst.getString("ID");
                cboPrID.addItem(id);
            }
        }catch(SQLException e){JOptionPane.showMessageDialog(this, e);}
    }
    public void edSave(){
        try{
            ps=con.prepareCall("insert into course values(?,?,?,?,?,?)");
            ps.setInt(1,Integer.parseInt(txtID.getText()));
            ps.setInt(2,Integer.parseInt(cboPrID.getSelectedItem().toString()));
            ps.setString(3,txtCName.getText());
            ps.setInt(4,Integer.parseInt(txtCredit.getText()));
            ps.setString(5,((JTextField)txtStartCuorse.getDateEditor().getUiComponent()).getText());
            ps.setString(6,((JTextField)txtEndCourse.getDateEditor().getUiComponent()).getText());
            ps.execute();
            edShowData();
            MainForm.register.edScCourseID();
            MainForm.schedule.edScCourseID();
            MainForm.information.edShowData();
            MainForm.assigment.edScCourseID();
        }catch(NumberFormatException | SQLException e){JOptionPane.showMessageDialog(this,e);}
    }
    public void edUpdate(){
        try{
        ps=con.prepareCall("update course set period_id=?,name=?,credit=?,start_date=?,end_date=? where id=?");
        ps.setInt(1,Integer.parseInt(cboPrID.getSelectedItem().toString()));
        ps.setString(2,txtCName.getText());
        ps.setInt(3,Integer.parseInt(txtCredit.getText()));
        ps.setString(4,((JTextField)txtStartCuorse.getDateEditor().getUiComponent()).getText());
        ps.setString(5,((JTextField)txtEndCourse.getDateEditor().getUiComponent()).getText());
        ps.setInt(6,Integer.parseInt(txtID.getText()));
        ps.execute();
        edShowData();
        btnSave.setText("Save");
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-22.png")));
        btnDelete.setEnabled(false);
        }catch(NumberFormatException | SQLException e){JOptionPane.showMessageDialog(this,e);}
    }
    public void edDelete(){
        try{
            ps=con.prepareCall("delete from course where id=?");
            ps.setInt(1,Integer.parseInt(txtID.getText()));
            ps.execute();
            edShowData();
            btnSave.setText("Save");
            btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-22.png"))); // NOI18N
            btnDelete.setEnabled(false);
            MainForm.register.edScCourseID();
            MainForm.schedule.edScCourseID();
            MainForm.information.edShowData();
            MainForm.assigment.edScCourseID();
        }catch(NumberFormatException | SQLException e){JOptionPane.showMessageDialog(this,e);}
    }
    private void edShowData(){
        try{
            while(mode.getRowCount()>0)
                mode.removeRow(0);
                mode=(DefaultTableModel)tbCourse.getModel();
                stm=con.createStatement();
                rst=stm.executeQuery("select * from course");
                while(rst.next()){
                    mode.addRow(new String[]{
                        rst.getString(1),
                         rst.getString(2),
                          rst.getString(3),
                           rst.getString(4),
                            rst.getString(5),
                             rst.getString(6)
                    });
                }
        }catch(SQLException e){}
    }
    }
