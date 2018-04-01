import com.toedter.calendar.JDateChooser;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class DalinType {
    
    public static void typeCharacter(KeyEvent evt){
       char ch=evt.getKeyChar();
         if(Character.isDigit(ch)){
             Toolkit.getDefaultToolkit().beep();
             evt.consume();
         }
   }
   public static void typeNumber(KeyEvent evt){
       char ch=evt.getKeyChar();
         if(!(Character.isDigit(ch))){
             Toolkit.getDefaultToolkit().beep();
             evt.consume();
         }
   }
   public static void typeLimit(JTextField text,KeyEvent evt){
       char ch=evt.getKeyChar();
       if(!(Character.isDigit(ch))){
           Toolkit.getDefaultToolkit().beep();
           evt.consume();
       }
       int max=9;
       int t=text.getText().trim().length();
       if(t>max){
           Toolkit.getDefaultToolkit().beep();
           evt.consume();
       }
   }
   public static void enterJText(JTextField text,KeyEvent evt){
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           text.requestFocus();
       }
   }
   public static void enterCbo(JComboBox cbo,KeyEvent evt){
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           cbo.requestFocus();
       }
   }
   public static void enterJDate(JDateChooser date,KeyEvent evt){
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           date.requestFocus();
       }
   }
    Connection con;
    ResultSet rst;
    Statement stm;
    
   public void autoID(String Data,JLabel l){
       try{
           con=DalinConnectSql.getDalinConnection();
           stm=con.createStatement();
           rst=stm.executeQuery("select max(right(no,2)) as no from "+Data+"");
           while(rst.next()){
               if(rst.first()==false){
                   l.setText("100001");
               }
               else {
                   
                   rst.last();
                         int set_id=rst.getInt(1)+1;
                         String no=String.valueOf(set_id);
                         int next_id=no.length();
                         for(int i=0;i<2-next_id;i++){
                             no="10000"+no;
                         }
                         l.setText(no);
               }
           }
       }catch(SQLException e){}
   }
   public static void edUperCase(JTextField input){
       String upercase=input.getText().toUpperCase();
       input.setText(upercase);
   }
}
