
package MainPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author SaMi ShaiKh
 */
public class TableManagement extends javax.swing.JFrame {
static Connection con;
static ResultSet rs;
static PreparedStatement pst;
        
 
RateManagerCRUD RMC;// = new RateManagerCRUD();
    public TableManagement() {
        initComponents();       
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        con = DBConnect.ConnectDB();

               
        RateManagerQueries.LargePizzaItemsShow();
        RateManagerQueries.RegularPizzaItemsShow();
        RateManagerQueries.SmallPizzaItemsShow();
        RateManagerQueries.RollsShow();
        RateManagerQueries.DealsShow();
        RateManagerQueries.FastFoodShow();
        RateManagerQueries.BBQShow();
        RateManagerQueries.BurgersShow();
        RateManagerQueries.BeveragesShow();
        RateManagerQueries.SaladRaitaShow();
        RateManagerQueries.BiryaniShow();
        RateManagerQueries.DessertsShow();
        RateManagerQueries.FriesShow();
        RateManagerQueries.PastaShow();
        RateManagerQueries.CheeseGarlicBreadShow();
        RateManagerQueries.LasagniaShow();
        RateManagerQueries.OtherShow();
        RateManagerQueries.Other2Show();

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
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_LID = new javax.swing.JTextField();
        txt_LargePizza = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_LargeRate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmb_LargeAvailable = new javax.swing.JComboBox<String>();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel18 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        txt_LargeRate1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        txt_RID = new javax.swing.JTextField();
        txt_RegularPizza = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txt_RegularRate = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        cmb_RegularAvailable = new javax.swing.JComboBox<String>();
        jLabel35 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jPanel20 = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jLabel81 = new javax.swing.JLabel();
        txt_LargeRate2 = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        txt_SID = new javax.swing.JTextField();
        txt_SmallPizza = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txt_SmallRate = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        cmb_SmallAvailable = new javax.swing.JComboBox<String>();
        jLabel39 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jPanel22 = new javax.swing.JPanel();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jLabel82 = new javax.swing.JLabel();
        txt_LargeRate3 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel23 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        txt_FastFoodID = new javax.swing.JTextField();
        txt_FastFood = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txt_FastFoodRate = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        cmb_FastFoodAvailable = new javax.swing.JComboBox<String>();
        jLabel43 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jPanel24 = new javax.swing.JPanel();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jLabel83 = new javax.swing.JLabel();
        txt_LargeRate6 = new javax.swing.JTextField();
        jPanel25 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        txt_DealID = new javax.swing.JTextField();
        txt_Deal = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txt_DealRate = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        cmb_DealsAvailable = new javax.swing.JComboBox<String>();
        jLabel47 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jPanel26 = new javax.swing.JPanel();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        txt_LargeRate5 = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_RollID = new javax.swing.JTextField();
        txt_Roll = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_RollRate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cmb_RollsAvailable = new javax.swing.JComboBox<String>();
        jLabel12 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel27 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel85 = new javax.swing.JLabel();
        txt_LargeRate4 = new javax.swing.JTextField();
        jPanel28 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        txt_DealID1 = new javax.swing.JTextField();
        txt_Deal1 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        txt_DealRate1 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        cmb_BurgersAvailable = new javax.swing.JComboBox<String>();
        jLabel51 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jPanel29 = new javax.swing.JPanel();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        txt_LargeRate8 = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        txt_FastFoodID1 = new javax.swing.JTextField();
        txt_FastFood1 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        txt_FastFoodRate1 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        cmb_BeveragesAvailable = new javax.swing.JComboBox<String>();
        jLabel55 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jPanel31 = new javax.swing.JPanel();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        txt_LargeRate9 = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txt_RollID1 = new javax.swing.JTextField();
        txt_Roll1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_RollRate1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cmb_BBQAvailable = new javax.swing.JComboBox<String>();
        jLabel19 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel32 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        txt_LargeRate7 = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel13 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txt_RollID2 = new javax.swing.JTextField();
        txt_Roll2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txt_RollRate2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cmb_SaladRaitaAvailable = new javax.swing.JComboBox<String>();
        jLabel23 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel33 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        txt_LargeRate10 = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        txt_DealID2 = new javax.swing.JTextField();
        txt_Deal2 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        txt_DealRate2 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        cmb_BiryaniAvailable = new javax.swing.JComboBox<String>();
        jLabel59 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jPanel35 = new javax.swing.JPanel();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        txt_LargeRate11 = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        txt_FastFoodID2 = new javax.swing.JTextField();
        txt_FastFood2 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        txt_FastFoodRate2 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        cmb_DessertsAvailable = new javax.swing.JComboBox<String>();
        jLabel63 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jPanel37 = new javax.swing.JPanel();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        txt_LargeRate12 = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        txt_DealID3 = new javax.swing.JTextField();
        txt_Deal3 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        txt_DealRate3 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        cmb_PastaAvailable = new javax.swing.JComboBox<String>();
        jLabel67 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        jPanel39 = new javax.swing.JPanel();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jLabel93 = new javax.swing.JLabel();
        txt_LargeRate14 = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        txt_RollID3 = new javax.swing.JTextField();
        txt_Roll3 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txt_RollRate3 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        cmb_FriesAvailable = new javax.swing.JComboBox<String>();
        jLabel27 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        jPanel40 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel94 = new javax.swing.JLabel();
        txt_LargeRate13 = new javax.swing.JTextField();
        jPanel41 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        txt_FastFoodID3 = new javax.swing.JTextField();
        txt_FastFood3 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        txt_FastFoodRate3 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        cmb_CheeseGarlicBreadAvailable = new javax.swing.JComboBox<String>();
        jLabel71 = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        jPanel42 = new javax.swing.JPanel();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jLabel92 = new javax.swing.JLabel();
        txt_LargeRate15 = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jPanel43 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        txt_FastFoodID4 = new javax.swing.JTextField();
        txt_FastFood4 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        txt_FastFoodRate4 = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        cmb_Other2Available = new javax.swing.JComboBox<String>();
        jLabel75 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        jPanel44 = new javax.swing.JPanel();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        txt_LargeRate18 = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        txt_RollID4 = new javax.swing.JTextField();
        txt_Roll4 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txt_RollRate4 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        cmb_LasagniaAvailable = new javax.swing.JComboBox<String>();
        jLabel31 = new javax.swing.JLabel();
        jSeparator23 = new javax.swing.JSeparator();
        jPanel45 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        txt_LargeRate16 = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        txt_DealID4 = new javax.swing.JTextField();
        txt_Deal4 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        txt_DealRate4 = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        cmb_OtherAvailable = new javax.swing.JComboBox<String>();
        jLabel79 = new javax.swing.JLabel();
        jSeparator24 = new javax.swing.JSeparator();
        jPanel47 = new javax.swing.JPanel();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        txt_LargeRate17 = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        txt_SearchHistory = new javax.swing.JTextField();
        jButton57 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        ordersTable = new javax.swing.JTable();
        btn_Delete = new javax.swing.JButton();
        jLabel99 = new javax.swing.JLabel();
        jButton58 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        soldItemsTable = new javax.swing.JTable();
        InternalDeliveryHistory = new javax.swing.JInternalFrame();
        lbl_DeliveryCharges5 = new javax.swing.JLabel();
        txt_CustomerHistory = new javax.swing.JTextField();
        txt_PhoneHistory = new javax.swing.JTextField();
        DeliveryBoyHistory = new javax.swing.JTextField();
        lbl_Customer4 = new javax.swing.JLabel();
        lbl_DeliveryCharges6 = new javax.swing.JLabel();
        txt_RemarksHistory = new javax.swing.JTextField();
        lbl_Address6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Area_AddressHistory = new javax.swing.JTextArea();
        txt_DeliveryChargesHistory = new javax.swing.JTextField();
        lbl_Phone4 = new javax.swing.JLabel();
        lbl_Address5 = new javax.swing.JLabel();
        InternalDineInHistory = new javax.swing.JInternalFrame();
        lbl_CashierPos17 = new javax.swing.JLabel();
        lbl_CashierPos18 = new javax.swing.JLabel();
        ServiceChargesHistory = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        WaiterHistory = new javax.swing.JTextField();
        txt_TableNameHistory = new javax.swing.JTextField();
        MemershipHistory = new javax.swing.JInternalFrame();
        jLabel113 = new javax.swing.JLabel();
        HistoryMemberName = new javax.swing.JLabel();
        HistoryMemberContact = new javax.swing.JLabel();
        HistoryMemberCardNo = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        HistoryMemberAddress = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        PrintOrder = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        txt_SearchCanceled = new javax.swing.JTextField();
        jButton62 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        ordersCanceledTable = new javax.swing.JTable();
        jLabel101 = new javax.swing.JLabel();
        jButton63 = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        itemsCanceldTable = new javax.swing.JTable();
        InternalDeliveryCanceled = new javax.swing.JInternalFrame();
        lbl_Customer5 = new javax.swing.JLabel();
        lbl_DeliveryCharges8 = new javax.swing.JLabel();
        txt_Phone2 = new javax.swing.JTextField();
        DeliveryBoy3 = new javax.swing.JTextField();
        txt_Customer2 = new javax.swing.JTextField();
        lbl_DeliveryCharges7 = new javax.swing.JLabel();
        lbl_Address7 = new javax.swing.JLabel();
        lbl_Phone5 = new javax.swing.JLabel();
        txt_DeliveryCharges2 = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        Area_Address2 = new javax.swing.JTextArea();
        lbl_Address8 = new javax.swing.JLabel();
        txt_Remarks2 = new javax.swing.JTextField();
        InternalDineInCanceled = new javax.swing.JInternalFrame();
        lbl_CashierPos19 = new javax.swing.JLabel();
        lbl_CashierPos20 = new javax.swing.JLabel();
        ServiceChargesCanceled = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        WaiterCanceled = new javax.swing.JTextField();
        lbl_TableNameCanceled = new javax.swing.JTextField();
        MemershipCanceled = new javax.swing.JInternalFrame();
        jLabel115 = new javax.swing.JLabel();
        CanceledMemberName = new javax.swing.JLabel();
        CanceledMemberContact = new javax.swing.JLabel();
        CanceledMemberCardNo = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        CanceledMemberAddress = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jColorChooser1 = new javax.swing.JColorChooser();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(31, 58, 147), 5, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 656));

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

        jTabbedPane1.setBackground(new java.awt.Color(255, 51, 51));
        jTabbedPane1.setForeground(new java.awt.Color(255, 0, 0));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });
        jTabbedPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane1FocusGained(evt);
            }
        });
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 5));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 2), "Large Pizza", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ItemId");

        txt_LID.setEditable(false);
        txt_LID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_LargePizza.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_LargePizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LargePizzaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Name");

        txt_LargeRate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_LargeRate.setForeground(new java.awt.Color(255, 0, 0));
        txt_LargeRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LargeRateActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Rate");

        cmb_LargeAvailable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmb_LargeAvailable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_LargeAvailable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_LargeAvailable.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_LargeAvailablePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_LargeAvailablePopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Items");

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(0, 0, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 0, 153));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Refresh");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton9FocusGained(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(0, 0, 0)
                .addComponent(jButton2)
                .addGap(1, 1, 1)
                .addComponent(jButton9)
                .addContainerGap())
        );

        txt_LargeRate1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_LargeRate1.setForeground(new java.awt.Color(255, 0, 0));
        txt_LargeRate1.setEnabled(false);
        txt_LargeRate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LargeRate1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Membership Rate");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txt_LargeRate, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_LargeRate1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txt_LID, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txt_LargePizza)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(cmb_LargeAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1))
                .addGap(0, 0, 0)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_LID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_LargePizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_LargeRate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_LargeRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_LargeAvailable)))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 2), "Regular Pizza", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("ItemId");

        txt_RID.setEditable(false);
        txt_RID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_RegularPizza.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Name");

        txt_RegularRate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_RegularRate.setForeground(new java.awt.Color(255, 0, 0));
        txt_RegularRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RegularRateActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("Rate");

        cmb_RegularAvailable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmb_RegularAvailable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_RegularAvailable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_RegularAvailable.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_RegularAvailablePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_RegularAvailablePopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Items");

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jButton19.setBackground(new java.awt.Color(0, 0, 153));
        jButton19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("Delete");
        jButton19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(0, 0, 153));
        jButton20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("Add");
        jButton20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(0, 0, 153));
        jButton21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("Refresh");
        jButton21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton21.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton21FocusGained(evt);
            }
        });
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton20)
                .addGap(0, 0, 0)
                .addComponent(jButton19)
                .addGap(1, 1, 1)
                .addComponent(jButton21)
                .addContainerGap())
        );

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel81.setText("Membership Rate");

        txt_LargeRate2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_LargeRate2.setForeground(new java.awt.Color(255, 0, 0));
        txt_LargeRate2.setEnabled(false);
        txt_LargeRate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LargeRate2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_RID, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_RegularPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(txt_RegularRate, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_LargeRate2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(cmb_RegularAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_RID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_RegularPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_LargeRate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_RegularRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_RegularAvailable)))
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 2), "Small Pizza", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText("ItemId");

        txt_SID.setEditable(false);
        txt_SID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_SmallPizza.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("Name");

        txt_SmallRate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_SmallRate.setForeground(new java.awt.Color(255, 0, 0));
        txt_SmallRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SmallRateActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setText("Rate");

        cmb_SmallAvailable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmb_SmallAvailable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_SmallAvailable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_SmallAvailable.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_SmallAvailablePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_SmallAvailablePopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("Items");

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        jButton22.setBackground(new java.awt.Color(0, 0, 153));
        jButton22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("Delete");
        jButton22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(0, 0, 153));
        jButton23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("Add");
        jButton23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(0, 0, 153));
        jButton24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("Refresh");
        jButton24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton24.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton24FocusGained(evt);
            }
        });
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton23)
                .addGap(0, 0, 0)
                .addComponent(jButton22)
                .addGap(1, 1, 1)
                .addComponent(jButton24)
                .addContainerGap())
        );

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel82.setText("Membership Rate");

        txt_LargeRate3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_LargeRate3.setForeground(new java.awt.Color(255, 0, 0));
        txt_LargeRate3.setEnabled(false);
        txt_LargeRate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LargeRate3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_SmallPizza)
                            .addComponent(txt_SID, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(txt_SmallRate, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_LargeRate3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(cmb_SmallAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_SID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_SmallPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_LargeRate3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_SmallRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_SmallAvailable)))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSeparator2.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(255, 0, 0));
        jSeparator2.setOpaque(true);

        jSeparator3.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator3.setOpaque(true);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 2), "Fast Food", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel40.setText("ItemId");

        txt_FastFoodID.setEditable(false);
        txt_FastFoodID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_FastFood.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setText("Name");

        txt_FastFoodRate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_FastFoodRate.setForeground(new java.awt.Color(255, 0, 0));
        txt_FastFoodRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FastFoodRateActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel42.setText("Rate");

        cmb_FastFoodAvailable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmb_FastFoodAvailable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_FastFoodAvailable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_FastFoodAvailable.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_FastFoodAvailablePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_FastFoodAvailablePopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setText("Items");

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));

        jButton25.setBackground(new java.awt.Color(0, 0, 153));
        jButton25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("Delete");
        jButton25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setBackground(new java.awt.Color(0, 0, 153));
        jButton26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setText("Add");
        jButton26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setBackground(new java.awt.Color(0, 0, 153));
        jButton27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setText("Refresh");
        jButton27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton27.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton27FocusGained(evt);
            }
        });
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton26)
                .addGap(0, 0, 0)
                .addComponent(jButton25)
                .addGap(1, 1, 1)
                .addComponent(jButton27)
                .addContainerGap())
        );

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel83.setText("Membership Rate");

        txt_LargeRate6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_LargeRate6.setForeground(new java.awt.Color(255, 0, 0));
        txt_LargeRate6.setEnabled(false);
        txt_LargeRate6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LargeRate6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_FastFood)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_FastFoodID, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel23Layout.createSequentialGroup()
                                        .addComponent(txt_FastFoodRate, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_LargeRate6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(cmb_FastFoodAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_FastFoodID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_FastFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_LargeRate6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_FastFoodRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_FastFoodAvailable)))
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 2), "Deals", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel44.setText("ItemId");

        txt_DealID.setEditable(false);
        txt_DealID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_Deal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel45.setText("Name");

        txt_DealRate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_DealRate.setForeground(new java.awt.Color(255, 0, 0));
        txt_DealRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DealRateActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel46.setText("Rate");

        cmb_DealsAvailable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmb_DealsAvailable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_DealsAvailable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_DealsAvailable.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_DealsAvailablePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_DealsAvailablePopupMenuWillBecomeVisible(evt);
            }
        });
        cmb_DealsAvailable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmb_DealsAvailableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmb_DealsAvailableKeyReleased(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel47.setText("Items");

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));

        jButton28.setBackground(new java.awt.Color(0, 0, 153));
        jButton28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setText("Delete");
        jButton28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setBackground(new java.awt.Color(0, 0, 153));
        jButton29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton29.setForeground(new java.awt.Color(255, 255, 255));
        jButton29.setText("Add");
        jButton29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setBackground(new java.awt.Color(0, 0, 153));
        jButton30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jButton30.setText("Refresh");
        jButton30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton30.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton30FocusGained(evt);
            }
        });
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton29)
                .addGap(0, 0, 0)
                .addComponent(jButton28)
                .addGap(1, 1, 1)
                .addComponent(jButton30)
                .addContainerGap())
        );

        txt_LargeRate5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_LargeRate5.setForeground(new java.awt.Color(255, 0, 0));
        txt_LargeRate5.setEnabled(false);
        txt_LargeRate5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LargeRate5ActionPerformed(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel84.setText("Membership Rate");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_DealID, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                                    .addComponent(txt_DealRate, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_LargeRate5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txt_Deal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(cmb_DealsAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DealID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Deal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_LargeRate5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_DealRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_DealsAvailable)))
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 2), "Rolls", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("ItemId");

        txt_RollID.setEditable(false);
        txt_RollID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_Roll.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Roll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RollActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Name");

        txt_RollRate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_RollRate.setForeground(new java.awt.Color(255, 0, 0));
        txt_RollRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RollRateActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Rate");

        cmb_RollsAvailable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmb_RollsAvailable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_RollsAvailable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_RollsAvailable.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_RollsAvailablePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_RollsAvailablePopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Items");

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setBackground(new java.awt.Color(0, 0, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Delete");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 153));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Add");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(0, 0, 153));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Refresh");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton10FocusGained(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addGap(0, 0, 0)
                .addComponent(jButton3)
                .addGap(1, 1, 1)
                .addComponent(jButton10)
                .addContainerGap())
        );

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel85.setText("Membership Rate");

        txt_LargeRate4.setEditable(false);
        txt_LargeRate4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_LargeRate4.setForeground(new java.awt.Color(255, 0, 0));
        txt_LargeRate4.setEnabled(false);
        txt_LargeRate4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LargeRate4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Roll)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_RollID, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(txt_RollRate, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_LargeRate4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(cmb_RollsAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator4))
                .addGap(0, 0, 0)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_RollID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Roll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_LargeRate4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_RollRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_RollsAvailable)))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 2), "Burgers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel48.setText("ItemId");

        txt_DealID1.setEditable(false);
        txt_DealID1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_Deal1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel49.setText("Name");

        txt_DealRate1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_DealRate1.setForeground(new java.awt.Color(255, 0, 0));
        txt_DealRate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DealRate1ActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel50.setText("Rate");

        cmb_BurgersAvailable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmb_BurgersAvailable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_BurgersAvailable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_BurgersAvailable.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_BurgersAvailablePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_BurgersAvailablePopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel51.setText("Items");

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));

        jButton31.setBackground(new java.awt.Color(0, 0, 153));
        jButton31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton31.setForeground(new java.awt.Color(255, 255, 255));
        jButton31.setText("Delete");
        jButton31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setBackground(new java.awt.Color(0, 0, 153));
        jButton32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton32.setForeground(new java.awt.Color(255, 255, 255));
        jButton32.setText("Add");
        jButton32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setBackground(new java.awt.Color(0, 0, 153));
        jButton33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton33.setForeground(new java.awt.Color(255, 255, 255));
        jButton33.setText("Refresh");
        jButton33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton33.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton33FocusGained(evt);
            }
        });
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton32)
                .addGap(0, 0, 0)
                .addComponent(jButton31)
                .addGap(1, 1, 1)
                .addComponent(jButton33)
                .addContainerGap())
        );

        txt_LargeRate8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_LargeRate8.setForeground(new java.awt.Color(255, 0, 0));
        txt_LargeRate8.setEnabled(false);
        txt_LargeRate8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LargeRate8ActionPerformed(evt);
            }
        });

        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel87.setText("Membership Rate");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_DealID1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Deal1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(txt_DealRate1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_LargeRate8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(cmb_BurgersAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DealID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Deal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_LargeRate8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_DealRate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_BurgersAvailable)))
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 2), "Beverages", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel52.setText("ItemId");

        txt_FastFoodID1.setEditable(false);
        txt_FastFoodID1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_FastFood1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel53.setText("Name");

        txt_FastFoodRate1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_FastFoodRate1.setForeground(new java.awt.Color(255, 0, 0));
        txt_FastFoodRate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FastFoodRate1ActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel54.setText("Rate");

        cmb_BeveragesAvailable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmb_BeveragesAvailable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_BeveragesAvailable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_BeveragesAvailable.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_BeveragesAvailablePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_BeveragesAvailablePopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel55.setText("Items");

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));

        jButton34.setBackground(new java.awt.Color(0, 0, 153));
        jButton34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton34.setForeground(new java.awt.Color(255, 255, 255));
        jButton34.setText("Delete");
        jButton34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setBackground(new java.awt.Color(0, 0, 153));
        jButton35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton35.setForeground(new java.awt.Color(255, 255, 255));
        jButton35.setText("Add");
        jButton35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.setBackground(new java.awt.Color(0, 0, 153));
        jButton36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton36.setForeground(new java.awt.Color(255, 255, 255));
        jButton36.setText("Refresh");
        jButton36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton36.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton36FocusGained(evt);
            }
        });
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton35)
                .addGap(0, 0, 0)
                .addComponent(jButton34)
                .addGap(1, 1, 1)
                .addComponent(jButton36)
                .addContainerGap())
        );

        txt_LargeRate9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_LargeRate9.setForeground(new java.awt.Color(255, 0, 0));
        txt_LargeRate9.setEnabled(false);
        txt_LargeRate9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LargeRate9ActionPerformed(evt);
            }
        });

        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel88.setText("Membership Rate");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_FastFood1)
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_FastFoodID1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel30Layout.createSequentialGroup()
                                        .addComponent(txt_FastFoodRate1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_LargeRate9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(cmb_BeveragesAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_FastFoodID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_FastFood1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_LargeRate9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_FastFoodRate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_BeveragesAvailable)))
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 2), "BBQ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("ItemId");

        txt_RollID1.setEditable(false);
        txt_RollID1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_Roll1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Roll1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Roll1ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Name");

        txt_RollRate1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_RollRate1.setForeground(new java.awt.Color(255, 0, 0));
        txt_RollRate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RollRate1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Rate");

        cmb_BBQAvailable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmb_BBQAvailable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_BBQAvailable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_BBQAvailable.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_BBQAvailablePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_BBQAvailablePopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Items");

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));

        jButton5.setBackground(new java.awt.Color(0, 0, 153));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Delete");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 0, 153));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Add");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(0, 0, 153));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Refresh");
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton11FocusGained(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6)
                .addGap(0, 0, 0)
                .addComponent(jButton5)
                .addGap(1, 1, 1)
                .addComponent(jButton11)
                .addContainerGap())
        );

        txt_LargeRate7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_LargeRate7.setForeground(new java.awt.Color(255, 0, 0));
        txt_LargeRate7.setEnabled(false);
        txt_LargeRate7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LargeRate7ActionPerformed(evt);
            }
        });

        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel86.setText("Membership Rate");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Roll1)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_RollID1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(txt_RollRate1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_LargeRate7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(cmb_BBQAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator5))
                .addGap(0, 0, 0)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_RollID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Roll1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_LargeRate7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_RollRate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_BBQAvailable)))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSeparator6.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator6.setOpaque(true);

        jSeparator7.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator7.setOpaque(true);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 2), "SaladRaita", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("ItemId");

        txt_RollID2.setEditable(false);
        txt_RollID2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_Roll2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Roll2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Roll2ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Name");

        txt_RollRate2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_RollRate2.setForeground(new java.awt.Color(255, 0, 0));
        txt_RollRate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RollRate2ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Rate");

        cmb_SaladRaitaAvailable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmb_SaladRaitaAvailable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_SaladRaitaAvailable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_SaladRaitaAvailable.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_SaladRaitaAvailablePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_SaladRaitaAvailablePopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Items");

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));

        jButton12.setBackground(new java.awt.Color(0, 0, 153));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Delete");
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(0, 0, 153));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Add");
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(0, 0, 153));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Refresh");
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton14FocusGained(evt);
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton13)
                .addGap(0, 0, 0)
                .addComponent(jButton12)
                .addGap(1, 1, 1)
                .addComponent(jButton14)
                .addContainerGap())
        );

        txt_LargeRate10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_LargeRate10.setForeground(new java.awt.Color(255, 0, 0));
        txt_LargeRate10.setEnabled(false);
        txt_LargeRate10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LargeRate10ActionPerformed(evt);
            }
        });

        jLabel89.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel89.setText("Membership Rate");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Roll2)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_RollID2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(txt_RollRate2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_LargeRate10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(cmb_SaladRaitaAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator8))
                .addGap(0, 0, 0)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_RollID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Roll2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_LargeRate10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_RollRate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_SaladRaitaAvailable)))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 2), "Biryani", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel56.setText("ItemId");

        txt_DealID2.setEditable(false);
        txt_DealID2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_Deal2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel57.setText("Name");

        txt_DealRate2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_DealRate2.setForeground(new java.awt.Color(255, 0, 0));
        txt_DealRate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DealRate2ActionPerformed(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel58.setText("Rate");

        cmb_BiryaniAvailable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmb_BiryaniAvailable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_BiryaniAvailable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_BiryaniAvailable.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_BiryaniAvailablePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_BiryaniAvailablePopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel59.setText("Items");

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));

        jButton37.setBackground(new java.awt.Color(0, 0, 153));
        jButton37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton37.setForeground(new java.awt.Color(255, 255, 255));
        jButton37.setText("Delete");
        jButton37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton38.setBackground(new java.awt.Color(0, 0, 153));
        jButton38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton38.setForeground(new java.awt.Color(255, 255, 255));
        jButton38.setText("Add");
        jButton38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton39.setBackground(new java.awt.Color(0, 0, 153));
        jButton39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton39.setForeground(new java.awt.Color(255, 255, 255));
        jButton39.setText("Refresh");
        jButton39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton39.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton39FocusGained(evt);
            }
        });
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton38)
                .addGap(0, 0, 0)
                .addComponent(jButton37)
                .addGap(1, 1, 1)
                .addComponent(jButton39)
                .addContainerGap())
        );

        txt_LargeRate11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_LargeRate11.setForeground(new java.awt.Color(255, 0, 0));
        txt_LargeRate11.setEnabled(false);
        txt_LargeRate11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LargeRate11ActionPerformed(evt);
            }
        });

        jLabel90.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel90.setText("Membership Rate");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_DealID2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Deal2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addComponent(txt_DealRate2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_LargeRate11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(cmb_BiryaniAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DealID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Deal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_LargeRate11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_DealRate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_BiryaniAvailable)))
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));
        jPanel36.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 2), "Desserts", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel60.setText("ItemId");

        txt_FastFoodID2.setEditable(false);
        txt_FastFoodID2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_FastFood2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel61.setText("Name");

        txt_FastFoodRate2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_FastFoodRate2.setForeground(new java.awt.Color(255, 0, 0));
        txt_FastFoodRate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FastFoodRate2ActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel62.setText("Rate");

        cmb_DessertsAvailable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmb_DessertsAvailable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_DessertsAvailable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_DessertsAvailable.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_DessertsAvailablePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_DessertsAvailablePopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel63.setText("Items");

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));

        jButton40.setBackground(new java.awt.Color(0, 0, 153));
        jButton40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton40.setForeground(new java.awt.Color(255, 255, 255));
        jButton40.setText("Delete");
        jButton40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jButton41.setBackground(new java.awt.Color(0, 0, 153));
        jButton41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton41.setForeground(new java.awt.Color(255, 255, 255));
        jButton41.setText("Add");
        jButton41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setBackground(new java.awt.Color(0, 0, 153));
        jButton42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton42.setForeground(new java.awt.Color(255, 255, 255));
        jButton42.setText("Refresh");
        jButton42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton42.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton42FocusGained(evt);
            }
        });
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton41)
                .addGap(0, 0, 0)
                .addComponent(jButton40)
                .addGap(1, 1, 1)
                .addComponent(jButton42)
                .addContainerGap())
        );

        txt_LargeRate12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_LargeRate12.setForeground(new java.awt.Color(255, 0, 0));
        txt_LargeRate12.setEnabled(false);
        txt_LargeRate12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LargeRate12ActionPerformed(evt);
            }
        });

        jLabel91.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel91.setText("Membership Rate");

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_FastFood2)
                            .addGroup(jPanel36Layout.createSequentialGroup()
                                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_FastFoodID2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel36Layout.createSequentialGroup()
                                        .addComponent(txt_FastFoodRate2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_LargeRate12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(cmb_DessertsAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_FastFoodID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_FastFood2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_LargeRate12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_FastFoodRate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_DessertsAvailable)))
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));
        jPanel38.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 2), "Pasta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel64.setText("ItemId");

        txt_DealID3.setEditable(false);
        txt_DealID3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_Deal3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel65.setText("Name");

        txt_DealRate3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_DealRate3.setForeground(new java.awt.Color(255, 0, 0));
        txt_DealRate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DealRate3ActionPerformed(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel66.setText("Rate");

        cmb_PastaAvailable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmb_PastaAvailable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_PastaAvailable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_PastaAvailable.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_PastaAvailablePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_PastaAvailablePopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel67.setText("Items");

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));

        jButton43.setBackground(new java.awt.Color(0, 0, 153));
        jButton43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton43.setForeground(new java.awt.Color(255, 255, 255));
        jButton43.setText("Delete");
        jButton43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jButton44.setBackground(new java.awt.Color(0, 0, 153));
        jButton44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton44.setForeground(new java.awt.Color(255, 255, 255));
        jButton44.setText("Add");
        jButton44.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jButton45.setBackground(new java.awt.Color(0, 0, 153));
        jButton45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton45.setForeground(new java.awt.Color(255, 255, 255));
        jButton45.setText("Refresh");
        jButton45.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton45.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton45FocusGained(evt);
            }
        });
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton44)
                .addGap(0, 0, 0)
                .addComponent(jButton43)
                .addGap(1, 1, 1)
                .addComponent(jButton45)
                .addContainerGap())
        );

        jLabel93.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel93.setText("Membership Rate");

        txt_LargeRate14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_LargeRate14.setForeground(new java.awt.Color(255, 0, 0));
        txt_LargeRate14.setEnabled(false);
        txt_LargeRate14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LargeRate14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_DealID3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Deal3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addComponent(txt_DealRate3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_LargeRate14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(cmb_PastaAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DealID3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Deal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_LargeRate14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_DealRate3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_PastaAvailable)))
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 2), "Fries", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("ItemId");

        txt_RollID3.setEditable(false);
        txt_RollID3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_Roll3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Roll3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Roll3ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Name");

        txt_RollRate3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_RollRate3.setForeground(new java.awt.Color(255, 0, 0));
        txt_RollRate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RollRate3ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Rate");

        cmb_FriesAvailable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmb_FriesAvailable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_FriesAvailable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_FriesAvailable.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_FriesAvailablePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_FriesAvailablePopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Items");

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));

        jButton15.setBackground(new java.awt.Color(0, 0, 153));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Delete");
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(0, 0, 153));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("Add");
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(0, 0, 153));
        jButton17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Refresh");
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton17FocusGained(evt);
            }
        });
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton16)
                .addGap(0, 0, 0)
                .addComponent(jButton15)
                .addGap(1, 1, 1)
                .addComponent(jButton17)
                .addContainerGap())
        );

        jLabel94.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel94.setText("Membership Rate");

        txt_LargeRate13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_LargeRate13.setForeground(new java.awt.Color(255, 0, 0));
        txt_LargeRate13.setEnabled(false);
        txt_LargeRate13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LargeRate13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Roll3)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_RollID3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addComponent(txt_RollRate3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_LargeRate13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(cmb_FriesAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator18))
                .addGap(0, 0, 0)
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_RollID3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Roll3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_LargeRate13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_RollRate3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_FriesAvailable)))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));
        jPanel41.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 2), "Cheese Garlic Bread", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel68.setText("ItemId");

        txt_FastFoodID3.setEditable(false);
        txt_FastFoodID3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_FastFood3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel69.setText("Name");

        txt_FastFoodRate3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_FastFoodRate3.setForeground(new java.awt.Color(255, 0, 0));
        txt_FastFoodRate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FastFoodRate3ActionPerformed(evt);
            }
        });

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel70.setText("Rate");

        cmb_CheeseGarlicBreadAvailable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmb_CheeseGarlicBreadAvailable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_CheeseGarlicBreadAvailable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_CheeseGarlicBreadAvailable.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_CheeseGarlicBreadAvailablePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_CheeseGarlicBreadAvailablePopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel71.setText("Items");

        jPanel42.setBackground(new java.awt.Color(255, 255, 255));

        jButton46.setBackground(new java.awt.Color(0, 0, 153));
        jButton46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton46.setForeground(new java.awt.Color(255, 255, 255));
        jButton46.setText("Delete");
        jButton46.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jButton47.setBackground(new java.awt.Color(0, 0, 153));
        jButton47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton47.setForeground(new java.awt.Color(255, 255, 255));
        jButton47.setText("Add");
        jButton47.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        jButton48.setBackground(new java.awt.Color(0, 0, 153));
        jButton48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton48.setForeground(new java.awt.Color(255, 255, 255));
        jButton48.setText("Refresh");
        jButton48.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton48.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton48FocusGained(evt);
            }
        });
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton47)
                .addGap(0, 0, 0)
                .addComponent(jButton46)
                .addGap(1, 1, 1)
                .addComponent(jButton48)
                .addContainerGap())
        );

        jLabel92.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel92.setText("Membership Rate");

        txt_LargeRate15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_LargeRate15.setForeground(new java.awt.Color(255, 0, 0));
        txt_LargeRate15.setEnabled(false);
        txt_LargeRate15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LargeRate15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_FastFood3)
                            .addGroup(jPanel41Layout.createSequentialGroup()
                                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel41Layout.createSequentialGroup()
                                        .addComponent(txt_FastFoodRate3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_LargeRate15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_FastFoodID3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(cmb_CheeseGarlicBreadAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_FastFoodID3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_FastFood3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_LargeRate15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_FastFoodRate3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_CheeseGarlicBreadAvailable)))
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSeparator20.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator20.setOpaque(true);

        jPanel43.setBackground(new java.awt.Color(255, 255, 255));
        jPanel43.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 2), "TEA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel72.setText("ItemId");

        txt_FastFoodID4.setEditable(false);
        txt_FastFoodID4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_FastFood4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel73.setText("Name");

        txt_FastFoodRate4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_FastFoodRate4.setForeground(new java.awt.Color(255, 0, 0));
        txt_FastFoodRate4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FastFoodRate4ActionPerformed(evt);
            }
        });

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel74.setText("Rate");

        cmb_Other2Available.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmb_Other2Available.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_Other2Available.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_Other2Available.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_Other2AvailablePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_Other2AvailablePopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel75.setText("Items");

        jPanel44.setBackground(new java.awt.Color(255, 255, 255));

        jButton49.setBackground(new java.awt.Color(0, 0, 153));
        jButton49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton49.setForeground(new java.awt.Color(255, 255, 255));
        jButton49.setText("Delete");
        jButton49.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        jButton50.setBackground(new java.awt.Color(0, 0, 153));
        jButton50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton50.setForeground(new java.awt.Color(255, 255, 255));
        jButton50.setText("Add");
        jButton50.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });

        jButton51.setBackground(new java.awt.Color(0, 0, 153));
        jButton51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton51.setForeground(new java.awt.Color(255, 255, 255));
        jButton51.setText("Refresh");
        jButton51.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton51.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton51FocusGained(evt);
            }
        });
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton50)
                .addGap(0, 0, 0)
                .addComponent(jButton49)
                .addGap(1, 1, 1)
                .addComponent(jButton51)
                .addContainerGap())
        );

        txt_LargeRate18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_LargeRate18.setForeground(new java.awt.Color(255, 0, 0));
        txt_LargeRate18.setEnabled(false);
        txt_LargeRate18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LargeRate18ActionPerformed(evt);
            }
        });

        jLabel97.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel97.setText("Membership Rate");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_FastFood4)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_FastFoodID4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel43Layout.createSequentialGroup()
                                        .addComponent(txt_FastFoodRate4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_LargeRate18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(cmb_Other2Available, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_FastFoodID4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_FastFood4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_LargeRate18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_FastFoodRate4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_Other2Available)))
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 2), "Lasagnia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("ItemId");

        txt_RollID4.setEditable(false);
        txt_RollID4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_Roll4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Roll4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Roll4ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Name");

        txt_RollRate4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_RollRate4.setForeground(new java.awt.Color(255, 0, 0));
        txt_RollRate4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RollRate4ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Rate");

        cmb_LasagniaAvailable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmb_LasagniaAvailable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_LasagniaAvailable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_LasagniaAvailable.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_LasagniaAvailablePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_LasagniaAvailablePopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Items");

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));

        jButton18.setBackground(new java.awt.Color(0, 0, 153));
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("Delete");
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton52.setBackground(new java.awt.Color(0, 0, 153));
        jButton52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton52.setForeground(new java.awt.Color(255, 255, 255));
        jButton52.setText("Add");
        jButton52.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });

        jButton53.setBackground(new java.awt.Color(0, 0, 153));
        jButton53.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton53.setForeground(new java.awt.Color(255, 255, 255));
        jButton53.setText("Refresh");
        jButton53.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton53.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton53FocusGained(evt);
            }
        });
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton52)
                .addGap(0, 0, 0)
                .addComponent(jButton18)
                .addGap(1, 1, 1)
                .addComponent(jButton53)
                .addContainerGap())
        );

        txt_LargeRate16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_LargeRate16.setForeground(new java.awt.Color(255, 0, 0));
        txt_LargeRate16.setEnabled(false);
        txt_LargeRate16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LargeRate16ActionPerformed(evt);
            }
        });

        jLabel95.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel95.setText("Membership Rate");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Roll4)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_RollID4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addComponent(txt_RollRate4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_LargeRate16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(cmb_LasagniaAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator23))
                .addGap(0, 0, 0)
                .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_RollID4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Roll4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_LargeRate16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_RollRate4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_LasagniaAvailable)))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel46.setBackground(new java.awt.Color(255, 255, 255));
        jPanel46.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 2), "Shawarma", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel76.setText("ItemId");

        txt_DealID4.setEditable(false);
        txt_DealID4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_Deal4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel77.setText("Name");

        txt_DealRate4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_DealRate4.setForeground(new java.awt.Color(255, 0, 0));
        txt_DealRate4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DealRate4ActionPerformed(evt);
            }
        });

        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel78.setText("Rate");

        cmb_OtherAvailable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmb_OtherAvailable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_OtherAvailable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_OtherAvailable.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_OtherAvailablePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_OtherAvailablePopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel79.setText("Items");

        jPanel47.setBackground(new java.awt.Color(255, 255, 255));

        jButton54.setBackground(new java.awt.Color(0, 0, 153));
        jButton54.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton54.setForeground(new java.awt.Color(255, 255, 255));
        jButton54.setText("Delete");
        jButton54.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });

        jButton55.setBackground(new java.awt.Color(0, 0, 153));
        jButton55.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton55.setForeground(new java.awt.Color(255, 255, 255));
        jButton55.setText("Add");
        jButton55.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });

        jButton56.setBackground(new java.awt.Color(0, 0, 153));
        jButton56.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton56.setForeground(new java.awt.Color(255, 255, 255));
        jButton56.setText("Refresh");
        jButton56.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton56.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton56FocusGained(evt);
            }
        });
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton55)
                .addGap(0, 0, 0)
                .addComponent(jButton54)
                .addGap(1, 1, 1)
                .addComponent(jButton56)
                .addContainerGap())
        );

        txt_LargeRate17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_LargeRate17.setForeground(new java.awt.Color(255, 0, 0));
        txt_LargeRate17.setEnabled(false);
        txt_LargeRate17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LargeRate17ActionPerformed(evt);
            }
        });

        jLabel96.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel96.setText("Membership Rate");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_DealID4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel46Layout.createSequentialGroup()
                                    .addComponent(txt_DealRate4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_LargeRate17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txt_Deal4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(cmb_OtherAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DealID4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Deal4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_LargeRate17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_DealRate4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_OtherAvailable)))
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator6)
                    .addComponent(jSeparator7)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator20)
                    .addComponent(jSeparator21)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 187, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel9);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1351, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Rate Manager", jPanel4);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 5));

        jPanel48.setBackground(new java.awt.Color(255, 255, 255));
        jPanel48.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sale", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        txt_SearchHistory.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton57.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton57.setText("Search");
        jButton57.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });

        ordersTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ordersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        ordersTable.setRowHeight(25);
        ordersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordersTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(ordersTable);

        btn_Delete.setBackground(new java.awt.Color(255, 0, 0));
        btn_Delete.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_Delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_Delete.setText("Cancel Order");
        btn_Delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Delete.setEnabled(false);
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        jLabel99.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel99.setText("Invoice ID");

        jButton58.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Delete_15px.png"))); // NOI18N
        jButton58.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel99)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_SearchHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_SearchHistory, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11))
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Delete)
                            .addComponent(jButton57))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jScrollPane10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Purchased Items"));

        soldItemsTable.setAutoCreateRowSorter(true);
        soldItemsTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        soldItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S#", "Item Name", "Rate", "Quantity", "Total"
            }
        ));
        soldItemsTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        soldItemsTable.setRowHeight(25);
        soldItemsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                soldItemsTableMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(soldItemsTable);

        InternalDeliveryHistory.setTitle("Delivery");
        InternalDeliveryHistory.setVisible(false);
        InternalDeliveryHistory.getContentPane().setLayout(null);

        lbl_DeliveryCharges5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_DeliveryCharges5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_DeliveryCharges5.setText("Charges");
        InternalDeliveryHistory.getContentPane().add(lbl_DeliveryCharges5);
        lbl_DeliveryCharges5.setBounds(0, 24, 86, 20);

        txt_CustomerHistory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_CustomerHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CustomerHistoryActionPerformed(evt);
            }
        });
        InternalDeliveryHistory.getContentPane().add(txt_CustomerHistory);
        txt_CustomerHistory.setBounds(90, 0, 164, 23);

        txt_PhoneHistory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_PhoneHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PhoneHistoryActionPerformed(evt);
            }
        });
        InternalDeliveryHistory.getContentPane().add(txt_PhoneHistory);
        txt_PhoneHistory.setBounds(316, 0, 192, 23);

        DeliveryBoyHistory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DeliveryBoyHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeliveryBoyHistoryActionPerformed(evt);
            }
        });
        InternalDeliveryHistory.getContentPane().add(DeliveryBoyHistory);
        DeliveryBoyHistory.setBounds(317, 25, 191, 25);

        lbl_Customer4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Customer4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Customer4.setText("Customer");
        InternalDeliveryHistory.getContentPane().add(lbl_Customer4);
        lbl_Customer4.setBounds(0, 1, 86, 20);

        lbl_DeliveryCharges6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_DeliveryCharges6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_DeliveryCharges6.setText("Delivery Boy");
        InternalDeliveryHistory.getContentPane().add(lbl_DeliveryCharges6);
        lbl_DeliveryCharges6.setBounds(213, 24, 94, 25);

        txt_RemarksHistory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_RemarksHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RemarksHistoryActionPerformed(evt);
            }
        });
        InternalDeliveryHistory.getContentPane().add(txt_RemarksHistory);
        txt_RemarksHistory.setBounds(90, 97, 412, 23);

        lbl_Address6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Address6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Address6.setText("Remarks");
        InternalDeliveryHistory.getContentPane().add(lbl_Address6);
        lbl_Address6.setBounds(0, 97, 86, 23);

        Area_AddressHistory.setColumns(20);
        Area_AddressHistory.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Area_AddressHistory.setLineWrap(true);
        Area_AddressHistory.setRows(5);
        Area_AddressHistory.setWrapStyleWord(true);
        jScrollPane6.setViewportView(Area_AddressHistory);

        InternalDeliveryHistory.getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(90, 56, 412, 40);

        txt_DeliveryChargesHistory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_DeliveryChargesHistory.setForeground(new java.awt.Color(255, 0, 0));
        txt_DeliveryChargesHistory.setText("0.0");
        txt_DeliveryChargesHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DeliveryChargesHistoryActionPerformed(evt);
            }
        });
        InternalDeliveryHistory.getContentPane().add(txt_DeliveryChargesHistory);
        txt_DeliveryChargesHistory.setBounds(90, 24, 105, 31);

        lbl_Phone4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Phone4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Phone4.setText("Phone");
        InternalDeliveryHistory.getContentPane().add(lbl_Phone4);
        lbl_Phone4.setBounds(257, 1, 49, 20);

        lbl_Address5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Address5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Address5.setText("Address");
        InternalDeliveryHistory.getContentPane().add(lbl_Address5);
        lbl_Address5.setBounds(0, 56, 86, 20);

        InternalDineInHistory.setTitle("Dining Details");
        InternalDineInHistory.setAutoscrolls(true);
        InternalDineInHistory.setVisible(false);
        InternalDineInHistory.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_CashierPos17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_CashierPos17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CashierPos17.setText("Charges");
        InternalDineInHistory.getContentPane().add(lbl_CashierPos17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 25));

        lbl_CashierPos18.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_CashierPos18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CashierPos18.setText("Waiter");
        InternalDineInHistory.getContentPane().add(lbl_CashierPos18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 25));

        ServiceChargesHistory.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ServiceChargesHistory.setForeground(new java.awt.Color(255, 51, 51));
        ServiceChargesHistory.setText("0.0");
        ServiceChargesHistory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ServiceChargesHistoryKeyReleased(evt);
            }
        });
        InternalDineInHistory.getContentPane().add(ServiceChargesHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 130, 30));

        jLabel100.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel100.setText("Table:");
        InternalDineInHistory.getContentPane().add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 30));

        WaiterHistory.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        WaiterHistory.setForeground(new java.awt.Color(255, 51, 51));
        InternalDineInHistory.getContentPane().add(WaiterHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 260, 30));

        txt_TableNameHistory.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_TableNameHistory.setForeground(new java.awt.Color(255, 51, 51));
        InternalDineInHistory.getContentPane().add(txt_TableNameHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 130, 30));

        MemershipHistory.setTitle("Membership");
        MemershipHistory.setAutoscrolls(true);
        MemershipHistory.setVisible(false);
        MemershipHistory.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel113.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel113.setText("Contact:");
        MemershipHistory.getContentPane().add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 48, 72, -1));

        HistoryMemberName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HistoryMemberName.setText("Nil");
        MemershipHistory.getContentPane().add(HistoryMemberName, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 0, 363, -1));

        HistoryMemberContact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HistoryMemberContact.setText("Nil");
        MemershipHistory.getContentPane().add(HistoryMemberContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 46, 207, -1));

        HistoryMemberCardNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HistoryMemberCardNo.setText("Nil");
        MemershipHistory.getContentPane().add(HistoryMemberCardNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 23, 207, -1));

        jLabel112.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel112.setText("CardNo:");
        MemershipHistory.getContentPane().add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 72, -1));

        jLabel110.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel110.setText("Name:");
        MemershipHistory.getContentPane().add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 72, -1));

        HistoryMemberAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HistoryMemberAddress.setText("Nil");
        MemershipHistory.getContentPane().add(HistoryMemberAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 69, 458, -1));

        jLabel114.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel114.setText("Address:");
        MemershipHistory.getContentPane().add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 69, 72, 24));

        PrintOrder.setBackground(new java.awt.Color(0, 51, 102));
        PrintOrder.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        PrintOrder.setForeground(new java.awt.Color(255, 255, 255));
        PrintOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Receipt_25px.png"))); // NOI18N
        PrintOrder.setText("Print Receipt");
        PrintOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PrintOrder.setEnabled(false);
        PrintOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(InternalDineInHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(InternalDeliveryHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PrintOrder)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(MemershipHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MemershipHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InternalDeliveryHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InternalDineInHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PrintOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        try {
            InternalDeliveryHistory.setIcon(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jTabbedPane1.addTab("Orders History", jPanel3);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 5));

        jPanel49.setBackground(new java.awt.Color(255, 255, 255));
        jPanel49.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sale", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanel49.setPreferredSize(new java.awt.Dimension(766, 676));

        txt_SearchCanceled.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton62.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton62.setText("Search");
        jButton62.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });

        ordersCanceledTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ordersCanceledTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        ordersCanceledTable.setRowHeight(25);
        ordersCanceledTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordersCanceledTableMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(ordersCanceledTable);

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel101.setText("Invoice ID");

        jButton63.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Delete_15px.png"))); // NOI18N
        jButton63.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_SearchCanceled, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_SearchCanceled, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(jLabel101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton62, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Purchased Items"));

        itemsCanceldTable.setAutoCreateRowSorter(true);
        itemsCanceldTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        itemsCanceldTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S#", "Item Name", "Rate", "Quantity", "Total"
            }
        ));
        itemsCanceldTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        itemsCanceldTable.setRowHeight(25);
        itemsCanceldTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemsCanceldTableMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(itemsCanceldTable);

        InternalDeliveryCanceled.setTitle("Delivery");
        InternalDeliveryCanceled.setVisible(false);
        InternalDeliveryCanceled.getContentPane().setLayout(null);

        lbl_Customer5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Customer5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Customer5.setText("Customer");
        InternalDeliveryCanceled.getContentPane().add(lbl_Customer5);
        lbl_Customer5.setBounds(10, 0, 86, 20);

        lbl_DeliveryCharges8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_DeliveryCharges8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_DeliveryCharges8.setText("Delivery Boy");
        InternalDeliveryCanceled.getContentPane().add(lbl_DeliveryCharges8);
        lbl_DeliveryCharges8.setBounds(223, 28, 94, 20);

        txt_Phone2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Phone2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Phone2ActionPerformed(evt);
            }
        });
        InternalDeliveryCanceled.getContentPane().add(txt_Phone2);
        txt_Phone2.setBounds(321, 0, 191, 23);

        DeliveryBoy3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DeliveryBoy3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeliveryBoy3ActionPerformed(evt);
            }
        });
        InternalDeliveryCanceled.getContentPane().add(DeliveryBoy3);
        DeliveryBoy3.setBounds(321, 26, 191, 27);

        txt_Customer2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Customer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Customer2ActionPerformed(evt);
            }
        });
        InternalDeliveryCanceled.getContentPane().add(txt_Customer2);
        txt_Customer2.setBounds(100, 0, 164, 23);

        lbl_DeliveryCharges7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_DeliveryCharges7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_DeliveryCharges7.setText("Charges");
        InternalDeliveryCanceled.getContentPane().add(lbl_DeliveryCharges7);
        lbl_DeliveryCharges7.setBounds(10, 30, 86, 20);

        lbl_Address7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Address7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Address7.setText("Address");
        InternalDeliveryCanceled.getContentPane().add(lbl_Address7);
        lbl_Address7.setBounds(10, 54, 86, 20);

        lbl_Phone5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Phone5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Phone5.setText("Phone");
        InternalDeliveryCanceled.getContentPane().add(lbl_Phone5);
        lbl_Phone5.setBounds(268, 1, 49, 20);

        txt_DeliveryCharges2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_DeliveryCharges2.setForeground(new java.awt.Color(255, 0, 0));
        txt_DeliveryCharges2.setText("0.0");
        txt_DeliveryCharges2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DeliveryCharges2ActionPerformed(evt);
            }
        });
        InternalDeliveryCanceled.getContentPane().add(txt_DeliveryCharges2);
        txt_DeliveryCharges2.setBounds(100, 25, 105, 27);

        Area_Address2.setColumns(20);
        Area_Address2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Area_Address2.setLineWrap(true);
        Area_Address2.setRows(5);
        Area_Address2.setWrapStyleWord(true);
        jScrollPane8.setViewportView(Area_Address2);

        InternalDeliveryCanceled.getContentPane().add(jScrollPane8);
        jScrollPane8.setBounds(100, 54, 412, 43);

        lbl_Address8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Address8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Address8.setText("Remarks");
        InternalDeliveryCanceled.getContentPane().add(lbl_Address8);
        lbl_Address8.setBounds(10, 98, 86, 32);

        txt_Remarks2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Remarks2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Remarks2ActionPerformed(evt);
            }
        });
        InternalDeliveryCanceled.getContentPane().add(txt_Remarks2);
        txt_Remarks2.setBounds(100, 98, 412, 32);

        InternalDineInCanceled.setTitle("Dining Details");
        InternalDineInCanceled.setVisible(false);
        InternalDineInCanceled.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_CashierPos19.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_CashierPos19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CashierPos19.setText("Charges");
        InternalDineInCanceled.getContentPane().add(lbl_CashierPos19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 70, 25));

        lbl_CashierPos20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_CashierPos20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CashierPos20.setText("Waiter");
        InternalDineInCanceled.getContentPane().add(lbl_CashierPos20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 70, 25));

        ServiceChargesCanceled.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ServiceChargesCanceled.setForeground(new java.awt.Color(255, 51, 51));
        ServiceChargesCanceled.setText("0.0");
        ServiceChargesCanceled.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ServiceChargesCanceledKeyReleased(evt);
            }
        });
        InternalDineInCanceled.getContentPane().add(ServiceChargesCanceled, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 130, 30));

        jLabel102.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel102.setText("Table:");
        InternalDineInCanceled.getContentPane().add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 30));

        WaiterCanceled.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        WaiterCanceled.setForeground(new java.awt.Color(255, 51, 51));
        InternalDineInCanceled.getContentPane().add(WaiterCanceled, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 260, 30));

        lbl_TableNameCanceled.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_TableNameCanceled.setForeground(new java.awt.Color(255, 51, 51));
        InternalDineInCanceled.getContentPane().add(lbl_TableNameCanceled, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 130, 30));

        MemershipCanceled.setTitle("Membership");
        MemershipCanceled.setAutoscrolls(true);
        MemershipCanceled.setVisible(false);
        MemershipCanceled.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel115.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel115.setText("Contact:");
        MemershipCanceled.getContentPane().add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 48, 72, -1));

        CanceledMemberName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CanceledMemberName.setText("Nil");
        MemershipCanceled.getContentPane().add(CanceledMemberName, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 0, 363, -1));

        CanceledMemberContact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CanceledMemberContact.setText("Nil");
        MemershipCanceled.getContentPane().add(CanceledMemberContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 46, 207, -1));

        CanceledMemberCardNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CanceledMemberCardNo.setText("Nil");
        MemershipCanceled.getContentPane().add(CanceledMemberCardNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 23, 207, -1));

        jLabel116.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel116.setText("CardNo:");
        MemershipCanceled.getContentPane().add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 72, -1));

        jLabel117.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel117.setText("Name:");
        MemershipCanceled.getContentPane().add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 72, -1));

        CanceledMemberAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CanceledMemberAddress.setText("Nil");
        MemershipCanceled.getContentPane().add(CanceledMemberAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 69, 458, -1));

        jLabel118.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel118.setText("Address:");
        MemershipCanceled.getContentPane().add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 69, 72, 24));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(InternalDineInCanceled, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MemershipCanceled, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InternalDeliveryCanceled, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(MemershipCanceled, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InternalDineInCanceled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(InternalDeliveryCanceled, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addComponent(jPanel49, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Orders Canceled", jPanel10);

        jPanel50.setBackground(new java.awt.Color(255, 255, 255));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Help"));

        jLabel1.setBackground(new java.awt.Color(255, 51, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 153));
        jLabel1.setText("1. Click an item again to increase quantity.");

        jLabel15.setBackground(new java.awt.Color(255, 51, 0));
        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 0, 153));
        jLabel15.setText("<html>3. Select an item from table and click <b>Cancel Button</b> to cancel item from Purchased Items.</html>");

        jLabel80.setBackground(new java.awt.Color(255, 51, 0));
        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(51, 0, 153));
        jLabel80.setText("2. Click Save Record if you don't want receipt print.");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 326, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        jColorChooser1.setBackground(new java.awt.Color(102, 102, 255));

        jButton65.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton65.setText("Apply Color");
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });

        jButton66.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton66.setText("Reset Color");
        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addComponent(jButton66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton65))
                    .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jColorChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(458, Short.MAX_VALUE))
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton65)
                    .addComponent(jButton66))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Help", jPanel50);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(1297, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(718, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1409, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
        );

        setBounds(80, 54, 1409, 768);
    }// </editor-fold>//GEN-END:initComponents
    
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

    private void txt_LargePizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LargePizzaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LargePizzaActionPerformed

    private void txt_LargeRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LargeRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LargeRateActionPerformed

    private void cmb_LargeAvailablePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_LargeAvailablePopupMenuWillBecomeInvisible

        RateManagerCRUD.ShowLargePizza();
    }//GEN-LAST:event_cmb_LargeAvailablePopupMenuWillBecomeInvisible

    private void cmb_LargeAvailablePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_LargeAvailablePopupMenuWillBecomeVisible

    }//GEN-LAST:event_cmb_LargeAvailablePopupMenuWillBecomeVisible

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        RateManagerCRUD.DeleteLargePizza();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        RateManagerCRUD r = new RateManagerCRUD();
//        r.AddLargePizza();
        
        RateManagerCRUD.AddLargePizza();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton9FocusGained

    }//GEN-LAST:event_jButton9FocusGained

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        txt_LID.setText("");
        txt_LargePizza.setText("");
        txt_LargeRate.setText("");
        txt_LargeRate1.setText("");

    }//GEN-LAST:event_jButton9ActionPerformed

    private void txt_LargeRate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LargeRate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LargeRate1ActionPerformed

    private void txt_RegularRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RegularRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RegularRateActionPerformed

    private void cmb_RegularAvailablePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_RegularAvailablePopupMenuWillBecomeInvisible
        RateManagerCRUD.ShowRegularPizza();
    }//GEN-LAST:event_cmb_RegularAvailablePopupMenuWillBecomeInvisible

    private void cmb_RegularAvailablePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_RegularAvailablePopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_RegularAvailablePopupMenuWillBecomeVisible

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        RateManagerCRUD.DeleteRegularPizza();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        RateManagerCRUD.AddRegularPizza();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton21FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21FocusGained

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        txt_RID.setText("");
        txt_RegularPizza.setText("");
        txt_RegularRate.setText("");
        txt_LargeRate2.setText("");
    }//GEN-LAST:event_jButton21ActionPerformed

    private void txt_LargeRate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LargeRate2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LargeRate2ActionPerformed

    private void txt_SmallRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SmallRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SmallRateActionPerformed

    private void cmb_SmallAvailablePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_SmallAvailablePopupMenuWillBecomeInvisible
        RateManagerCRUD.ShowSmallPizza();
    }//GEN-LAST:event_cmb_SmallAvailablePopupMenuWillBecomeInvisible

    private void cmb_SmallAvailablePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_SmallAvailablePopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_SmallAvailablePopupMenuWillBecomeVisible

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        RateManagerCRUD.DeleteSmallPizza();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        RateManagerCRUD.AddSmallPizza();
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton24FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24FocusGained

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        txt_SID.setText("");
        txt_SmallPizza.setText("");
        txt_SmallRate.setText("");
        txt_LargeRate3.setText("");
    }//GEN-LAST:event_jButton24ActionPerformed

    private void txt_LargeRate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LargeRate3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LargeRate3ActionPerformed

    private void txt_FastFoodRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FastFoodRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FastFoodRateActionPerformed

    private void cmb_FastFoodAvailablePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_FastFoodAvailablePopupMenuWillBecomeInvisible
        RateManagerCRUD.ShowFastFood();
    }//GEN-LAST:event_cmb_FastFoodAvailablePopupMenuWillBecomeInvisible

    private void cmb_FastFoodAvailablePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_FastFoodAvailablePopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_FastFoodAvailablePopupMenuWillBecomeVisible

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        RateManagerCRUD.DeleteFastFood();
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        RateManagerCRUD.AddFastFood();
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton27FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27FocusGained

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        txt_FastFoodID.setText("");
        txt_FastFood.setText("");
        txt_FastFoodRate.setText("");
        txt_LargeRate6.setText("");
    }//GEN-LAST:event_jButton27ActionPerformed

    private void txt_LargeRate6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LargeRate6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LargeRate6ActionPerformed

    private void txt_DealRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DealRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DealRateActionPerformed

    private void cmb_DealsAvailablePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_DealsAvailablePopupMenuWillBecomeInvisible
        RateManagerCRUD.ShowDeals();
    }//GEN-LAST:event_cmb_DealsAvailablePopupMenuWillBecomeInvisible

    private void cmb_DealsAvailablePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_DealsAvailablePopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_DealsAvailablePopupMenuWillBecomeVisible

    private void cmb_DealsAvailableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmb_DealsAvailableKeyPressed

    }//GEN-LAST:event_cmb_DealsAvailableKeyPressed

    private void cmb_DealsAvailableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmb_DealsAvailableKeyReleased

    }//GEN-LAST:event_cmb_DealsAvailableKeyReleased

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        RateManagerCRUD.DeleteDeal();
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        RateManagerCRUD.AddDeal();
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton30FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton30FocusGained

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        txt_DealID.setText("");
        txt_Deal.setText("");
        txt_DealRate.setText("");
        txt_LargeRate5.setText("");
    }//GEN-LAST:event_jButton30ActionPerformed

    private void txt_LargeRate5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LargeRate5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LargeRate5ActionPerformed

    private void txt_RollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RollActionPerformed

    private void txt_RollRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RollRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RollRateActionPerformed

    private void cmb_RollsAvailablePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_RollsAvailablePopupMenuWillBecomeInvisible

        RateManagerCRUD.ShowRolls();
