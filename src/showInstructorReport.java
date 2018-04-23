
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class showInstructorReport extends javax.swing.JPanel {   
    DefaultTableModel mode=new DefaultTableModel();
    ResultSet rst;
    Statement stm;
    Connection con;
    PreparedStatement ps;
    public showInstructorReport() {
        initComponents();
        setSize(1370, 306);
        setLocation(30,100);
        tbInstuctor.setAutoResizeMode(tbInstuctor.AUTO_RESIZE_OFF);
        tbInstuctor.getColumnModel().getColumn(0).setPreferredWidth(60);
        tbInstuctor.getColumnModel().getColumn(1).setPreferredWidth(120);
        tbInstuctor.getColumnModel().getColumn(2).setPreferredWidth(60);
        tbInstuctor.getColumnModel().getColumn(3).setPreferredWidth(90);
        tbInstuctor.getColumnModel().getColumn(4).setPreferredWidth(220);
        tbInstuctor.getColumnModel().getColumn(5).setPreferredWidth(120);
        tbInstuctor.getColumnModel().getColumn(6).setPreferredWidth(170);
        tbInstuctor.getColumnModel().getColumn(7).setPreferredWidth(90);
        tbInstuctor.getColumnModel().getColumn(8).setPreferredWidth(120);
        tbInstuctor.getColumnModel().getColumn(9).setPreferredWidth(100);
        tbInstuctor.getColumnModel().getColumn(10).setPreferredWidth(90);
        tbInstuctor.getColumnModel().getColumn(11).setPreferredWidth(100);
        try{
            con=DalinConnectSql.getDalinConnection();
        }catch(Exception e){}
        edShowData();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbInstuctor = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnPrint = new javax.swing.JButton();

        setLayout(null);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(null);

        tbInstuctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "Birth Date", "Place of Birh", "Phone", "Position", "Salary", "Department", "Collage", "Hired Date", "Stop Work"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbInstuctor);

        jPanel4.add(jScrollPane3);
        jScrollPane3.setBounds(10, 50, 1350, 241);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Search");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(10, 10, 90, 31);

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
        txtSearch.setBounds(130, 10, 400, 30);

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jPanel4.add(btnPrint);
        btnPrint.setBounds(610, 10, 110, 30);

        add(jPanel4);
        jPanel4.setBounds(0, 0, 1370, 300);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        try{
            while(mode.getRowCount()>0)
            mode.removeRow(0);
            mode=(DefaultTableModel)tbInstuctor.getModel();
            String sql="select * from instructor where ID=? or Name=?";
            ps=con.prepareCall(sql);
            ps.setString(1,txtSearch.getText());
            ps.setString(2,txtSearch.getText());
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
                        rst.getString(10),
                        rst.getString(11),
                        rst.getString(12)

                    });
                }while(rst.next());
            }
            else {edShowData();}
        }catch(Exception e){}
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
         try{
             MessageFormat header =new MessageFormat("Receipt Instructor");
            MessageFormat footer =new MessageFormat("Page{0,number,Integer}");
            tbInstuctor.print(JTable.PrintMode.FIT_WIDTH,header,footer);
        }catch(Exception e){JOptionPane.showMessageDialog(this,e);}
    }//GEN-LAST:event_btnPrintActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbInstuctor;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void edShowData() {
         try{
            while(mode.getRowCount()>0)
            mode.removeRow(0);
            mode=(DefaultTableModel)tbInstuctor.getModel();
            String sql="select * from instructor";
            ps=con.prepareCall(sql);
            rst=ps.executeQuery();
            
                while(rst.next()){
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
                        rst.getString(10),
                        rst.getString(11),
                        rst.getString(12)

                    });
                }
            
            
        }catch(Exception e){JOptionPane.showMessageDialog(this,e+"error showData"); }
    }
}
