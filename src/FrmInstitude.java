
import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public class FrmInstitude extends javax.swing.JPanel {
    public FrmInstitude() {
        initComponents();
        setSize(1312, 692);
        setLocation(300, 80);
        try{
            con=DalinConnectSql.getDalinConnection();
        }catch(Exception e){}
        edShowData();
        btnDelete.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cboPosition = new javax.swing.JComboBox<>();
        txtHiredDate = new com.toedter.calendar.JDateChooser();
        chkStopWork = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        cboDepartMent = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        cboCollage = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cboGender = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPlaceofBirth = new javax.swing.JTextArea();
        txtBirthDate = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Img = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbInstuctor = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setLayout(null);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Staff Information");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel1);
        jLabel1.setBounds(370, 20, 250, 40);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Position");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 10, 90, 31);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Hired Date");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 200, 90, 31);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Salary");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 50, 90, 31);

        txtSalary.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(txtSalary);
        txtSalary.setBounds(130, 50, 257, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Stop Work");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 250, 90, 31);

        cboPosition.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cboPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrator", "Receptionish", "Security", "Cleaner" }));
        jPanel1.add(cboPosition);
        cboPosition.setBounds(130, 10, 260, 30);

        txtHiredDate.setDateFormatString("dd-MM-YYYY");
        jPanel1.add(txtHiredDate);
        txtHiredDate.setBounds(130, 200, 260, 30);
        jPanel1.add(chkStopWork);
        chkStopWork.setBounds(140, 250, 20, 21);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Department");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(10, 100, 90, 31);

        cboDepartMent.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cboDepartMent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer Science", "Mathematics", "Physics", "Biology", "Chemestry", "Enviromenttal Science" }));
        jPanel1.add(cboDepartMent);
        cboDepartMent.setBounds(130, 100, 260, 30);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Collage");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(10, 150, 90, 31);

        cboCollage.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cboCollage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Science", "Science and Humanities", "Engeneering", "Development Studies" }));
        jPanel1.add(cboCollage);
        cboCollage.setBounds(130, 150, 260, 30);

        add(jPanel1);
        jPanel1.setBounds(480, 70, 450, 290);

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
        jLabel8.setText("Name");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 50, 90, 31);

        txtName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtName);
        txtName.setBounds(130, 50, 257, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Birth Date");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 130, 90, 31);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Gender");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 90, 90, 31);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Place of Birth");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 190, 110, 31);

        cboGender.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel2.add(cboGender);
        cboGender.setBounds(130, 90, 260, 30);

        txtPlaceofBirth.setColumns(20);
        txtPlaceofBirth.setRows(5);
        jScrollPane1.setViewportView(txtPlaceofBirth);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(130, 180, 260, 60);

        txtBirthDate.setDateFormatString("dd-MM-YYYY");
        jPanel2.add(txtBirthDate);
        txtBirthDate.setBounds(130, 130, 260, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Phone");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 250, 90, 31);

        txtPhone.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(txtPhone);
        txtPhone.setBounds(130, 250, 257, 30);

        add(jPanel2);
        jPanel2.setBounds(10, 70, 450, 290);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Photo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(255, 0, 51))); // NOI18N

        Img.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Img, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Img, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3);
        jPanel3.setBounds(970, 60, 180, 230);

        jButton1.setText("Browe");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(1040, 290, 70, 23);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(null);

        tbInstuctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "Birth Date", "Place of Birh", "Phone", "Position", "Salary", "Department", "Collage", "Hired Date", "Stop Work", "Photo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbInstuctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbInstuctorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbInstuctor);
        if (tbInstuctor.getColumnModel().getColumnCount() > 0) {
            tbInstuctor.getColumnModel().getColumn(0).setResizable(false);
            tbInstuctor.getColumnModel().getColumn(1).setResizable(false);
            tbInstuctor.getColumnModel().getColumn(2).setResizable(false);
            tbInstuctor.getColumnModel().getColumn(3).setResizable(false);
            tbInstuctor.getColumnModel().getColumn(4).setResizable(false);
            tbInstuctor.getColumnModel().getColumn(5).setResizable(false);
            tbInstuctor.getColumnModel().getColumn(6).setResizable(false);
            tbInstuctor.getColumnModel().getColumn(7).setResizable(false);
            tbInstuctor.getColumnModel().getColumn(8).setResizable(false);
            tbInstuctor.getColumnModel().getColumn(9).setResizable(false);
            tbInstuctor.getColumnModel().getColumn(10).setResizable(false);
            tbInstuctor.getColumnModel().getColumn(11).setResizable(false);
            tbInstuctor.getColumnModel().getColumn(12).setResizable(false);
        }

        jPanel4.add(jScrollPane3);
        jScrollPane3.setBounds(10, 50, 1210, 241);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Name");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(10, 10, 90, 31);

        jTextField8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField8);
        jTextField8.setBounds(130, 10, 257, 30);

        add(jPanel4);
        jPanel4.setBounds(10, 380, 1230, 300);

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
        jPanel5.setBounds(1160, 130, 120, 100);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ImgDalinBros(Img);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        switch(btnSave.getText()){
            case"Save":
                edSave();
                break;
            case"Update":
                edUpdate();
                btnSave.setText("Save");
                txtID.setEnabled(true);
                btnDelete.setEnabled(false);
                break;
                    
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tbInstuctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbInstuctorMouseClicked
       if(evt.getClickCount()==2){
            int index=tbInstuctor.getSelectedRow();
            txtID.setText(tbInstuctor.getValueAt(index,0).toString());
            txtName.setText(tbInstuctor.getValueAt(index,1).toString());
            cboGender.setSelectedItem(tbInstuctor.getValueAt(index,2));
           
            try {
                 String dob=tbInstuctor.getValueAt(index,3).toString();
                 SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
                 Date date=sdf.parse(dob);
                 txtBirthDate.setDate(date);
                 
                 String hired=tbInstuctor.getValueAt(index,10).toString();
                 date=sdf.parse(hired);
                 txtHiredDate.setDate(date);
                
                int id=Integer.parseInt(tbInstuctor.getValueAt(index,0).toString());
               stm=con.createStatement();
               rst=stm.executeQuery("select Picture from instructor where ID="+id);
               if(rst.next()){
                   img=rst.getBytes(1);
                   Img.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(img).getScaledInstance(Img.getWidth(), Img.getHeight(), Image.SCALE_SMOOTH)));
               }
            } catch (NumberFormatException | SQLException | ParseException ex) {
                
            }
            txtPlaceofBirth.setText(tbInstuctor.getValueAt(index,4).toString());
            txtPhone.setText(tbInstuctor.getValueAt(index,5).toString());
            cboPosition.setSelectedItem(tbInstuctor.getValueAt(index,6).toString());
            txtSalary.setText(tbInstuctor.getValueAt(index,7).toString());
            cboDepartMent.setSelectedItem(tbInstuctor.getValueAt(index,8).toString());
            cboCollage.setSelectedItem(tbInstuctor.getValueAt(index,9).toString());
            
            String chk=tbInstuctor.getValueAt(index,11).toString();
            if(chk.equals(yes)){
                chkStopWork.setSelected(true);
                
            }
           else{
                chkStopWork.setSelected(false);
            }
            btnSave.setText("Update");
            txtID.setEnabled(false);
            btnDelete.setEnabled(true);
       }
    }//GEN-LAST:event_tbInstuctorMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        edDelete();
        txtID.setEnabled(true);
        btnSave.setText("Save");
        btnDelete.setEnabled(false);
    }//GEN-LAST:event_btnDeleteActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Img;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cboCollage;
    private javax.swing.JComboBox<String> cboDepartMent;
    private javax.swing.JComboBox<String> cboGender;
    private javax.swing.JComboBox<String> cboPosition;
    private javax.swing.JCheckBox chkStopWork;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTable tbInstuctor;
    private com.toedter.calendar.JDateChooser txtBirthDate;
    private com.toedter.calendar.JDateChooser txtHiredDate;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextArea txtPlaceofBirth;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
   FileInputStream fis;
    int leng;
    byte[] img;
    Connection con;
    ResultSet rst;
    Statement stm;
    DefaultTableModel mode =new DefaultTableModel();
    PreparedStatement ps;
    File f;
    String fileName;
    String yes="Yes";
    String no="No";
    public void edShowData(){
        try{ 
        while(mode.getRowCount()>0)
           
            mode.removeRow(0);
            mode=(DefaultTableModel)tbInstuctor.getModel();
                stm=con.createStatement();
                rst=stm.executeQuery("select * from instructor");
                if(rst.first())
                do{
                    mode.addRow(new String[]{
                    //rst.getInt(1),
                    rst.getString(1),    
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9),
                    rst.getString(10),
                    rst.getString(11),
                    rst.getString(12),
                    rst.getString(13)
                    });
                }while(rst.next());
            
            }catch(SQLException e){JOptionPane.showMessageDialog(this,e);}            
    }
    public void edSave(){
        try {
            con=DalinConnectSql.getDalinConnection();
            ps=con.prepareCall("insert into instructor values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1,Integer.parseInt(txtID.getText().trim()));
            ps.setString(2,txtName.getText().trim());
            ps.setString(3,cboGender.getSelectedItem().toString());
            ps.setString(4,((JTextField)txtBirthDate.getDateEditor().getUiComponent()).getText());
            ps.setString(5,txtPlaceofBirth.getText().trim());
            ps.setString(6,txtPhone.getText().trim());
            ps.setString(7,cboPosition.getSelectedItem().toString());
            ps.setString(8,txtSalary.getText());
            ps.setString(9,cboDepartMent.getSelectedItem().toString());
            ps.setString(10,cboCollage.getSelectedItem().toString());
            
            ps.setString(11,((JTextField)txtHiredDate.getDateEditor().getUiComponent()).getText());
          
            if(chkStopWork.isSelected()){
                ps.setString(12,yes);
            }
            else{
                ps.setString(12,no);
            }
           
                if(fileName!=null){
                     fis=new FileInputStream(f);
                    leng=(int)f.length();
            ps.setBinaryStream(13, fis, leng);
                }
                else {
            ps.setBinaryStream(13, new ByteArrayInputStream(img),img.length);
                 }
                        
            ps.execute();
            MainForm.schedule.edScInstructorID();
            MainForm.assigment.edScInSTID();
            edShowData();
            edClear();
            
        } catch (FileNotFoundException | NumberFormatException | SQLException ex) {
            JOptionPane.showMessageDialog(this,ex);
        }
    }
    public void edUpdate(){
         try {
            con=DalinConnectSql.getDalinConnection();
            ps=con.prepareCall("update instructor set Name=?,Gender=?,BirthDate=?,PlaceBirth=?,Phone=?,Position=?,Salary=?,Department=?,Collage=?,HiredDate=?,StopWork=?,Picture=? where ID=?");
                       
            ps.setString(1,txtName.getText().trim());
            ps.setString(2,cboGender.getSelectedItem().toString());
            ps.setString(3,((JTextField)txtBirthDate.getDateEditor().getUiComponent()).getText());
            ps.setString(4,txtPlaceofBirth.getText().trim());
            ps.setString(5,txtPhone.getText().trim());
            ps.setString(6,cboPosition.getSelectedItem().toString());
            ps.setString(7,txtSalary.getText());
            ps.setString(8,cboDepartMent.getSelectedItem().toString());
            ps.setString(9,cboCollage.getSelectedItem().toString());
            
            ps.setString(10,((JTextField)txtHiredDate.getDateEditor().getUiComponent()).getText());
          
            if(chkStopWork.isSelected()){
                ps.setString(11,yes);
            }
            else{
                ps.setString(11,no);
            }
           
                if(fileName!=null){
                     fis=new FileInputStream(f);
                    leng=(int)f.length();
            ps.setBinaryStream(12, fis, leng);
                }
                else {
            ps.setBinaryStream(12, new ByteArrayInputStream(img),img.length);
                 }
            ps.setInt(13,Integer.parseInt(txtID.getText().trim()));            
            ps.execute();
            edShowData();
            edClear();
        } catch (FileNotFoundException | NumberFormatException | SQLException ex) {
            JOptionPane.showMessageDialog(this,ex);
        }
    }
    private void edDelete(){
        try{
            ps=con.prepareCall("delete from instructor where ID=?");
            ps.setInt(1,Integer.parseInt(txtID.getText()));
            ps.execute();
            edShowData();
            edClear();
            MainForm.schedule.edScInstructorID();
            MainForm.assigment.edScInSTID();
        }catch(NumberFormatException | SQLException e){JOptionPane.showMessageDialog(this,e);}
                
    }
    public  void ImgDalinBros(JLabel image){
        JFileChooser fc=new JFileChooser();
        fc.setDialogTitle("choose your image");
        FileNameExtensionFilter filter=new FileNameExtensionFilter("*.image","png","jpg");
        fc.addChoosableFileFilter(filter);
        int result=fc.showOpenDialog(image);
        if(result==JFileChooser.APPROVE_OPTION){
            f=fc.getSelectedFile();
            fileName=f.getAbsolutePath();
            try{
            fileName=fileName.replace("\\\\","\\");
            int w=image.getWidth(),h=image.getHeight();
            image.setIcon(new ImageIcon(new ImageIcon(fileName).getImage().getScaledInstance(w,h,Image.SCALE_SMOOTH)));
            
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }
   private void edClear(){
       txtID.setText(null);
       txtName.setText(null);
       cboGender.setSelectedItem(null);
       txtBirthDate.setDate(null);
       txtPhone.setText(null);
       cboPosition.setSelectedItem(null);
       txtSalary.setText(null);
       cboDepartMent.setSelectedItem(null);
       cboCollage.setSelectedItem(null);
       txtHiredDate.setDate(null);
       chkStopWork.setSelected(false);
       Img.setIcon(null);
       txtPlaceofBirth.setText(null);
   } 
    
}

