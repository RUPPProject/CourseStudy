
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class DalinBros {
     File f;
     String fileName;
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
}
