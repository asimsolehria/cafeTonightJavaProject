
package MainPackage;

import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author SaMi ShaiKh
 */
public class Expenses extends javax.swing.JFrame {
Connection con;
ResultSet rs;
PreparedStatement pst;
 
    public Expenses() {
        initComponents();
   con = DBConnect.ConnectDB();
   ShowExpense();

    }
public void ShowExpense()
        {
            String sql = "Select * from expenses";
            try
              {
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                Expense_Table.setModel(DbUtils.resultSetToTableModel(rs));
              }catch(Exception e)
                {
                  JOptionPane.showMessageDialog(null, e+" Error in showing Expense");
                }
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
        jPanel9 = new javax.swing.JPanel();
        ExpUpdate = new javax.swing.JButton();
        Expense = new javax.swing.JTextField();
        ExpDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ExpClear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Exp_Amount = new javax.swing.JTextField();
        ExpInsert = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        Exp_Id = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        Exp_Date = new com.toedter.calendar.JDateChooser();
        Search = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        SearchBox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Description = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Expense_Table = new javax.swing.JTable();
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
        jPanel1.setPreferredSize(new java.awt.Dimension(1128, 662));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modify Expense"));

        ExpUpdate.setBackground(new java.awt.Color(255, 255, 255));
        ExpUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ExpUpdate.setText("Update");
        ExpUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExpUpdate.setEnabled(false);
        ExpUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpUpdateActionPerformed(evt);
            }
        });

        Expense.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        ExpDelete.setBackground(new java.awt.Color(255, 255, 255));
        ExpDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ExpDelete.setText("Delete");
        ExpDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExpDelete.setEnabled(false);
        ExpDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpDeleteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Exp_Id");

        ExpClear.setBackground(new java.awt.Color(255, 255, 255));
        ExpClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ExpClear.setText("Refresh");
        ExpClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExpClear.setEnabled(false);
        ExpClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpClearActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Expense");

        Exp_Amount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Exp_Amount.setForeground(new java.awt.Color(255, 0, 0));

        ExpInsert.setBackground(new java.awt.Color(255, 255, 255));
        ExpInsert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ExpInsert.setText("Add");
        ExpInsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExpInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpInsertActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Amount");

        Exp_Id.setEditable(false);
        Exp_Id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Exp_Id.setEnabled(false);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Date");

        Exp_Date.setDateFormatString("yyy-MM-dd");
        Exp_Date.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        Search.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Search.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton14.setBackground(new java.awt.Color(255, 255, 255));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Delete_15px.png"))); // NOI18N
        jButton14.setToolTipText("Clear Search");
        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        jButton14.setFocusPainted(false);
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        Search.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 2, 20, 26));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search_15px.png"))); // NOI18N
        jLabel24.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel24FocusGained(evt);
            }
        });
        Search.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, -1, 20));

        SearchBox.setToolTipText("Search Guest information by ID,Name,CNIC,Number etc");
        SearchBox.setMargin(new java.awt.Insets(2, 22, 2, 2));
        SearchBox.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                SearchBoxCaretUpdate(evt);
            }
        });
        SearchBox.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SearchBoxMouseMoved(evt);
            }
        });
        SearchBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SearchBoxFocusLost(evt);
            }
        });
        SearchBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchBoxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SearchBoxMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SearchBoxMouseReleased(evt);
            }
        });
        SearchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBoxActionPerformed(evt);
            }
        });
        SearchBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchBoxKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchBoxKeyReleased(evt);
            }
        });
        Search.add(SearchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 220, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Description");

        Description.setColumns(20);
        Description.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Description.setLineWrap(true);
        Description.setRows(5);
        Description.setWrapStyleWord(true);
        jScrollPane1.setViewportView(Description);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Expense)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(Exp_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Exp_Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Exp_Date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                            .addComponent(jLabel5)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ExpInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ExpClear, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ExpDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ExpUpdate))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(Exp_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Expense, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Exp_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Exp_Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ExpUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExpInsert))
                .addGap(5, 5, 5)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExpClear)
                    .addComponent(ExpDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ExpClear, ExpDelete});

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EXPENSES");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Expense_Table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Expense_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Expense_Table.setRowHeight(25);
        Expense_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Expense_TableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Expense_Table);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

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
            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(677, 677, 677)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1218, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
