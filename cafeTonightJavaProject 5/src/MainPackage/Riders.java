
package MainPackage;

import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author SaMi ShaiKh
 */
public class Riders extends javax.swing.JFrame {
Connection con;
ResultSet rs;
PreparedStatement pst;
 
    public Riders() {
        initComponents();
        con = DBConnect.ConnectDB();
       
//        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
      ShowRiders();  
      txtWaiter.grabFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RiderId = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        frmtCell = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        frmtCnic = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtWaiter = new javax.swing.JTextField();
        areaAddress = new javax.swing.JTextField();
        areaRemarks = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        RiderTable = new javax.swing.JTable();
        RiderSearch = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 5, true));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 656));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DELIVERY BOYS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Delivery Boys Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Rider_Id");
        jLabel2.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Surname");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Name");

        RiderId.setEditable(false);
        RiderId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RiderId.setEnabled(false);

        txtSurname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtSurname.setNextFocusableComponent(frmtCell);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Cell #");

        try {
            frmtCell.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        frmtCell.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        frmtCell.setNextFocusableComponent(frmtCnic);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("CNIC");

        try {
            frmtCnic.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-#######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        frmtCnic.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Address");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setText("Remarks");

        txtWaiter.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtWaiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWaiterActionPerformed(evt);
            }
        });

        areaAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        areaRemarks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("SAVE");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setText("RESET");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("DELETE");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RiderId, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addComponent(txtWaiter, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(frmtCnic))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSurname)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(areaAddress))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(frmtCell)
                    .addComponent(jLabel5)
                    .addComponent(jLabel45)
                    .addComponent(areaRemarks))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel45, jLabel5, jLabel6, jLabel7});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {frmtCell, txtSurname, txtWaiter});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(RiderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, 0)
                                .addComponent(frmtCell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel45)
                                .addGap(0, 0, 0)
                                .addComponent(areaRemarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(1, 1, 1)
                                .addComponent(txtWaiter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel6)
                                .addGap(0, 0, 0)
                                .addComponent(frmtCnic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4)
                        .addGap(0, 0, 0)
                        .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel7)
                        .addGap(0, 0, 0)
                        .addComponent(areaAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {RiderId, jLabel2});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtSurname, txtWaiter});

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Search Rider");

        RiderTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        RiderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "EMPID", "Firstname", "Lastname", "Cell#", "CNIC", "Joining Date", "Address", "Remarks"
            }
        ));
        RiderTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        RiderTable.setRowHeight(30);
        RiderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RiderTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(RiderTable);

        RiderSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RiderSearch.setToolTipText("Search Master information by ID,Name,CNIC,Number etc");
        RiderSearch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                RiderSearchCaretUpdate(evt);
            }
        });
        RiderSearch.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                RiderSearchMouseMoved(evt);
            }
        });
        RiderSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                RiderSearchFocusLost(evt);
            }
        });
        RiderSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RiderSearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RiderSearchMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RiderSearchMouseReleased(evt);
            }
        });
        RiderSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RiderSearchActionPerformed(evt);
            }
        });
        RiderSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RiderSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RiderSearchKeyReleased(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Delete_30px.png"))); // NOI18N
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Delete_35px.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Subtract_30px.png"))); // NOI18N
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Subtract_35px.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(698, 698, 698)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(558, 558, 558)
                .addComponent(jLabel8)
                .addGap(4, 4, 4)
                .addComponent(RiderSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8))
                    .addComponent(RiderSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(925, 541));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   private void ShowRiders()
    {
        
        try
          {
            String sql = "Select * from Riders";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            RiderTable.setModel(DbUtils.resultSetToTableModel(rs));
          }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error in ShowRiders");
            }
        
     TableColumn col = RiderTable.getColumnModel().getColumn(0);
     col.setPreferredWidth(15);
     col = RiderTable.getColumnModel().getColumn(1);
     col.setPreferredWidth(110);
     col = RiderTable.getColumnModel().getColumn(2);
     col.setPreferredWidth(60);
     col = RiderTable.getColumnModel().getColumn(3);
     col.setPreferredWidth(80);
     col = RiderTable.getColumnModel().getColumn(4);
     col.setPreferredWidth(100);
     col = RiderTable.getColumnModel().getColumn(5);
     col.setPreferredWidth(160);
     col = RiderTable.getColumnModel().getColumn(6);
     col.setPreferredWidth(40);
     
    }
    

    
      public  void ResetRiders()
        {
         RiderId.setText(null);
        txtWaiter.setText(null);
        txtSurname.setText(null);
        frmtCell.setText(null);
        frmtCnic.setText(null);
        areaAddress.setText(null);
        areaRemarks.setText(null);
        }
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
//        Runtime.getRuntime().exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      this.setState(1);   
    }//GEN-LAST:event_jButton8ActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
