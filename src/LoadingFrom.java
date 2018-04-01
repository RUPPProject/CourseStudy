
public class LoadingFrom extends javax.swing.JFrame {
    static LoadingFrom load;
    public LoadingFrom() {
        initComponents();
        setSize(177, 182);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Course Study.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 177, 170);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/h6viz.gif"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-70, 20, 210, 140);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
          load= new LoadingFrom();load.setVisible(true);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    
                }
                MainForm.ref= new MainForm();
                MainForm.ref.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
