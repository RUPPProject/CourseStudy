
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmPeriod extends javax.swing.JPanel {
    public FrmPeriod() {
        initComponents();
        setSize(541, 516);
        setLocation(500,100);
        try{
        con=DalinConnectSql.getDalinConnection();
        }catch(Exception e){}
        edShowData();
        btnCancel.setEnabled(false);
        btnDelete.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cboTime = new javax.swing.JComboBox<>();
        txtEndDate = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        lblshow_id = new javax.swing.JLabel();
        lblshow_endTime = new javax.swing.JLabel();
        lblshow_starttime = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPeroid = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("ID");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(12, 13, 120, 31);

        txtID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });
        jPanel2.add(txtID);
        txtID.setBounds(160, 10, 200, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Time");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 60, 140, 31);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setText("Start Time");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(10, 100, 130, 31);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setText("End Time");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(10, 150, 130, 31);

        cboTime.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cboTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning", "Evening", "Night" }));
        cboTime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboTimeKeyReleased(evt);
            }
        });
        jPanel2.add(cboTime);
        cboTime.setBounds(160, 60, 200, 30);

        txtEndDate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtEndDate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtEndDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEndDateFocusLost(evt);
            }
        });
        txtEndDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndDateActionPerformed(evt);
            }
        });
        txtEndDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEndDateKeyReleased(evt);
            }
        });
        jPanel2.add(txtEndDate);
        txtEndDate.setBounds(160, 150, 200, 30);

        txtStartDate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtStartDate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtStartDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtStartDateFocusLost(evt);
            }
        });
        txtStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStartDateActionPerformed(evt);
            }
        });
        txtStartDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtStartDateKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStartDateKeyTyped(evt);
            }
        });
        jPanel2.add(txtStartDate);
        txtStartDate.setBounds(160, 100, 200, 30);

        lblshow_id.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblshow_id.setForeground(new java.awt.Color(255, 0, 102));
        lblshow_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblshow_id);
        lblshow_id.setBounds(160, 40, 200, 20);

        lblshow_endTime.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblshow_endTime.setForeground(new java.awt.Color(255, 0, 102));
        lblshow_endTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblshow_endTime);
        lblshow_endTime.setBounds(160, 180, 200, 20);

        lblshow_starttime.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblshow_starttime.setForeground(new java.awt.Color(255, 0, 102));
        lblshow_starttime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblshow_starttime);
        lblshow_starttime.setBounds(160, 130, 200, 20);

        add(jPanel2);
        jPanel2.setBounds(10, 60, 380, 210);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Period");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel1);
        jLabel1.setBounds(60, 10, 290, 40);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);

        btnDelete.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-trash-25.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
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
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
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
        jPanel5.setBounds(400, 110, 130, 130);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        tbPeroid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Time", "Start Date", "End Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPeroid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPeroidMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPeroid);
        if (tbPeroid.getColumnModel().getColumnCount() > 0) {
            tbPeroid.getColumnModel().getColumn(0).setResizable(false);
            tbPeroid.getColumnModel().getColumn(1).setResizable(false);
            tbPeroid.getColumnModel().getColumn(2).setResizable(false);
            tbPeroid.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(12, 48, 496, 170);

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
        jPanel1.add(txtSearch);
        txtSearch.setBounds(170, 10, 200, 30);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setText("Search");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(20, 10, 130, 31);

        add(jPanel1);
        jPanel1.setBounds(10, 270, 520, 230);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
         switch(btnSave.getText()){
             case"Save":
                 if(txtID.getText().equals("")){
                     lblshow_id.setText("Please input period id!");
                     txtID.requestFocus();
                     return;
                 }
                 else if(txtStartDate.getText().equals("")){
                     lblshow_starttime.setText("Please input start time period");
                     txtStartDate.requestFocus();
                     return;
                 }
                 else if(txtEndDate.getText().equals("")){
                     lblshow_endTime.setText("Please input endt time period!");
                     txtEndDate.requestFocus();
                     return;
                 }
                 edSave();
                 MainForm.ref.course.edSCPeriodID();
                 edClear();
                 break;
             case"Update":
                 edUpdate();
                 btnSave.setText("Save");
                 txtID.setEnabled(true);
                 edClear();
                break;
         }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tbPeroidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPeroidMouseClicked
        if(evt.getClickCount()==2){
            int index =tbPeroid.getSelectedRow();
            txtID.setText(tbPeroid.getValueAt(index,0).toString());
            cboTime.setSelectedItem(tbPeroid.getValueAt(index, 1));
            txtStartDate.setText(tbPeroid.getValueAt(index,2).toString());
             txtEndDate.setText(tbPeroid.getValueAt(index,3).toString());
//             try {
//            String start=tbPeroid.getValueAt(index,2).toString();
//            SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
//                Date date1;
//                date1=sdf.parse(start);
//               txtStartDate.setDate(date1);
//            String end=tbPeroid.getValueAt(index, 3).toString();
//               Date date=sdf.parse(end);
//                txtEndDate.setDate(date);
//            } catch (ParseException ex) {
//               
//            }
             btnSave.setText("Update");
             btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-available-updates-25.png")));
             btnCancel.setEnabled(true);
             btnDelete.setEnabled(true);
              txtID.setEnabled(false);
        }
    }//GEN-LAST:event_tbPeroidMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int ask=JOptionPane.showConfirmDialog(null,"Do you want to delete?","Delete Data",JOptionPane.YES_NO_OPTION);
        if(ask==JOptionPane.YES_OPTION){
            edDelete();
        }
        else{}
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtEndDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndDateActionPerformed

    private void txtStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartDateActionPerformed

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        DalinType.typeNumber(evt);
    }//GEN-LAST:event_txtIDKeyTyped

    private void txtIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyReleased
        DalinType.enterCbo(cboTime, evt);
        lblshow_id.setText("");
    }//GEN-LAST:event_txtIDKeyReleased

    private void txtStartDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStartDateKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartDateKeyTyped

    private void txtStartDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStartDateKeyReleased
        DalinType.enterJText(txtEndDate, evt);
        lblshow_starttime.setText("");
    }//GEN-LAST:event_txtStartDateKeyReleased

    private void txtEndDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEndDateKeyReleased
        DalinType.enterJButton(btnSave, evt);
        lblshow_endTime.setText("");
    }//GEN-LAST:event_txtEndDateKeyReleased

    private void cboTimeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboTimeKeyReleased
      DalinType.enterJText(txtStartDate, evt);
    }//GEN-LAST:event_cboTimeKeyReleased

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        try{
            while(mode.getRowCount()>0)
                mode.removeRow(0);
                mode=(DefaultTableModel) tbPeroid.getModel();
                String sql="select * from period where ID=?";
                ps=con.prepareStatement(sql);
                ps.setString(1,txtSearch.getText());
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
                else {edShowData();}
        }catch(SQLException e){
        JOptionPane.showMessageDialog(this,e);
        }
            
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        btnSave.setText("Save");
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-22.png")));
        btnDelete.setEnabled(false);
        btnCancel.setEnabled(false);
        txtID.setEnabled(true);
        edClear();

    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtStartDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStartDateFocusLost
       DalinType.edUperCase(txtStartDate);
    }//GEN-LAST:event_txtStartDateFocusLost

    private void txtEndDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEndDateFocusLost
         DalinType.edUperCase(txtEndDate);
    }//GEN-LAST:event_txtEndDateFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cboTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblshow_endTime;
    private javax.swing.JLabel lblshow_id;
    private javax.swing.JLabel lblshow_starttime;
    private javax.swing.JTable tbPeroid;
    private javax.swing.JTextField txtEndDate;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStartDate;
    // End of variables declaration//GEN-END:variables
    Connection con;
    ResultSet rst;
    Statement stm;
    DefaultTableModel mode =new DefaultTableModel();
    PreparedStatement ps;
    
    private void edSave() {
        try{
           con=DalinConnectSql.getDalinConnection();
           ps=con.prepareCall("insert into period values(?,?,?,?)");
           ps.setInt(1,Integer.parseInt(txtID.getText()));
           ps.setString(2,cboTime.getSelectedItem().toString());
           ps.setString(3,txtStartDate.getText());
           ps.setString(4,txtEndDate.getText());
           ps.execute();
           edShowData();
           edClear();
        }catch(NumberFormatException | SQLException e){JOptionPane.showMessageDialog(null,e);}
    }
    private void edUpdate(){
                try{
           con=DalinConnectSql.getDalinConnection();
           ps=con.prepareCall("update period set Time=?,Start_Time=?,End_Time=? where ID=?");
           
           ps.setInt(4,Integer.parseInt(txtID.getText()));//cboTime.getSelectedItem().toString());
           ps.setString(1,cboTime.getSelectedItem().toString());//);
           ps.setString(2,txtStartDate.getText());
           ps.setString(3,txtEndDate.getText());
           ps.execute();
           btnSave.setText("Save");
            btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-22.png")));
            btnDelete.setEnabled(false);
            txtID.setEnabled(true);
            btnCancel.setEnabled(false);
           edShowData();
           edClear();
        }catch(NumberFormatException | SQLException e){JOptionPane.showMessageDialog(null,e);}
    }
    private void edShowData(){
        try{
            while(mode.getRowCount()>0)
                mode.removeRow(0);
                mode=(DefaultTableModel) tbPeroid.getModel();
                stm=con.createStatement();
                rst=stm.executeQuery("select * from period");
                while(rst.next()){
                    mode.addRow(new String[]{
                        rst.getString(1),
                        rst.getString(2),
                        rst.getString(3),
                        rst.getString(4)
                    });
                }
           
        }catch(SQLException e){}
    }
    private void edDelete(){
        try{
            ps=con.prepareCall("delete from period where ID=?");
            ps.setInt(1,Integer.parseInt(txtID.getText()));
            ps.execute();
            btnSave.setText("Save");
            btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-22.png")));
            txtID.setEnabled(true);
            btnDelete.setEnabled(false);
            btnCancel.setEnabled(false);
            MainForm.ref.course.edSCPeriodID();
            edShowData();
            edClear();
            
        }catch(NumberFormatException | SQLException e){JOptionPane.showMessageDialog(this,e);}
    }
    private void edClear(){
        txtID.setText(null);
        txtStartDate.setText(null);
        txtEndDate.setText(null);
    }
}
