
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class FrmInformation extends javax.swing.JPanel {
    public FrmInformation() {
        initComponents();
        setSize(643, 292);
        setLocation(400,100);
        edShowData();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCourse = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        setLayout(null);

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
        jScrollPane1.setViewportView(tbCourse);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 596, 215);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Search");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(10, 10, 90, 31);

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtSearch);
        txtSearch.setBounds(130, 10, 257, 30);

        add(jPanel1);
        jPanel1.setBounds(10, 10, 630, 280);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        try{
            while(mode.getRowCount()>0)
                mode.removeRow(0);
                mode=(DefaultTableModel)tbCourse.getModel();
                String sql="select * from course where id=? or name=?";
                ps=con.prepareCall(sql);
                ps.setInt(1,Integer.parseInt(txtSearch.getText()));
                ps.setString(2, txtSearch.getText());
                rst=ps.executeQuery();
                if(rst.first())
                    do{
                    mode.addRow(new String[]{
                        rst.getString(1),
                         rst.getString(2),
                          rst.getString(3),
                           rst.getString(4),
                            rst.getString(5),
                             rst.getString(6)
                    });
                    }while(rst.next());
                else 
                    edShowData();
        }catch(Exception e){}
    }//GEN-LAST:event_txtSearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCourse;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
    Statement stm;
    ResultSet rst;
    DefaultTableModel mode=new DefaultTableModel();
    Connection con;
    PreparedStatement ps;
    public void edShowData(){
        try{
            con=DalinConnectSql.getDalinConnection();
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
