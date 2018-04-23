
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClassRoom extends javax.swing.JPanel {
    public ClassRoom() {
        initComponents();
        setSize(650, 657);
        setLocation(400,100);
        try{
            con=DalinConnectSql.getDalinConnection();
        }catch(Exception e){}
        edShowData();
        btnDelete.setEnabled(false);
        txtID.requestFocus();
        txtDecription.setWrapStyleWord(true);
        txtDecription.setLineWrap(true);
        btnCancel.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNameBuilding = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCapacity = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDecription = new javax.swing.JTextArea();
        lblshow_id = new javax.swing.JLabel();
        lblshowClass_name = new javax.swing.JLabel();
        lblshow_NameBuilding = new javax.swing.JLabel();
        lblshow_capaty = new javax.swing.JLabel();
        lblshow_Decription = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClassRoom = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        setLayout(null);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Class Information");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel1);
        jLabel1.setBounds(100, 10, 290, 40);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("ID");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(12, 13, 150, 31);

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
        txtID.setBounds(160, 10, 257, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Class Name");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 60, 140, 31);

        txtName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        jPanel2.add(txtName);
        txtName.setBounds(160, 60, 257, 30);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Name of Building");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 110, 130, 31);

        txtNameBuilding.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtNameBuilding.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameBuildingFocusLost(evt);
            }
        });
        txtNameBuilding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameBuildingActionPerformed(evt);
            }
        });
        txtNameBuilding.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameBuildingKeyReleased(evt);
            }
        });
        jPanel2.add(txtNameBuilding);
        txtNameBuilding.setBounds(160, 110, 257, 30);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("Capacity");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(10, 160, 130, 31);

        txtCapacity.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtCapacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapacityActionPerformed(evt);
            }
        });
        txtCapacity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCapacityKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCapacityKeyTyped(evt);
            }
        });
        jPanel2.add(txtCapacity);
        txtCapacity.setBounds(160, 160, 257, 30);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("Decription");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(10, 220, 130, 31);

        txtDecription.setColumns(20);
        txtDecription.setRows(5);
        txtDecription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDecriptionKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(txtDecription);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(160, 210, 260, 70);

        lblshow_id.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblshow_id.setForeground(new java.awt.Color(255, 0, 102));
        lblshow_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblshow_id);
        lblshow_id.setBounds(170, 40, 220, 20);

        lblshowClass_name.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblshowClass_name.setForeground(new java.awt.Color(255, 0, 102));
        lblshowClass_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblshowClass_name);
        lblshowClass_name.setBounds(170, 90, 220, 20);

        lblshow_NameBuilding.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblshow_NameBuilding.setForeground(new java.awt.Color(255, 0, 102));
        lblshow_NameBuilding.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblshow_NameBuilding);
        lblshow_NameBuilding.setBounds(170, 140, 220, 20);

        lblshow_capaty.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblshow_capaty.setForeground(new java.awt.Color(255, 0, 102));
        lblshow_capaty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblshow_capaty);
        lblshow_capaty.setBounds(180, 190, 220, 20);

        lblshow_Decription.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblshow_Decription.setForeground(new java.awt.Color(255, 0, 102));
        lblshow_Decription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblshow_Decription);
        lblshow_Decription.setBounds(180, 280, 220, 20);

        add(jPanel2);
        jPanel2.setBounds(20, 60, 430, 310);

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
        jPanel5.setBounds(480, 230, 130, 130);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        tbClassRoom.setModel(new javax.swing.table.DefaultTableModel(
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
        tbClassRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClassRoomMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbClassRoom);
        if (tbClassRoom.getColumnModel().getColumnCount() > 0) {
            tbClassRoom.getColumnModel().getColumn(0).setResizable(false);
            tbClassRoom.getColumnModel().getColumn(1).setResizable(false);
            tbClassRoom.getColumnModel().getColumn(2).setResizable(false);
            tbClassRoom.getColumnModel().getColumn(3).setResizable(false);
            tbClassRoom.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 596, 180);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Search");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(20, 10, 90, 31);

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
        txtSearch.setBounds(130, 10, 257, 30);

        add(jPanel1);
        jPanel1.setBounds(20, 370, 630, 240);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNameBuildingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameBuildingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameBuildingActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtCapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapacityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapacityActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        switch(btnSave.getText()){
            case"Save":
                if(txtID.getText().equals("")){
                    lblshow_id.setText("Please input class id");
                    txtID.requestFocus();
                    return;
                }
                else if(txtName.getText().equals("")){
                    lblshowClass_name.setText("Please input class name!");
                    txtName.requestFocus();
                    return;
                }
                else if(txtNameBuilding.getText().equals("")){
                    lblshow_NameBuilding.setText("Please input building name!");
                    txtNameBuilding.requestFocus();
                    return;
                }
                else if(txtCapacity.getText().equals("")){
                    lblshow_capaty.setText("Please input capacity of class!");
                    txtCapacity.requestFocus();
                    return;
                }
                else if(txtDecription.getText().equals("")){
                    lblshow_Decription.setText("Please input room decription!");
                    txtDecription.requestFocus();
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

    private void tbClassRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClassRoomMouseClicked
       if(evt.getClickCount()==2){
           int index=tbClassRoom.getSelectedRow();
           txtID.setEnabled(false);
           txtID.setText(tbClassRoom.getValueAt(index,0).toString());
           txtName.setText(tbClassRoom.getValueAt(index, 1).toString());
           txtNameBuilding.setText(tbClassRoom.getValueAt(index,2).toString());
           txtCapacity.setText(tbClassRoom.getValueAt(index,3).toString());
           txtDecription.setText(tbClassRoom.getValueAt(index,4).toString());
             btnSave.setText("Update");
             btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-available-updates-25.png")));
             btnCancel.setEnabled(true);
             btnDelete.setEnabled(true);
       }
    }//GEN-LAST:event_tbClassRoomMouseClicked
    //DalinType ed=new DalinType();
    private void txtIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyReleased
         DalinType.enterJText(txtName, evt);
         lblshow_id.setText("");
    }//GEN-LAST:event_txtIDKeyReleased

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
         DalinType.enterJText(txtNameBuilding, evt);
         lblshowClass_name.setText("");
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
      DalinType.edUperCase(txtName);
        
    }//GEN-LAST:event_txtNameFocusLost

    private void txtNameBuildingFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameBuildingFocusLost
         DalinType.edUperCase(txtNameBuilding);
    }//GEN-LAST:event_txtNameBuildingFocusLost

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        DalinType.typeNumber(evt);
    }//GEN-LAST:event_txtIDKeyTyped

    private void txtNameBuildingKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameBuildingKeyReleased
        DalinType.enterJText(txtCapacity, evt);
        lblshow_NameBuilding.setText("");
    }//GEN-LAST:event_txtNameBuildingKeyReleased

    private void txtCapacityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapacityKeyReleased
        DalinType.enterJTextArea(txtDecription, evt);
        lblshow_capaty.setText("");
    }//GEN-LAST:event_txtCapacityKeyReleased

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        btnSave.setText("Save");
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-22.png")));
        btnDelete.setEnabled(false);
        btnCancel.setEnabled(false);
        txtID.setEnabled(true);
        edClear();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtDecriptionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDecriptionKeyReleased
        lblshow_Decription.setText("");
    }//GEN-LAST:event_txtDecriptionKeyReleased

    private void txtCapacityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapacityKeyTyped
        DalinType.typeNumber(evt);
    }//GEN-LAST:event_txtCapacityKeyTyped

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        try{
            while(mode.getRowCount()>0)
                mode.removeRow(0);
                mode=(DefaultTableModel) tbClassRoom.getModel();
                String sql="select * from classroom where ID=? or Name=?";
                ps=con.prepareStatement(sql);
                ps.setInt(1,Integer.parseInt(txtSearch.getText()));
                ps.setString(2,txtSearch.getText());
                rst=ps.executeQuery();
                if(rst.first()){
                    do{
                        mode.addRow(new String[]{
                        rst.getString(1),
                        rst.getString(2),
                        rst.getString(3),
                        rst.getString(4),
                        rst.getString(5)
                        });
                    }while(rst.next());
                }
                
                else {
                   
                    edShowData();
                    
                }
        }catch(SQLException e){}
    }//GEN-LAST:event_txtSearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblshowClass_name;
    private javax.swing.JLabel lblshow_Decription;
    private javax.swing.JLabel lblshow_NameBuilding;
    private javax.swing.JLabel lblshow_capaty;
    private javax.swing.JLabel lblshow_id;
    private javax.swing.JTable tbClassRoom;
    private javax.swing.JTextField txtCapacity;
    private javax.swing.JTextArea txtDecription;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNameBuilding;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
    PreparedStatement ps;
    Connection con;
    ResultSet rst;
    Statement stm;
    DefaultTableModel mode=new DefaultTableModel();
    private void edSave(){
        try{
           con=DalinConnectSql.getDalinConnection();
           ps=con.prepareCall("insert into classroom values(?,?,?,?,?)");
           ps.setInt(1,Integer.parseInt(txtID.getText().trim()));
           ps.setString(2,txtName.getText().trim());
           ps.setString(3,txtNameBuilding.getText().trim());
           ps.setInt(4,Integer.parseInt(txtCapacity.getText().trim()));
           ps.setString(5,txtDecription.getText());
           ps.execute();
           edShowData();
           edClear();
           MainForm.classDetail.edScClass();
           MainForm.assigment.edSCClassID();
        }catch(NumberFormatException | SQLException e){JOptionPane.showMessageDialog(this,e);}
    }
    
    private void edDelete(){
        try{
            con=DalinConnectSql.getDalinConnection();
            ps=con.prepareCall("delete from classroom where ID=?");
            ps.setInt(1,Integer.parseInt(txtID.getText()));
            ps.execute();
            edShowData();
            edClear();
             btnSave.setText("Save");
             btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-22.png")));
             btnDelete.setEnabled(false);
             btnCancel.setEnabled(false);
             txtID.setEnabled(true);
            MainForm.classDetail.edScClass();
            MainForm.assigment.edSCClassID();
        }catch(NumberFormatException | SQLException e){JOptionPane.showMessageDialog(this,e);}
    }
    private void edShowData() {
        try{
            while(mode.getRowCount()>0)
                mode.removeRow(0);
                mode=(DefaultTableModel) tbClassRoom.getModel();
                stm=con.createStatement();
                rst=stm.executeQuery("select * from classroom");
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
    private void edUpdate(){
        try{
            con=DalinConnectSql.getDalinConnection();
            ps=con.prepareCall("update classroom set Name=?,Name_Building=?,Capacity=?,Description=? where ID=?");
            ps.setString(1,txtName.getText().trim());
            ps.setString(2,txtNameBuilding.getText().trim());
            ps.setInt(3,Integer.parseInt(txtCapacity.getText().trim()));
            ps.setString(4,txtDecription.getText().trim());
            ps.setInt(5,Integer.parseInt(txtID.getText().trim()));
            ps.execute();
            edShowData();
            edClear();
            btnSave.setText("Save");
            btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-22.png")));            
            btnDelete.setEnabled(false);
            btnCancel.setEnabled(false);
            txtID.setEnabled(true);
        }catch(NumberFormatException | SQLException e){JOptionPane.showMessageDialog(this,e);}
    }
    public void edClear(){
        txtID.setText(null);
        txtName.setText(null);
        txtNameBuilding.setText(null);
        txtCapacity.setText(null);
        txtDecription.setText(null);
    }
}
