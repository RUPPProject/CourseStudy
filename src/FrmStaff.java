
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
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public class FrmStaff extends javax.swing.JPanel {
    Connection con;
    ResultSet rst;
    Statement stm;
    DefaultTableModel mode =new DefaultTableModel();
    public FrmStaff() {
        initComponents();
        setSize(1312, 692);
        setLocation(295, 80);
        try{
             con=DalinConnectSql.getDalinConnection();
        }catch(Exception e){
           
        }
        edShowData();
        btnDelete.setEnabled(false);
        btnCancel.setEnabled(false);
        txtPlaceofBirth.setWrapStyleWord(true);
        txtPlaceofBirth.setLineWrap(true);
        txtID.requestFocus();
        btnCancel.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cboPosition = new javax.swing.JComboBox<>();
        txtHiredDate = new com.toedter.calendar.JDateChooser();
        chkStopWork = new javax.swing.JCheckBox();
        lblshow_phone = new javax.swing.JLabel();
        lblshowSalary = new javax.swing.JLabel();
        lblshow_hireddate = new javax.swing.JLabel();
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
        txtDateofBirth = new com.toedter.calendar.JDateChooser();
        lblshow_id = new javax.swing.JLabel();
        lblshow_name = new javax.swing.JLabel();
        lblshow_birthdate = new javax.swing.JLabel();
        lblshow_Pbirth = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Img = new javax.swing.JLabel();
        btnBrows = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbStaff = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblshow_Img = new javax.swing.JLabel();

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
        jLabel1.setBounds(380, 20, 290, 40);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Phone");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(12, 13, 90, 31);

        txtPhone.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtPhone.setText("0");
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneKeyTyped(evt);
            }
        });
        jPanel1.add(txtPhone);
        txtPhone.setBounds(130, 10, 257, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Position");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 60, 90, 31);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Hired Date");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 160, 90, 31);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Salary");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 110, 90, 31);

        txtSalary.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSalaryKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalaryKeyTyped(evt);
            }
        });
        jPanel1.add(txtSalary);
        txtSalary.setBounds(130, 110, 257, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Stop Work");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 210, 90, 31);

        cboPosition.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cboPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrator", "Manager", "Receptionish", "Cleaner", "Security" }));
        cboPosition.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboPositionKeyReleased(evt);
            }
        });
        jPanel1.add(cboPosition);
        cboPosition.setBounds(130, 60, 260, 30);

        txtHiredDate.setDateFormatString("dd-MM-yyyy");
        txtHiredDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtHiredDatePropertyChange(evt);
            }
        });
        txtHiredDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHiredDateKeyReleased(evt);
            }
        });
        jPanel1.add(txtHiredDate);
        txtHiredDate.setBounds(130, 160, 260, 30);
        jPanel1.add(chkStopWork);
        chkStopWork.setBounds(140, 210, 20, 21);

        lblshow_phone.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblshow_phone.setForeground(new java.awt.Color(255, 0, 102));
        lblshow_phone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblshow_phone);
        lblshow_phone.setBounds(140, 40, 220, 20);

        lblshowSalary.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblshowSalary.setForeground(new java.awt.Color(255, 0, 102));
        lblshowSalary.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblshowSalary);
        lblshowSalary.setBounds(140, 140, 240, 20);

        lblshow_hireddate.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblshow_hireddate.setForeground(new java.awt.Color(255, 0, 102));
        lblshow_hireddate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblshow_hireddate);
        lblshow_hireddate.setBounds(140, 190, 220, 20);

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

        txtDateofBirth.setDateFormatString("dd-MM-yyyy");
        txtDateofBirth.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtDateofBirthPropertyChange(evt);
            }
        });
        txtDateofBirth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDateofBirthKeyReleased(evt);
            }
        });
        jPanel2.add(txtDateofBirth);
        txtDateofBirth.setBounds(130, 160, 260, 30);

        lblshow_id.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblshow_id.setForeground(new java.awt.Color(255, 0, 102));
        lblshow_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblshow_id);
        lblshow_id.setBounds(140, 40, 220, 20);

        lblshow_name.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblshow_name.setForeground(new java.awt.Color(255, 0, 102));
        lblshow_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblshow_name);
        lblshow_name.setBounds(140, 90, 220, 20);

        lblshow_birthdate.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblshow_birthdate.setForeground(new java.awt.Color(255, 0, 102));
        lblshow_birthdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblshow_birthdate);
        lblshow_birthdate.setBounds(140, 190, 220, 20);

        lblshow_Pbirth.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblshow_Pbirth.setForeground(new java.awt.Color(255, 0, 102));
        lblshow_Pbirth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblshow_Pbirth);
        lblshow_Pbirth.setBounds(140, 270, 220, 20);

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
        jPanel3.setBounds(950, 70, 180, 230);

        btnBrows.setText("Brows");
        btnBrows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowsActionPerformed(evt);
            }
        });
        add(btnBrows);
        btnBrows.setBounds(1000, 300, 80, 23);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(null);

        tbStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "Birth Date", "Place of Birh", "Phone", "Position", "Salary", "Hired Date", "Stop Work"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbStaffMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbStaff);
        if (tbStaff.getColumnModel().getColumnCount() > 0) {
            tbStaff.getColumnModel().getColumn(0).setResizable(false);
            tbStaff.getColumnModel().getColumn(1).setResizable(false);
            tbStaff.getColumnModel().getColumn(2).setResizable(false);
            tbStaff.getColumnModel().getColumn(3).setResizable(false);
            tbStaff.getColumnModel().getColumn(4).setResizable(false);
            tbStaff.getColumnModel().getColumn(5).setResizable(false);
            tbStaff.getColumnModel().getColumn(6).setResizable(false);
            tbStaff.getColumnModel().getColumn(7).setResizable(false);
            tbStaff.getColumnModel().getColumn(8).setResizable(false);
            tbStaff.getColumnModel().getColumn(9).setResizable(false);
        }

        jPanel4.add(jScrollPane3);
        jScrollPane3.setBounds(10, 50, 1210, 241);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Search by: ID , Name");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(10, 10, 170, 31);

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel4.add(txtSearch);
        txtSearch.setBounds(200, 10, 730, 30);

        add(jPanel4);
        jPanel4.setBounds(10, 380, 1230, 300);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);

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
        jPanel5.setBounds(1140, 140, 130, 130);

        lblshow_Img.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblshow_Img.setForeground(new java.awt.Color(255, 0, 102));
        lblshow_Img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(lblshow_Img);
        lblshow_Img.setBounds(940, 330, 220, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    @SuppressWarnings("empty-statement")
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        switch(btnSave.getText()){
            case "Save":
                if(txtID.getText().equals("")){
                    lblshow_id.setText("Please input staff id!");
                    txtID.requestFocus();
                    return;
                }
                else if(txtName.getText().equals("")){
                    lblshow_name.setText("Please input staff name!");
                    txtName.requestFocus();
                    return ;
                }
                String n=((JTextField)txtDateofBirth.getDateEditor().getUiComponent()).getText();
                if(n.equals("")){
                        lblshow_birthdate.setText("Please choose date of birth staff!");
                        txtDateofBirth.requestFocus();
                        return;
                 } 
                else if(txtPlaceofBirth.getText().equals("")){
                    lblshow_Pbirth.setText("Please input place of birth staff!");
                    txtPlaceofBirth.requestFocus();
                    return;
                }
                int tc=txtPhone.getText().length();
                if(tc<=8){
                    lblshow_phone.setText("Phone number of staff is incorrect!");
                    txtPhone.requestFocus();
                    return;
                }
                if(txtSalary.getText().equals("")){
                    lblshowSalary.setText("Please input salery of staff!");
                    txtSalary.requestFocus();;
                    return;
                }
                String hd=((JTextField)txtHiredDate.getDateEditor().getUiComponent()).getText();
                if(hd.equals("")){
                    lblshow_hireddate.setText("Please choose hired date of staff!");
                    txtHiredDate.requestFocus();;
                    return ;
                }
                if(Img.getIcon()==null){
                    lblshow_Img.setText("Please choose staff image!");
                    btnBrows.requestFocus();
                    return;
                }
                 edSave();
                break;
            case  "Update":
                edUpdate();
                btnSave.setText("Save");
                btnDelete.setEnabled(false);
                txtID.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_btnSaveActionPerformed
   
    private void btnBrowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowsActionPerformed
        lblshow_Img.setText("");
        ImgDalinBros(Img);
        
        
    }//GEN-LAST:event_btnBrowsActionPerformed
   
            
    private void tbStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbStaffMouseClicked
         if(evt.getClickCount()==2){
            int index=tbStaff.getSelectedRow();
            txtID.setText(tbStaff.getValueAt(index,0).toString());
            txtName.setText(tbStaff.getValueAt(index,1).toString());
            cboGender.setSelectedItem(tbStaff.getValueAt(index,2));
            try {
                String birth=tbStaff.getValueAt(index,3).toString();
             SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date d=sdf.parse(birth);
            txtDateofBirth.setDate(d);
            
            String hireddate=tbStaff.getValueAt(index,8).toString();
            d=sdf.parse(hireddate);
            txtHiredDate.setDate(d);           

                int id=Integer.parseInt(tbStaff.getValueAt(index,0).toString());
               stm=con.createStatement();
               rst=stm.executeQuery("select Picture from staff where ID="+id);
               if(rst.next()){
                   img=rst.getBytes(1);
                   Img.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(img).getScaledInstance(Img.getWidth(), Img.getHeight(), Image.SCALE_SMOOTH)));
               }
            } catch (NumberFormatException | SQLException | ParseException ex) {
                
            }
            txtPlaceofBirth.setText(tbStaff.getValueAt(index,4).toString());
            txtPhone.setText(tbStaff.getValueAt(index,5).toString());
            cboPosition.setSelectedItem(tbStaff.getValueAt(index,6).toString());
            txtSalary.setText(tbStaff.getValueAt(index,7).toString());
            String d=tbStaff.getValueAt(index,9).toString();
            if(d.equals(yes)){
                chkStopWork.setSelected(true);
            }
            else{
                chkStopWork.setSelected(false);
            }
            btnSave.setText("Update");
            btnDelete.setEnabled(true);
            txtID.setEnabled(false);
            btnCancel.setEnabled(true);
        }

    }//GEN-LAST:event_tbStaffMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
      int ask=JOptionPane.showConfirmDialog(null,"Do you want to delete data?", "Delete Data", JOptionPane.YES_NO_OPTION);
       if(ask==JOptionPane.YES_OPTION){
        edDelete();
         btnSave.setText("Save");
         btnDelete.setEnabled(false);
         txtID.setEnabled(true);
       }
       else{}
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        DalinType.typeNumber(evt);
    }//GEN-LAST:event_txtIDKeyTyped

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        DalinType.typeCharacter(evt);
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyTyped
        DalinType.type10(txtPhone, evt);
    }//GEN-LAST:event_txtPhoneKeyTyped

    private void txtSalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalaryKeyTyped
        DalinType.type1Dot(evt, txtSalary);
    }//GEN-LAST:event_txtSalaryKeyTyped

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
            btnSave.setText("Save"); 
            btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-22.png")));
             btnDelete.setEnabled(false);
             btnCancel.setEnabled(false);
             txtID.setEnabled(true);
             edClear();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyReleased
         DalinType.enterJText(txtName, evt);
         lblshow_id.setText("");
    }//GEN-LAST:event_txtIDKeyReleased

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
         DalinType.enterCbo(cboGender, evt);
         lblshow_name.setText("");
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtDateofBirthPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtDateofBirthPropertyChange
        lblshow_birthdate.setText("");
    }//GEN-LAST:event_txtDateofBirthPropertyChange

    private void txtPlaceofBirthKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlaceofBirthKeyReleased
        lblshow_Pbirth.setText("");
    }//GEN-LAST:event_txtPlaceofBirthKeyReleased

    private void txtPhoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyReleased
        DalinType.enterCbo(cboPosition, evt);
        lblshow_phone.setText("");
    }//GEN-LAST:event_txtPhoneKeyReleased

    private void txtSalaryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalaryKeyReleased
        DalinType.enterJDate(txtHiredDate, evt);
        lblshowSalary.setText("");
    }//GEN-LAST:event_txtSalaryKeyReleased

    private void txtHiredDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtHiredDatePropertyChange
        lblshow_hireddate.setText("");
    }//GEN-LAST:event_txtHiredDatePropertyChange

    private void cboGenderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboGenderKeyReleased
          DalinType.enterJDate(txtDateofBirth, evt);
    }//GEN-LAST:event_cboGenderKeyReleased

    private void txtDateofBirthKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateofBirthKeyReleased
         DalinType.enterJTextArea(txtPlaceofBirth, evt);
    }//GEN-LAST:event_txtDateofBirthKeyReleased

    private void cboPositionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboPositionKeyReleased
         DalinType.enterJText(txtSalary, evt);
    }//GEN-LAST:event_cboPositionKeyReleased

    private void txtHiredDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHiredDateKeyReleased
         DalinType.enterJButton(btnBrows, evt);
    }//GEN-LAST:event_txtHiredDateKeyReleased

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        try{
            while(mode.getRowCount()>0)
                mode.removeRow(0);
                mode=(DefaultTableModel)tbStaff.getModel();
                String sql="select * from staff where ID=? or Name=?";
                ps=con.prepareCall(sql);
                ps.setString(1, txtSearch.getText());
                ps.setString(2, txtSearch.getText());
                rst=ps.executeQuery();
                if(rst.first()){
                    do{
                        mode.addRow(new String[]{
                        rst.getString(1),    
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9),
                    rst.getString(10)
                    
                                });
                    }while(rst.next());
                }
                else {edShowData();}
        }catch(Exception e){}
    }//GEN-LAST:event_txtSearchKeyReleased
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Img;
    private javax.swing.JButton btnBrows;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cboGender;
    private javax.swing.JComboBox<String> cboPosition;
    private javax.swing.JCheckBox chkStopWork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel lblshowSalary;
    private javax.swing.JLabel lblshow_Img;
    private javax.swing.JLabel lblshow_Pbirth;
    private javax.swing.JLabel lblshow_birthdate;
    private javax.swing.JLabel lblshow_hireddate;
    private javax.swing.JLabel lblshow_id;
    private javax.swing.JLabel lblshow_name;
    private javax.swing.JLabel lblshow_phone;
    private javax.swing.JTable tbStaff;
    private com.toedter.calendar.JDateChooser txtDateofBirth;
    private com.toedter.calendar.JDateChooser txtHiredDate;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextArea txtPlaceofBirth;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
   FileInputStream fis;
    int leng;
    byte[] img;
   
    PreparedStatement ps;
    File f;
    String fileName;
    String yes="Yes";
    String no="No";
    
   
    public void edSave(){
        try {
            con=DalinConnectSql.getDalinConnection();
            ps=con.prepareCall("insert into staff values(?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1,Integer.parseInt(txtID.getText().trim()));
            ps.setString(2,txtName.getText().trim());
            ps.setString(3,cboGender.getSelectedItem().toString());
            ps.setString(4,((JTextField)txtDateofBirth.getDateEditor().getUiComponent()).getText());
            ps.setString(5,txtPlaceofBirth.getText().trim());
            ps.setString(6,txtPhone.getText().trim());
            ps.setString(7,cboPosition.getSelectedItem().toString());
            ps.setDouble(8,Double.parseDouble(txtSalary.getText()));
            ps.setString(9,((JTextField)txtHiredDate.getDateEditor().getUiComponent()).getText());
          
            if(chkStopWork.isSelected()){
                ps.setString(10,yes);
            }
            if(!chkStopWork.isSelected()){
                ps.setString(10,no);
            }
           
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
            edClear();
            MainForm.account.edSCStaffID();
            //MainForm.register.edSCStaffID();
        } catch (FileNotFoundException | NumberFormatException | SQLException ex) {
            JOptionPane.showMessageDialog(this,ex);
        }
    }
    public void edUpdate(){
          try {
            con=DalinConnectSql.getDalinConnection();
            ps=con.prepareCall("update staff set Name=?,Gender=?,BirtDate=?,PlaceBirth=?,Phone=?,Position=?,Salary=?,HiredDate=?,StopWork=?,Picture=? where ID=?");
            
            ps.setString(1,txtName.getText().trim());
            ps.setString(2,cboGender.getSelectedItem().toString());
            ps.setString(3,((JTextField)txtDateofBirth.getDateEditor().getUiComponent()).getText());
            ps.setString(4,txtPlaceofBirth.getText().trim());
            ps.setString(5,txtPhone.getText().trim());
            ps.setString(6,cboPosition.getSelectedItem().toString());
            ps.setDouble(7,Double.parseDouble(txtSalary.getText()));
            ps.setString(8,((JTextField)txtHiredDate.getDateEditor().getUiComponent()).getText());
          
            if(chkStopWork.isSelected()){
                ps.setString(9,yes);
            }
            if(!chkStopWork.isSelected()){
                ps.setString(9,no);
            }
           
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
    public void edDelete(){
        try{
            con=DalinConnectSql.getDalinConnection();
            ps=con.prepareCall("delete from staff where ID=?");
            ps.setInt(1, Integer.parseInt(txtID.getText()));
            ps.execute();
            edShowData();
            edClear();
            MainForm.account.edSCStaffID();
          //  MainForm.register.edSCStaffID();
        }catch(NumberFormatException | SQLException e){JOptionPane.showMessageDialog(this, e);}
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
            mode=(DefaultTableModel)tbStaff.getModel();
                stm=con.createStatement();
                rst=stm.executeQuery("select * from staff");
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
                    rst.getString(10)
            
                    });
                }while(rst.next());
            
            }catch(SQLException e){JOptionPane.showMessageDialog(this,e);}            
    }
   private void edClear(){
       txtID.setText(null);
       txtName.setText(null);
       cboGender.setSelectedItem(null);
       txtDateofBirth.setDate(null);
       txtPlaceofBirth.setText(null);
       txtPhone.setText(null);
       cboPosition.setSelectedItem(null);
       txtSalary.setText(null);
       txtHiredDate.setDate(null);
       chkStopWork.setSelected(false);
       Img.setIcon(null);
   }
}

