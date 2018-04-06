
import java.awt.Color;
import java.sql.Connection;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class MainForm extends javax.swing.JFrame {
    public static JLabel userlogin; 
    public static JButton infor;
    static public JPanel cur;
    static public JButton curbtn;
    static  MainForm ref;
    public static JLabel date;
   static DalinType type=new DalinType();
   static CreateAccount account=new CreateAccount();
   static  FrmRegister register=new FrmRegister();
   static FrmStaff staff=new FrmStaff();
    FrmStudent student=new FrmStudent();
    FrmInstitude institude=new FrmInstitude();
    FrmPeriod period=new FrmPeriod();
    ClassRoom classRoom=new ClassRoom();
    FrmCourse course=new FrmCourse();
    static FrmInformation information=new FrmInformation();
    static FrmCalssDetail classDetail=new FrmCalssDetail();
   static FrmAssigment assigment=new FrmAssigment();
   static FrmSchedule schedule=new FrmSchedule();
    JButton btnR;
    static FrmLogin login;
    
    public MainForm() {
        initComponents();
        try{
            con=DalinConnectSql.getDalinConnection();
        }catch(Exception e){}
        date=lblDate;
        login =new FrmLogin();
        btnR = btnRegister;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        setDate(lblDate);
        setTime(lblTime);
        cur=login;
        curbtn=btnRegister;
        btnRegister.setForeground(Color.white);
        
        add(login);
        
       
        add(student).setVisible(false);
        add(institude).setVisible(false);
        add(staff).setVisible(false);
        add(information).setVisible(false);
        add(classRoom).setVisible(false);
        add(course).setVisible(false);
        add(assigment).setVisible(false);
        add(classDetail).setVisible(false);
        add(schedule).setVisible(false);
        add(period).setVisible(false);
        add(register);
         register.setVisible(false);
        add(account);account.setVisible(false);
        setEnableJButton(false);
        userlogin=lblUser;
        infor=btnInfromation;
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegister = new javax.swing.JButton();
        btnStaff = new javax.swing.JButton();
        btnCoures = new javax.swing.JButton();
        btnInstructor = new javax.swing.JButton();
        btnAssignment = new javax.swing.JButton();
        btnPeriod = new javax.swing.JButton();
        btnClassRoom = new javax.swing.JButton();
        btnClassRoomDetail = new javax.swing.JButton();
        btnInstuctorDetail = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        btnStudent = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSignin = new javax.swing.JButton();
        btnCreateAccount = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnInfromation = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        btnRegister.setBackground(new java.awt.Color(0, 0, 204));
        btnRegister.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnStaff.setBackground(new java.awt.Color(0, 0, 204));
        btnStaff.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnStaff.setForeground(new java.awt.Color(255, 255, 255));
        btnStaff.setText("Staff");
        btnStaff.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStaffActionPerformed(evt);
            }
        });

        btnCoures.setBackground(new java.awt.Color(0, 0, 204));
        btnCoures.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnCoures.setForeground(new java.awt.Color(255, 255, 255));
        btnCoures.setText("Course");
        btnCoures.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCoures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCouresActionPerformed(evt);
            }
        });

        btnInstructor.setBackground(new java.awt.Color(0, 0, 204));
        btnInstructor.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnInstructor.setForeground(new java.awt.Color(255, 255, 255));
        btnInstructor.setText("Instructor");
        btnInstructor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstructorActionPerformed(evt);
            }
        });

        btnAssignment.setBackground(new java.awt.Color(0, 0, 204));
        btnAssignment.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnAssignment.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignment.setText("Assigments");
        btnAssignment.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAssignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignmentActionPerformed(evt);
            }
        });

        btnPeriod.setBackground(new java.awt.Color(0, 0, 204));
        btnPeriod.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnPeriod.setForeground(new java.awt.Color(255, 255, 255));
        btnPeriod.setText("Period");
        btnPeriod.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPeriod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeriodActionPerformed(evt);
            }
        });

        btnClassRoom.setBackground(new java.awt.Color(0, 0, 204));
        btnClassRoom.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnClassRoom.setForeground(new java.awt.Color(255, 255, 255));
        btnClassRoom.setText("Classs Room");
        btnClassRoom.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnClassRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassRoomActionPerformed(evt);
            }
        });

        btnClassRoomDetail.setBackground(new java.awt.Color(0, 0, 204));
        btnClassRoomDetail.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnClassRoomDetail.setForeground(new java.awt.Color(255, 255, 255));
        btnClassRoomDetail.setText("Room Detail");
        btnClassRoomDetail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnClassRoomDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassRoomDetailActionPerformed(evt);
            }
        });

        btnInstuctorDetail.setBackground(new java.awt.Color(0, 0, 204));
        btnInstuctorDetail.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnInstuctorDetail.setForeground(new java.awt.Color(255, 255, 255));
        btnInstuctorDetail.setText("InstructorDetail");
        btnInstuctorDetail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnInstuctorDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstuctorDetailActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel17.setText("User Logined :");

        jLabel16.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel16.setText("Time :");

        lblTime.setBackground(new java.awt.Color(204, 255, 51));
        lblTime.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel18.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel18.setText("Date  :");

        lblDate.setBackground(new java.awt.Color(204, 255, 51));
        lblDate.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnStudent.setBackground(new java.awt.Color(0, 0, 204));
        btnStudent.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnStudent.setText("Student");
        btnStudent.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(0, 0, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Course Study.png"))); // NOI18N
        jLabel15.setToolTipText("");
        jLabel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblUser.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 0, 51));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setToolTipText("");
        lblUser.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnRegister, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStaff, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStudent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInstuctorDetail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(btnClassRoomDetail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClassRoom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPeriod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAssignment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInstructor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCoures, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnCoures, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnAssignment, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnClassRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnClassRoomDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnInstuctorDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addGap(5, 5, 5)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 23, 210, 862);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSignin.setBackground(new java.awt.Color(0, 0, 204));
        btnSignin.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        btnSignin.setForeground(new java.awt.Color(255, 255, 255));
        btnSignin.setText("Sign out");
        btnSignin.setBorder(null);
        btnSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigninActionPerformed(evt);
            }
        });

        btnCreateAccount.setBackground(new java.awt.Color(0, 0, 204));
        btnCreateAccount.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        btnCreateAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateAccount.setText("Create Account");
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });

        btnReport.setBackground(new java.awt.Color(0, 0, 204));
        btnReport.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        btnReport.setForeground(new java.awt.Color(255, 255, 255));
        btnReport.setText("Report");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        btnInfromation.setBackground(new java.awt.Color(0, 0, 204));
        btnInfromation.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        btnInfromation.setForeground(new java.awt.Color(255, 255, 255));
        btnInfromation.setText("Inforamtion");
        btnInfromation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfromationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInfromation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 811, Short.MAX_VALUE)
                .addComponent(btnCreateAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnSignin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInfromation, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(220, 20, 1320, 76);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static String staff_id,staff_name,staff_pos;

    public static void setStaff(FrmStaff staff) {
        MainForm.staff = staff;
    }

    public static void setStaff_id(String staff_id) {
        MainForm.staff_id = staff_id;
    }

    public static void setStaff_name(String staff_name) {
        MainForm.staff_name = staff_name;
    }

    public static void setStaff_pos(String staff_pos) {
        MainForm.staff_pos = staff_pos;
    }
    
    private void btnInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstructorActionPerformed
        swapFrm(institude,btnInstructor);
    }//GEN-LAST:event_btnInstructorActionPerformed

    private void btnClassRoomDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassRoomDetailActionPerformed
       swapFrm(classDetail,btnClassRoomDetail);
    }//GEN-LAST:event_btnClassRoomDetailActionPerformed

    private void btnInstuctorDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstuctorDetailActionPerformed
        swapFrm(schedule,btnInstuctorDetail);
    }//GEN-LAST:event_btnInstuctorDetailActionPerformed

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        swapFrm(student,btnStudent);
    }//GEN-LAST:event_btnStudentActionPerformed

    private void btnStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStaffActionPerformed
        swapFrm(staff,btnStaff);
    }//GEN-LAST:event_btnStaffActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        swapFrm(register, btnRegister);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnCouresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCouresActionPerformed
        swapFrm(course,btnCoures);
    }//GEN-LAST:event_btnCouresActionPerformed

    private void btnPeriodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeriodActionPerformed
         swapFrm(period,btnPeriod);
    }//GEN-LAST:event_btnPeriodActionPerformed

    private void btnClassRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassRoomActionPerformed
         swapFrm(classRoom, btnClassRoom);
    }//GEN-LAST:event_btnClassRoomActionPerformed

    private void btnAssignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignmentActionPerformed
         swapFrm(assigment,btnAssignment);
    }//GEN-LAST:event_btnAssignmentActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                LoadingFrom.load.dispose();
    }//GEN-LAST:event_formWindowOpened

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        swapFrm(account, btnCreateAccount);
    }//GEN-LAST:event_btnCreateAccountActionPerformed

    private void btnSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigninActionPerformed
        setEnableJButton(false);
        swapFrm(login, btnSignin);
        
    }//GEN-LAST:event_btnSigninActionPerformed

    private void btnInfromationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfromationActionPerformed
         swapFrm(information,btnInfromation);
    }//GEN-LAST:event_btnInfromationActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed

    if(curbtn.equals(btnAssignment)){
        JOptionPane.showMessageDialog(null,"btnAssingment");
    }
    else if(curbtn.equals(btnInfromation)){
        JOptionPane.showMessageDialog(null,"btnIfrom");
    }
    else if(curbtn.equals(btnCoures)){
                try{
            String report="C:\\Users\\Ean Dalin\\Documents\\NetBeansProjects\\CourseStudy\\src\\report\\Testreport.jrxml";
            JasperReport rp=JasperCompileManager.compileReport(report);
            JasperPrint print=JasperFillManager.fillReport(rp,null,con);
            JasperViewer.viewReport(print);
        }catch(JRException e){JOptionPane.showMessageDialog(this,e);}
    }
    }//GEN-LAST:event_btnReportActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                ref = new MainForm();
