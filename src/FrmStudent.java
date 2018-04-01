
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
import java.text.DateFormat;
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


public class FrmStudent extends javax.swing.JPanel {
    DalinType dalin=new DalinType();
    DateFormat sdf=new SimpleDateFormat("dd/MM/YYYY");
    public FrmStudent() {
        initComponents();
        setSize(1312, 692);
        setLocation(295,80);
        txtBirthDAte.setDateFormatString("dd/MM/YYYY");
        try{
            con=DalinConnectSql.getDalinConnection();
            
        }catch(Exception e){}
        edShowData();
        txtID.requestFocus();
        btnDelete.setEnabled(false);    
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPhoneStu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtParentContact = new javax.swing.JTextField();
        cboDepartment = new javax.swing.JComboBox<>();
        cboCollege = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtGeneration = new javax.swing.JTextField();
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
        txtBirthDAte = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        Img = new javax.swing.JLabel();
        btnBros = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbStudent = new javax.swing.JTable();
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
        jLabel1.setText("Students Information");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel1);
        jLabel1.setBounds(320, 20, 280, 40);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Student Phone ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(12, 13, 120, 31);

        txtPhoneStu.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtPhoneStu.setText("0");
        txtPhoneStu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneStuKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneStuKeyTyped(evt);
            }
        });
        jPanel1.add(txtPhoneStu);
        txtPhoneStu.setBounds(130, 10, 257, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Department");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 110, 90, 31);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Parents Contact");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 60, 120, 31);

        txtParentContact.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtParentContact.setText("0");
        txtParentContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtParentContactKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtParentContactKeyTyped(evt);
            }
        });
        jPanel1.add(txtParentContact);
        txtParentContact.setBounds(130, 60, 257, 30);

        cboDepartment.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cboDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer Science", "Comper enginering", "Khmer lec" }));
        cboDepartment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboDepartmentKeyReleased(evt);
            }
        });
        jPanel1.add(cboDepartment);
        cboDepartment.setBounds(130, 110, 260, 30);

        cboCollege.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cboCollege.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Science", "Socail" }));
        cboCollege.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboCollegeKeyReleased(evt);
            }
        });
        jPanel1.add(cboCollege);
        cboCollege.setBounds(130, 160, 260, 30);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Collage");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(10, 160, 90, 31);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Generation");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 210, 120, 31);

        txtGeneration.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(txtGeneration);
        txtGeneration.setBounds(130, 210, 257, 30);

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
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });
        jPanel2.add(txtID);
        txtID.setBounds(130, 10, 257, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Name");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 60, 90, 31);

        txtName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        jPanel2.add(txtName);
        txtName.setBounds(130, 60, 257, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Birth Date");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 160, 90, 31);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Gender");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 110, 90, 31);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Place of Birth");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 220, 110, 31);

        cboGender.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        cboGender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboGenderKeyReleased(evt);
            }
        });
        jPanel2.add(cboGender);
        cboGender.setBounds(130, 110, 260, 30);

        txtPlaceofBirth.setColumns(20);
        txtPlaceofBirth.setRows(5);
        txtPlaceofBirth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPlaceofBirthKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtPlaceofBirth);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(130, 210, 260, 60);

        txtBirthDAte.setDateFormatString("dd/MM/YYYY");
        txtBirthDAte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBirthDAteKeyReleased(evt);
            }
        });
        jPanel2.add(txtBirthDAte);
        txtBirthDAte.setBounds(130, 160, 260, 30);

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

        btnBros.setText("Brows");
        btnBros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrosActionPerformed(evt);
            }
        });
        add(btnBros);
        btnBros.setBounds(1040, 290, 61, 23);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(null);

        tbStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "Birth Date", "Place of Birh", "Phone", "Parents Contact", "Department", "Collage", "Photo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbStudentMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbStudent);
        if (tbStudent.getColumnModel().getColumnCount() > 0) {
            tbStudent.getColumnModel().getColumn(0).setResizable(false);
            tbStudent.getColumnModel().getColumn(1).setResizable(false);
            tbStudent.getColumnModel().getColumn(2).setResizable(false);
            tbStudent.getColumnModel().getColumn(3).setResizable(false);
            tbStudent.getColumnModel().getColumn(4).setResizable(false);
            tbStudent.getColumnModel().getColumn(5).setResizable(false);
            tbStudent.getColumnModel().getColumn(6).setResizable(false);
            tbStudent.getColumnModel().getColumn(7).setResizable(false);
            tbStudent.getColumnModel().getColumn(8).setResizable(false);
            tbStudent.getColumnModel().getColumn(9).setResizable(false);
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

    private void btnBrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrosActionPerformed
        ImgDalinBros(Img);
    }//GEN-LAST:event_btnBrosActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
         switch(btnSave.getText()){
             case"Save":
                 edSave();
                 break;
             case"Update":
                 edUpdate();
                 txtID.setEnabled(true);
                 btnDelete.setEnabled(false);
                 btnSave.setText("Save");
                 break;
         }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyReleased
          DalinType.enterJText(txtID, evt);
    }//GEN-LAST:event_txtIDKeyReleased

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        DalinType.enterJText(txtName, evt);
    }//GEN-LAST:event_txtNameKeyReleased

    private void cboGenderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboGenderKeyReleased
         DalinType.enterCbo(cboGender, evt);
    }//GEN-LAST:event_cboGenderKeyReleased

    private void txtPlaceofBirthKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlaceofBirthKeyReleased
           //d.enterJText(txtPlaceofBirth, evt);
    }//GEN-LAST:event_txtPlaceofBirthKeyReleased

    private void txtBirthDAteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBirthDAteKeyReleased
          DalinType.enterJDate(txtBirthDAte, evt);
    }//GEN-LAST:event_txtBirthDAteKeyReleased

    private void txtPhoneStuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneStuKeyReleased
         DalinType.enterJText(txtPhoneStu, evt);
    }//GEN-LAST:event_txtPhoneStuKeyReleased

    private void txtParentContactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtParentContactKeyReleased
           DalinType.enterJText(txtParentContact, evt);
    }//GEN-LAST:event_txtParentContactKeyReleased

    private void cboDepartmentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboDepartmentKeyReleased
         DalinType.enterCbo(cboDepartment, evt);
    }//GEN-LAST:event_cboDepartmentKeyReleased

    private void cboCollegeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboCollegeKeyReleased
           
    }//GEN-LAST:event_cboCollegeKeyReleased
    
    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
          DalinType.typeNumber(evt);
    }//GEN-LAST:event_txtIDKeyTyped

    private void txtPhoneStuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneStuKeyTyped
       DalinType.typeLimit(txtPhoneStu, evt);
    }//GEN-LAST:event_txtPhoneStuKeyTyped

    private void txtParentContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtParentContactKeyTyped
       DalinType.typeLimit(txtParentContact, evt);
    }//GEN-LAST:event_txtParentContactKeyTyped
   Date date=new Date();
    private void tbStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbStudentMouseClicked
        if(evt.getClickCount()==2){
            int index=tbStudent.getSelectedRow();
            txtID.setText(tbStudent.getValueAt(index,0).toString());
            txtName.setText(tbStudent.getValueAt(index,1).toString());
            cboGender.setSelectedItem(tbStudent.getValueAt(index,2));
            String dob=tbStudent.getValueAt(index,3).toString();
            try {
                Date date=sdf.parse(dob);
                txtBirthDAte.setDate(date);
                
                int id=Integer.parseInt(tbStudent.getValueAt(index,0).toString());
               stm=con.createStatement();
               rst=stm.executeQuery("select Picture from student where ID="+id);
               if(rst.next()){
                   img=rst.getBytes(1);
                   Img.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(img).getScaledInstance(Img.getWidth(), Img.getHeight(), Image.SCALE_SMOOTH)));
               }
            } catch (NumberFormatException | SQLException | ParseException ex) {
                
            }
            txtPlaceofBirth.setText(tbStudent.getValueAt(index,4).toString());
            txtPhoneStu.setText(tbStudent.getValueAt(index,5).toString());
            txtParentContact.setText(tbStudent.getValueAt(index,6).toString());
            cboDepartment.setSelectedItem(tbStudent.getValueAt(index,7).toString());
            cboCollege.setSelectedItem(tbStudent.getValueAt(index,8).toString());
            txtGeneration.setText(tbStudent.getValueAt(index,9).toString());
            txtID.setEnabled(false);
            btnSave.setText("Update");
            btnDelete.setEnabled(true);
        }
    }//GEN-LAST:event_tbStudentMouseClicked

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
         DalinType.typeCharacter(evt);
    }//GEN-LAST:event_txtNameKeyTyped

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
         edDelete();
         txtID.setEnabled(true);
         btnSave.setText("Save");
         btnDelete.setEnabled(false);
    }//GEN-LAST:event_btnDeleteActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Img;
    private javax.swing.JButton btnBros;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cboCollege;
    private javax.swing.JComboBox<String> cboDepartment;
    private javax.swing.JComboBox<String> cboGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JTable tbStudent;
    private com.toedter.calendar.JDateChooser txtBirthDAte;
    private javax.swing.JTextField txtGeneration;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtParentContact;
    private javax.swing.JTextField txtPhoneStu;
    private javax.swing.JTextArea txtPlaceofBirth;
    // End of variables declaration//GEN-END:variables
    FileInputStream fis;
    int leng;
    byte[] img;
    Connection con;
    PreparedStatement ps;
    File f;
    String fileName;
    ResultSet rst;
    Statement stm;
    DefaultTableModel mode=new DefaultTableModel();
    public void edSave(){
        try {
            con=DalinConnectSql.getDalinConnection();
            ps=con.prepareCall("insert into student values(?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1,Integer.parseInt(txtID.getText().trim()));
            ps.setString(2,txtName.getText().trim());
            ps.setString(3,cboGender.getSelectedItem().toString());
            ps.setString(4,((JTextField)txtBirthDAte.getDateEditor().getUiComponent()).getText());
            ps.setString(5,txtPlaceofBirth.getText().trim());
            ps.setString(6,txtPhoneStu.getText().trim());
            ps.setString(7,txtParentContact.getText().trim());
            ps.setString(8,cboDepartment.getSelectedItem().toString());
            ps.setString(9,cboCollege.getSelectedItem().toString());
            ps.setString(10,txtGeneration.getText());
                if(fileName!=null){
                     fis=new FileInputStream(f);
                    leng=(int)f.length();
            ps.setBinaryStream(11, fis, leng);
                }
                else {
            ps.setBinaryStream(11, new ByteArrayInputStream(img),img.length);
                 }
                        
            ps.execute();
            edShowData();
            MainForm.classDetail.edScStaffID();
            MainForm.register.edScStudentID();
            MainForm.assigment.edSCStudentID();
            edClear();
            
        } catch (FileNotFoundException | NumberFormatException | SQLException ex) {
            JOptionPane.showMessageDialog(this,ex);
        }
    }
    private void edUpdate(){
         try {
            con=DalinConnectSql.getDalinConnection();
            ps=con.prepareCall("update student set Name=?,Gender=?,BirthDate=?,Address=?,Phone=?,Par_Contacts=?,Department=?,College=?,Generation=?,Picture=? where ID=?");
          
            ps.setString(1,txtName.getText().trim());
            ps.setString(2,cboGender.getSelectedItem().toString());
            ps.setString(3,((JTextField)txtBirthDAte.getDateEditor().getUiComponent()).getText());
            ps.setString(4,txtPlaceofBirth.getText().trim());
            ps.setString(5,txtPhoneStu.getText().trim());
            ps.setString(6,txtParentContact.getText().trim());
            ps.setString(7,cboDepartment.getSelectedItem().toString());
            ps.setString(8,cboCollege.getSelectedItem().toString());
            ps.setString(9,txtGeneration.getText());
                if(fileName!=null){
                     fis=new FileInputStream(f);
                    leng=(int)f.length();
            ps.setBinaryStream(10, fis, leng);
                }
                else {
            ps.setBinaryStream(10, new ByteArrayInputStream(img),img.length);
                 }
                        
            ps.setInt(11,Integer.parseInt(txtID.getText().trim()));
            ps.execute();
            edShowData();
            edClear();
        } catch (FileNotFoundException | NumberFormatException | SQLException ex) {
            JOptionPane.showMessageDialog(this,ex);
        }
    }
    private void edDelete(){
        try{
        ps=con.prepareCall("delete from student where ID=?");
        ps.setInt(1,Integer.parseInt(txtID.getText()));
        ps.execute();
        edShowData();
        edClear();
        MainForm.classDetail.edScStaffID();
        MainForm.register.edScStudentID();
        MainForm.assigment.edSCStudentID();
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
    public void edShowData(){
        try{ 
        while(mode.getRowCount()>0)
           
            mode.removeRow(0);
            mode=(DefaultTableModel)tbStudent.getModel();
                stm=con.createStatement();
                rst=stm.executeQuery("select * from student");
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
                    rst.getString(11)
                    });
                }while(rst.next());
            
            }catch(SQLException e){JOptionPane.showMessageDialog(this,e);}            
    }
    private void edClear(){
        txtID.setText(null);
        txtName.setText(null);
        cboGender.setSelectedItem(null);
        txtBirthDAte.setDate(null);
        txtPlaceofBirth.setText(null);
        txtPhoneStu.setText(null);
        txtParentContact.setText(null);
        cboDepartment.setSelectedItem(null);
        cboCollege.setSelectedItem(null);
        txtGeneration.setText(null);
        Img.setIcon(null);
    }
}

