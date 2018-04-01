
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
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPeroid = new javax.swing.JTable();
        jTextField10 = new javax.swing.JTextField();
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
        jPanel2.add(txtID);
        txtID.setBounds(160, 10, 200, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Time");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 50, 140, 31);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setText("Start Date");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(10, 90, 130, 31);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setText("End Date");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(10, 130, 130, 31);

        cboTime.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cboTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning", "Evening", "Night" }));
        jPanel2.add(cboTime);
        cboTime.setBounds(160, 50, 200, 30);

        txtEndDate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtEndDate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtEndDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndDateActionPerformed(evt);
            }
        });
        jPanel2.add(txtEndDate);
        txtEndDate.setBounds(160, 140, 200, 30);

        txtStartDate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtStartDate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStartDateActionPerformed(evt);
            }
        });
        jPanel2.add(txtStartDate);
        txtStartDate.setBounds(160, 90, 200, 30);

        add(jPanel2);
        jPanel2.setBounds(10, 60, 380, 200);

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
        jPanel5.setBounds(410, 100, 120, 100);

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

        jTextField10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField10);
        jTextField10.setBounds(170, 10, 200, 30);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setText("Search");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(20, 10, 130, 31);

        add(jPanel1);
        jPanel1.setBounds(10, 270, 520, 230);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
         switch(btnSave.getText()){
             case"Save":
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
            txtID.setEnabled(false);
            btnSave.setText("Update");
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
        }
    }//GEN-LAST:event_tbPeroidMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        edDelete();
        btnSave.setText("Save");
        txtID.setEnabled(true);
        MainForm.ref.course.edSCPeriodID();
        edClear();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtEndDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndDateActionPerformed

    private void txtStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartDateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTable tbPeroid;
    private javax.swing.JTextField txtEndDate;
    private javax.swing.JTextField txtID;
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
           edShowData();
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
            edShowData();
            
        }catch(NumberFormatException | SQLException e){JOptionPane.showMessageDialog(this,e);}
    }
    private void edClear(){
        txtID.setText(null);
        txtStartDate.setText(null);
        txtEndDate.setText(null);
    }
}