//        RateManagerCRUD.ShowRolls();
    }//GEN-LAST:event_cmb_RollsAvailablePopupMenuWillBecomeInvisible

    private void cmb_RollsAvailablePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_RollsAvailablePopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_RollsAvailablePopupMenuWillBecomeVisible

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        RateManagerCRUD.DeleteRoll();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        RateManagerCRUD.AddRoll();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton10FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10FocusGained

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        txt_RollID.setText("");
        txt_Roll.setText("");
        txt_RollRate.setText("");
        txt_LargeRate4.setText("");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void txt_LargeRate4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LargeRate4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LargeRate4ActionPerformed

    private void txt_DealRate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DealRate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DealRate1ActionPerformed

    private void cmb_BurgersAvailablePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_BurgersAvailablePopupMenuWillBecomeInvisible
        RateManagerCRUD.ShowBurgers();

    }//GEN-LAST:event_cmb_BurgersAvailablePopupMenuWillBecomeInvisible

    private void cmb_BurgersAvailablePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_BurgersAvailablePopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_BurgersAvailablePopupMenuWillBecomeVisible

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        RateManagerCRUD.DeleteBurger();
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        RateManagerCRUD.AddBurger();
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton33FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton33FocusGained

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        txt_DealID1.setText("");
        txt_Deal1.setText("");
        txt_DealRate1.setText("");
        txt_LargeRate8.setText("");
    }//GEN-LAST:event_jButton33ActionPerformed

    private void txt_LargeRate8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LargeRate8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LargeRate8ActionPerformed

    private void txt_FastFoodRate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FastFoodRate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FastFoodRate1ActionPerformed

    private void cmb_BeveragesAvailablePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_BeveragesAvailablePopupMenuWillBecomeInvisible
        RateManagerCRUD.ShowBeverages();
    }//GEN-LAST:event_cmb_BeveragesAvailablePopupMenuWillBecomeInvisible

    private void cmb_BeveragesAvailablePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_BeveragesAvailablePopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_BeveragesAvailablePopupMenuWillBecomeVisible

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        RateManagerCRUD.DeleteBeverages();
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        RateManagerCRUD.AddBeverages();
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton36FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton36FocusGained

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        txt_FastFoodID1.setText("");
        txt_FastFood1.setText("");
        txt_FastFoodRate1.setText("");
        txt_LargeRate9.setText("");
    }//GEN-LAST:event_jButton36ActionPerformed

    private void txt_LargeRate9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LargeRate9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LargeRate9ActionPerformed

    private void txt_Roll1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Roll1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Roll1ActionPerformed

    private void txt_RollRate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RollRate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RollRate1ActionPerformed

    private void cmb_BBQAvailablePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_BBQAvailablePopupMenuWillBecomeInvisible
        RateManagerCRUD.ShowBBQ();
    }//GEN-LAST:event_cmb_BBQAvailablePopupMenuWillBecomeInvisible

    private void cmb_BBQAvailablePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_BBQAvailablePopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_BBQAvailablePopupMenuWillBecomeVisible

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        RateManagerCRUD.DeleteBBQ();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        RateManagerCRUD.AddBBQ();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton11FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11FocusGained

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        txt_RollID1.setText("");
        txt_Roll1.setText("");
        txt_RollRate1.setText("");
        txt_LargeRate7.setText("");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void txt_LargeRate7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LargeRate7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LargeRate7ActionPerformed

    private void txt_Roll2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Roll2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Roll2ActionPerformed

    private void txt_RollRate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RollRate2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RollRate2ActionPerformed

    private void cmb_SaladRaitaAvailablePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_SaladRaitaAvailablePopupMenuWillBecomeInvisible
        RateManagerCRUD.ShowSaladRaita();
    }//GEN-LAST:event_cmb_SaladRaitaAvailablePopupMenuWillBecomeInvisible

    private void cmb_SaladRaitaAvailablePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_SaladRaitaAvailablePopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_SaladRaitaAvailablePopupMenuWillBecomeVisible

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        RateManagerCRUD.DeleteSaladRaita();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        RateManagerCRUD.AddSaladRaita();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton14FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14FocusGained

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        txt_RollID2.setText("");
        txt_Roll2.setText("");
        txt_RollRate2.setText("");
        txt_LargeRate10.setText("");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void txt_LargeRate10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LargeRate10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LargeRate10ActionPerformed

    private void txt_DealRate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DealRate2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DealRate2ActionPerformed

    private void cmb_BiryaniAvailablePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_BiryaniAvailablePopupMenuWillBecomeInvisible
        RateManagerCRUD.ShowBiryani();
    }//GEN-LAST:event_cmb_BiryaniAvailablePopupMenuWillBecomeInvisible

    private void cmb_BiryaniAvailablePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_BiryaniAvailablePopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_BiryaniAvailablePopupMenuWillBecomeVisible

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        RateManagerCRUD.DeleteBiryani();
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        RateManagerCRUD.AddBiryani();
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton39FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton39FocusGained

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        txt_DealID2.setText("");
        txt_Deal2.setText("");
        txt_DealRate2.setText("");
        txt_LargeRate11.setText("");
    }//GEN-LAST:event_jButton39ActionPerformed

    private void txt_LargeRate11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LargeRate11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LargeRate11ActionPerformed

    private void txt_FastFoodRate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FastFoodRate2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FastFoodRate2ActionPerformed

    private void cmb_DessertsAvailablePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_DessertsAvailablePopupMenuWillBecomeInvisible
        RateManagerCRUD.ShowDesserts();
    }//GEN-LAST:event_cmb_DessertsAvailablePopupMenuWillBecomeInvisible

    private void cmb_DessertsAvailablePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_DessertsAvailablePopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_DessertsAvailablePopupMenuWillBecomeVisible

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        RateManagerCRUD.DeleteDesserts();
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        RateManagerCRUD.AddDesserts();
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton42FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton42FocusGained

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        txt_FastFoodID2.setText("");
        txt_FastFood2.setText("");
        txt_FastFoodRate2.setText("");
        txt_LargeRate12.setText("");
    }//GEN-LAST:event_jButton42ActionPerformed

    private void txt_LargeRate12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LargeRate12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LargeRate12ActionPerformed

    private void txt_DealRate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DealRate3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DealRate3ActionPerformed

    private void cmb_PastaAvailablePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_PastaAvailablePopupMenuWillBecomeInvisible
        RateManagerCRUD.ShowPasta();
    }//GEN-LAST:event_cmb_PastaAvailablePopupMenuWillBecomeInvisible

    private void cmb_PastaAvailablePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_PastaAvailablePopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_PastaAvailablePopupMenuWillBecomeVisible

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        RateManagerCRUD.DeletePasta();
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        RateManagerCRUD.AddPasta();
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton45FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton45FocusGained

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        txt_DealID3.setText("");
        txt_Deal3.setText("");
        txt_DealRate3.setText("");
        txt_LargeRate14.setText("");
    }//GEN-LAST:event_jButton45ActionPerformed

    private void txt_LargeRate14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LargeRate14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LargeRate14ActionPerformed

    private void txt_Roll3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Roll3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Roll3ActionPerformed

    private void txt_RollRate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RollRate3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RollRate3ActionPerformed

    private void cmb_FriesAvailablePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_FriesAvailablePopupMenuWillBecomeInvisible
        RateManagerCRUD.ShowFries();
    }//GEN-LAST:event_cmb_FriesAvailablePopupMenuWillBecomeInvisible

    private void cmb_FriesAvailablePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_FriesAvailablePopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_FriesAvailablePopupMenuWillBecomeVisible

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        RateManagerCRUD.DeleteFries();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        RateManagerCRUD.AddFries();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton17FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17FocusGained

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        txt_RollID3.setText("");
        txt_Roll3.setText("");
        txt_RollRate3.setText("");
        txt_LargeRate13.setText("");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void txt_LargeRate13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LargeRate13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LargeRate13ActionPerformed

    private void txt_FastFoodRate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FastFoodRate3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FastFoodRate3ActionPerformed

    private void cmb_CheeseGarlicBreadAvailablePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_CheeseGarlicBreadAvailablePopupMenuWillBecomeInvisible
        RateManagerCRUD.ShowCheeseGarlicBread();
    }//GEN-LAST:event_cmb_CheeseGarlicBreadAvailablePopupMenuWillBecomeInvisible

    private void cmb_CheeseGarlicBreadAvailablePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_CheeseGarlicBreadAvailablePopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_CheeseGarlicBreadAvailablePopupMenuWillBecomeVisible

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        RateManagerCRUD.DeleteCheeseGarlicBread();
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        RateManagerCRUD.AddCheeseGarlicBread();
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton48FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton48FocusGained

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        txt_FastFoodID3.setText("");
        txt_FastFood3.setText("");
        txt_FastFoodRate3.setText("");
        txt_LargeRate15.setText("");
    }//GEN-LAST:event_jButton48ActionPerformed

    private void txt_LargeRate15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LargeRate15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LargeRate15ActionPerformed

    private void txt_FastFoodRate4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FastFoodRate4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FastFoodRate4ActionPerformed

    private void cmb_Other2AvailablePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_Other2AvailablePopupMenuWillBecomeInvisible
        RateManagerCRUD.ShowOther2();
    }//GEN-LAST:event_cmb_Other2AvailablePopupMenuWillBecomeInvisible

    private void cmb_Other2AvailablePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_Other2AvailablePopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_Other2AvailablePopupMenuWillBecomeVisible

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        RateManagerCRUD.DeleteOther2();
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        RateManagerCRUD.AddOther2();
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton51FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton51FocusGained

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        txt_FastFoodID4.setText("");
        txt_FastFood4.setText("");
        txt_FastFoodRate4.setText("");
        txt_LargeRate18.setText("");
    }//GEN-LAST:event_jButton51ActionPerformed

    private void txt_LargeRate18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LargeRate18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LargeRate18ActionPerformed

    private void txt_Roll4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Roll4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Roll4ActionPerformed

    private void txt_RollRate4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RollRate4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RollRate4ActionPerformed

    private void cmb_LasagniaAvailablePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_LasagniaAvailablePopupMenuWillBecomeInvisible
        RateManagerCRUD.ShowLasagnia();
    }//GEN-LAST:event_cmb_LasagniaAvailablePopupMenuWillBecomeInvisible

    private void cmb_LasagniaAvailablePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_LasagniaAvailablePopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_LasagniaAvailablePopupMenuWillBecomeVisible

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        RateManagerCRUD.DeleteLasagnia();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        RateManagerCRUD.AddLasagnia();
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton53FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton53FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton53FocusGained

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        txt_RollID4.setText("");
        txt_Roll4.setText("");
        txt_RollRate4.setText("");
        txt_LargeRate16.setText("");
    }//GEN-LAST:event_jButton53ActionPerformed

    private void txt_LargeRate16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LargeRate16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LargeRate16ActionPerformed

    private void txt_DealRate4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DealRate4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DealRate4ActionPerformed

    private void cmb_OtherAvailablePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_OtherAvailablePopupMenuWillBecomeInvisible
        RateManagerCRUD.ShowOther();
    }//GEN-LAST:event_cmb_OtherAvailablePopupMenuWillBecomeInvisible

    private void cmb_OtherAvailablePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_OtherAvailablePopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_OtherAvailablePopupMenuWillBecomeVisible

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        RateManagerCRUD.DeleteOther();
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        RateManagerCRUD.AddOther();
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton56FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton56FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton56FocusGained

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
        txt_DealID4.setText("");
        txt_Deal4.setText("");
        txt_DealRate4.setText("");
        txt_LargeRate17.setText("");
    }//GEN-LAST:event_jButton56ActionPerformed

    private void txt_LargeRate17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LargeRate17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LargeRate17ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        if(!txt_SearchHistory.getText().isEmpty())
        ShowOrder("Select * From `Sale` Where OrderId = '"+txt_SearchHistory.getText()+"'",ordersTable);

    }//GEN-LAST:event_jButton57ActionPerformed

    private void ordersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersTableMouseClicked
        DefaultTableModel sold = (DefaultTableModel) soldItemsTable.getModel();
        int k =1;
