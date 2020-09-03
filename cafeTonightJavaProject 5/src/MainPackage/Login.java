
package MainPackage;


import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.KeyEvent;
import static java.lang.Thread.sleep;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

public class Login extends javax.swing.JFrame {
Connection con;
ResultSet rs;
PreparedStatement pst;
public static String USERNAME = "No User";
public static int LOGID = 0;
public static String ConMessage="Database Connected!";
 
  
    public Login()
    {
        initComponents();
        con = DBConnect.ConnectDB();
        TIMENOW();
//        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/Tailor.png")));
        connectionMessage.setText(ConMessage);
//        &&License.getHDDsr("C").equals("083F-EB01")
//if((License.getMotherboardID().isEmpty()&&License.getMachineSr().isEmpty())){
    
//       if((License.getMotherboardID().equals("PCSTLA17V2X28C") && License.getMachineSr().equals("5CB233007M"))||(License.getMotherboardID().equals(".CD9P712.CN7620647J00TE.") && License.getMachineSr().equals("CD9P712"))||(License.getMotherboardID().equals("PFXJQ028JAP8JY") && License.getMachineSr().equals("JPH824H4V5"))||(License.getMotherboardID().equals("1ZHVB05X7KY") && License.getMachineSr().equals("MJVED81")))
       if(true)
    {
            jButton1.setEnabled(true);
            jButton4.setEnabled(true);
            txt_user.setEnabled(true);
            txt_pass.setEnabled(true);
            jLabel6.setEnabled(true);
        }else
    {
            jButton1.setEnabled(false);
            WarningMessage.setText("You are not authorized to use this application!");
            txt_user.setEnabled(false);
            txt_user.setText("Access Denied!");
            txt_pass.setEnabled(false);
            jButton4.setEnabled(false);
            jLabel6.setEnabled(false);
            
            JOptionPane.showMessageDialog(null, "Unauthorized Copy!");
    }

}
//**********************************************
public void TIMENOW()
    {
        Thread clock = new Thread(){
            public void run(){
                for(;;){
            
        
       DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss aa");
    	String dateString = dateFormat.format(new Date()).toString();
    	
        
    	//Displaying current date and time in 12 hour format with AM/PM
    	//DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd hh:mm aa");
    	DateFormat dateFormat3 = new SimpleDateFormat("MM-dd-yyyy");
    	String dateString2 = dateFormat3.format(new Date()).toString();
    	//System.out.println("Current date and time in AM/PM: "+dateString2);
       LoginDateTime.setText(""+dateString2);
       LoginTimerTime.setText(""+dateString);
                    try
                      {
                        sleep(1000);
                      } catch (InterruptedException ex)
                      {
                        Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
                      }
                }}
        };
                clock.start();
    }




//**********************************************    
    public void LoginFunction()
    {
        DateFormat ReportTime = new SimpleDateFormat("hh:mm:ss aa");
    	String ReportTimeString = ReportTime.format(new Date());
    	DateFormat ReportDate = new SimpleDateFormat("yyyy-MM-dd");
    	String ReportDateString = ReportDate.format(new Date());
        java.util.Date dt = new java.util.Date();
        java.text.SimpleDateFormat sdf = 
        new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = sdf.format(dt);
        java.sql.Timestamp timestamp = new java.sql.Timestamp(dt.getTime());
        String sql ="select * from login where (username,password)=(?,?)";
        
        try
        {
         pst = con.prepareStatement(sql);
         pst.setString(1,txt_user.getText());
         pst.setString(2, txt_pass.getText());
         rs = pst.executeQuery();
         
          if(txt_user.getText().isEmpty()&&txt_pass.getText().isEmpty())
                  {
                  JOptionPane.showMessageDialog(null, "Enter Username & Password! ","Provide Login Credentials!", INFORMATION_MESSAGE);
                  }else
                  if(txt_user.getText().isEmpty())
                    {
                      JOptionPane.showMessageDialog(null, "Username is Required!","Username Required!", WARNING_MESSAGE);
                    } else
                      if(txt_pass.getText().isEmpty())
                        {
                            JOptionPane.showMessageDialog(null, "Password is Required!","Password Required!", WARNING_MESSAGE);
                        }else
                        {
                        if (rs.next())
                        {
                            USERNAME = txt_user.getText();
                            String SaveLog= "INSERT INTO `logdetails`(`Username`, `LogDate`, `LogTime`) VALUES (?,?,?)";
                            pst = con.prepareStatement(SaveLog);
                            pst.setString(1, txt_user.getText());
                            pst.setString(2, ReportDateString);
                            pst.setString(3, currentTime);
                            pst.execute();
                            
                            String getLogId="SELECT LogId from LogDetails ORDER BY LogId";
                             //Geting id
                            pst = con.prepareStatement(getLogId);
                            rs = pst.executeQuery();
                            while(rs.next())
                            {
                                LOGID = rs.getInt("LogId");
                            }
//                            JOptionPane.showMessageDialog(null, LOGID);
                            //end
                            
                                new MainScreen().setVisible(true);
                                this.dispose();          
                        }else
                          {
                            JOptionPane.showMessageDialog(null, "Please Enter Correct Username & Password.","LOGIN FAILED!", ERROR_MESSAGE);
                          }
                        }
            
             
            
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e+" Problem in Login in!");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LoginDateTime = new javax.swing.JLabel();
        LoginTimerTime = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        connectionMessage = new javax.swing.JLabel();
        WarningMessage = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tailor Master");
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 5, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User_17px.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 137, 20, 28));

        txt_user.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_user.setText("Username");
        txt_user.setToolTipText("Enter username here");
        txt_user.setMargin(new java.awt.Insets(2, 22, 2, 2));
        txt_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_userFocusGained(evt);
            }
        });
        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });
        jPanel1.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 136, 211, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Invisible_20px.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel8MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 185, 20, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Lock_17px.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 186, -1, 28));

        txt_pass.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txt_pass.setText("Password");
        txt_pass.setToolTipText("Enter password here");
        txt_pass.setMargin(new java.awt.Insets(2, 22, 2, 2));
        txt_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_passFocusGained(evt);
            }
        });
        txt_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_passKeyReleased(evt);
            }
        });
        jPanel1.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 185, 211, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(31, 58, 147));
        jButton1.setText("Login");
        jButton1.setToolTipText("Click to Login");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton1FocusLost(evt);
            }
        });
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 234, 100, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Male User_100px.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 19, 251, 111));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(31, 58, 147));
        jButton4.setText("Sign Up");
        jButton4.setToolTipText("Click to Login");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 234, 100, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Forgot Password?");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 277, -1, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, 305));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Phone_35px.png"))); // NOI18N
        jLabel2.setText("03053729551");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(52, 52, 52))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 180, 90));

        LoginDateTime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LoginDateTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Calendar_25px.png"))); // NOI18N
        LoginDateTime.setText("Date");
        LoginDateTime.setIconTextGap(3);
        jPanel3.add(LoginDateTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 30));

        LoginTimerTime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LoginTimerTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Alarm Clock_25px.png"))); // NOI18N
        LoginTimerTime.setText("Time");
        LoginTimerTime.setIconTextGap(3);
        jPanel3.add(LoginTimerTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 150, 30));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 55)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<html>Cafe <span style=\"color:#FF6600;\">Tonight</span></html>");
        jLabel5.setToolTipText("");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 50, 450, 70));

        connectionMessage.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        connectionMessage.setForeground(new java.awt.Color(255, 0, 0));
        connectionMessage.setText("Database Status!");
        connectionMessage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        connectionMessage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                connectionMessageMouseClicked(evt);
            }
        });
        jPanel3.add(connectionMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 420, 40));

        WarningMessage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        WarningMessage.setForeground(new java.awt.Color(255, 0, 0));
        WarningMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WarningMessage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(WarningMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 30, 43));

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LoginMinus35.png"))); // NOI18N
        jButton2.setToolTipText("Exit");
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LoginExitOnMouse35.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LoginExit35.png"))); // NOI18N
        jButton3.setToolTipText("Minimize");
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Reduce_35px.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, 40));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/techsamtranspernt.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 90, 80));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Facebook_35px.png"))); // NOI18N
        jLabel1.setText("<html> <a href=http://www.facebook.com/thesamishaikh target=_blank style=\"color: black\">Facebook</a> </html>  ");
        jLabel1.setToolTipText("Click to Open in Browser");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 448, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    LoginFunction();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setState(1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     String Pass = JOptionPane.showInputDialog(null,"Enter Master Password","Security Check", DISPOSE_ON_CLOSE);
        if(Pass.equals("Sami7264"))
        {
            new UserManage().setVisible(true);
        }else
        {
            JOptionPane.showMessageDialog(null, "Password Incorrect! Contact Developer");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
 
    }//GEN-LAST:event_formMouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        //String link = "<a href=\"http://www.facebook.com/thesamishaikh\" target=\"_blank\">http://www.facebook.com/Ss.Shykh</a>";
        try{
        Desktop.getDesktop().browse(new URL("http://www.facebook.com/thesamishaikh").toURI());
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txt_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_userFocusGained
        txt_user.setText("");
    }//GEN-LAST:event_txt_userFocusGained

    private void txt_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passFocusGained
        txt_pass.setText("");
    }//GEN-LAST:event_txt_passFocusGained

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        txt_pass.setEchoChar((char)0);
        jButton2.setOpaque(true);
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseReleased
         txt_pass.setEchoChar('*');
        jButton2.setOpaque(false);
    }//GEN-LAST:event_jLabel8MouseReleased

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(Color.WHITE);
        jButton1.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        
        jButton1.setBackground(new Color(31,58,148));
        jButton1.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusLost
       
    }//GEN-LAST:event_jButton1FocusLost

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jButton4.setBackground(new Color(31,58,148));
        jButton4.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        jButton4.setBackground(Color.WHITE);
        jButton4.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton4MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setFont(new Font("Tahoma",Font.BOLD,13));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
       jLabel6.setFont(new Font("Tahoma",Font.BOLD,12));
    }//GEN-LAST:event_jLabel6MouseExited

    private void txt_passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passKeyReleased
       int  key = evt.getKeyCode();

       if((key==KeyEvent.VK_ENTER))
         {
            LoginFunction();
         }
    }//GEN-LAST:event_txt_passKeyReleased

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
         new AboutPage().setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void connectionMessageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connectionMessageMouseClicked
       
       String pass = JOptionPane.showInputDialog(null, "Enter the password?");
       if(pass.equals("Sami7264"))
       {
       new Settings().setVisible(true);
       }else{
           JOptionPane.showMessageDialog(null, "Wrong Password!");
       }
    }//GEN-LAST:event_connectionMessageMouseClicked

    public static void main(String args[]) {
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
          //  UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginDateTime;
    private javax.swing.JLabel LoginTimerTime;
    private javax.swing.JLabel WarningMessage;
    private javax.swing.JLabel connectionMessage;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