//           int x = evt.getXOnScreen();
//        int y = evt.getYOnScreen();
//        this.setLocation(x, y);
    }//GEN-LAST:event_formMouseDragged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String sql="INSERT INTO `Riders`(`Firstname`, `Lastname`, `Cell`, `CNIC`, `Address`, `Description`) VALUES (?,?,?,?,?,?) ";
       
       if(txtWaiter.getText().isEmpty())
       {
        JOptionPane.showMessageDialog(null, "Enter Waiter Name first!");
       }else
       {
            try
            {
                pst = con.prepareStatement(sql);
                pst.setString(1,txtWaiter.getText() );
                pst.setString(2,txtSurname.getText() );
                pst.setString(3,frmtCell.getText() );
                pst.setString(4,frmtCnic.getText() );
                pst.setString(5,areaAddress.getText() );
                pst.setString(6,areaRemarks.getText() );

                pst.execute();
                ShowRiders();
                ResetRiders();
                JOptionPane.showMessageDialog(null, "Rider Added Succesfully!");
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e+" Error in Adding Riders...");
            }
       }
       
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void RiderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RiderTableMouseClicked
        jButton3.setEnabled(true);
        int row             = RiderTable.getSelectedRow();
        String id           = RiderTable.getModel().getValueAt(row,0).toString();
        String firstname    = RiderTable.getModel().getValueAt(row,1).toString();
        String lastname     = RiderTable.getModel().getValueAt(row,2).toString();
        String cell         = RiderTable.getModel().getValueAt(row,3).toString();
        String cnic         = RiderTable.getModel().getValueAt(row,4).toString();
        String address      = RiderTable.getModel().getValueAt(row,5).toString();
        String desc         = RiderTable.getModel().getValueAt(row,6).toString();
        
        RiderId.setText(id);
        txtWaiter.setText(firstname);
        txtSurname.setText(lastname);
        frmtCell.setText(cell);
        frmtCnic.setText(cnic);
        areaAddress.setText(address);
        areaRemarks.setText(desc);
        
        
    }//GEN-LAST:event_RiderTableMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
               String sqldelet ="DELETE FROM `Riders` WHERE Rider_Id = '"+RiderId.getText()+"'";
       try
         {
           pst = con.prepareStatement(sqldelet);
           pst.execute();
           ShowRiders();
            ResetRiders();
        JOptionPane.showMessageDialog(null, "Deleted Successfully!");
         }catch(Exception e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in Rider Deleting");
           }
        
            
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void RiderSearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_RiderSearchCaretUpdate

    }//GEN-LAST:event_RiderSearchCaretUpdate

    private void RiderSearchMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RiderSearchMouseMoved

    }//GEN-LAST:event_RiderSearchMouseMoved

    private void RiderSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RiderSearchFocusLost
        //        SearchBox.setText("Search");
    }//GEN-LAST:event_RiderSearchFocusLost

    private void RiderSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RiderSearchMouseClicked
        //       SearchBox.setText("");
    }//GEN-LAST:event_RiderSearchMouseClicked

    private void RiderSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RiderSearchMouseEntered

    }//GEN-LAST:event_RiderSearchMouseEntered

    private void RiderSearchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RiderSearchMouseReleased

    }//GEN-LAST:event_RiderSearchMouseReleased

    private void RiderSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RiderSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RiderSearchActionPerformed

    private void RiderSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RiderSearchKeyPressed

    }//GEN-LAST:event_RiderSearchKeyPressed

    private void RiderSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RiderSearchKeyReleased
        int key = evt.getKeyCode();
        String search = "Select * from Riders where Rider_Id like '%"+RiderSearch.getText()+"%' OR firstname like '%"+RiderSearch.getText()+"%' OR lastname like '%"+RiderSearch.getText()+"%'OR cell like '%"+RiderSearch.getText()+"%'OR cnic like '%"+RiderSearch.getText()+"%'OR address like '%"+RiderSearch.getText()+"%'";

        //String search = "Select * from checkinout where guestid LIKE '"+SearchBox.getText()+"' OR guestname LIKE'"+SearchBox.getText()+"'OR cnic LIKE'"+SearchBox.getText()+"'OR cell LIKE'"+SearchBox.getText()+"'OR email LIKE'"+SearchBox.getText()+"'OR city LIKE'"+SearchBox.getText()+"'OR address LIKE'"+SearchBox.getText()+"'OR checkindate LIKE'"+SearchBox.getText()+"'OR checkoutdate LIKE'"+SearchBox.getText()+"'";

   
        try
        {

            if(key == KeyEvent.VK_BACKSPACE)
            {
                if(RiderSearch.getText().equals(""))
                {
                 ShowRiders();
                }
            }else
            {
                pst = con.prepareStatement(search);
                rs = pst.executeQuery();

                RiderTable.setModel(DbUtils.resultSetToTableModel(rs));
             

            }
        }catch(Exception e)
        {

        }
    }//GEN-LAST:event_RiderSearchKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       ResetRiders();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtWaiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWaiterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWaiterActionPerformed

   
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
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Riders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Riders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Riders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Riders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Riders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RiderId;
    private javax.swing.JTextField RiderSearch;
    private javax.swing.JTable RiderTable;
    private javax.swing.JTextField areaAddress;
    private javax.swing.JTextField areaRemarks;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JFormattedTextField frmtCell;
    private javax.swing.JFormattedTextField frmtCnic;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    public javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtSurname;
    private javax.swing.JTextField txtWaiter;
    // End of variables declaration//GEN-END:variables
}