//        float gtotal = 0;

        //Removing Sale Items
        int rowCount = sold.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--)
        {
            sold.removeRow(i);
        }

        int row             = ordersTable.getSelectedRow();
        String Ocid         = ordersTable.getModel().getValueAt(row,0).toString();
        txt_SearchHistory.setText(Ocid);
        btn_Delete.setEnabled(true);
        if(ordersTable.getValueAt(ordersTable.getSelectedRow(), 7).equals("Member"))
        {
            MemershipHistory.setVisible(true);
            HistoryMemberName.setText(getMemberDetails.getMemberInfo(getMemberDetails.getMemberId(Integer.parseInt(txt_SearchHistory.getText())),"Name"));
            HistoryMemberContact.setText(getMemberDetails.getMemberInfo(getMemberDetails.getMemberId(Integer.parseInt(txt_SearchHistory.getText())),"Contact"));
            HistoryMemberCardNo.setText(getMemberDetails.getMemberInfo(getMemberDetails.getMemberId(Integer.parseInt(txt_SearchHistory.getText())),"CardNo"));
            HistoryMemberAddress.setText(getMemberDetails.getMemberInfo(getMemberDetails.getMemberId(Integer.parseInt(txt_SearchHistory.getText())),"Address"));
        }else
        {
            MemershipHistory.setVisible(false);
        }
        if(ordersTable.getValueAt(ordersTable.getSelectedRow(), 8).equals("DineIn"))
        {
            InternalDeliveryHistory.setVisible(false);
            InternalDineInHistory.setVisible(true);
            WaiterHistory.setText("");
            ServiceChargesHistory.setText("");
            txt_TableNameHistory.setText("");
            String sql = "Select * from DiningDetails Where OrderId = '"+txt_SearchHistory.getText()+"' ";
            try
            {
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                while(rs.next())
                {
                    String tabno = rs.getString("TableNo");
                    String waiter = rs.getString("Waiter");
                    String charges = rs.getString("Charges");
                    WaiterHistory.setText(waiter);
                    ServiceChargesHistory.setText(charges);
                    txt_TableNameHistory.setText(tabno);
                }
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }else if (ordersTable.getValueAt(ordersTable.getSelectedRow(), 8).equals("Home Delivery"))
        {
            InternalDeliveryHistory.setVisible(true);
            InternalDineInHistory.setVisible(false);
            //First Clean
            txt_CustomerHistory.setText("");
            txt_PhoneHistory.setText("");
            txt_DeliveryChargesHistory.setText("");
            DeliveryBoyHistory.setText("");
            Area_AddressHistory.setText("");
            txt_RemarksHistory.setText("");
            String sql = "Select * from DeliveryDetails Where OrderId = '"+txt_SearchHistory.getText()+"' ";
            try
            {
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                while(rs.next())
                {
                    String cst = rs.getString("Customer");
                    String phm = rs.getString("Phone");
                    String charges = rs.getString("Charges");
                    String ad = rs.getString("Address");
                    String dby = rs.getString("DeliveryBoy");
                    String rm = rs.getString("Remarks");
                    txt_CustomerHistory.setText(cst);
                    txt_PhoneHistory.setText(phm);
                    txt_DeliveryChargesHistory.setText(charges);
                    DeliveryBoyHistory.setText(dby);
                    Area_AddressHistory.setText(ad);
                    txt_RemarksHistory.setText(rm);

                }
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }else
        {
            InternalDeliveryHistory.setVisible(false);
            InternalDineInHistory.setVisible(false);
        }

        List itmid = new ArrayList();
        List itmqty = new ArrayList();
        List itmname = new ArrayList();
        List itmrate = new ArrayList();
        //Getting Items Id
        String getOrd= "SELECT * FROM `solditems` where OrderId = '"+txt_SearchHistory.getText()+"' ORDER BY OrderId";
        try
        {
            pst = con.prepareStatement(getOrd);
            rs = pst.executeQuery();
            while(rs.next())
            {
                itmid.add(rs.getInt("ItemId"));
                itmqty.add(rs.getInt("ItemsQty"));
            }

            //Getting Names and rates of items
            for (Object itmid1 : itmid) {
                String getItem = "SELECT * FROM `items` where itemid = '" + itmid1 + "'";
                pst = con.prepareStatement(getItem);
                rs = pst.executeQuery();
                while(rs.next())
                {
                    itmname.add(rs.getString("Name"));
                    //itmrate.add(rs.getInt("rate"));
                    if(ordersTable.getValueAt(ordersTable.getSelectedRow(), 7).equals("Member"))
                    {
                        itmrate.add(rs.getInt("MembershipRate"));
                    }else
                    {
                        itmrate.add(rs.getInt("rate"));
                    }
                }
            }
            //Inserting into tables
//            int looplength = (int)ordersTable.getValueAt(ordersTable.getSelectedRow(), 1);
            for(int Love = 0;Love<itmid.size();Love++)
            {
                if(ordersTable.getValueAt(ordersTable.getSelectedRow(), 7).equals("Member"))
                {
                    //                    for(int t =0;t<looplength/2;t++)
                    //                    {
                        //                    if((SoldItemsTableHistory.getValueAt(Love, 1).equals("Large Pizza (Free)"))||(SoldItemsTableHistory.getValueAt(Love, 1).equals("Chicken Roll (Free)"))||(SoldItemsTableHistory.getValueAt(Love, 1).equals("Regular Pizza (Free)")))
                        if((itmname.get(Love).equals("Big Offer (Large Pizza Free)"))||(itmname.get(Love).equals("Chicken Roll (Free)"))||(itmname.get(Love).equals("Regular Pizza (Bonus)")))
                        sold.addRow(new Object[]{k,itmname.get(Love), itmrate.get(Love),itmqty.get(Love),(int)itmrate.get(Love)*(int)itmqty.get(Love)});
                        else
                        sold.addRow(new Object[]{k,itmname.get(Love), itmrate.get(Love),itmqty.get(Love),(int)itmrate.get(Love)*(int)itmqty.get(Love)/2});
                        //                    }

                }else
                {
                    sold.addRow(new Object[]{k,itmname.get(Love), itmrate.get(Love),itmqty.get(Love),(int)itmrate.get(Love)*(int)itmqty.get(Love)});
                }

                k++;
            }
//            float charges = 0;
//            if (ordersTable.getValueAt(ordersTable.getSelectedRow(), 8).equals("Home Delivery"))
//            {
//                charges = Float.parseFloat(txt_DeliveryChargesHistory.getText());
//            }else if (ordersTable.getValueAt(ordersTable.getSelectedRow(), 8).equals("DineIn"))
//            {
//                charges = Float.parseFloat(ServiceChargesHistory.getText());
//            }
//            Float f = (Float)ordersTable.getValueAt(ordersTable.getSelectedRow(), 4);
//            TotalAmountHistory.setText(Float.toString(f+charges));
            itemsTabSize(soldItemsTable);
        }catch(SQLException | NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, e+" Error in geting sold items");
        }
    }//GEN-LAST:event_ordersTableMouseClicked

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        SaveSaleDeletedOrders();
        SaveSoldItemsDeleted();
        DeleteOrder("Sale", txt_SearchHistory,"Select * From `Sale` ORDER BY OrderId desc ", ordersTable);
        DeleteOrder("SoldItems", txt_SearchHistory,"Select * From `Sale` ORDER BY OrderId desc ", ordersTable);
        JOptionPane.showMessageDialog(null, "<html><font size=5><b>Order deleted from Sale</b> but saved in History of Records!</font></html>");
        txt_SearchHistory.setText("");
        btn_Delete.setEnabled(false);
        DefaultTableModel sold = (DefaultTableModel) soldItemsTable.getModel();

        //Removing Sale Items
        int rowCount = sold.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--)
        {
            sold.removeRow(i);
        }
        InternalDeliveryHistory.setVisible(false);
        InternalDineInHistory.setVisible(false);
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
//        TotalAmountHistory.setText("0.00");
        txt_SearchHistory.setText("");
        ShowOrder("Select * From `Sale` Order by OrderId desc",ordersTable);
        DefaultTableModel sold = (DefaultTableModel) soldItemsTable.getModel();

        //Removing Sale Items
        int rowCount = sold.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--)
        {
            sold.removeRow(i);
        }
        InternalDeliveryHistory.setVisible(false);
        InternalDineInHistory.setVisible(false);
    }//GEN-LAST:event_jButton58ActionPerformed

    private void soldItemsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soldItemsTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_soldItemsTableMouseClicked

    private void txt_CustomerHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CustomerHistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CustomerHistoryActionPerformed

    private void txt_PhoneHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PhoneHistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PhoneHistoryActionPerformed

    private void DeliveryBoyHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeliveryBoyHistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeliveryBoyHistoryActionPerformed

    private void txt_RemarksHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RemarksHistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RemarksHistoryActionPerformed

    private void txt_DeliveryChargesHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DeliveryChargesHistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DeliveryChargesHistoryActionPerformed

    private void ServiceChargesHistoryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ServiceChargesHistoryKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ServiceChargesHistoryKeyReleased

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        if(!txt_SearchCanceled.getText().isEmpty())
        ShowOrder("Select * From `SaleDeleted` Where OrderId = '"+txt_SearchCanceled.getText()+"'",ordersCanceledTable);
    }//GEN-LAST:event_jButton62ActionPerformed

    private void ordersCanceledTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersCanceledTableMouseClicked
        DefaultTableModel deleted = (DefaultTableModel) itemsCanceldTable.getModel();
        int k =1;
        float gtotal = 0;

        //Removing Sale Items
        int rowCount = deleted.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--)
        {
            deleted.removeRow(i);
        }

        int row             = ordersCanceledTable.getSelectedRow();
        String Ocid         = ordersCanceledTable.getModel().getValueAt(row,0).toString();
        txt_SearchCanceled.setText(Ocid);
        if(ordersCanceledTable.getValueAt(ordersCanceledTable.getSelectedRow(), 7).equals("Member"))
        {
            MemershipCanceled.setVisible(true);
            CanceledMemberName.setText(getMemberDetails.getMemberInfo(getMemberDetails.getMemberId(Integer.parseInt(txt_SearchCanceled.getText())),"Name"));
            CanceledMemberContact.setText(getMemberDetails.getMemberInfo(getMemberDetails.getMemberId(Integer.parseInt(txt_SearchCanceled.getText())),"Contact"));
            CanceledMemberCardNo.setText(getMemberDetails.getMemberInfo(getMemberDetails.getMemberId(Integer.parseInt(txt_SearchCanceled.getText())),"CardNo"));
            CanceledMemberAddress.setText(getMemberDetails.getMemberInfo(getMemberDetails.getMemberId(Integer.parseInt(txt_SearchCanceled.getText())),"Address"));
        }else
        {
            MemershipCanceled.setVisible(false);
        }
        if(ordersCanceledTable.getValueAt(ordersCanceledTable.getSelectedRow(), 8).equals("DineIn"))
        {
            InternalDeliveryCanceled.setVisible(false);
            InternalDineInCanceled.setVisible(true);
            WaiterCanceled.setText("");
            ServiceChargesCanceled.setText("");
            lbl_TableNameCanceled.setText("");
            String sql = "Select * from DiningDetailsDeleted Where OrderId = '"+txt_SearchCanceled.getText()+"' ";
            try
            {
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                while(rs.next())
                {
                    String tabno = rs.getString("TableNo");
                    String wtr = rs.getString("Waiter");
                    String crgs = rs.getString("Charges");
                    WaiterCanceled.setText(wtr);
                    ServiceChargesCanceled.setText(crgs);
                    lbl_TableNameCanceled.setText(tabno);
                }
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e+" Error in Dining deletion");
            }
        }else if (ordersCanceledTable.getValueAt(ordersCanceledTable.getSelectedRow(), 8).equals("Home Delivery"))
        {
            InternalDeliveryCanceled.setVisible(true);
            InternalDineInCanceled.setVisible(false);
            //First Clean
            txt_Customer2.setText("");
            txt_Phone2.setText("");
            txt_DeliveryCharges2.setText("");
            DeliveryBoy3.setText("");
            Area_Address2.setText("");
            txt_Remarks2.setText("");
            String sql = "Select * from DeliveryDetailsDeleted Where OrderId = '"+txt_SearchCanceled.getText()+"' ";
            try
            {
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                while(rs.next())
                {
                    String cst = rs.getString("Customer");
                    String phm = rs.getString("Phone");
                    String charges = rs.getString("Charges");
                    String ad = rs.getString("Address");
                    String dby = rs.getString("DeliveryBoy");
                    String rm = rs.getString("Remarks");
                    txt_Customer2.setText(cst);
                    txt_Phone2.setText(phm);
                    txt_DeliveryCharges2.setText(charges);
                    DeliveryBoy3.setText(dby);
                    Area_Address2.setText(ad);
                    txt_Remarks2.setText(rm);
                }

            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }else
        {
            InternalDeliveryCanceled.setVisible(false);
            InternalDineInCanceled.setVisible(false);
        }

        List itmid = new ArrayList();
        List itmqty = new ArrayList();
        List itmname = new ArrayList();
        List itmrate = new ArrayList();
        //Getting Items Id
        String getOrd= "SELECT * FROM `solditemsDeleted` where OrderId = '"+txt_SearchCanceled.getText()+"' ORDER BY OrderId";
        try
        {
            pst = con.prepareStatement(getOrd);
            rs = pst.executeQuery();
            while(rs.next())
            {
                itmid.add(rs.getInt("ItemId"));
                itmqty.add(rs.getInt("ItemsQty"));
            }

            //Getting Names and rates of items
            for (Object itmid1 : itmid) {
                String getItem = "SELECT * FROM `items` where itemid = '" + itmid1 + "'";
                pst = con.prepareStatement(getItem);
                rs = pst.executeQuery();
                while(rs.next())
                {
                    itmname.add(rs.getString("Name"));
                    itmrate.add(rs.getInt("rate"));
                }
            }
            //Inserting into tables
            for(int Love = 0;Love<itmid.size();Love++)
            {
                deleted.addRow(new Object[]{k,itmname.get(Love), itmrate.get(Love),itmqty.get(Love),(int)itmrate.get(Love)*(int)itmqty.get(Love)});
                k++;
            }
//            float charges = 0;
//            if (ordersCanceledTable.getValueAt(ordersCanceledTable.getSelectedRow(), 6).equals("Home Delivery"))
//            {
//                charges = Float.parseFloat(txt_DeliveryCharges2.getText());
//            }else if (ordersCanceledTable.getValueAt(ordersCanceledTable.getSelectedRow(), 6).equals("DineIn"))
//            {
//                charges = Float.parseFloat(ServiceChargesCanceled.getText());
//            }
//            Float f = (Float)ordersCanceledTable.getValueAt(ordersCanceledTable.getSelectedRow(), 2);
//            TotalAmount2.setText(Float.toString(f+charges));
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e+" Error in geting sold deleted items");
        }
    }//GEN-LAST:event_ordersCanceledTableMouseClicked

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
//        TotalAmount2.setText("0.00");
        txt_SearchCanceled.setText("");
        ShowOrder("Select * From `SaleDeleted` Order by OrderId desc",ordersCanceledTable);
        DefaultTableModel sold = (DefaultTableModel) itemsCanceldTable.getModel();

        //Removing Sale Items
        int rowCount = sold.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--)
        {
            sold.removeRow(i);
        }
        InternalDeliveryCanceled.setVisible(false);
        InternalDineInCanceled.setVisible(false);
    }//GEN-LAST:event_jButton63ActionPerformed

    private void itemsCanceldTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemsCanceldTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_itemsCanceldTableMouseClicked

    private void txt_Phone2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Phone2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Phone2ActionPerformed

    private void DeliveryBoy3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeliveryBoy3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeliveryBoy3ActionPerformed

    private void txt_Customer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Customer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Customer2ActionPerformed

    private void txt_DeliveryCharges2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DeliveryCharges2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DeliveryCharges2ActionPerformed

    private void txt_Remarks2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Remarks2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Remarks2ActionPerformed

    private void ServiceChargesCanceledKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ServiceChargesCanceledKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ServiceChargesCanceledKeyReleased

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
//        jPanel2.setBackground(jColorChooser1.getColor());
        jPanel4.setBackground(jColorChooser1.getColor());
        jPanel3.setBackground(jColorChooser1.getColor());
        jPanel10.setBackground(jColorChooser1.getColor());
        jPanel50.setBackground(jColorChooser1.getColor());

    }//GEN-LAST:event_jButton65ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
