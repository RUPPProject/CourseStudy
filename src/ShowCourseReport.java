
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class ShowCourseReport extends javax.swing.JPanel {
    Connection con;
    PreparedStatement ps;
    ResultSet rst;
    Statement stm;
    DefaultTableModel mode=new DefaultTableModel();
    public ShowCourseReport() {
        initComponents();
        setSize(641, 286);
        setLocation(200,100);
        try{
            con=DalinConnectSql.getDalinConnection();
        }catch(Exception e){}
        LeftJoin();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCourse = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnPrint = new javax.swing.JButton();

        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        tbCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course_Name", "Time", "Credit", "Start Course", "End Course"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbCourse);
        if (tbCourse.getColumnModel().getColumnCount() > 0) {
            tbCourse.getColumnModel().getColumn(0).setResizable(false);
            tbCourse.getColumnModel().getColumn(1).setResizable(false);
            tbCourse.getColumnModel().getColumn(2).setResizable(false);
            tbCourse.getColumnModel().getColumn(3).setResizable(false);
            tbCourse.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 596, 215);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Search");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(30, 10, 90, 31);

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtSearch);
        txtSearch.setBounds(130, 10, 257, 30);

        btnPrint.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrint);
        btnPrint.setBounds(400, 10, 110, 30);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 630, 280);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        try{
            while(mode.getRowCount()>0)
            mode.removeRow(0);
            mode=(DefaultTableModel) tbCourse.getModel();
            String sql="select * from course where id=? or name=?";
            ps=con.prepareStatement(sql);
            ps.setString(1,txtSearch.getText());
            ps.setString(2,txtSearch.getText());
            rst=ps.executeQuery();
            if(rst.first()){
                do{
                    mode.addRow(new String[]{
                        rst.getString(2),
                        rst.getString(1),
                        rst.getString(3),
                        rst.getString(4),
                        rst.getString(5),
                        rst.getString(6)
                    });
                }while(rst.next());
            }
           
        }catch(SQLException e){JOptionPane.showMessageDialog(this,e);}
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
                  try{
            String report="C:\\Users\\Ean Dalin\\Documents\\NetBeansProjects\\CourseStudy\\src\\report\\Testreport.jrxml";
            JasperReport rp=JasperCompileManager.compileReport(report);
            JasperPrint print=JasperFillManager.fillReport(rp,null,con);
            JasperViewer .viewReport(print,false);
            //JasperViewer.vie
            
         
         }catch(JRException e){JOptionPane.showMessageDialog(this,e);}
    }//GEN-LAST:event_btnPrintActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCourse;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
    public void LeftJoin(){
        try{
            while(mode.getRowCount()>0)
                mode.removeRow(0);
                mode=(DefaultTableModel)tbCourse.getModel();
            String sql="select c.name,p.Time,c.credit,c.start_date,c.end_date from period p left join course c on p.ID=c.id Group by p.ID,c.id";
            ps=con.prepareStatement(sql);
            rst=ps.executeQuery();
            while(rst.next()){
                mode.addRow(new String[]{
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
                    
                });
            }
        }catch(Exception e){}
    }
}