//                ref.setVisible(true);
//                
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignment;
    private javax.swing.JButton btnClassRoom;
    private javax.swing.JButton btnClassRoomDetail;
    private javax.swing.JButton btnCoures;
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JButton btnInfromation;
    private javax.swing.JButton btnInstructor;
    private javax.swing.JButton btnInstuctorDetail;
    private javax.swing.JButton btnPeriod;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnSignin;
    private javax.swing.JButton btnStaff;
    private javax.swing.JButton btnStudent;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables
    void setDate(JLabel l){
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                while(true){
                long t=System.currentTimeMillis();
                String s;
                SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY");
                Date d=new Date(t);
                s=sdf.format(d);
                l.setText(s);
                }
            }
        };
        Thread r=new Thread(runnable);
        r.start();
    }
    void setTime(JLabel tt){
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                while(true){
                long t=System.currentTimeMillis();
                String s;
                SimpleDateFormat sdf1=new SimpleDateFormat("hh:mm:ss a");
                Date d=new Date(t);
                s=sdf1.format(d);
                tt.setText(s);
            }
            }
        };
        Thread r1=new Thread(runnable);
        r1.start();
    }
   public void swapFrm(JPanel panel,JButton btn){
    
        curbtn.setForeground(Color.white);
        curbtn=btn;
        curbtn.setForeground(Color.red);
        cur.setVisible(false);
        cur=panel;
        cur.setVisible(true);
      
    }
   public void setEnableJButton(boolean en ){
        btnRegister.setEnabled(en);
        btnStaff.setEnabled(en);
        btnStudent.setEnabled(en);
        btnCoures.setEnabled(en);
        btnInstructor.setEnabled(en);
        btnAssignment.setEnabled(en);
        btnPeriod.setEnabled(en);
        btnClassRoom.setEnabled(en);
        btnClassRoomDetail.setEnabled(en);
        btnInstuctorDetail.setEnabled(en);
        btnInfromation.setEnabled(en);
        btnCreateAccount.setEnabled(en);
        btnSignin.setEnabled(en);
        btnReport.setEnabled(en);
   }
   public void setEnableJButtonReceptionish(boolean en){
        btnRegister.setEnabled(en);        
        btnStudent.setEnabled(en);
        btnCoures.setEnabled(en);
        btnAssignment.setEnabled(en);
        btnPeriod.setEnabled(en);
        btnClassRoom.setEnabled(en);
        btnClassRoomDetail.setEnabled(en);
        btnInstuctorDetail.setEnabled(en);
        btnInfromation.setEnabled(en);
        btnSignin.setEnabled(en);
        btnReport.setEnabled(en);
   }
    Connection con;
}