//        jPanel2.setBackground(java.awt.Color.WHITE);
        jPanel4.setBackground(java.awt.Color.WHITE);
        jPanel3.setBackground(java.awt.Color.WHITE);
        jPanel10.setBackground(java.awt.Color.WHITE);
        jPanel50.setBackground(java.awt.Color.WHITE);
    }//GEN-LAST:event_jButton66ActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
//        TotalAmountHistory.setText("0.00");
        DefaultTableModel saletab = (DefaultTableModel) soldItemsTable.getModel();
        //Removing Sale Items
        int rowCount = saletab.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--)
        {
            saletab.removeRow(i);
        }
        if(jTabbedPane1.getSelectedIndex()==1)
        {
            txt_SearchHistory.setText("");
            InternalDineInHistory.setVisible(false);
            InternalDeliveryHistory.setVisible(false);
            ShowOrder("Select * From `Sale` Order by OrderId desc",ordersTable);
            HistoryOrderTabSize(ordersTable);

        }else if(jTabbedPane1.getSelectedIndex()==2)
        {
            //            TotalAmount2.setText("0.00");
            //            DefaultTableModel sold = (DefaultTableModel) SoldItemsTableCanceled.getModel();
            //         //Removing Sale Items
            //        int rowCount = sold.getRowCount();
            //        for (int i = rowCount - 1; i >= 0; i--)
            //        {
                //            sold.removeRow(i);
                //        }
            txt_SearchCanceled.setText("");
            InternalDineInCanceled.setVisible(false);
            InternalDeliveryCanceled.setVisible(false);

            ShowOrder("Select OrderId,ItemsQty,discount,Subtotal,Total,SaleDate,SaleTime,Type,SaleCategory,LogId From `Saledeleted` Order by deleteid desc",ordersCanceledTable);
            HistoryOrderTabSize(ordersCanceledTable);

        }

    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jTabbedPane1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane1FocusGained

    }//GEN-LAST:event_jTabbedPane1FocusGained

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked

    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void PrintOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintOrderActionPerformed
       
    }//GEN-LAST:event_PrintOrderActionPerformed

   
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
            java.util.logging.Logger.getLogger(TableManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableManagement().setVisible(true);
            }
        });
    }
    
     //*************************************************************************
     //*************************************************************************
     //*************************************************************************
         public void ShowOrder(String sql, JTable tabName)
    {       
            try{
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            tabName.setModel(DbUtils.resultSetToTableModel(rs));
            
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e+" Error in Fetching History of Records!");
            }   
    }
    
     //*********************************************************************
     public  void SaveSaleDeletedOrders()
    {       
            DefaultTableModel tab = (DefaultTableModel) ordersTable.getModel();
            String sqla ="INSERT INTO `saledeleted`(`OrderId`, `ItemsQty`, `Total`,`discount`,`Subtotal`, `SaleDate`, `SaleTime`,`Type`, `SaleCategory`, `LogId`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            try{
            pst = con.prepareStatement(sqla);
            pst.setString(1,  tab.getValueAt(ordersTable.getSelectedRow(), 0).toString());
            pst.setString(2,  tab.getValueAt(ordersTable.getSelectedRow(), 1).toString());
            pst.setString(3,  tab.getValueAt(ordersTable.getSelectedRow(), 2).toString());
            pst.setString(4,  tab.getValueAt(ordersTable.getSelectedRow(), 3).toString());
            pst.setString(5,  tab.getValueAt(ordersTable.getSelectedRow(), 4).toString());
            pst.setString(6,  tab.getValueAt(ordersTable.getSelectedRow(), 5).toString());
            pst.setString(7,  tab.getValueAt(ordersTable.getSelectedRow(), 6).toString());
            pst.setString(8,  tab.getValueAt(ordersTable.getSelectedRow(), 7).toString());
            pst.setString(9,  tab.getValueAt(ordersTable.getSelectedRow(), 8).toString());
            pst.setInt(10,  Login.LOGID);
            pst.execute();
            if(ordersTable.getValueAt(ordersTable.getSelectedRow(), 6).equals("DineIn"))
            {
            String adddineindetails = "INSERT INTO `diningdetailsdeleted`(`TableNo`, `Waiter`, `Charges`, `OrderId`) VALUES (?,?,?,?)";
            pst = con.prepareStatement(adddineindetails);
            pst.setString(1, txt_TableNameHistory.getText());
            pst.setString(2, WaiterHistory.getText());
            pst.setString(3, ServiceChargesHistory.getText());
            pst.setString(4, txt_SearchHistory.getText());
            
            pst.execute();
            DeleteOrder("DiningDetails", txt_SearchHistory,"Select * From `Sale` ORDER BY OrderId desc ", ordersTable);
            InternalDineInHistory.setVisible(false);
            }else if(ordersTable.getValueAt(ordersTable.getSelectedRow(), 6).equals("Home Delivery"))
            {
            String adddeliverydetails = "INSERT INTO `deliverydetailsdeleted`(`Customer`, `Phone`, `Charges`, `Address`, `DeliveryBoy`, `Remarks`, `OrderId`) VALUES (?,?,?,?,?,?,?)";
            pst = con.prepareStatement(adddeliverydetails);
            pst.setString(1, txt_CustomerHistory.getText());
            pst.setString(2, txt_PhoneHistory.getText());
            pst.setString(3, txt_DeliveryChargesHistory.getText());
            pst.setString(4, Area_AddressHistory.getText());
            pst.setString(5, DeliveryBoyHistory.getText());
            pst.setString(6, txt_RemarksHistory.getText());
            pst.setString(7, txt_SearchHistory.getText());
            
            pst.execute();
            DeleteOrder("DeliveryDetails", txt_SearchHistory,"Select * From `Sale` ORDER BY OrderId desc ", ordersTable);
            InternalDeliveryHistory.setVisible(false);
            }
                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e+" Error in Saving Delete History of Records!");
            }   
    }         
    //**************************************************************************
    public void SaveSoldItemsDeleted()
    {
        int ItmId = 0;                
        //****************************************************************//Geting Item Id

      try
      {
        String SoldItems = "INSERT INTO `solditemsdeleted`(`ItemId`, `ItemsQty`, `OrderId`) VALUES (?,?,?)";
        for(int a=0;a<soldItemsTable.getModel().getRowCount();a++)
        {
         String ItemId = "Select * from Items Where Name = '"+soldItemsTable.getModel().getValueAt(a, 1)+"' AND rate = '"+soldItemsTable.getModel().getValueAt(a, 2)+"'";
        pst = con.prepareStatement(ItemId);
        rs = pst.executeQuery();
        while(rs.next())
        {
        ItmId = rs.getInt("ItemId");
        }   
        pst = con.prepareStatement(SoldItems);
        pst.setInt(1, ItmId);
        pst.setInt(2, (int)soldItemsTable.getModel().getValueAt(a, 3));
        pst.setInt(3, Integer.parseInt(txt_SearchHistory.getText()));
        pst.execute();

        }
      }catch(Exception e)
      {
          JOptionPane.showMessageDialog(null, e+" Error in adding sold deleted items!");
      }
    }
    //**************************************************************************
        
   //*********************************************************************
             public void DeleteOrder(String str, JTextField TextFieldName,String str2, JTable tabName)
    {       String sqla ="Delete from `"+str+"` where OrderId = '"+TextFieldName.getText()+"'";
            try{
            pst = con.prepareStatement(sqla);
            pst.execute();
//            JOptionPane.showMessageDialog(null, "<html><font size=5><b>Order deleted from Sale</b> but saved in History of Records!</font></html>");

//            ShowOrder(str2, tabName);
            HistoryOrderTabSize(tabName);
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e+" Error in Deleting History of Records!");
            }   
    }     
             
    public static void HistoryOrderTabSize(JTable tabName)
     {
     
     TableColumn col = tabName.getColumnModel().getColumn(0);
     col.setPreferredWidth(35);
     col = tabName.getColumnModel().getColumn(1);
     col.setPreferredWidth(30);
     col = tabName.getColumnModel().getColumn(2);
     col.setPreferredWidth(40);
     col = tabName.getColumnModel().getColumn(3);
     col.setPreferredWidth(50);
     col = tabName.getColumnModel().getColumn(4);
     col.setPreferredWidth(50);
     col = tabName.getColumnModel().getColumn(5);
     col.setPreferredWidth(90);
     col = tabName.getColumnModel().getColumn(6);
     col.setPreferredWidth(70);
     col = tabName.getColumnModel().getColumn(7);
     col.setPreferredWidth(10);
     col = tabName.getColumnModel().getColumn(8);
     col.setPreferredWidth(100);
     col = tabName.getColumnModel().getColumn(9);
     col.setPreferredWidth(20);
     }         
    
    public static void itemsTabSize(JTable tabName)
     {
     TableColumn col = tabName.getColumnModel().getColumn(0);
     col.setPreferredWidth(5);
     col = tabName.getColumnModel().getColumn(1);
     col.setPreferredWidth(150);
     col = tabName.getColumnModel().getColumn(2);
     col.setPreferredWidth(50);
     col = tabName.getColumnModel().getColumn(3);
     col.setPreferredWidth(10);
     col = tabName.getColumnModel().getColumn(4);
     col.setPreferredWidth(100);
     }
        
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area_Address2;
    private static javax.swing.JTextArea Area_AddressHistory;
    private javax.swing.JLabel CanceledMemberAddress;
    private javax.swing.JLabel CanceledMemberCardNo;
    private javax.swing.JLabel CanceledMemberContact;
    private javax.swing.JLabel CanceledMemberName;
    private javax.swing.JTextField DeliveryBoy3;
    private static javax.swing.JTextField DeliveryBoyHistory;
    private javax.swing.JLabel HistoryMemberAddress;
    private javax.swing.JLabel HistoryMemberCardNo;
    private javax.swing.JLabel HistoryMemberContact;
    private javax.swing.JLabel HistoryMemberName;
    private javax.swing.JInternalFrame InternalDeliveryCanceled;
    private static javax.swing.JInternalFrame InternalDeliveryHistory;
    private javax.swing.JInternalFrame InternalDineInCanceled;
    private static javax.swing.JInternalFrame InternalDineInHistory;
    private javax.swing.JInternalFrame MemershipCanceled;
    private javax.swing.JInternalFrame MemershipHistory;
    protected static javax.swing.JButton PrintOrder;
    private javax.swing.JTextField ServiceChargesCanceled;
    private static javax.swing.JTextField ServiceChargesHistory;
    private javax.swing.JTextField WaiterCanceled;
    private static javax.swing.JTextField WaiterHistory;
    private javax.swing.JButton btn_Delete;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    public static javax.swing.JComboBox<String> cmb_BBQAvailable;
    public static javax.swing.JComboBox<String> cmb_BeveragesAvailable;
    public static javax.swing.JComboBox<String> cmb_BiryaniAvailable;
    public static javax.swing.JComboBox<String> cmb_BurgersAvailable;
    public static javax.swing.JComboBox<String> cmb_CheeseGarlicBreadAvailable;
    public static javax.swing.JComboBox<String> cmb_DealsAvailable;
    public static javax.swing.JComboBox<String> cmb_DessertsAvailable;
    public static javax.swing.JComboBox<String> cmb_FastFoodAvailable;
    public static javax.swing.JComboBox<String> cmb_FriesAvailable;
    public static javax.swing.JComboBox<String> cmb_LargeAvailable;
    public static javax.swing.JComboBox<String> cmb_LasagniaAvailable;
    public static javax.swing.JComboBox<String> cmb_Other2Available;
    public static javax.swing.JComboBox<String> cmb_OtherAvailable;
    public static javax.swing.JComboBox<String> cmb_PastaAvailable;
    public static javax.swing.JComboBox<String> cmb_RegularAvailable;
    public static javax.swing.JComboBox<String> cmb_RollsAvailable;
    public static javax.swing.JComboBox<String> cmb_SaladRaitaAvailable;
    public static javax.swing.JComboBox<String> cmb_SmallAvailable;
    public static javax.swing.JTable itemsCanceldTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton7;
    public javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    public javax.swing.JPanel jPanel11;
    public javax.swing.JPanel jPanel12;
    public javax.swing.JPanel jPanel13;
    public javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    public javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    public javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    public javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    public javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    public javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    public javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    public javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    public javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    public javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    public javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    public javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    public javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    public javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    public javax.swing.JPanel jPanel9;
    public static javax.swing.JScrollPane jScrollPane10;
    public static javax.swing.JScrollPane jScrollPane11;
    public javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    public javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_Address5;
    private javax.swing.JLabel lbl_Address6;
    private javax.swing.JLabel lbl_Address7;
    private javax.swing.JLabel lbl_Address8;
    private javax.swing.JLabel lbl_CashierPos17;
    private javax.swing.JLabel lbl_CashierPos18;
    private javax.swing.JLabel lbl_CashierPos19;
    private javax.swing.JLabel lbl_CashierPos20;
    private javax.swing.JLabel lbl_Customer4;
    private javax.swing.JLabel lbl_Customer5;
    private javax.swing.JLabel lbl_DeliveryCharges5;
    private javax.swing.JLabel lbl_DeliveryCharges6;
    private javax.swing.JLabel lbl_DeliveryCharges7;
    private javax.swing.JLabel lbl_DeliveryCharges8;
    private javax.swing.JLabel lbl_Phone4;
    private javax.swing.JLabel lbl_Phone5;
    private javax.swing.JTextField lbl_TableNameCanceled;
    private static javax.swing.JTable ordersCanceledTable;
    private static javax.swing.JTable ordersTable;
    public static javax.swing.JTable soldItemsTable;
    private javax.swing.JTextField txt_Customer2;
    private static javax.swing.JTextField txt_CustomerHistory;
    public static javax.swing.JTextField txt_Deal;
    public static javax.swing.JTextField txt_Deal1;
    public static javax.swing.JTextField txt_Deal2;
    public static javax.swing.JTextField txt_Deal3;
    public static javax.swing.JTextField txt_Deal4;
    public static javax.swing.JTextField txt_DealID;
    public static javax.swing.JTextField txt_DealID1;
    public static javax.swing.JTextField txt_DealID2;
    public static javax.swing.JTextField txt_DealID3;
    public static javax.swing.JTextField txt_DealID4;
    public static javax.swing.JTextField txt_DealRate;
    public static javax.swing.JTextField txt_DealRate1;
    public static javax.swing.JTextField txt_DealRate2;
    public static javax.swing.JTextField txt_DealRate3;
    public static javax.swing.JTextField txt_DealRate4;
    private javax.swing.JTextField txt_DeliveryCharges2;
    private static javax.swing.JTextField txt_DeliveryChargesHistory;
    public static javax.swing.JTextField txt_FastFood;
    public static javax.swing.JTextField txt_FastFood1;
    public static javax.swing.JTextField txt_FastFood2;
    public static javax.swing.JTextField txt_FastFood3;
    public static javax.swing.JTextField txt_FastFood4;
    public static javax.swing.JTextField txt_FastFoodID;
    public static javax.swing.JTextField txt_FastFoodID1;
    public static javax.swing.JTextField txt_FastFoodID2;
    public static javax.swing.JTextField txt_FastFoodID3;
    public static javax.swing.JTextField txt_FastFoodID4;
    public static javax.swing.JTextField txt_FastFoodRate;
    public static javax.swing.JTextField txt_FastFoodRate1;
    public static javax.swing.JTextField txt_FastFoodRate2;
    public static javax.swing.JTextField txt_FastFoodRate3;
    public static javax.swing.JTextField txt_FastFoodRate4;
    public static javax.swing.JTextField txt_LID;
    public static javax.swing.JTextField txt_LargePizza;
    public static javax.swing.JTextField txt_LargeRate;
    public static javax.swing.JTextField txt_LargeRate1;
    public static javax.swing.JTextField txt_LargeRate10;
    public static javax.swing.JTextField txt_LargeRate11;
    public static javax.swing.JTextField txt_LargeRate12;
    public static javax.swing.JTextField txt_LargeRate13;
    public static javax.swing.JTextField txt_LargeRate14;
    public static javax.swing.JTextField txt_LargeRate15;
    public static javax.swing.JTextField txt_LargeRate16;
    public static javax.swing.JTextField txt_LargeRate17;
    public static javax.swing.JTextField txt_LargeRate18;
    public static javax.swing.JTextField txt_LargeRate2;
    public static javax.swing.JTextField txt_LargeRate3;
    public static javax.swing.JTextField txt_LargeRate4;
    public static javax.swing.JTextField txt_LargeRate5;
    public static javax.swing.JTextField txt_LargeRate6;
    public static javax.swing.JTextField txt_LargeRate7;
    public static javax.swing.JTextField txt_LargeRate8;
    public static javax.swing.JTextField txt_LargeRate9;
    private javax.swing.JTextField txt_Phone2;
    private static javax.swing.JTextField txt_PhoneHistory;
    public static javax.swing.JTextField txt_RID;
    public static javax.swing.JTextField txt_RegularPizza;
    public static javax.swing.JTextField txt_RegularRate;
    private javax.swing.JTextField txt_Remarks2;
    private static javax.swing.JTextField txt_RemarksHistory;
    public static javax.swing.JTextField txt_Roll;
    public static javax.swing.JTextField txt_Roll1;
    public static javax.swing.JTextField txt_Roll2;
    public static javax.swing.JTextField txt_Roll3;
    public static javax.swing.JTextField txt_Roll4;
    public static javax.swing.JTextField txt_RollID;
    public static javax.swing.JTextField txt_RollID1;
    public static javax.swing.JTextField txt_RollID2;
    public static javax.swing.JTextField txt_RollID3;
    public static javax.swing.JTextField txt_RollID4;
    public static javax.swing.JTextField txt_RollRate;
    public static javax.swing.JTextField txt_RollRate1;
    public static javax.swing.JTextField txt_RollRate2;
    public static javax.swing.JTextField txt_RollRate3;
    public static javax.swing.JTextField txt_RollRate4;
    public static javax.swing.JTextField txt_SID;
    private static javax.swing.JTextField txt_SearchCanceled;
    private static javax.swing.JTextField txt_SearchHistory;
    public static javax.swing.JTextField txt_SmallPizza;
    public static javax.swing.JTextField txt_SmallRate;
    private static javax.swing.JTextField txt_TableNameHistory;
    // End of variables declaration//GEN-END:variables
}