//        Runtime.getRuntime().exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      this.setState(1);   
    }//GEN-LAST:event_jButton8ActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
         
    }//GEN-LAST:event_formMouseDragged

    private void SearchBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchBoxKeyReleased
        int key = evt.getKeyCode();
        String search = "Select * from expenses where Exp_Id = '"+SearchBox.getText()+"' OR expense ='"+SearchBox.getText()+"'OR Date ='"+SearchBox.getText()+"'OR Amount ='"+SearchBox.getText()+"'OR Description ='"+SearchBox.getText()+"'";
        String show = "select * from expenses";
        try
        {
            if(key ==KeyEvent.VK_BACKSPACE)
            {
                if(SearchBox.getText().equals(""))
                {
                    pst = con.prepareStatement(show);
                    rs = pst.executeQuery();
                    Expense_Table.setModel(DbUtils.resultSetToTableModel(rs));

                }
            }else
            {
                pst = con.prepareStatement(search);
                rs = pst.executeQuery();

                Expense_Table.setModel(DbUtils.resultSetToTableModel(rs));

            }
        }catch(Exception e)
        {

        }
    }//GEN-LAST:event_SearchBoxKeyReleased

    private void SearchBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchBoxKeyPressed

    }//GEN-LAST:event_SearchBoxKeyPressed

    private void SearchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchBoxActionPerformed

    private void SearchBoxMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBoxMouseReleased

    }//GEN-LAST:event_SearchBoxMouseReleased

    private void SearchBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBoxMouseEntered

    }//GEN-LAST:event_SearchBoxMouseEntered

    private void SearchBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBoxMouseClicked
        //       SearchBox.setText("");
    }//GEN-LAST:event_SearchBoxMouseClicked

    private void SearchBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchBoxFocusLost
        //        SearchBox.setText("Search");
    }//GEN-LAST:event_SearchBoxFocusLost

    private void SearchBoxMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBoxMouseMoved

    }//GEN-LAST:event_SearchBoxMouseMoved

    private void SearchBoxCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_SearchBoxCaretUpdate

    }//GEN-LAST:event_SearchBoxCaretUpdate

    private void jLabel24FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel24FocusGained

    }//GEN-LAST:event_jLabel24FocusGained

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        String show = "select * from expenses";
        try
        {
            pst = con.prepareStatement(show);
            rs = pst.executeQuery();
            Expense_Table.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(Exception e)
        {

        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        SearchBox.setText(" ");
    }//GEN-LAST:event_jButton14MouseClicked

    private void ExpInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpInsertActionPerformed
        String sql = "INSERT INTO `expenses`( `Expense`, `Date`, `Description`, `Amount`) VALUES (?,?,?,?)";
        try
        {
            pst = con.prepareStatement(sql);
            pst.setString(1, Expense.getText());
            pst.setString(2, ((JTextField)Exp_Date.getDateEditor().getUiComponent()).getText());
            pst.setString(3, Description.getText());
            pst.setString(4, Exp_Amount.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null," Expense Added");
            ShowExpense();

        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e+" Error in Inserting Expense");
        }
    }//GEN-LAST:event_ExpInsertActionPerformed

    private void ExpClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpClearActionPerformed
        Exp_Id.setText("");
        Expense.setText("");
        Exp_Date.setCalendar(null);
        Exp_Amount.setText("");
        Description.setText("");
        ExpUpdate.setEnabled(false);
        ExpClear.setEnabled(false);
        ExpDelete.setEnabled(false);

    }//GEN-LAST:event_ExpClearActionPerformed

    private void ExpDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpDeleteActionPerformed
        String sqldelet ="delete from expenses where exp_id = '"+Exp_Id.getText()+"'";
        try
        {
            pst = con.prepareStatement(sqldelet);
            pst.execute();
            ShowExpense();
            Exp_Id.setText("");
            Expense.setText("");
            Exp_Date.setCalendar(null);
            Exp_Amount.setText("");
            Description.setText("");
            ExpUpdate.setEnabled(false);
            ExpClear.setEnabled(false);
            ExpDelete.setEnabled(false);

        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error in Deleting");
        }

        JOptionPane.showMessageDialog(null, "Record Deleted!");
    }//GEN-LAST:event_ExpDeleteActionPerformed

    private void ExpUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpUpdateActionPerformed
        String sql = "UPDATE `expenses` SET `Expense`='"+Expense.getText()+"',`Date`='"+((JTextField)Exp_Date.getDateEditor().getUiComponent()).getText()+"',`Description`='"+Description.getText()+"',`Amount`='"+Exp_Amount.getText()+"' where exp_id='"+Exp_Id.getText()+"'";
        try
        {
            pst = con.prepareStatement(sql);
            pst.execute();
            ShowExpense();

            JOptionPane.showMessageDialog(null,"Record Updated!");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e+" Error in updating!");
        }
    }//GEN-LAST:event_ExpUpdateActionPerformed

    private void Expense_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Expense_TableMouseClicked
        ExpUpdate.setEnabled(true);
        ExpClear.setEnabled(true);
        ExpDelete.setEnabled(true);
        int row             = Expense_Table.getSelectedRow();
        String id           = Expense_Table.getModel().getValueAt(row,0).toString();
        String Exp           = Expense_Table.getModel().getValueAt(row,1).toString();
        String Date           = Expense_Table.getModel().getValueAt(row,2).toString();
        String Desc           = Expense_Table.getModel().getValueAt(row,3).toString();
        String Amount           = Expense_Table.getModel().getValueAt(row,4).toString();

        Exp_Id.setText(id);
        Expense.setText(Exp);
        Description.setText(Desc);

        Exp_Amount.setText(Amount);
        try
        {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(Date);
            Exp_Date.setDate(date);
        } catch(Exception e)
        {
            e.printStackTrace();
        }
        //ExpInsert.setEnabled(true);
    }//GEN-LAST:event_Expense_TableMouseClicked

   
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
            java.util.logging.Logger.getLogger(Expenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Expenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Expenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Expenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Expenses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Description;
    private javax.swing.JButton ExpClear;
    private javax.swing.JButton ExpDelete;
    private javax.swing.JButton ExpInsert;
    private javax.swing.JButton ExpUpdate;
    private javax.swing.JTextField Exp_Amount;
    private com.toedter.calendar.JDateChooser Exp_Date;
    private javax.swing.JTextField Exp_Id;
    private javax.swing.JTextField Expense;
    private javax.swing.JTable Expense_Table;
    public static javax.swing.JPanel Search;
    private javax.swing.JTextField SearchBox;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton7;
    public javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
