package MainPackage;

import static MainPackage.AddSale.SaleType;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.FontSelector;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abdul Sami
 */
public class POS extends javax.swing.JFrame {

    static Connection con;
    static ResultSet rs;
    static PreparedStatement pst;
    //For Dine in
    static List a1 = new ArrayList();
    static List a2 = new ArrayList();
    static List a3 = new ArrayList();
    static List a4 = new ArrayList();
    static List a5 = new ArrayList();
    static List a6 = new ArrayList();
    static List a7 = new ArrayList();
    static List a8 = new ArrayList();
    static List a9 = new ArrayList();
    static List a10 = new ArrayList();
    static List a11 = new ArrayList();
    static List a12 = new ArrayList();
    static List a13 = new ArrayList();
    static List a14 = new ArrayList();
    static List a15 = new ArrayList();
    static List a16 = new ArrayList();
    static List a17 = new ArrayList();
    static List a18 = new ArrayList();
    static List a19 = new ArrayList();
    static List a20 = new ArrayList();
    static List ChargesList = new ArrayList();
    static List WaitersList = new ArrayList();
    static DefaultTableModel model1;
    static DefaultTableModel model2;

    static int TokenNo = 1;

    public POS() {

        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);//To maximize
        con = DBConnect.ConnectDB();
        TIMENOW();

        Membership.setVisible(false);

//        showMembers();
//        ShowOrder("Select * From `TakeAway` order by Order_Id desc",TakeAway);
        for (int z = 0; z < 20; z++) {
            ChargesList.add("0.0");
        }

        //**********************************************************************
    }

////////////////////////////////////////////////////////////////////////////////
    public final void TIMENOW() {
        Thread clock = new Thread() {
            @Override
            public void run() {
                for (;;) {
                    DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss aa");
                    String dateString = dateFormat.format(new Date());
                    DateFormat dateFormat3 = new SimpleDateFormat("MM-dd-yyyy");
                    String dateString2 = dateFormat3.format(new Date());
                    DateTime.setText(dateString2 + " : " + dateString);
//       DateTime.setText("Date: "+dateString2+"  Time: "+dateString);
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        clock.start();
    }
//******************************************************************************

    public static PdfPCell HeaderCell(String text) {
        FontSelector fs = new FontSelector();
        Font font = FontFactory.getFont(FontFactory.COURIER_BOLD, 18);
//		font.setColor(BaseColor.BLACK);
        fs.addFont(font);
        Phrase phrase = fs.process(text);
        PdfPCell cell = new PdfPCell(phrase);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setPadding(0.5f);
        cell.setBorder(0);
//                cell.setBorderWidth(0.5f);
        return cell;
    }

    public static PdfPCell DateCell(String text) {
        FontSelector fs = new FontSelector();
        Font font = FontFactory.getFont(FontFactory.COURIER_BOLD, 16);
        fs.addFont(font);
        Phrase phrase = fs.process(text);
        PdfPCell cell = new PdfPCell(phrase);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.setPadding(0.5f);
        cell.setBorder(0);
        return cell;
    }

    public static PdfPCell DateCellBold(String text) {
        FontSelector fs = new FontSelector();
        Font font = FontFactory.getFont(FontFactory.COURIER_BOLD, 14);
        fs.addFont(font);
        Phrase phrase = fs.process(text);
        PdfPCell cell = new PdfPCell(phrase);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.setPadding(0.5f);
        cell.setBorder(0);
        return cell;
    }

    public static PdfPCell DateCellRight(String text) {
        FontSelector fs = new FontSelector();
        Font font = FontFactory.getFont(FontFactory.COURIER_BOLD, 16);
        fs.addFont(font);
        Phrase phrase = fs.process(text);
        PdfPCell cell = new PdfPCell(phrase);
        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
        cell.setPadding(0.5f);
        cell.setBorder(0);
        return cell;
    }

    public static PdfPCell DateCellBoldRight(String text) {
        FontSelector fs = new FontSelector();
        Font font = FontFactory.getFont(FontFactory.COURIER_BOLD, 14);
        fs.addFont(font);
        Phrase phrase = fs.process(text);
        PdfPCell cell = new PdfPCell(phrase);
        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
        cell.setPadding(0.5f);
        cell.setBorder(0);
        return cell;
    }

    public static PdfPCell BodyCell(String text) {
        FontSelector fs = new FontSelector();
        Font font = FontFactory.getFont(FontFactory.COURIER_BOLD, 14);
        font.setColor(BaseColor.BLACK);
        fs.addFont(font);
        Phrase phrase = fs.process(text);
        PdfPCell cell = new PdfPCell(phrase);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
//		cell.setPadding (0.0f);
//                cell.setPaddingBottom(6f);//border design
        cell.setBorder(1);
//                    cell.setBorderWidthBottom(1.0f);
        cell.setBorderWidthTop(0f);
//                    cell.setBorderWidthLeft(0.5f);
//                    cell.setBorderWidthRight(0.5f);

//                   cell.setBorderColor(BaseColor.LIGHT_GRAY);
        return cell;
    }

    public static PdfPCell BillLeft(String text) {
        FontSelector fs = new FontSelector();
        Font font = FontFactory.getFont(FontFactory.COURIER_BOLD, 16);
        font.setColor(BaseColor.BLACK);
        fs.addFont(font);
        Phrase phrase = fs.process(text);
        PdfPCell cell = new PdfPCell(phrase);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
//		cell.setPadding (0.5f);
//                cell.setPaddingBottom(6f);//border design
        cell.setBorder(0);
        return cell;
    }

    public static PdfPCell BillRight(String text) {
        FontSelector fs = new FontSelector();
        Font font = FontFactory.getFont(FontFactory.COURIER_BOLD, 16);
        font.setColor(BaseColor.BLACK);
        fs.addFont(font);
        Phrase phrase = fs.process(text);
        PdfPCell cell = new PdfPCell(phrase);
        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
//		cell.setPadding (0.5f);
//                cell.setPaddingBottom(6f);//border design
        cell.setBorder(0);
        return cell;
    }

    public static PdfPCell BodyCellCenter(String text) {
        FontSelector fs = new FontSelector();
        Font font = FontFactory.getFont(FontFactory.COURIER_BOLD, 14);
        font.setColor(BaseColor.BLACK);
        fs.addFont(font);
        Phrase phrase = fs.process(text);
        PdfPCell cell = new PdfPCell(phrase);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
//		cell.setPadding (0.0f);
        cell.setPaddingBottom(6f);
        cell.setBorder(1);
        cell.setBorderWidthTop(0f);
        return cell;
    }

    public static PdfPCell BodyCellSpan(String text, int colspan) {
        FontSelector fs = new FontSelector();
        Font font = FontFactory.getFont(FontFactory.COURIER_BOLD, 16);
        font.setColor(BaseColor.BLACK);
        fs.addFont(font);
        Phrase phrase = fs.process(text);
        PdfPCell cell = new PdfPCell(phrase);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
//		cell.setPadding (0.0f);
//                cell.setPaddingBottom(6f);
        cell.setBorder(1);
//                cell.setBorderWidthTop(0f);
        cell.setColspan(colspan);

        return cell;
    }

    public static PdfPCell BodyCellBold(String text) {
        FontSelector fs = new FontSelector();
        Font font = FontFactory.getFont(FontFactory.COURIER_BOLD, 16);
        font.setColor(BaseColor.BLACK);
        fs.addFont(font);
        Phrase phrase = fs.process(text);
        PdfPCell cell = new PdfPCell(phrase);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
//		cell.setPadding (0.0f);
        cell.setPaddingBottom(6f);

        return cell;
    }

    public static PdfPCell FooterCell(String text, int fontsize) {
        FontSelector fs = new FontSelector();
        Font font = FontFactory.getFont(FontFactory.COURIER_BOLD, fontsize);
        fs.addFont(font);
        Phrase phrase = fs.process(text);
        PdfPCell cell = new PdfPCell(phrase);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setPadding(0.0f);
        cell.setBorder(0);
        return cell;
    }

    //*************************************************************************
    public static void showWaiters() {
        String fetchWaiters = "Select * From Waiters";

        cmb_Waiters.removeAllItems();

        try {
            pst = con.prepareStatement(fetchWaiters);
            rs = pst.executeQuery();
            while (rs.next()) {
                String firstname = rs.getString("firstname");
                String lasttname = rs.getString("lastname");
                cmb_Waiters.addItem(firstname + " " + lasttname);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + " Error in Fetching waiters!");
        }

    }

    //*************************************************************************

    public void showMembers() {
        String fetchMembers = "Select * From Members";

        try {
            pst = con.prepareStatement(fetchMembers);
            rs = pst.executeQuery();
            while (rs.next()) {
                String Membername = rs.getString("Name");
                String card = rs.getString("CardNo");
                cmb_Members.addItem(Membername);
                MemberCardNo.addItem(card);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + " Error in Fetching Members!");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        lbl_OrderType = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        OrderId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DateTime = new javax.swing.JLabel();
        OrderType = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        Membership = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        SmallPizza = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        Beverages = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        jToggleButton15 = new javax.swing.JToggleButton();
        jToggleButton16 = new javax.swing.JToggleButton();
        jToggleButton17 = new javax.swing.JToggleButton();
        jToggleButton18 = new javax.swing.JToggleButton();
        Deals = new javax.swing.JToggleButton();
        jToggleButton20 = new javax.swing.JToggleButton();
        jToggleButton21 = new javax.swing.JToggleButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        PurchasedItems = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        PrintOrder = new javax.swing.JButton();
        CancelOrder = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        discount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        TotalAmount = new javax.swing.JTextField();
        SubTotal = new javax.swing.JTextField();
        onlyCustomerPrint = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel15 = new javax.swing.JPanel();
        CancelItem = new javax.swing.JButton();
        SAVEORDER = new javax.swing.JButton();
        InternalDelivery = new javax.swing.JInternalFrame();
        DeliveryPanel3 = new javax.swing.JPanel();
        lbl_Customer3 = new javax.swing.JLabel();
        txt_Phone = new javax.swing.JTextField();
        txt_Customer = new javax.swing.JTextField();
        lbl_DeliveryCharges3 = new javax.swing.JLabel();
        lbl_Address3 = new javax.swing.JLabel();
        lbl_Phone3 = new javax.swing.JLabel();
        txt_DeliveryCharges = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        Area_Address = new javax.swing.JTextArea();
        lbl_Address4 = new javax.swing.JLabel();
        txt_Remarks = new javax.swing.JTextField();
        lbl_DeliveryCharges4 = new javax.swing.JLabel();
        DeliveryBoy = new javax.swing.JComboBox<String>();
        InternalDineIn = new javax.swing.JInternalFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablesPane = new javax.swing.JPanel();
        Table1 = new javax.swing.JToggleButton();
        Table2 = new javax.swing.JToggleButton();
        Table3 = new javax.swing.JToggleButton();
        Table4 = new javax.swing.JToggleButton();
        Table5 = new javax.swing.JToggleButton();
        Table6 = new javax.swing.JToggleButton();
        Table7 = new javax.swing.JToggleButton();
        Table8 = new javax.swing.JToggleButton();
        Table9 = new javax.swing.JToggleButton();
        Table10 = new javax.swing.JToggleButton();
        Table11 = new javax.swing.JToggleButton();
        Table12 = new javax.swing.JToggleButton();
        Table13 = new javax.swing.JToggleButton();
        Table14 = new javax.swing.JToggleButton();
        Table15 = new javax.swing.JToggleButton();
        Table16 = new javax.swing.JToggleButton();
        Table17 = new javax.swing.JToggleButton();
        Table18 = new javax.swing.JToggleButton();
        Table19 = new javax.swing.JToggleButton();
        Table20 = new javax.swing.JToggleButton();
        cmb_Waiters = new javax.swing.JComboBox<String>();
        lbl_TableName = new javax.swing.JLabel();
        lbl_CashierPos15 = new javax.swing.JLabel();
        lbl_CashierPos16 = new javax.swing.JLabel();
        ServiceCharges = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        jButton64 = new javax.swing.JButton();
        KitchenOrder = new javax.swing.JButton();
        MemershipForm = new javax.swing.JInternalFrame();
        jPanel51 = new javax.swing.JPanel();
        cmb_Members = new javax.swing.JComboBox<String>();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        MemberContact = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        SamAddress = new javax.swing.JButton();
        jPanel52 = new javax.swing.JPanel();
        firstVisit = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        FreeRoll = new javax.swing.JLabel();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        LastVisitDate = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        MemberAddress = new javax.swing.JTextPane();
        jLabel119 = new javax.swing.JLabel();
        jButton61 = new javax.swing.JButton();
        MemberCardNo = new javax.swing.JComboBox<String>();
        PDI = new javax.swing.JButton();
        IS = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Point of Sale");
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 5));

        lbl_OrderType.setFont(new java.awt.Font("Tahoma", 1, 34)); // NOI18N
        lbl_OrderType.setText("Take Away");

        jPanel6.setBackground(new java.awt.Color(0, 51, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        OrderId.setEditable(false);
        OrderId.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        OrderId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderIdActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Order Id");

        DateTime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DateTime.setForeground(new java.awt.Color(255, 255, 255));
        DateTime.setText("Date & Time");

        OrderType.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        OrderType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Take Away", "Dine In", "Home Delivery" }));
        OrderType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OrderType.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                OrderTypePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ORDER TYPE");

        Membership.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Membership.setForeground(new java.awt.Color(255, 255, 255));
        Membership.setText("Membership");
        Membership.setContentAreaFilled(false);
        Membership.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Membership.setEnabled(false);
        Membership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MembershipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(Membership, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OrderType, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addComponent(DateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(OrderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(OrderType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(Membership, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {OrderType, jLabel4});

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Categories", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jToggleButton1.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup2.add(jToggleButton1);
        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("<html>Large<br>Pizza</html>");
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup2.add(jToggleButton2);
        jToggleButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setText("<html>Regular<br>Pizza</html>");
        jToggleButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        SmallPizza.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup2.add(SmallPizza);
        SmallPizza.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        SmallPizza.setForeground(new java.awt.Color(255, 255, 255));
        SmallPizza.setText("<html>Small<br>Pizza</html>");
        SmallPizza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SmallPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmallPizzaActionPerformed(evt);
            }
        });

        jToggleButton7.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup2.add(jToggleButton7);
        jToggleButton7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jToggleButton7.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton7.setText("BAR B.Q");
        jToggleButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton7.setPreferredSize(new java.awt.Dimension(0, 77));
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        jToggleButton8.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup2.add(jToggleButton8);
        jToggleButton8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jToggleButton8.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton8.setText("Fast Food");
        jToggleButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton8.setPreferredSize(new java.awt.Dimension(0, 53));
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        jToggleButton9.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup2.add(jToggleButton9);
        jToggleButton9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jToggleButton9.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton9.setText("Rolls/Dry");
        jToggleButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton9.setPreferredSize(new java.awt.Dimension(0, 53));
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        jToggleButton10.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup2.add(jToggleButton10);
        jToggleButton10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jToggleButton10.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton10.setText("Burgers");
        jToggleButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton10.setPreferredSize(new java.awt.Dimension(0, 77));
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton10ActionPerformed(evt);
            }
        });

        jToggleButton11.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup2.add(jToggleButton11);
        jToggleButton11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jToggleButton11.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton11.setText("<html>Lasagnia</html>");
        jToggleButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton11ActionPerformed(evt);
            }
        });

        jToggleButton12.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup2.add(jToggleButton12);
        jToggleButton12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jToggleButton12.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton12.setText("<html><center>Salad <br>&<br> Raita</center></html>");
        jToggleButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton12ActionPerformed(evt);
            }
        });

        Beverages.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup2.add(Beverages);
        Beverages.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Beverages.setForeground(new java.awt.Color(255, 255, 255));
        Beverages.setText("Beverages");
        Beverages.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Beverages.setPreferredSize(new java.awt.Dimension(0, 77));
        Beverages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeveragesActionPerformed(evt);
            }
        });

        jToggleButton14.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup2.add(jToggleButton14);
        jToggleButton14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jToggleButton14.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton14.setText("Fries");
        jToggleButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton14ActionPerformed(evt);
            }
        });

        jToggleButton15.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup2.add(jToggleButton15);
        jToggleButton15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jToggleButton15.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton15.setText("Desserts");
        jToggleButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton15ActionPerformed(evt);
            }
        });

        jToggleButton16.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup2.add(jToggleButton16);
        jToggleButton16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jToggleButton16.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton16.setText("<html><center>Cheese<br>Garlic<br>Bread</center></html>");
        jToggleButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton16ActionPerformed(evt);
            }
        });

        jToggleButton17.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup2.add(jToggleButton17);
        jToggleButton17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jToggleButton17.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton17.setText("Chai/Tea");
        jToggleButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton17ActionPerformed(evt);
            }
        });

        jToggleButton18.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup2.add(jToggleButton18);
        jToggleButton18.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jToggleButton18.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton18.setText("Shawarma");
        jToggleButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton18ActionPerformed(evt);
            }
        });

        Deals.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup2.add(Deals);
        Deals.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Deals.setForeground(new java.awt.Color(255, 255, 255));
        Deals.setText("Deals");
        Deals.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Deals.setPreferredSize(new java.awt.Dimension(0, 53));
        Deals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DealsActionPerformed(evt);
            }
        });

        jToggleButton20.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup2.add(jToggleButton20);
        jToggleButton20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jToggleButton20.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton20.setText("Biryani");
        jToggleButton20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton20ActionPerformed(evt);
            }
        });

        jToggleButton21.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup2.add(jToggleButton21);
        jToggleButton21.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jToggleButton21.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton21.setText("Pasta");
        jToggleButton21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jToggleButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(Deals, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Beverages, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SmallPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jToggleButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jToggleButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Beverages, Deals, SmallPizza, jToggleButton1, jToggleButton10, jToggleButton11, jToggleButton12, jToggleButton14, jToggleButton15, jToggleButton16, jToggleButton17, jToggleButton18, jToggleButton2, jToggleButton20, jToggleButton21, jToggleButton7, jToggleButton8, jToggleButton9});

        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Deals, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Beverages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SmallPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jToggleButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jToggleButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jToggleButton21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton16, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Beverages, Deals, SmallPizza, jToggleButton1, jToggleButton10, jToggleButton11, jToggleButton12, jToggleButton14, jToggleButton15, jToggleButton16, jToggleButton17, jToggleButton18, jToggleButton2, jToggleButton20, jToggleButton21, jToggleButton7, jToggleButton8, jToggleButton9});

        jScrollPane9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Purchased Items"));

        PurchasedItems.setAutoCreateRowSorter(true);
        PurchasedItems.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        PurchasedItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S#", "Item Name", "Rate", "Quantity", "Total"
            }
        ));
        PurchasedItems.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        PurchasedItems.setRowHeight(25);
        PurchasedItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PurchasedItemsMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(PurchasedItems);
        if (PurchasedItems.getColumnModel().getColumnCount() > 0) {
            PurchasedItems.getColumnModel().getColumn(0).setMinWidth(30);
            PurchasedItems.getColumnModel().getColumn(0).setPreferredWidth(0);
            PurchasedItems.getColumnModel().getColumn(0).setMaxWidth(5);
            PurchasedItems.getColumnModel().getColumn(1).setMinWidth(120);
            PurchasedItems.getColumnModel().getColumn(1).setPreferredWidth(120);
            PurchasedItems.getColumnModel().getColumn(2).setMinWidth(55);
            PurchasedItems.getColumnModel().getColumn(2).setPreferredWidth(10);
            PurchasedItems.getColumnModel().getColumn(2).setMaxWidth(5);
            PurchasedItems.getColumnModel().getColumn(3).setMinWidth(55);
            PurchasedItems.getColumnModel().getColumn(3).setPreferredWidth(5);
            PurchasedItems.getColumnModel().getColumn(3).setMaxWidth(5);
            PurchasedItems.getColumnModel().getColumn(4).setMinWidth(65);
            PurchasedItems.getColumnModel().getColumn(4).setPreferredWidth(30);
            PurchasedItems.getColumnModel().getColumn(4).setMaxWidth(5);
        }

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 5, true), "Payment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 51, 102))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("<html>Sub <br>Total</html>");

        PrintOrder.setBackground(new java.awt.Color(0, 51, 102));
        PrintOrder.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        PrintOrder.setForeground(new java.awt.Color(255, 255, 255));
        PrintOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Receipt_25px.png"))); // NOI18N
        PrintOrder.setText("Receipt");
        PrintOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PrintOrder.setEnabled(false);
        PrintOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintOrderActionPerformed(evt);
            }
        });

        CancelOrder.setBackground(new java.awt.Color(204, 0, 0));
        CancelOrder.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        CancelOrder.setForeground(new java.awt.Color(255, 255, 255));
        CancelOrder.setText("Cancel Order");
        CancelOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelOrderActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dicount");

        discount.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        discount.setForeground(new java.awt.Color(255, 0, 0));
        discount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        discount.setText("0");
        discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountActionPerformed(evt);
            }
        });
        discount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                discountKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                discountKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("%");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Total");

        TotalAmount.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        TotalAmount.setText("0.00");
        TotalAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalAmountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TotalAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {TotalAmount, jLabel5});

        SubTotal.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        SubTotal.setForeground(new java.awt.Color(255, 0, 0));
        SubTotal.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        SubTotal.setText("0.00");
        SubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubTotalActionPerformed(evt);
            }
        });
        SubTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SubTotalKeyReleased(evt);
            }
        });

        onlyCustomerPrint.setBackground(new java.awt.Color(0, 51, 102));
        onlyCustomerPrint.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        onlyCustomerPrint.setForeground(new java.awt.Color(255, 255, 255));
        onlyCustomerPrint.setText("Only Customer Print");
        onlyCustomerPrint.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        onlyCustomerPrint.setBorderPainted(true);
        onlyCustomerPrint.setBorderPaintedFlat(true);
        onlyCustomerPrint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        onlyCustomerPrint.setEnabled(false);
        onlyCustomerPrint.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        onlyCustomerPrint.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        onlyCustomerPrint.setIconTextGap(8);
        onlyCustomerPrint.setMargin(new java.awt.Insets(2, 5, 2, 2));
        onlyCustomerPrint.setOpaque(true);
        onlyCustomerPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onlyCustomerPrintMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CancelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(PrintOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(onlyCustomerPrint, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(onlyCustomerPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(CancelOrder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SubTotal, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PrintOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Available Items", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 585, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel15);

        CancelItem.setBackground(new java.awt.Color(255, 0, 0));
        CancelItem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CancelItem.setForeground(new java.awt.Color(255, 255, 255));
        CancelItem.setText("<html>Cancel<br>Item</html>");
        CancelItem.setToolTipText("Select any item then click cancel item will be canceled from table.");
        CancelItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CancelItem.setEnabled(false);
        CancelItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelItemActionPerformed(evt);
            }
        });

        SAVEORDER.setBackground(new java.awt.Color(17, 95, 19));
        SAVEORDER.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SAVEORDER.setForeground(new java.awt.Color(255, 255, 255));
        SAVEORDER.setText("<html>Save<br>Order</html>");
        SAVEORDER.setToolTipText("If you don't want to print receipts.");
        SAVEORDER.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SAVEORDER.setEnabled(false);
        SAVEORDER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVEORDERActionPerformed(evt);
            }
        });

        InternalDelivery.setTitle("Delivery");
        InternalDelivery.setOpaque(true);
        InternalDelivery.setVisible(false);
        InternalDelivery.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeliveryPanel3.setBackground(new java.awt.Color(255, 255, 255));
        DeliveryPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Delivery", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        lbl_Customer3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Customer3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Customer3.setText("Customer");

        txt_Phone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PhoneActionPerformed(evt);
            }
        });

        txt_Customer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CustomerActionPerformed(evt);
            }
        });

        lbl_DeliveryCharges3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_DeliveryCharges3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_DeliveryCharges3.setText("Charges");

        lbl_Address3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Address3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Address3.setText("Address");

        lbl_Phone3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Phone3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Phone3.setText("Phone");

        txt_DeliveryCharges.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_DeliveryCharges.setForeground(new java.awt.Color(255, 0, 0));
        txt_DeliveryCharges.setText("0.0");
        txt_DeliveryCharges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DeliveryChargesActionPerformed(evt);
            }
        });

        Area_Address.setColumns(20);
        Area_Address.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Area_Address.setLineWrap(true);
        Area_Address.setRows(5);
        Area_Address.setWrapStyleWord(true);
        jScrollPane4.setViewportView(Area_Address);

        lbl_Address4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Address4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Address4.setText("Remarks");

        txt_Remarks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Remarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RemarksActionPerformed(evt);
            }
        });

        lbl_DeliveryCharges4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_DeliveryCharges4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_DeliveryCharges4.setText("Delivery Boy");

        DeliveryBoy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DeliveryBoy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Delivery Boy" }));
        DeliveryBoy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeliveryBoy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeliveryBoyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DeliveryPanel3Layout = new javax.swing.GroupLayout(DeliveryPanel3);
        DeliveryPanel3.setLayout(DeliveryPanel3Layout);
        DeliveryPanel3Layout.setHorizontalGroup(
            DeliveryPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeliveryPanel3Layout.createSequentialGroup()
                .addGroup(DeliveryPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DeliveryPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_Address4, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                    .addComponent(lbl_Address3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_DeliveryCharges3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Customer3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(DeliveryPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DeliveryPanel3Layout.createSequentialGroup()
                        .addComponent(txt_Customer, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_Phone3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Phone))
                    .addGroup(DeliveryPanel3Layout.createSequentialGroup()
                        .addComponent(txt_DeliveryCharges, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(lbl_DeliveryCharges4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeliveryBoy, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4)
                    .addComponent(txt_Remarks)))
        );
        DeliveryPanel3Layout.setVerticalGroup(
            DeliveryPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeliveryPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(DeliveryPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Customer3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Phone3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Customer, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(DeliveryPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_DeliveryCharges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_DeliveryCharges3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_DeliveryCharges4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeliveryBoy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(DeliveryPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DeliveryPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_Address3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DeliveryPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DeliveryPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Remarks, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Address4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        DeliveryPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txt_Customer, txt_DeliveryCharges, txt_Phone, txt_Remarks});

        InternalDelivery.getContentPane().add(DeliveryPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 511, 320));

        InternalDineIn.setTitle("Dine in Tables");
        InternalDineIn.setOpaque(true);
        InternalDineIn.setVisible(false);
        InternalDineIn.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        TablesPane.setBackground(new java.awt.Color(0, 0, 0));

        Table1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Table1);
        Table1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Table1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/restaurant_table_Final.png"))); // NOI18N
        Table1.setSelected(true);
        Table1.setText("A1");
        Table1.setBorder(new javax.swing.border.MatteBorder(null));
        Table1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Table1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Table1.setOpaque(true);
        Table1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table1ActionPerformed(evt);
            }
        });

        Table2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Table2);
        Table2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Table2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/restaurant_table_Final.png"))); // NOI18N
        Table2.setText("A2");
        Table2.setBorder(new javax.swing.border.MatteBorder(null));
        Table2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Table2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Table2.setOpaque(true);
        Table2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table2ActionPerformed(evt);
            }
        });

        Table3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Table3);
        Table3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Table3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/restaurant_table_Final.png"))); // NOI18N
        Table3.setText("A3");
        Table3.setBorder(new javax.swing.border.MatteBorder(null));
        Table3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Table3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Table3.setOpaque(true);
        Table3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table3ActionPerformed(evt);
            }
        });

        Table4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Table4);
        Table4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Table4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/restaurant_table_Final.png"))); // NOI18N
        Table4.setText("B1");
        Table4.setBorder(new javax.swing.border.MatteBorder(null));
        Table4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Table4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Table4.setOpaque(true);
        Table4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table4ActionPerformed(evt);
            }
        });

        Table5.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Table5);
        Table5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Table5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/restaurant_table_Final.png"))); // NOI18N
        Table5.setText("B2");
        Table5.setBorder(new javax.swing.border.MatteBorder(null));
        Table5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Table5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Table5.setOpaque(true);
        Table5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table5ActionPerformed(evt);
            }
        });

        Table6.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Table6);
        Table6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Table6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/restaurant_table_Final.png"))); // NOI18N
        Table6.setText("B3");
        Table6.setBorder(new javax.swing.border.MatteBorder(null));
        Table6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Table6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Table6.setOpaque(true);
        Table6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table6ActionPerformed(evt);
            }
        });

        Table7.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Table7);
        Table7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Table7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/restaurant_table_Final.png"))); // NOI18N
        Table7.setText("C1");
        Table7.setBorder(new javax.swing.border.MatteBorder(null));
        Table7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Table7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Table7.setOpaque(true);
        Table7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table7ActionPerformed(evt);
            }
        });

        Table8.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Table8);
        Table8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Table8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/restaurant_table_Final.png"))); // NOI18N
        Table8.setText("C2");
        Table8.setBorder(new javax.swing.border.MatteBorder(null));
        Table8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Table8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Table8.setOpaque(true);
        Table8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table8ActionPerformed(evt);
            }
        });

        Table9.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Table9);
        Table9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Table9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/restaurant_table_Final.png"))); // NOI18N
        Table9.setText("C3");
        Table9.setBorder(new javax.swing.border.MatteBorder(null));
        Table9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Table9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Table9.setOpaque(true);
        Table9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table9ActionPerformed(evt);
            }
        });

        Table10.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Table10);
        Table10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Table10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/restaurant_table_Final.png"))); // NOI18N
        Table10.setText("Z1");
        Table10.setBorder(new javax.swing.border.MatteBorder(null));
        Table10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Table10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Table10.setOpaque(true);
        Table10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table10ActionPerformed(evt);
            }
        });

        Table11.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Table11);
        Table11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Table11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/restaurant_table_Final.png"))); // NOI18N
        Table11.setText("Z2");
        Table11.setBorder(new javax.swing.border.MatteBorder(null));
        Table11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Table11.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Table11.setOpaque(true);
        Table11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table11ActionPerformed(evt);
            }
        });

        Table12.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Table12);
        Table12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Table12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/restaurant_table_Final.png"))); // NOI18N
        Table12.setText("Z3");
        Table12.setBorder(new javax.swing.border.MatteBorder(null));
        Table12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Table12.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Table12.setOpaque(true);
        Table12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table12ActionPerformed(evt);
            }
        });

        Table13.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Table13);
        Table13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Table13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/restaurant_table_Final.png"))); // NOI18N
        Table13.setText("Z4");
        Table13.setBorder(new javax.swing.border.MatteBorder(null));
        Table13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Table13.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Table13.setOpaque(true);
        Table13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table13ActionPerformed(evt);
            }
        });

        Table14.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Table14);
        Table14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Table14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/restaurant_table_Final.png"))); // NOI18N
        Table14.setText("Z5");
        Table14.setBorder(new javax.swing.border.MatteBorder(null));
        Table14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Table14.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Table14.setOpaque(true);
        Table14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table14ActionPerformed(evt);
            }
        });

        Table15.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Table15);
        Table15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Table15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/restaurant_table_Final.png"))); // NOI18N
        Table15.setText("H1");
        Table15.setBorder(new javax.swing.border.MatteBorder(null));
        Table15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Table15.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Table15.setOpaque(true);
        Table15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table15ActionPerformed(evt);
            }
        });

        Table16.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Table16);
        Table16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Table16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/restaurant_table_Final.png"))); // NOI18N
        Table16.setText("H2");
        Table16.setBorder(new javax.swing.border.MatteBorder(null));
        Table16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Table16.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Table16.setOpaque(true);
        Table16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table16ActionPerformed(evt);
            }
        });

        Table17.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Table17);
        Table17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Table17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/restaurant_table_Final.png"))); // NOI18N
        Table17.setText("H3");
        Table17.setBorder(new javax.swing.border.MatteBorder(null));
        Table17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Table17.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Table17.setOpaque(true);
        Table17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table17ActionPerformed(evt);
            }
        });

        Table18.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Table18);
        Table18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Table18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/restaurant_table_Final.png"))); // NOI18N
        Table18.setText("H4");
        Table18.setBorder(new javax.swing.border.MatteBorder(null));
        Table18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Table18.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Table18.setOpaque(true);
        Table18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table18ActionPerformed(evt);
            }
        });

        Table19.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Table19);
        Table19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Table19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/restaurant_table_Final.png"))); // NOI18N
        Table19.setText("H5");
        Table19.setBorder(new javax.swing.border.MatteBorder(null));
        Table19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Table19.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Table19.setOpaque(true);
        Table19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table19ActionPerformed(evt);
            }
        });

        Table20.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Table20);
        Table20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Table20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/restaurant_table_Final.png"))); // NOI18N
        Table20.setText("Other");
        Table20.setBorder(new javax.swing.border.MatteBorder(null));
        Table20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Table20.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Table20.setOpaque(true);
        Table20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TablesPaneLayout = new javax.swing.GroupLayout(TablesPane);
        TablesPane.setLayout(TablesPaneLayout);
        TablesPaneLayout.setHorizontalGroup(
            TablesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablesPaneLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(TablesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(TablesPaneLayout.createSequentialGroup()
                        .addComponent(Table1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(Table2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(Table3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(Table4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TablesPaneLayout.createSequentialGroup()
                        .addComponent(Table13, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(Table14, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(Table15, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(Table16, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TablesPaneLayout.createSequentialGroup()
                        .addGroup(TablesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Table9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Table5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(TablesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Table10, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Table6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(TablesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TablesPaneLayout.createSequentialGroup()
                                .addComponent(Table7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(Table8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(TablesPaneLayout.createSequentialGroup()
                                .addComponent(Table11, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(Table12, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(TablesPaneLayout.createSequentialGroup()
                        .addComponent(Table17, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(Table18, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(Table19, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(Table20, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        TablesPaneLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Table1, Table10, Table11, Table12, Table13, Table14, Table15, Table16, Table17, Table18, Table19, Table2, Table20, Table3, Table4, Table5, Table6, Table7, Table8, Table9});

        TablesPaneLayout.setVerticalGroup(
            TablesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablesPaneLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(TablesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Table1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Table2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Table3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Table4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(TablesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Table6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Table5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Table7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Table8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(TablesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Table9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Table10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Table11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Table12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(TablesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Table13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Table14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Table15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Table16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(TablesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Table17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Table18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Table19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Table20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        TablesPaneLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Table1, Table10, Table11, Table12, Table13, Table14, Table15, Table16, Table17, Table18, Table19, Table2, Table20, Table3, Table4, Table5, Table6, Table7, Table8, Table9});

        jScrollPane3.setViewportView(TablesPane);

        InternalDineIn.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 61, 510, 270));

        cmb_Waiters.setBackground(new java.awt.Color(255, 0, 0));
        cmb_Waiters.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cmb_Waiters.setForeground(new java.awt.Color(255, 255, 255));
        cmb_Waiters.setMaximumRowCount(15);
        cmb_Waiters.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select waiter" }));
        cmb_Waiters.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_Waiters.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_WaitersPopupMenuWillBecomeVisible(evt);
            }
        });
        InternalDineIn.getContentPane().add(cmb_Waiters, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 0, 252, 31));

        lbl_TableName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_TableName.setForeground(new java.awt.Color(255, 51, 0));
        lbl_TableName.setText("A1");
        InternalDineIn.getContentPane().add(lbl_TableName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 90, 31));

        lbl_CashierPos15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_CashierPos15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CashierPos15.setText("Charges");
        InternalDineIn.getContentPane().add(lbl_CashierPos15, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 30, 70, 25));

        lbl_CashierPos16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_CashierPos16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CashierPos16.setText("Waiter");
        InternalDineIn.getContentPane().add(lbl_CashierPos16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 25));

        ServiceCharges.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ServiceCharges.setForeground(new java.awt.Color(255, 0, 0));
        ServiceCharges.setText("0.0");
        ServiceCharges.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ServiceChargesKeyReleased(evt);
            }
        });
        InternalDineIn.getContentPane().add(ServiceCharges, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 130, 30));

        jLabel98.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel98.setText("Table Active:");
        InternalDineIn.getContentPane().add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, 30));

        jButton64.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton64.setText("Add");
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });
        InternalDineIn.getContentPane().add(jButton64, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, 30));

        KitchenOrder.setBackground(new java.awt.Color(0, 51, 102));
        KitchenOrder.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        KitchenOrder.setForeground(new java.awt.Color(255, 255, 255));
        KitchenOrder.setText("<html>Print<br>Kitchen<br>Order</html>");
        KitchenOrder.setToolTipText("If you don't want a customer receipt. This option will print just Kitchen Order receip and save the order in databaset");
        KitchenOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        KitchenOrder.setEnabled(false);
        KitchenOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KitchenOrderActionPerformed(evt);
            }
        });

        MemershipForm.setBackground(new java.awt.Color(255, 255, 255));
        MemershipForm.setTitle("Membership");
        MemershipForm.setAutoscrolls(true);
        MemershipForm.setOpaque(true);
        try {
            MemershipForm.setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        MemershipForm.setVisible(false);

        jPanel51.setBackground(new java.awt.Color(255, 255, 255));
        jPanel51.setLayout(null);

        cmb_Members.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_Members.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Member" }));
        cmb_Members.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_Members.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_MembersPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cmb_Members.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_MembersActionPerformed(evt);
            }
        });
        cmb_Members.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmb_MembersKeyReleased(evt);
            }
        });
        jPanel51.add(cmb_Members);
        cmb_Members.setBounds(64, 0, 289, 30);

        jLabel104.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel104.setText("Member");
        jPanel51.add(jLabel104);
        jLabel104.setBounds(2, 3, 62, 17);

        jLabel105.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel105.setText("CardNo");
        jPanel51.add(jLabel105);
        jLabel105.setBounds(0, 30, 62, 17);

        MemberContact.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MemberContact.setText("Nil");
        jPanel51.add(MemberContact);
        MemberContact.setBounds(69, 53, 280, 20);

        jLabel108.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel108.setText("Contact");
        jPanel51.add(jLabel108);
        jLabel108.setBounds(0, 50, 62, 17);

        jLabel109.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel109.setText("Address");
        jPanel51.add(jLabel109);
        jLabel109.setBounds(0, 70, 62, 25);

        jLabel106.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel106.setText("Last Visit");
        jPanel51.add(jLabel106);
        jLabel106.setBounds(355, 79, 62, 20);

        SamAddress.setBackground(new java.awt.Color(51, 0, 153));
        SamAddress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SamAddress.setForeground(new java.awt.Color(255, 255, 255));
        SamAddress.setText("Same Details>>");
        SamAddress.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SamAddress.setEnabled(false);
        SamAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SamAddressActionPerformed(evt);
            }
        });
        jPanel51.add(SamAddress);
        SamAddress.setBounds(679, 11, 120, 36);

        jPanel52.setBackground(new java.awt.Color(255, 255, 255));
        jPanel52.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Deals Available"));

        firstVisit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        firstVisit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Delete_30px.png"))); // NOI18N

        jLabel107.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel107.setText("1st Visit Bonus");

        jLabel111.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel111.setText("Free Family Dine in Roll");

        FreeRoll.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FreeRoll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Delete_30px.png"))); // NOI18N

        jButton59.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton59.setText("Add");
        jButton59.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton59.setEnabled(false);
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });

        jButton60.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton60.setText("Add");
        jButton60.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton60.setEnabled(false);
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel52Layout.createSequentialGroup()
                        .addComponent(jLabel107, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstVisit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addComponent(jLabel111)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FreeRoll)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton60, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)))
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(firstVisit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton59))
                .addGap(0, 0, 0)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FreeRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel111)
                    .addComponent(jButton60)))
        );

        jPanel51.add(jPanel52);
        jPanel52.setBounds(353, 0, 320, 80);

        LastVisitDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LastVisitDate.setText("Nill");
        jPanel51.add(LastVisitDate);
        LastVisitDate.setBounds(423, 80, 117, 20);

        MemberAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane12.setViewportView(MemberAddress);

        jPanel51.add(jScrollPane12);
        jScrollPane12.setBounds(60, 75, 290, 25);

        jLabel119.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel119.setText("Big Offer Rs 270");
        jPanel51.add(jLabel119);
        jLabel119.setBounds(546, 77, 150, 22);

        jButton61.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton61.setText("Add");
        jButton61.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });
        jPanel51.add(jButton61);
        jButton61.setBounds(700, 73, 99, 30);

        MemberCardNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MemberCardNo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select CardNo" }));
        MemberCardNo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                MemberCardNoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        MemberCardNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberCardNoActionPerformed(evt);
            }
        });
        MemberCardNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MemberCardNoKeyReleased(evt);
            }
        });
        jPanel51.add(MemberCardNo);
        MemberCardNo.setBounds(66, 30, 140, 23);

        javax.swing.GroupLayout MemershipFormLayout = new javax.swing.GroupLayout(MemershipForm.getContentPane());
        MemershipForm.getContentPane().setLayout(MemershipFormLayout);
        MemershipFormLayout.setHorizontalGroup(
            MemershipFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MemershipFormLayout.setVerticalGroup(
            MemershipFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PDI.setBackground(new java.awt.Color(0, 51, 102));
        PDI.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PDI.setForeground(new java.awt.Color(255, 255, 255));
        PDI.setText("<html>Print<br>Dine<br>Items</html>");
        PDI.setToolTipText("This option will print the kitchen order receipt for dining only this will not the save order in database. ");
        PDI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PDI.setEnabled(false);
        PDI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDIActionPerformed(evt);
            }
        });

        IS.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        IS.setText("<html> Items<br> Selection</html>");
        IS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        IS.setBorderPainted(true);
        IS.setContentAreaFilled(false);
        IS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IS.setEnabled(false);
        IS.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        IS.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        IS.setIconTextGap(8);
        IS.setMargin(new java.awt.Insets(2, 5, 2, 2));
        IS.setOpaque(true);
        IS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ISMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_OrderType, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(386, 386, 386)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(MemershipForm, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(814, 814, 814))
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PDI)
                                    .addComponent(IS)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CancelItem)
                                            .addComponent(SAVEORDER)
                                            .addComponent(KitchenOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InternalDineIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(InternalDelivery, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CancelItem, KitchenOrder, SAVEORDER});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_OrderType, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(CancelItem, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SAVEORDER, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(IS, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PDI, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(KitchenOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(InternalDineIn, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(InternalDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addComponent(MemershipForm, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {KitchenOrder, PDI, SAVEORDER});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PrintOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintOrderActionPerformed
//        PrintReceipt PR = new PrintReceipt();
//        PR.PrintReceipt();
        String takeid = null;
        int Customerpageheight = 0;
        int kotpageheight = 320;

        switch (OrderType.getSelectedIndex()) {
            case 0:
                Customerpageheight = 490;
                break;
            case 1:
                Customerpageheight = 550;
                break;
            case 2:
                Customerpageheight = 610;
                break;
        }
        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
        String oname = (String) OrderType.getSelectedItem();
        int dialogResult = JOptionPane.showConfirmDialog(null, "<html><span style='font-size:18px; font-weight:bold; font-family:sans-serif; ' > Order    : <span style= 'color:black;'>" + oname + "</span> <br>Items&nbsp; : <span style= 'color:black;'>" + model.getRowCount() + "</span><br><br>Total&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  : <span style= 'color:black;'>" + TotalAmount.getText() + "</span><br>Discount  : <span style= 'color:black;'>" + discount.getText() + "%</span><br><br> SubTotal  : <span style= 'color:red;'>" + SubTotal.getText() + "</span> </span></html>", "Confirm the Order? ", 2, JOptionPane.PLAIN_MESSAGE);

        if (dialogResult == JOptionPane.YES_OPTION) {

            for (int a = 0; a < PurchasedItems.getModel().getRowCount(); a++) {
                Customerpageheight += 65;
                kotpageheight += 35;
            }
            if (POS.Membership.isSelected()) {
                SaleType = "Member";
            } else {
                SaleType = "";
            }

//        Rectangle pagesize = new Rectangle(0,0,300,pageheight);
            DateFormat ReportTime = new SimpleDateFormat("hh:mm:ss aa");
            String ReportTimeString = ReportTime.format(new Date());
            DateFormat ReportDate = new SimpleDateFormat("yyyy-MM-dd");
            DateFormat ReportDatePrint = new SimpleDateFormat("dd-MM-yyyy");
            String ReportDateString = ReportDate.format(new Date());
            String ReportDateString2 = ReportDatePrint.format(new Date());

            java.util.Date dt = new java.util.Date();
            java.text.SimpleDateFormat sdf
                    = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String currentTime = sdf.format(dt);
            java.sql.Timestamp timestamp = new java.sql.Timestamp(dt.getTime());

            //Take Away
            switch (OrderType.getSelectedIndex()) {
                case 0:
                    AddSale.AddTakeAway();
                    break;
                //Dine In
                case 1:

                    AddSale.AddDineIn();
                    break;
                //Delivery
                case 2:

                    AddSale.AddDelivery();
                    break;
                default:
                    break;
            }

            if (Membership.isSelected()) {
                MembershipSale.AddMembershipSale();
            }

//             Document document = new Document(pagesize);
            Document document = new Document();
            try {
//************************************************************************
//                PdfWriter.getInstance(document, new FileOutputStream("TakeAway.pdf"));
                PdfWriter.getInstance(document, new FileOutputStream("TakeAway.pdf"));
                Rectangle one = new Rectangle(300, Customerpageheight);
                Rectangle two = new Rectangle(300, kotpageheight);
                document.setPageSize(one);
                document.setMargins(20, 20, 30, 20);
                document.open();
                PdfPTable HeadTable = new PdfPTable(1);
                HeadTable.addCell(HeaderCell("Restaurant"));
                HeadTable.addCell(HeaderCell("Sale Receipt"));
                HeadTable.addCell(FooterCell("------------------------------", 14));
                HeadTable.setWidthPercentage(100);
                document.add(HeadTable);
                String SaleId = "Select OrderId from Sale ORDER BY OrderId";
                pst = con.prepareStatement(SaleId);
                rs = pst.executeQuery();
                while (rs.next()) {
                    takeid = rs.getString("OrderId");
                }
                PdfPTable DateTable = new PdfPTable(2);
                DateTable.setWidthPercentage(100);
                DateTable.addCell(DateCell("Invoice No:"));
                DateTable.addCell(DateCellRight(takeid));
                if (Membership.isSelected()) {
                    DateTable.addCell(DateCell("Cust Type:"));
                    DateTable.addCell(DateCellRight("Member"));
                    DateTable.addCell(DateCell("Card No:"));
                    DateTable.addCell(DateCellRight(MemberCardNo.getSelectedItem().toString()));
                }
                DateTable.addCell(DateCell("Order Type: "));
                DateTable.addCell(DateCellRight(OrderType.getSelectedItem().toString()));
                if (OrderType.getSelectedIndex() == 1) {
                    DateTable.addCell(DateCell("Table: "));
                    DateTable.addCell(DateCellRight(lbl_TableName.getText()));
                } else if (OrderType.getSelectedIndex() == 2) {
                    DateTable.addCell(DateCell("Customer: "));
                    DateTable.addCell(DateCellRight(txt_Customer.getText()));
                    DateTable.addCell(DateCell("Address: "));
                    DateTable.addCell(DateCellRight(Area_Address.getText()));
                    DateTable.addCell(DateCell("Phone: "));
                    DateTable.addCell(DateCellRight(txt_Phone.getText()));
                }
                DateTable.addCell(DateCell("Token No: "));
                DateTable.addCell(DateCellRight(Integer.toString(TokenNo)));
                DateTable.addCell(DateCell("Date: "));
                DateTable.addCell(DateCellRight(ReportDateString2));
                DateTable.addCell(DateCell("Time: "));
                DateTable.addCell(DateCellRight(ReportTimeString));
                document.add(DateTable);
                PdfPTable HeadTable2 = new PdfPTable(1);
                HeadTable2.addCell(FooterCell("------------------------------", 14));
                HeadTable2.addCell(HeaderCell(" "));
                HeadTable2.setWidthPercentage(100);
                document.add(HeadTable2);
                PdfPTable body = new PdfPTable(5);
                body.setHorizontalAlignment(Element.ALIGN_LEFT);
                body.setWidthPercentage(100);

                body.addCell(BodyCellBold("S#"));
                body.addCell(BodyCellBold("Item"));
                body.addCell(BodyCellBold("Rate"));
                body.addCell(BodyCellBold("Qty"));
                body.addCell(BodyCellBold("Total"));

                body.setWidths(new float[]{1.6f, 6, 3, 2.3f, 3.5f});
                for (int a = 0; a < PurchasedItems.getModel().getRowCount(); a++) {

                    int sno1 = (int) PurchasedItems.getModel().getValueAt(a, 0);
                    String name = (String) PurchasedItems.getModel().getValueAt(a, 1);
                    String rate = (String) PurchasedItems.getModel().getValueAt(a, 2).toString();
                    String itemqty = (String) PurchasedItems.getModel().getValueAt(a, 3).toString();
                    String itemtotal = (String) PurchasedItems.getModel().getValueAt(a, 4).toString();
                    //table.addCell(cell);
                    body.addCell(BodyCell(Integer.toString(sno1)));
                    body.addCell(BodyCell(name));
                    body.addCell(BodyCellCenter(rate));
                    body.addCell(BodyCellCenter(itemqty));
                    body.addCell(BodyCellCenter(itemtotal));
                }

                body.addCell(BodyCell(" "));
                body.addCell(BodyCell(" "));
                body.addCell(BodyCell(" "));
                body.addCell(BodyCell(" "));
                body.addCell(BodyCell(" "));
                PdfPTable BillLine = new PdfPTable(1);
                BillLine.addCell(FooterCell("------------------------------", 14));

                PdfPTable Bill = new PdfPTable(2);
                BillLine.setWidthPercentage(100);
                Bill.setWidthPercentage(100);
//                body.addCell(BodyCellSpan("Sub Total",2));
                Bill.addCell(BillLeft("Total"));
                Bill.addCell(BillRight(TotalAmount.getText()));

                Bill.addCell(BillLeft("Discount"));
                Bill.addCell(BillRight(discount.getText() + "%"));
                if (OrderType.getSelectedIndex() == 0) {
                    Bill.addCell(BillLeft("Sub Total"));
                    Bill.addCell(BillRight(SubTotal.getText()));
                }

                Float z = null;

                if (OrderType.getSelectedIndex() == 1) {
                    Bill.addCell(BillLeft("S.Charges"));
                    Bill.addCell(BillRight(ServiceCharges.getText()));

                    Float d = Float.parseFloat(ServiceCharges.getText());
                    Float t = Float.parseFloat(SubTotal.getText());
                    z = t + d;

                } else if (OrderType.getSelectedIndex() == 2) {
                    Bill.addCell(BillLeft("D.Charges"));
                    Bill.addCell(BillRight(txt_DeliveryCharges.getText()));

                    Float S = Float.parseFloat(txt_DeliveryCharges.getText());
                    Float t = Float.parseFloat(SubTotal.getText());
                    z = t + S;
                }

                Bill.addCell(BillLeft("Grand Total"));
                if (OrderType.getSelectedIndex() != 0) {
                    Bill.addCell(BillRight(Float.toString(z)));
                }

                document.add(body);
                document.add(BillLine);
                document.add(Bill);
                PdfPTable FootTable = new PdfPTable(1);

                FootTable.addCell(FooterCell("------------------------------", 14));
                FootTable.addCell(FooterCell(" ", 14));
                FootTable.addCell(FooterCell("Xyz Address ", 14));
                FootTable.addCell(FooterCell("For Delivery Contact:03xxxxxx", 16));
                //                                FootTable.addCell(FooterCell("_______________________"));
                FootTable.addCell(FooterCell("-------------------------", 14));
        //                                FootTable.addCell(FooterCell(" "));
                //                                FootTable.addCell(FooterCell("Developed By : SamSoft Solutions"));
                FootTable.addCell(FooterCell("CompanyName", 14));
                FootTable.addCell(FooterCell("Developer: 03xxxxxx", 14));
                FootTable.addCell(FooterCell("------------------------------", 14));
                FootTable.addCell(FooterCell("  ", 14));
                FootTable.addCell(FooterCell("  ", 14));
                FootTable.setWidthPercentage(100);
                document.add(FootTable);
//************************************************************
                if (!onlyCustomerPrint.isSelected()) {
                    document.setPageSize(two);
                    document.setMargins(20, 20, 20, 20);
                    document.newPage();
//               //******************************Kitchen Order Toke***********************************
                    PdfPTable KHeadTable = new PdfPTable(1);
                    KHeadTable.addCell(HeaderCell("Kitchen Order Token"));
                    KHeadTable.addCell(FooterCell("-----------------------------", 14));
                    KHeadTable.setWidthPercentage(100);
                    document.add(KHeadTable);

                    PdfPTable KDateTable = new PdfPTable(2);
                    KDateTable.setWidthPercentage(100);
                    KDateTable.addCell(DateCell("Invoice No:"));
                    KDateTable.addCell(DateCellRight(takeid));
                    if (Membership.isSelected()) {
                        KDateTable.addCell(DateCell("Cust Type:"));
                        KDateTable.addCell(DateCellRight("Member"));
                        KDateTable.addCell(DateCell("Card No:"));
                        KDateTable.addCell(DateCellRight(MemberCardNo.getSelectedItem().toString()));
                    }
                    KDateTable.addCell(DateCell("Order Type: "));
                    KDateTable.addCell(DateCellRight(OrderType.getSelectedItem().toString()));
                    KDateTable.addCell(DateCell("Date: "));
                    KDateTable.addCell(DateCellRight(ReportDateString2));
                    KDateTable.addCell(DateCell("Time: "));
                    KDateTable.addCell(DateCellRight(ReportTimeString));
                    KDateTable.addCell(DateCellBold("Token No: "));
                    KDateTable.addCell(DateCellBoldRight(Integer.toString(TokenNo)));
                    KDateTable.addCell(DateCellRight(" "));
                    KDateTable.addCell(DateCellRight(" "));
                    document.add(KDateTable);

                    PdfPTable Kbody = new PdfPTable(4);
                    Kbody.setHorizontalAlignment(Element.ALIGN_LEFT);
                    Kbody.setWidthPercentage(100);
                    Kbody.addCell(BodyCellBold("S#"));
                    Kbody.addCell(BodyCellBold("Item"));
                    Kbody.addCell(BodyCellBold("Rate"));
                    Kbody.addCell(BodyCellBold("Qty"));

                    Kbody.setWidths(new float[]{1, 6, 2.5f, 1.5f});
                    for (int i = 0; i < PurchasedItems.getModel().getRowCount(); i++) {
                        int sn = (int) PurchasedItems.getModel().getValueAt(i, 0);
                        String name = (String) PurchasedItems.getModel().getValueAt(i, 1);
                        int rate = (int) PurchasedItems.getModel().getValueAt(i, 2);
                        String itemqty = (String) PurchasedItems.getModel().getValueAt(i, 3).toString();

                        Kbody.addCell(BodyCell(Integer.toString(sn)));
                        Kbody.addCell(BodyCell(name));
                        Kbody.addCell(BodyCell(Integer.toString(rate)));
                        Kbody.addCell(BodyCellCenter(itemqty));
                    }

                    document.add(Kbody);
                    PdfPTable KFTable = new PdfPTable(1);
                    KFTable.addCell(FooterCell("-----------------------------", 14));
                    KFTable.setWidthPercentage(100);
                    document.add(KFTable);

                    PdfPTable KitchenBill = new PdfPTable(2);
                    KitchenBill.setWidthPercentage(100);

                    KitchenBill.addCell(BillLeft("Sub Total"));
                    if (OrderType.getSelectedIndex() != 0) {
                        KitchenBill.addCell(BillRight(Float.toString(z)));
//                Bill.addCell(BillRight(Float.toString(z)));
                    } else {
                        KitchenBill.addCell(BillRight(SubTotal.getText()));
                    }
                    document.add(KitchenBill);
                    document.add(BillLine);

                    PdfPTable KFooterTable = new PdfPTable(2);
                    KFooterTable.addCell(DateCell(" "));
                    KFooterTable.addCell(DateCellRight(" "));
                    KFooterTable.addCell(DateCell("Counter:"));
                    KFooterTable.addCell(DateCellRight("POS"));
                    KFooterTable.addCell(DateCell("User:"));
                    KFooterTable.addCell(DateCellRight("Cashier"));
                    KFooterTable.setWidthPercentage(100);
                    document.add(KFooterTable);
//
                }
                document.close();
                try {

                    //*************************************************
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Please Connect the printer with System");
                }

                int rowCount = model.getRowCount();
                //Remove rows one by one from the end of the table
                for (int i = rowCount - 1; i >= 0; i--) {
                    model.removeRow(i);
                }
                Membership.setSelected(false);
                MemershipForm.setVisible(false);
                if (Membership.isSelected()) {
                    SAVEORDER.setEnabled(false);
                    KitchenOrder.setEnabled(false);
                    PrintOrder.setEnabled(false);
                }
                jPanel15.removeAll();
                jPanel15.repaint();
                jPanel15.revalidate();

                TotalAmount.setText("0.00");
                SubTotal.setText("0.00");
                discount.setText("0");
                TableForgroundColor.ChangeTableColor();
                if (OrderType.getSelectedIndex() == 2) {
                    txt_Customer.setText("");
                    txt_Phone.setText("");
                    txt_DeliveryCharges.setText("0.0");
                    Area_Address.setText("");
                    txt_Remarks.setText("");
                }
                if (OrderType.getSelectedIndex() == 1) {
                    ServiceCharges.setText("0.0");

                }
                TokenNo++;
                try {
                    Desktop.getDesktop().open(new File("TakeAway.pdf"));
                } catch (IOException ex) {
                    Logger.getLogger(POS.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (FileNotFoundException | DocumentException | SQLException | NumberFormatException e) {
            }
        }

    }//GEN-LAST:event_PrintOrderActionPerformed

    private void CancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelOrderActionPerformed
//         Category ct = new Category();

        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        Category.Sno = 1;
        Category.no = 0;
        //CancelDineInOrder
        if (OrderType.getSelectedIndex() == 1) {
            CancelDineInOrder.CancelDineIn();
            TableForgroundColor.ChangeTableColor();
        }
        //Changing table for color;
        TotalAmount.setText("0.00");
        ServiceCharges.setText("0.0");
        discount.setText("0");
        SubTotal.setText("0.00");

    }//GEN-LAST:event_CancelOrderActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

//        Category ct = new Category();
//        Category.LargePizza();
        Category.AllItems("LargePizza");

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void SmallPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmallPizzaActionPerformed
//        Category ct = new Category();
//        Category.SmallPizza();
        Category.AllItems("SmallPizza");
    }//GEN-LAST:event_SmallPizzaActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
//         Category ct = new Category();
//        Category.RegularPizza();
        Category.AllItems("RegularPizza");

    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void CancelItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelItemActionPerformed
//       Category ct = new Category();

        Category.Sno = 1;
        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
        float Totalvalue = Float.parseFloat(model.getValueAt(PurchasedItems.getSelectedRow(), 4).toString());
        float sTotalAmount = Float.parseFloat(TotalAmount.getText());
        float gTotalValue = sTotalAmount - Totalvalue;
        TotalAmount.setText(Float.toString(gTotalValue));
        SubTotal.setText(Float.toString(gTotalValue));
        discount.setText("0");

        //to cancel dine in item
        if (OrderType.getSelectedIndex() == 1) {
            CancelDineInItem.CancelDineItem();
        }
        model.removeRow(PurchasedItems.getSelectedRow());
        PurchasedItems.clearSelection();

        for (int i = 0; i < PurchasedItems.getRowCount(); i++) {
            model.setValueAt(Category.Sno, i, 0);
            Category.Sno++;
        }
        //Changing table for color;
        TableForgroundColor.ChangeTableColor();
        CancelItem.setEnabled(false);
    }//GEN-LAST:event_CancelItemActionPerformed

    private void PurchasedItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PurchasedItemsMouseClicked
        CancelItem.setEnabled(true);
    }//GEN-LAST:event_PurchasedItemsMouseClicked

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
//        Category.Rolls();
        Category.AllItems("Rolls");
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void DealsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DealsActionPerformed
//        Category.Deals();
        Category.AllItems("Deals");
    }//GEN-LAST:event_DealsActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
//       Category.FastFood();
        Category.AllItems("FastFood");

    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void SAVEORDERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVEORDERActionPerformed
        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
//  int dialogResult = JOptionPane.showConfirmDialog(null, "<html><font size='6' >Order Type : "+OrderType.getSelectedItem().toString()+" <br>No of Items : "+model.getRowCount()+"<br>Sub Total : "+TotalAmount.getText()+"</font></html>","Save Record? ",2,INFORMATION_MESSAGE);
        int dialogResult = JOptionPane.showConfirmDialog(null, "<html><span style='font-size:18px; font-weight:bold; font-family:sans-serif; ' > Order    : <span style= 'color:black;'>" + OrderType.getSelectedItem() + "</span> <br>Items&nbsp; : <span style= 'color:black;'>" + model.getRowCount() + "</span><br><br>Total&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  : <span style= 'color:black;'>" + TotalAmount.getText() + "</span><br>Discount  : <span style= 'color:black;'>" + discount.getText() + "%</span><br><br> SubTotal  : <span style= 'color:red;'>" + SubTotal.getText() + "</span> </span></html>", "Save Record without Printing? ", 2, JOptionPane.PLAIN_MESSAGE);
        int mid = 0;
        int oid = 0;
        if (dialogResult == JOptionPane.YES_OPTION) {
            if (POS.Membership.isSelected()) {
                SaleType = "Member";
            } else {
                SaleType = "";
            }
            switch (OrderType.getSelectedIndex()) {
                //TakeAway
                case 0:
                    AddSale.AddTakeAway();
                    JOptionPane.showMessageDialog(null, "<html><font size='6' >Order Saved!</font></html>");
                    break;
                //Dine In
                case 1:
                    AddSale.AddDineIn();
                    JOptionPane.showMessageDialog(null, "<html><font size='6' >Order Saved!</font></html>");
                    break;
                //Delivery
                case 2:
                    AddSale.AddDelivery();
                    JOptionPane.showMessageDialog(null, "<html><font size='6' >Order Saved!</font></html>");
                    break;
                default:
                    break;
            }
            if (Membership.isSelected()) {
                MembershipSale.AddMembershipSale();
            }
            int rowCount = model.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            Membership.setSelected(false);
            MemershipForm.setVisible(false);
            if (Membership.isSelected()) {
                SAVEORDER.setEnabled(false);
                KitchenOrder.setEnabled(false);
                PrintOrder.setEnabled(false);
            }
            jPanel15.removeAll();
            jPanel15.repaint();
            jPanel15.revalidate();
            TotalAmount.setText("0.00");
            SubTotal.setText("0.00");
            discount.setText("0.00");
            TableForgroundColor.ChangeTableColor();
            if (OrderType.getSelectedIndex() == 2) {
                txt_Customer.setText("");
                txt_Phone.setText("");
                txt_DeliveryCharges.setText("0.0");
                Area_Address.setText("");
                txt_Remarks.setText("");
            }
            if (OrderType.getSelectedIndex() == 1) {
                ServiceCharges.setText("0.0");

            }
        }

    }//GEN-LAST:event_SAVEORDERActionPerformed

    private void BeveragesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeveragesActionPerformed
//        Category.Beverages();
        Category.AllItems("Beverages");
    }//GEN-LAST:event_BeveragesActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
//        Category.BBQ();
        Category.AllItems("BBQ");
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton10ActionPerformed
//         Category.Burgers();
        Category.AllItems("Burgers");
    }//GEN-LAST:event_jToggleButton10ActionPerformed

    private void jToggleButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton12ActionPerformed
//         Category.SaladRaita();
        Category.AllItems("SaladRaita");
    }//GEN-LAST:event_jToggleButton12ActionPerformed

    private void jToggleButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton20ActionPerformed
//         Category.Biryani();
        Category.AllItems("Biryani");
    }//GEN-LAST:event_jToggleButton20ActionPerformed

    private void jToggleButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton15ActionPerformed
//         Category.Desserts();
        Category.AllItems("Desserts");
    }//GEN-LAST:event_jToggleButton15ActionPerformed

    private void jToggleButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton14ActionPerformed
//        Category.Fries();
        Category.AllItems("Fries");
    }//GEN-LAST:event_jToggleButton14ActionPerformed

    private void jToggleButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton21ActionPerformed
//         Category.Pasta();
        Category.AllItems("Pasta");
    }//GEN-LAST:event_jToggleButton21ActionPerformed

    private void jToggleButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton16ActionPerformed
//        Category.CheeseGarlicBread();
        Category.AllItems("CheeseGarlicBread");
    }//GEN-LAST:event_jToggleButton16ActionPerformed

    private void jToggleButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton11ActionPerformed
//         Category.Lasagnia();
        Category.AllItems("Lasagnia");
    }//GEN-LAST:event_jToggleButton11ActionPerformed

    private void jToggleButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton17ActionPerformed
//         Category.Other();
        Category.AllItems("Other2");
    }//GEN-LAST:event_jToggleButton17ActionPerformed

    private void jToggleButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton18ActionPerformed
//         Category.Other2();
        Category.AllItems("Other");
    }//GEN-LAST:event_jToggleButton18ActionPerformed

    private void OrderTypePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_OrderTypePopupMenuWillBecomeInvisible
        IS.setSelected(false);
        onlyCustomerPrint.setSelected(false);
        if (OrderType.getSelectedIndex() == 1) {
            PDI.setEnabled(true);
            IS.setEnabled(true);
            onlyCustomerPrint.setEnabled(true);
        } else {
            PDI.setEnabled(false);
            IS.setEnabled(false);
            onlyCustomerPrint.setEnabled(false);
        }
        Float gtotal = 0.0f;
        int j = 0;
        int k = 1;

        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        TotalAmount.setText("0.00");
        SubTotal.setText("0.00");
        discount.setText("0");

        lbl_OrderType.setText(OrderType.getSelectedItem().toString());
        switch (OrderType.getSelectedIndex()) {
            case 0:
                InternalDelivery.setVisible(false);
                InternalDineIn.setVisible(false);
                SamAddress.setEnabled(false);
                break;
            case 1:
                InternalDelivery.setVisible(false);
                InternalDineIn.setVisible(true);
                lbl_TableName.setText(Table1.getText());
//                    Table1.setBackground(java.awt.Color.WHITE);

                Table2.setBackground(java.awt.Color.WHITE);
                Table3.setBackground(java.awt.Color.WHITE);
                Table4.setBackground(java.awt.Color.WHITE);
                Table5.setBackground(java.awt.Color.WHITE);
                Table6.setBackground(java.awt.Color.WHITE);
                Table7.setBackground(java.awt.Color.WHITE);
                Table8.setBackground(java.awt.Color.WHITE);
                Table9.setBackground(java.awt.Color.WHITE);
                Table10.setBackground(java.awt.Color.WHITE);
                Table11.setBackground(java.awt.Color.WHITE);
                Table12.setBackground(java.awt.Color.WHITE);
                Table13.setBackground(java.awt.Color.WHITE);
                Table14.setBackground(java.awt.Color.WHITE);
                Table15.setBackground(java.awt.Color.WHITE);
                Table16.setBackground(java.awt.Color.WHITE);
                Table16.setBackground(java.awt.Color.WHITE);
                Table17.setBackground(java.awt.Color.WHITE);
                Table18.setBackground(java.awt.Color.WHITE);
                Table19.setBackground(java.awt.Color.WHITE);
                Table20.setBackground(java.awt.Color.WHITE);
                Table1.setBackground(java.awt.Color.green);

                if (a1.size() > 0) {
                    for (int i = 0; i < a1.size() / 4; i++) {
                        model.addRow(new Object[]{k, a1.get(j), a1.get(j + 1), a1.get(j + 2), a1.get(j + 3)});
                        gtotal += Float.parseFloat(a1.get(j + 3).toString());
                        j += 4;
                        k++;
                    }
                }
                Table1.setSelected(true);
                DineInTableBackgroundColor.ChangeColor();
                TotalAmount.setText(Float.toString(gtotal));
                SubTotal.setText(Float.toString(gtotal));
                SamAddress.setEnabled(false);
                break;
            case 2:
                InternalDelivery.setVisible(true);
                InternalDineIn.setVisible(false);
                SamAddress.setEnabled(true);
                String sql = "Select * from Riders";
                try {
                    DeliveryBoy.removeAllItems();
                    pst = con.prepareStatement(sql);
                    rs = pst.executeQuery();
                    while (rs.next()) {
                        DeliveryBoy.addItem(rs.getString("Firstname") + " " + rs.getString("Lastname"));
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e + " Error in fetching riders");
                }
                break;
            default:
                break;
        }

    }//GEN-LAST:event_OrderTypePopupMenuWillBecomeInvisible

    private void txt_PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PhoneActionPerformed

    private void txt_CustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CustomerActionPerformed

    private void txt_DeliveryChargesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DeliveryChargesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DeliveryChargesActionPerformed

    private void TotalAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalAmountActionPerformed

    private void Table1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table1ActionPerformed
        lbl_TableName.setText(Table1.getText());
        DineInTableBackgroundColor.ChangeColor();
        Float gtotal = 0.0f;
        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        int j = 0;
        int k = 1;

        if (a1.size() > 0) {
            for (int i = 0; i < a1.size() / 4; i++) {
                model.addRow(new Object[]{k, a1.get(j), a1.get(j + 1), a1.get(j + 2), a1.get(j + 3)});
                gtotal += Float.parseFloat(a1.get(j + 3).toString());
                j += 4;
                k++;
            }
        }
        ServiceCharges.setText((String) ChargesList.get(0));
        TotalAmount.setText(Float.toString(gtotal));
        SubTotal.setText(Float.toString(gtotal));
        discount.setText("0");

    }//GEN-LAST:event_Table1ActionPerformed

    private void Table2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table2ActionPerformed
        lbl_TableName.setText(Table2.getText());
        DineInTableBackgroundColor.ChangeColor();
        Float gtotal = 0.0f;
        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        int j = 0;
        int k = 1;

        if (a2.size() > 0) {
            for (int i = 0; i < a2.size() / 4; i++) {
                model.addRow(new Object[]{k, a2.get(j), a2.get(j + 1), a2.get(j + 2), a2.get(j + 3)});
                gtotal += Float.parseFloat(a2.get(j + 3).toString());
                j += 4;
                k++;
            }
        }
        ServiceCharges.setText((String) ChargesList.get(1));
        TotalAmount.setText(Float.toString(gtotal));
        SubTotal.setText(Float.toString(gtotal));
        discount.setText("0");

    }//GEN-LAST:event_Table2ActionPerformed

    private void Table3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table3ActionPerformed
        lbl_TableName.setText(Table3.getText());
        DineInTableBackgroundColor.ChangeColor();
        Float gtotal = 0.0f;
        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        int j = 0;
        int k = 1;

        if (a3.size() > 0) {
            for (int i = 0; i < a3.size() / 4; i++) {
                model.addRow(new Object[]{k, a3.get(j), a3.get(j + 1), a3.get(j + 2), a3.get(j + 3)});
                gtotal += Float.parseFloat(a3.get(j + 3).toString());
                j += 4;
                k++;
            }
        }
        ServiceCharges.setText((String) ChargesList.get(2));
        TotalAmount.setText(Float.toString(gtotal));
        SubTotal.setText(Float.toString(gtotal));
        discount.setText("0");
    }//GEN-LAST:event_Table3ActionPerformed

    private void Table4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table4ActionPerformed
        DineInTableBackgroundColor.ChangeColor();
        lbl_TableName.setText(Table4.getText());
        Float gtotal = 0.0f;
        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        int j = 0;
        int k = 1;

        if (a4.size() > 0) {
            for (int i = 0; i < a4.size() / 4; i++) {
                model.addRow(new Object[]{k, a4.get(j), a4.get(j + 1), a4.get(j + 2), a4.get(j + 3)});
                gtotal += Float.parseFloat(a4.get(j + 3).toString());
                j += 4;
                k++;
            }
        }
        TotalAmount.setText(Float.toString(gtotal));
        SubTotal.setText(Float.toString(gtotal));
        discount.setText("0");
    }//GEN-LAST:event_Table4ActionPerformed

    private void Table5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table5ActionPerformed
        DineInTableBackgroundColor.ChangeColor();
        lbl_TableName.setText(Table5.getText());
        Float gtotal = 0.0f;
        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        int j = 0;
        int k = 1;

        if (a5.size() > 0) {
            for (int i = 0; i < a5.size() / 4; i++) {
                model.addRow(new Object[]{k, a5.get(j), a5.get(j + 1), a5.get(j + 2), a5.get(j + 3)});
                gtotal += Float.parseFloat(a5.get(j + 3).toString());
                j += 4;
                k++;
            }
        }
        TotalAmount.setText(Float.toString(gtotal));
        SubTotal.setText(Float.toString(gtotal));
        discount.setText("0");
    }//GEN-LAST:event_Table5ActionPerformed

    private void Table6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table6ActionPerformed
        DineInTableBackgroundColor.ChangeColor();
        lbl_TableName.setText(Table6.getText());
        Float gtotal = 0.0f;
        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        int j = 0;
        int k = 1;

        if (a6.size() > 0) {
            for (int i = 0; i < a6.size() / 4; i++) {
                model.addRow(new Object[]{k, a6.get(j), a6.get(j + 1), a6.get(j + 2), a6.get(j + 3)});
                gtotal += Float.parseFloat(a6.get(j + 3).toString());
                j += 4;
                k++;
            }
        }
        TotalAmount.setText(Float.toString(gtotal));
        SubTotal.setText(Float.toString(gtotal));
        discount.setText("0");
    }//GEN-LAST:event_Table6ActionPerformed

    private void Table7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table7ActionPerformed
        DineInTableBackgroundColor.ChangeColor();
        lbl_TableName.setText(Table7.getText());
        Float gtotal = 0.0f;
        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        int j = 0;
        int k = 1;

        if (a7.size() > 0) {
            for (int i = 0; i < a7.size() / 4; i++) {
                model.addRow(new Object[]{k, a7.get(j), a7.get(j + 1), a7.get(j + 2), a7.get(j + 3)});
                gtotal += Float.parseFloat(a7.get(j + 3).toString());
                j += 4;
                k++;
            }
        }
        TotalAmount.setText(Float.toString(gtotal));
        SubTotal.setText(Float.toString(gtotal));
        discount.setText("0");
    }//GEN-LAST:event_Table7ActionPerformed

    private void Table8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table8ActionPerformed
        DineInTableBackgroundColor.ChangeColor();
        lbl_TableName.setText(Table8.getText());
        Float gtotal = 0.0f;
        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        int j = 0;
        int k = 1;

        if (a8.size() > 0) {
            for (int i = 0; i < a8.size() / 4; i++) {
                model.addRow(new Object[]{k, a8.get(j), a8.get(j + 1), a8.get(j + 2), a8.get(j + 3)});
                gtotal += Float.parseFloat(a8.get(j + 3).toString());
                j += 4;
                k++;
            }
        }
        TotalAmount.setText(Float.toString(gtotal));
        SubTotal.setText(Float.toString(gtotal));
        discount.setText("0");
    }//GEN-LAST:event_Table8ActionPerformed

    private void Table9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table9ActionPerformed
        DineInTableBackgroundColor.ChangeColor();
        lbl_TableName.setText(Table9.getText());
        Float gtotal = 0.0f;
        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        int j = 0;
        int k = 1;

        if (a9.size() > 0) {
            for (int i = 0; i < a9.size() / 4; i++) {
                model.addRow(new Object[]{k, a9.get(j), a9.get(j + 1), a9.get(j + 2), a9.get(j + 3)});
                gtotal += Float.parseFloat(a9.get(j + 3).toString());
                j += 4;
                k++;
            }
        }
        TotalAmount.setText(Float.toString(gtotal));
        SubTotal.setText(Float.toString(gtotal));
        discount.setText("0");
    }//GEN-LAST:event_Table9ActionPerformed

    private void Table10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table10ActionPerformed
        DineInTableBackgroundColor.ChangeColor();
        lbl_TableName.setText(Table10.getText());
        Float gtotal = 0.0f;
        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        int j = 0;
        int k = 1;

        if (a10.size() > 0) {
            for (int i = 0; i < a10.size() / 4; i++) {
                model.addRow(new Object[]{k, a10.get(j), a10.get(j + 1), a10.get(j + 2), a10.get(j + 3)});
                gtotal += Float.parseFloat(a10.get(j + 3).toString());
                j += 4;
                k++;
            }
        }
        TotalAmount.setText(Float.toString(gtotal));
        SubTotal.setText(Float.toString(gtotal));
        discount.setText("0");
    }//GEN-LAST:event_Table10ActionPerformed

    private void Table11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table11ActionPerformed
        DineInTableBackgroundColor.ChangeColor();
        lbl_TableName.setText(Table11.getText());
        Float gtotal = 0.0f;
        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        int j = 0;
        int k = 1;

        if (a11.size() > 0) {
            for (int i = 0; i < a11.size() / 4; i++) {
                model.addRow(new Object[]{k, a11.get(j), a11.get(j + 1), a11.get(j + 2), a11.get(j + 3)});
                gtotal += Float.parseFloat(a11.get(j + 3).toString());
                j += 4;
                k++;
            }
        }
        TotalAmount.setText(Float.toString(gtotal));
        SubTotal.setText(Float.toString(gtotal));
        discount.setText("0");
    }//GEN-LAST:event_Table11ActionPerformed

    private void Table12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table12ActionPerformed
        DineInTableBackgroundColor.ChangeColor();
        lbl_TableName.setText(Table12.getText());
        Float gtotal = 0.0f;
        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        int j = 0;
        int k = 1;

        if (a12.size() > 0) {
            for (int i = 0; i < a12.size() / 4; i++) {
                model.addRow(new Object[]{k, a12.get(j), a12.get(j + 1), a12.get(j + 2), a12.get(j + 3)});
                gtotal += Float.parseFloat(a12.get(j + 3).toString());
                j += 4;
                k++;
            }
        }
        TotalAmount.setText(Float.toString(gtotal));
        SubTotal.setText(Float.toString(gtotal));
        discount.setText("0");
    }//GEN-LAST:event_Table12ActionPerformed

    private void Table13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table13ActionPerformed
        DineInTableBackgroundColor.ChangeColor();
        lbl_TableName.setText(Table13.getText());
        Float gtotal = 0.0f;
        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        int j = 0;
        int k = 1;

        if (a13.size() > 0) {
            for (int i = 0; i < a13.size() / 4; i++) {
                model.addRow(new Object[]{k, a13.get(j), a13.get(j + 1), a13.get(j + 2), a13.get(j + 3)});
                gtotal += Float.parseFloat(a13.get(j + 3).toString());
                j += 4;
                k++;
            }
        }
        TotalAmount.setText(Float.toString(gtotal));
        SubTotal.setText(Float.toString(gtotal));
        discount.setText("0");
    }//GEN-LAST:event_Table13ActionPerformed

    private void Table14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table14ActionPerformed
        DineInTableBackgroundColor.ChangeColor();
        lbl_TableName.setText(Table14.getText());
        Float gtotal = 0.0f;
        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        int j = 0;
        int k = 1;

        if (a14.size() > 0) {
            for (int i = 0; i < a14.size() / 4; i++) {
                model.addRow(new Object[]{k, a14.get(j), a14.get(j + 1), a14.get(j + 2), a14.get(j + 3)});
                gtotal += Float.parseFloat(a14.get(j + 3).toString());
                j += 4;
                k++;
            }
        }
        TotalAmount.setText(Float.toString(gtotal));
        SubTotal.setText(Float.toString(gtotal));
        discount.setText("0");
    }//GEN-LAST:event_Table14ActionPerformed

    private void Table15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table15ActionPerformed
        DineInTableBackgroundColor.ChangeColor();
        lbl_TableName.setText(Table15.getText());
        Float gtotal = 0.0f;
        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        int j = 0;
        int k = 1;

        if (a15.size() > 0) {
            for (int i = 0; i < a15.size() / 4; i++) {
                model.addRow(new Object[]{k, a15.get(j), a15.get(j + 1), a15.get(j + 2), a15.get(j + 3)});
                gtotal += Float.parseFloat(a15.get(j + 3).toString());
                j += 4;
                k++;
            }
        }
        TotalAmount.setText(Float.toString(gtotal));
        SubTotal.setText(Float.toString(gtotal));
        discount.setText("0");
    }//GEN-LAST:event_Table15ActionPerformed

    private void Table16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table16ActionPerformed
        DineInTableBackgroundColor.ChangeColor();
        lbl_TableName.setText(Table16.getText());
        Float gtotal = 0.0f;
        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        int j = 0;
        int k = 1;

        if (a16.size() > 0) {
            for (int i = 0; i < a16.size() / 4; i++) {
                model.addRow(new Object[]{k, a16.get(j), a16.get(j + 1), a16.get(j + 2), a16.get(j + 3)});
                gtotal += Float.parseFloat(a16.get(j + 3).toString());
                j += 4;
                k++;
            }
        }
        TotalAmount.setText(Float.toString(gtotal));
        SubTotal.setText(Float.toString(gtotal));
        SubTotal.setText(Float.toString(gtotal));
        discount.setText("0");
    }//GEN-LAST:event_Table16ActionPerformed

    private void Table17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table17ActionPerformed
        DineInTableBackgroundColor.ChangeColor();
        lbl_TableName.setText(Table17.getText());
        Float gtotal = 0.0f;
        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        int j = 0;
        int k = 1;

        if (a17.size() > 0) {
            for (int i = 0; i < a17.size() / 4; i++) {
                model.addRow(new Object[]{k, a17.get(j), a17.get(j + 1), a17.get(j + 2), a17.get(j + 3)});
                gtotal += Float.parseFloat(a17.get(j + 3).toString());
                j += 4;
                k++;
            }
        }
        TotalAmount.setText(Float.toString(gtotal));
        SubTotal.setText(Float.toString(gtotal));
        discount.setText("0");
    }//GEN-LAST:event_Table17ActionPerformed

    private void Table18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table18ActionPerformed
        DineInTableBackgroundColor.ChangeColor();
        lbl_TableName.setText(Table18.getText());
        Float gtotal = 0.0f;
        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        int j = 0;
        int k = 1;

        if (a18.size() > 0) {
            for (int i = 0; i < a18.size() / 4; i++) {
                model.addRow(new Object[]{k, a18.get(j), a18.get(j + 1), a18.get(j + 2), a18.get(j + 3)});
                gtotal += Float.parseFloat(a18.get(j + 3).toString());
                j += 4;
                k++;
            }
        }
        TotalAmount.setText(Float.toString(gtotal));
        SubTotal.setText(Float.toString(gtotal));
        discount.setText("0");
    }//GEN-LAST:event_Table18ActionPerformed

    private void Table19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table19ActionPerformed
        DineInTableBackgroundColor.ChangeColor();
        lbl_TableName.setText(Table19.getText());
        Float gtotal = 0.0f;
        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        int j = 0;
        int k = 1;

        if (a19.size() > 0) {
            for (int i = 0; i < a19.size() / 4; i++) {
                model.addRow(new Object[]{k, a19.get(j), a19.get(j + 1), a19.get(j + 2), a19.get(j + 3)});
                gtotal += Float.parseFloat(a19.get(j + 3).toString());
                j += 4;
                k++;
            }
        }
        TotalAmount.setText(Float.toString(gtotal));
        SubTotal.setText(Float.toString(gtotal));
        discount.setText("0");
    }//GEN-LAST:event_Table19ActionPerformed

    private void Table20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table20ActionPerformed
        DineInTableBackgroundColor.ChangeColor();
        lbl_TableName.setText(Table20.getText());
        Float gtotal = 0.0f;
        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        int j = 0;
        int k = 1;

        if (a20.size() > 0) {
            for (int i = 0; i < a20.size() / 4; i++) {
                model.addRow(new Object[]{k, a20.get(j), a20.get(j + 1), a20.get(j + 2), a20.get(j + 3)});
                gtotal += Float.parseFloat(a20.get(j + 3).toString());
                j += 4;
                k++;
            }
        }
        TotalAmount.setText(Float.toString(gtotal));
        SubTotal.setText(Float.toString(gtotal));
        discount.setText("0");
    }//GEN-LAST:event_Table20ActionPerformed

    private void txt_RemarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RemarksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RemarksActionPerformed

    private void KitchenOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KitchenOrderActionPerformed
        String takeid = null;

        int kotpageheight = 320;
        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
//        int dialogResult = JOptionPane.showConfirmDialog(null, "<html><font size='6' >Order Type : "+OrderType.getSelectedItem().toString()+" <br>No of Items : "+model.getRowCount()+"<br>Total : "+TotalAmount.getText()+"</font></html>","Print ",2,INFORMATION_MESSAGE);
        int dialogResult = JOptionPane.showConfirmDialog(null, "<html><span style='font-size:18px; font-weight:bold; font-family:sans-serif; ' > Order    : <span style= 'color:black;'>" + OrderType.getSelectedItem() + "</span> <br>Items&nbsp; : <span style= 'color:black;'>" + model.getRowCount() + "</span><br><br>Total&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  : <span style= 'color:black;'>" + TotalAmount.getText() + "</span><br>Discount  : <span style= 'color:black;'>" + discount.getText() + "%</span><br><br> SubTotal  : <span style= 'color:red;'>" + SubTotal.getText() + "</span> </span></html>", "Confirm the Order? ", 2, JOptionPane.PLAIN_MESSAGE);
        if (dialogResult == JOptionPane.YES_OPTION) {

            for (int a = 0; a < PurchasedItems.getModel().getRowCount(); a++) {

                kotpageheight += 35;
            }
            if (POS.Membership.isSelected()) {
                SaleType = "Member";
            } else {
                SaleType = "";
            }

//        Rectangle pagesize = new Rectangle(0,0,300,pageheight);
            DateFormat ReportTime = new SimpleDateFormat("hh:mm:ss aa");
            String ReportTimeString = ReportTime.format(new Date());
            DateFormat ReportDate = new SimpleDateFormat("yyyy-MM-dd");
            DateFormat ReportDatePrint = new SimpleDateFormat("dd-MM-yyyy");
            String ReportDateString = ReportDate.format(new Date());
            String ReportDateString2 = ReportDatePrint.format(new Date());

            java.util.Date dt = new java.util.Date();
            java.text.SimpleDateFormat sdf
                    = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String currentTime = sdf.format(dt);
            java.sql.Timestamp timestamp = new java.sql.Timestamp(dt.getTime());
            switch (OrderType.getSelectedIndex()) {
                //Take Away
                case 0:
                    AddSale.AddTakeAway();
                    break;
                //Dine In
                case 1:
                    AddSale.AddDineIn();
                    break;
                //Delivery
                case 2:
                    AddSale.AddDelivery();
                    break;
                default:
                    break;
            }

            if (Membership.isSelected()) {
                MembershipSale.AddMembershipSale();
            }

//             Document document = new Document(pagesize);
            Document document = new Document();
            try {
//                PdfWriter.getInstance(document, new FileOutputStream("TakeAway.pdf"));
                PdfWriter.getInstance(document, new FileOutputStream("KitchenOrder.pdf"));

                Rectangle two = new Rectangle(300, kotpageheight);
                document.setPageSize(two);
                document.setMargins(20, 20, 20, 20);
                document.open();

                String SaleId = "Select OrderId from Sale ORDER BY OrderId";
                pst = con.prepareStatement(SaleId);
                rs = pst.executeQuery();
                while (rs.next()) {
                    takeid = rs.getString("OrderId");

                }

//               //******************************Kitchen Order Token***********************************
                PdfPTable KHeadTable = new PdfPTable(1);
                KHeadTable.addCell(HeaderCell("Kitchen Order Token"));
                KHeadTable.addCell(FooterCell("-----------------------------", 14));
                KHeadTable.setWidthPercentage(100);
                document.add(KHeadTable);

                PdfPTable KDateTable = new PdfPTable(2);
                KDateTable.setWidthPercentage(100);
                KDateTable.addCell(DateCell("Invoice No:"));
                KDateTable.addCell(DateCellRight(takeid));
                if (Membership.isSelected()) {
                    KDateTable.addCell(DateCell("Cust Type:"));
                    KDateTable.addCell(DateCellRight("Member"));
                    KDateTable.addCell(DateCell("Card No:"));
                    KDateTable.addCell(DateCellRight(MemberCardNo.getSelectedItem().toString()));

                }
                KDateTable.addCell(DateCell("Order Type: "));
                KDateTable.addCell(DateCellRight(OrderType.getSelectedItem().toString()));
                KDateTable.addCell(DateCell("Date: "));
                KDateTable.addCell(DateCellRight(ReportDateString2));
                KDateTable.addCell(DateCell("Time: "));
                KDateTable.addCell(DateCellRight(ReportTimeString));
                KDateTable.addCell(DateCellBold("Token No: "));
                KDateTable.addCell(DateCellBoldRight(Integer.toString(TokenNo)));
                KDateTable.addCell(DateCellRight(" "));
                KDateTable.addCell(DateCellRight(" "));
                document.add(KDateTable);

                PdfPTable Kbody = new PdfPTable(4);
                Kbody.setHorizontalAlignment(Element.ALIGN_LEFT);
                Kbody.setWidthPercentage(100);
                Kbody.addCell(BodyCellBold("S#"));
                Kbody.addCell(BodyCellBold("Item"));
                Kbody.addCell(BodyCellBold("Rate"));
                Kbody.addCell(BodyCellBold("Qty"));
                Kbody.setWidths(new float[]{1, 6, 2.5f, 1.5f});

                for (int i = 0; i < PurchasedItems.getModel().getRowCount(); i++) {
                    int sn = (int) PurchasedItems.getModel().getValueAt(i, 0);
                    String name = (String) PurchasedItems.getModel().getValueAt(i, 1);
                    int rate = (int) PurchasedItems.getModel().getValueAt(i, 2);
                    String itemqty = (String) PurchasedItems.getModel().getValueAt(i, 3).toString();

                    Kbody.addCell(BodyCell(Integer.toString(sn)));
                    Kbody.addCell(BodyCell(name));
                    Kbody.addCell(BodyCell(Integer.toString(rate)));
                    Kbody.addCell(BodyCellCenter(itemqty));
                }
                document.add(Kbody);
                PdfPTable KFTable = new PdfPTable(1);
                KFTable.addCell(FooterCell("-----------------------------", 14));
                KFTable.setWidthPercentage(100);
                document.add(KFTable);
                PdfPTable BillLine = new PdfPTable(1);
                BillLine.addCell(FooterCell("------------------------------", 14));

                PdfPTable KitchenBill = new PdfPTable(2);
                BillLine.setWidthPercentage(100);
                KitchenBill.setWidthPercentage(100);

                KitchenBill.addCell(BillLeft("Sub Total"));
                KitchenBill.addCell(BillRight(TotalAmount.getText()));
                document.add(KitchenBill);
                document.add(BillLine);

                PdfPTable KFooterTable = new PdfPTable(2);
                KFooterTable.addCell(DateCell(" "));
                KFooterTable.addCell(DateCellRight(" "));
                KFooterTable.addCell(DateCell("Counter:"));
                KFooterTable.addCell(DateCellRight("POS"));
                KFooterTable.addCell(DateCell("User:"));
                KFooterTable.addCell(DateCellRight("Cashier"));
                KFooterTable.setWidthPercentage(100);
                document.add(KFooterTable);
//
                document.close();
                int rowCount = model.getRowCount();
                //Remove rows one by one from the end of the table
                for (int i = rowCount - 1; i >= 0; i--) {
                    model.removeRow(i);
                }
                Membership.setSelected(false);
                MemershipForm.setVisible(false);
                if (Membership.isSelected()) {
                    SAVEORDER.setEnabled(false);
                    KitchenOrder.setEnabled(false);
                    PrintOrder.setEnabled(false);
                }
                jPanel15.removeAll();
                jPanel15.repaint();
                jPanel15.revalidate();
                TotalAmount.setText("0.00");
                SubTotal.setText("0.00");
                discount.setText("0");
                TableForgroundColor.ChangeTableColor();
                //****************************************
                if (OrderType.getSelectedIndex() == 2) {
                    txt_Customer.setText("");
                    txt_Phone.setText("");
                    txt_DeliveryCharges.setText("0.0");
                    Area_Address.setText("");
                    txt_Remarks.setText("");
                }
                if (OrderType.getSelectedIndex() == 1) {
                    ServiceCharges.setText("0.0");

                }
                TokenNo++;

                try {
                    Desktop.getDesktop().open(new File("KitchenOrder.pdf"));
                } catch (IOException ex) {
                    Logger.getLogger(POS.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_KitchenOrderActionPerformed

    private void ServiceChargesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ServiceChargesKeyReleased
//            float SCharge = Float.parseFloat(ServiceCharges.getText());
//            float TA = Float.parseFloat(TotalAmount.getText());
//            Float gtotals = 0f;
//            gtotals = TA + SCharge;
//            TotalAmount.setText(Float.toString(gtotals));
//
//        ChargesCalculation();

    }//GEN-LAST:event_ServiceChargesKeyReleased

    private void OrderIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderIdActionPerformed

    private void DeliveryBoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeliveryBoyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeliveryBoyActionPerformed

    private void cmb_MembersPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_MembersPopupMenuWillBecomeInvisible
        if (cmb_Members.getSelectedIndex() != 0) {
            SAVEORDER.setEnabled(true);
            KitchenOrder.setEnabled(true);
            PrintOrder.setEnabled(true);
        }
        DateFormat ReportDate = new SimpleDateFormat("dd/MM/yyyy");
        String ReportDateString = ReportDate.format(new Date());
        //String input_date="01/08/2012";
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        Date dt1 = null;
        try {
            dt1 = format1.parse(ReportDateString);
        } catch (ParseException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
        DateFormat format2 = new SimpleDateFormat("EEEE");
        String finalDay = format2.format(dt1);

        String sql = "Select * From Members where Name = '" + cmb_Members.getSelectedItem() + "' ORDER BY Name";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String contact = rs.getString("Contact");
                String address = rs.getString("Address");
                String CardNo = rs.getString("CardNo");
                MemberContact.setText(contact);
                MemberAddress.setText(address);
                MemberCardNo.setSelectedItem(CardNo);
            }
            //Free Roll Deal
            ImageIcon imgThisImg = new ImageIcon("src\\Images\\Checkmark_30px.png");
            ImageIcon imgThisRed = new ImageIcon("src\\Images\\Delete_30px.png");
            if (Membership.isSelected() && finalDay.equalsIgnoreCase("Monday") || finalDay.equalsIgnoreCase("Tuesday") || finalDay.equalsIgnoreCase("Wednesday") || finalDay.equalsIgnoreCase("Thursday")) {
                FreeRoll.setIcon(imgThisImg);
                if (OrderType.getSelectedIndex() == 1) {
                    if (cmb_Members.getSelectedIndex() != 0) {
                        jButton60.setEnabled(true);
                    }
                } else {
                    jButton60.setEnabled(false);

                }
            } else {
                FreeRoll.setIcon(imgThisRed);
            }
            //1st Visit Bonus
            String getId = "Select * from Members where Name = '" + cmb_Members.getSelectedItem() + "'";
            int mid = 0;
            int orderid = 0;
            String orderdate = "";
            pst = con.prepareStatement(getId);
            rs = pst.executeQuery();
            while (rs.next()) {
                mid = rs.getInt("M_Id");
            }
            String checkVisit = "Select * from Membership where M_Id = '" + mid + "'";
            pst = con.prepareStatement(checkVisit);
            rs = pst.executeQuery();
            while (rs.next()) {
                orderid = rs.getInt("OrderId");
            }
            //checkmark
            if (orderid == 0) {
                firstVisit.setIcon(imgThisImg);
                if (OrderType.getSelectedIndex() == 0 || OrderType.getSelectedIndex() == 1) {
                    if (cmb_Members.getSelectedIndex() != 0) {
                        jButton59.setEnabled(true);
                    }
                } else {
                    jButton59.setEnabled(false);

                }

            } else {
                firstVisit.setIcon(imgThisRed);
            }
            String checkLastVisit = "Select * from Sale where OrderId = '" + orderid + "'";
            pst = con.prepareStatement(checkLastVisit);
            rs = pst.executeQuery();
            while (rs.next()) {
                orderdate = rs.getString("SaleDate");
            }
            LastVisitDate.setText(orderdate);
            if (cmb_Members.getSelectedIndex() == 0) {
                MemberContact.setText("Nil");
                MemberAddress.setText("Nil");
                MemberCardNo.setSelectedIndex(0);
                LastVisitDate.setText("Nil");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + " Error in Selecting members details!");
        }
    }//GEN-LAST:event_cmb_MembersPopupMenuWillBecomeInvisible

    private void SamAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SamAddressActionPerformed
        if (OrderType.getSelectedIndex() == 2) {
            txt_Customer.setText("");
            txt_Phone.setText("");
            txt_DeliveryCharges.setText("0.0");
            Area_Address.setText("");
            txt_Remarks.setText("");
        }
        txt_Customer.setText(cmb_Members.getSelectedItem().toString());
        txt_Phone.setText(MemberContact.getText());
        Area_Address.setText(MemberAddress.getText());

    }//GEN-LAST:event_SamAddressActionPerformed

    private void cmb_MembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_MembersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_MembersActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();

        model.addRow(new Object[]{PurchasedItems.getRowCount() + 1, "Regular Pizza (Bonus)", 150, 1, (150)});
//        jButton59.setEnabled(false);

        Float GTotals = +150 + Float.parseFloat(TotalAmount.getText());
        TotalAmount.setText(Float.toString(GTotals));
        if (OrderType.getSelectedIndex() == 1) {
            DineInOrderItemsAdd.AddDineInItems();
            //Changing table for color;
            TableForgroundColor.ChangeTableColor();
        }
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
        model.addRow(new Object[]{PurchasedItems.getRowCount() + 1, "Chicken Roll (Free)", 0, 1, (0)});
//        jButton60.setEnabled(false);
        DineInOrderItemsAdd.AddDineInItems();
        //Changing table for color;
        TableForgroundColor.ChangeTableColor();

    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();

        model.addRow(new Object[]{PurchasedItems.getRowCount() + 1, "Big Offer (Large Pizza Free)", 270, 1, (270)});
//        jButton61.setEnabled(false);
        Float GTotals = +270 + Float.parseFloat(TotalAmount.getText());
        TotalAmount.setText(Float.toString(GTotals));
        if (OrderType.getSelectedIndex() == 1) {
            DineInOrderItemsAdd.AddDineInItems();
            //Changing table for color;
            TableForgroundColor.ChangeTableColor();
        }
    }//GEN-LAST:event_jButton61ActionPerformed

    private void PDIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDIActionPerformed

        int kotpageheight = 200;

        DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
        if (OrderType.getSelectedIndex() == 1) {
//        int dialogResult = JOptionPane.showConfirmDialog(null, "<html><font size='6' >Order Type : "+OrderType.getSelectedItem().toString()+" <br>No of Items : "+model.getRowCount()+"<br>Total : "+TotalAmount.getText()+"</font></html>","Print ",2,INFORMATION_MESSAGE);
//      int dialogResult = JOptionPane.showConfirmDialog(null, "<html><span style='font-size:18px; font-weight:bold; font-family:sans-serif; ' > Order    : <span style= 'color:black;'>"+OrderType.getSelectedItem()+"</span> <br>Items&nbsp; : <span style= 'color:black;'>"+model.getRowCount()+"</span><br><br>Total&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  : <span style= 'color:black;'>"+TotalAmount.getText()+"</span><br>Discount  : <span style= 'color:black;'>"+discount.getText()+"%</span><br><br> SubTotal  : <span style= 'color:red;'>"+SubTotal.getText()+"</span> </span></html>","Do you want to print Dining Items only? ",2,JOptionPane.PLAIN_MESSAGE);
//       if(dialogResult == JOptionPane.YES_OPTION)
            if (true) {

                for (int a = 0; a < PurchasedItems.getModel().getRowCount(); a++) {
                    if (IS.isSelected()) {
                        if (PurchasedItems.isRowSelected(a)) {
                            kotpageheight += 35;
                        }
                    } else {
                        kotpageheight += 35;
                    }

                }
                if (POS.Membership.isSelected()) {
                    SaleType = "Member";
                } else {
                    SaleType = "";
                }

//        Rectangle pagesize = new Rectangle(0,0,300,pageheight);
                DateFormat ReportTime = new SimpleDateFormat("hh:mm:ss aa");
                String ReportTimeString = ReportTime.format(new Date());
                DateFormat ReportDate = new SimpleDateFormat("yyyy-MM-dd");
                DateFormat ReportDatePrint = new SimpleDateFormat("dd-MM-yyyy");
                String ReportDateString = ReportDate.format(new Date());
                String ReportDateString2 = ReportDatePrint.format(new Date());

                java.util.Date dt = new java.util.Date();
                java.text.SimpleDateFormat sdf
                        = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String currentTime = sdf.format(dt);
                java.sql.Timestamp timestamp = new java.sql.Timestamp(dt.getTime());

//             Document document = new Document(pagesize);
                Document document = new Document();
                try {
//                PdfWriter.getInstance(document, new FileOutputStream("TakeAway.pdf"));
                    PdfWriter.getInstance(document, new FileOutputStream("KitchenOrderPrint.pdf"));

                    Rectangle two = new Rectangle(300, kotpageheight);
                    document.setPageSize(two);
                    document.setMargins(20, 20, 20, 20);
                    document.open();

//               //******************************Kitchen Order Token***********************************
                    PdfPTable KHeadTable = new PdfPTable(1);
                    KHeadTable.addCell(HeaderCell("Kitchen Order Print"));
                    KHeadTable.addCell(FooterCell("-----------------------------", 14));
                    KHeadTable.setWidthPercentage(100);
                    document.add(KHeadTable);

                    PdfPTable KDateTable = new PdfPTable(2);
                    KDateTable.setWidthPercentage(100);
                    KDateTable.addCell(DateCell("Table No:"));
                    KDateTable.addCell(DateCellRight(lbl_TableName.getText()));
//                if(Membership.isSelected()){
//                KDateTable.addCell(DateCell("Cust Type:"));
//                KDateTable.addCell(DateCellRight("Member"));
//                KDateTable.addCell(DateCell("Card No:"));
//                KDateTable.addCell(DateCellRight(MemberCardNo.getSelectedItem().toString()));
//
//                }
                    KDateTable.addCell(DateCell("Order Type: "));
                    KDateTable.addCell(DateCellRight(OrderType.getSelectedItem().toString()));
                    KDateTable.addCell(DateCell("Date: "));
                    KDateTable.addCell(DateCellRight(ReportDateString2));
                    KDateTable.addCell(DateCell("Time: "));
                    KDateTable.addCell(DateCellRight(ReportTimeString));
                    KDateTable.addCell(DateCellRight(" "));
                    KDateTable.addCell(DateCellRight(" "));
                    document.add(KDateTable);

                    PdfPTable Kbody = new PdfPTable(4);
                    Kbody.setHorizontalAlignment(Element.ALIGN_LEFT);
                    Kbody.setWidthPercentage(100);
                    Kbody.addCell(BodyCellBold("S#"));
                    Kbody.addCell(BodyCellBold("Item"));
                    Kbody.addCell(BodyCellBold("Rate"));
                    Kbody.addCell(BodyCellBold("Qty"));
                    Kbody.setWidths(new float[]{1, 6, 2.5f, 1.5f});

                    for (int i = 0; i < PurchasedItems.getModel().getRowCount(); i++) {
                        if (IS.isSelected()) {
                            if (PurchasedItems.isRowSelected(i)) {
                                int sn = (int) PurchasedItems.getModel().getValueAt(i, 0);
                                String name = (String) PurchasedItems.getModel().getValueAt(i, 1);
                                int rate = (int) PurchasedItems.getModel().getValueAt(i, 2);
                                String itemqty = (String) PurchasedItems.getModel().getValueAt(i, 3).toString();

                                Kbody.addCell(BodyCell(Integer.toString(sn)));
                                Kbody.addCell(BodyCell(name));
                                Kbody.addCell(BodyCell(Integer.toString(rate)));
                                Kbody.addCell(BodyCellCenter(itemqty));
//                            IS.setSelected(false);
//                            PurchasedItems.clearSelection();
                            }
                        } else {
                            int sn = (int) PurchasedItems.getModel().getValueAt(i, 0);
                            String name = (String) PurchasedItems.getModel().getValueAt(i, 1);
                            int rate = (int) PurchasedItems.getModel().getValueAt(i, 2);
                            String itemqty = (String) PurchasedItems.getModel().getValueAt(i, 3).toString();

                            Kbody.addCell(BodyCell(Integer.toString(sn)));
                            Kbody.addCell(BodyCell(name));
                            Kbody.addCell(BodyCell(Integer.toString(rate)));
                            Kbody.addCell(BodyCellCenter(itemqty));
                        }
                    }
                    document.add(Kbody);
                    PdfPTable KFTable = new PdfPTable(1);
                    KFTable.addCell(FooterCell("-----------------------------", 14));
                    KFTable.setWidthPercentage(100);
                    document.add(KFTable);
                    PdfPTable BillLine = new PdfPTable(1);
                    BillLine.addCell(FooterCell("------------------------------", 14));

                    PdfPTable KitchenBill = new PdfPTable(2);
                    BillLine.setWidthPercentage(100);
                    KitchenBill.setWidthPercentage(100);

                    document.close();

                    try {
                        Desktop.getDesktop().open(new File("KitchenOrderPrint.pdf"));
                    } catch (IOException ex) {
                        Logger.getLogger(POS.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } catch (FileNotFoundException | DocumentException e) {
                    e.printStackTrace();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "You can print items only for Dining!");
        }
    }//GEN-LAST:event_PDIActionPerformed

    private void cmb_MembersKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmb_MembersKeyReleased
        AutoCompletion.enable(cmb_Members);
//AutoCompletion autoCompletion = new AutoCompletion(cmb_Members);
    }//GEN-LAST:event_cmb_MembersKeyReleased

    private void MemberCardNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberCardNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MemberCardNoActionPerformed

    private void MemberCardNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MemberCardNoKeyReleased
        AutoCompletion.enable(MemberCardNo);
    }//GEN-LAST:event_MemberCardNoKeyReleased

    private void MemberCardNoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_MemberCardNoPopupMenuWillBecomeInvisible
        if (MemberCardNo.getSelectedIndex() != 0) {
            SAVEORDER.setEnabled(true);
            KitchenOrder.setEnabled(true);
            PrintOrder.setEnabled(true);
        }
        DateFormat ReportDate = new SimpleDateFormat("dd/MM/yyyy");
        String ReportDateString = ReportDate.format(new Date());
        //String input_date="01/08/2012";
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        Date dt1 = null;
        try {
            dt1 = format1.parse(ReportDateString);
        } catch (ParseException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
        DateFormat format2 = new SimpleDateFormat("EEEE");
        String finalDay = format2.format(dt1);

        String sql = "Select * From Members where CardNo = '" + MemberCardNo.getSelectedItem() + "' ORDER BY CardNo";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String name = rs.getString("Name");
                String contact = rs.getString("Contact");
                String address = rs.getString("Address");
//               String CardNo = rs.getString("CardNo");
                MemberContact.setText(contact);
                MemberAddress.setText(address);
//               MemberCardNo.setSelectedItem(CardNo);
                cmb_Members.setSelectedItem(name);
            }
            //Free Roll Deal
            ImageIcon imgThisImg = new ImageIcon("src\\Images\\Checkmark_30px.png");
            ImageIcon imgThisRed = new ImageIcon("src\\Images\\Delete_30px.png");
            if (Membership.isSelected() && finalDay.equalsIgnoreCase("Monday") || finalDay.equalsIgnoreCase("Tuesday") || finalDay.equalsIgnoreCase("Wednesday") || finalDay.equalsIgnoreCase("Thursday")) {
                FreeRoll.setIcon(imgThisImg);
                if (OrderType.getSelectedIndex() == 1) {
                    if (MemberCardNo.getSelectedIndex() != 0) {
                        jButton60.setEnabled(true);
                    }
                } else {
                    jButton60.setEnabled(false);

                }
            } else {
                FreeRoll.setIcon(imgThisRed);
            }
            //1st Visit Bonus
            String getId = "Select * from Members where CardNo = '" + MemberCardNo.getSelectedItem() + "'";
            int mid = 0;
            int orderid = 0;
            String orderdate = "";
            pst = con.prepareStatement(getId);
            rs = pst.executeQuery();
            while (rs.next()) {
                mid = rs.getInt("M_Id");
            }
            String checkVisit = "Select * from Membership where M_Id = '" + mid + "'";
            pst = con.prepareStatement(checkVisit);
            rs = pst.executeQuery();
            while (rs.next()) {
                orderid = rs.getInt("OrderId");
            }
            //checkmark
            if (orderid == 0) {
                firstVisit.setIcon(imgThisImg);
                if (OrderType.getSelectedIndex() == 0 || OrderType.getSelectedIndex() == 1) {
                    if (MemberCardNo.getSelectedIndex() != 0) {
                        jButton59.setEnabled(true);
                    }
                } else {
                    jButton59.setEnabled(false);

                }

            } else {
                firstVisit.setIcon(imgThisRed);
            }
            String checkLastVisit = "Select * from Sale where OrderId = '" + orderid + "'";
            pst = con.prepareStatement(checkLastVisit);
            rs = pst.executeQuery();
            while (rs.next()) {
                orderdate = rs.getString("SaleDate");
            }
            LastVisitDate.setText(orderdate);
            if (MemberCardNo.getSelectedIndex() == 0) {
                MemberContact.setText("Nil");
                MemberAddress.setText("Nil");
//               MemberCardNo.setSelectedIndex(0);
                cmb_Members.setSelectedIndex(0);
                LastVisitDate.setText("Nil");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + " Error in Selecting members details!");
        }
    }//GEN-LAST:event_MemberCardNoPopupMenuWillBecomeInvisible

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed

        switch (lbl_TableName.getText()) {
            case "A1":
            case "a1":
                ChargesList.add(0, ServiceCharges.getText());
                break;
            case "A2":
            case "a2":
                ChargesList.add(1, ServiceCharges.getText());
                break;
            case "A3":
            case "a3":
                ChargesList.add(2, ServiceCharges.getText());
                break;

        }
    }//GEN-LAST:event_jButton64ActionPerformed

    private void MembershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MembershipActionPerformed

        //            final JComboBox comboBox = cmb_Members;
        //AutoCompletion ac = new AutoCompletion();
        SAVEORDER.setEnabled(false);
        KitchenOrder.setEnabled(false);
        PrintOrder.setEnabled(false);

        jPanel15.removeAll();
        jPanel15.repaint();
        jPanel15.validate();
        if (OrderType.getSelectedIndex() == 2) {
            txt_Customer.setText("");
            txt_Phone.setText("");
            txt_DeliveryCharges.setText("0.0");
            Area_Address.setText("");
            txt_Remarks.setText("");
        }
        if (Membership.isSelected()) {
            cmb_Members.removeAllItems();
            MemberCardNo.removeAllItems();
            MemershipForm.setVisible(true);
            cmb_Members.addItem("Select Member");
            MemberCardNo.addItem("Select CardNo");
            showMembers();
        } else {
            cmb_Members.removeAllItems();
            MemberCardNo.removeAllItems();
            cmb_Members.addItem("Select Member");
            MemberCardNo.addItem("Select CardNo");
            MemershipForm.setVisible(false);
        }
        //        AutoCompletion.enable(cmb_Members);
        //AutoCompletion autoCompletion = new AutoCompletion(cmb_Members);

    }//GEN-LAST:event_MembershipActionPerformed

    private void discountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discountActionPerformed

    private void discountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_discountKeyReleased

        discountCalculation();

    }//GEN-LAST:event_discountKeyReleased

    private void SubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubTotalActionPerformed

    private void SubTotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SubTotalKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_SubTotalKeyReleased

    private void cmb_WaitersPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_WaitersPopupMenuWillBecomeVisible
        showWaiters();
    }//GEN-LAST:event_cmb_WaitersPopupMenuWillBecomeVisible

    private void discountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_discountKeyPressed

    }//GEN-LAST:event_discountKeyPressed

    private void ISMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ISMouseClicked
        if (!IS.isSelected()) {
            PurchasedItems.clearSelection();
        }
    }//GEN-LAST:event_ISMouseClicked

    private void onlyCustomerPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onlyCustomerPrintMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_onlyCustomerPrintMouseClicked

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
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new POS().setVisible(true);
            }
        });
    }

    public float discountCalculation() {
//        discount.getDocument().addDocumentListener(new DocumentListener(){
//        public void changedUpdate(Document e)
//        {
//            discountCalculation();
//        }
//        });

        int dis = Integer.parseInt(discount.getText());

        if (dis > 100) {
            JOptionPane.showMessageDialog(null, "Please enter the discount between 1 to 100");
            dis = 0;
        }

        discount.setText(Integer.toString(dis));
        //Calculation

        float t = Float.parseFloat(TotalAmount.getText()); //total

        float discountAmount = (t / 100) * dis; //discount

        float subTotalAmount = t - discountAmount; //calculation

        SubTotal.setText(Float.toString(Math.round(subTotalAmount)));//final
        return subTotalAmount;//for using in another method
    }

    public float ChargesCalculation() {
        Float chr = Float.parseFloat(ServiceCharges.getText());//fetching from charges
        if (ServiceCharges.getText().equals("")) {
//            ServiceCharges.setText("0");
            chr = 0.0F;
        }
//      ServiceCharges.setText(Float.toString(chr));

//      float st = Float.parseFloat(SubTotal.getText()); //Subtotal
        float finalTotal = chr + discountCalculation();
        SubTotal.setText(Float.toString(Math.round(finalTotal)));//final
        return chr;
    }

    //*****************************************************************************
    //Silent Printing
//    char[] initEP = new char[]{0x1b, '@'};
//    char[] cutP = new char[]{0x1d,'V',1};
//    String Ptxt=  new String(initEP)+ " text data \n \n \n"+ new String(cutP);
//
//        InputStream pis = new ByteArrayInputStream(bFile);
//        Doc d = new SimpleDoc(pis, flavor, null);
//
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JTextArea Area_Address;
    protected static javax.swing.JToggleButton Beverages;
    private javax.swing.JButton CancelItem;
    private javax.swing.JButton CancelOrder;
    private javax.swing.JLabel DateTime;
    protected static javax.swing.JToggleButton Deals;
    protected static javax.swing.JComboBox<String> DeliveryBoy;
    private javax.swing.JPanel DeliveryPanel3;
    protected static javax.swing.JLabel FreeRoll;
    private javax.swing.JCheckBox IS;
    private javax.swing.JInternalFrame InternalDelivery;
    private javax.swing.JInternalFrame InternalDineIn;
    protected static javax.swing.JButton KitchenOrder;
    protected static javax.swing.JLabel LastVisitDate;
    private javax.swing.JTextPane MemberAddress;
    public static javax.swing.JComboBox<String> MemberCardNo;
    private javax.swing.JLabel MemberContact;
    protected static javax.swing.JCheckBox Membership;
    public static javax.swing.JInternalFrame MemershipForm;
    private javax.swing.JTextField OrderId;
    public static javax.swing.JComboBox<String> OrderType;
    protected static javax.swing.JButton PDI;
    protected static javax.swing.JButton PrintOrder;
    public static javax.swing.JTable PurchasedItems;
    protected static javax.swing.JButton SAVEORDER;
    private javax.swing.JButton SamAddress;
    protected static javax.swing.JTextField ServiceCharges;
    protected static javax.swing.JToggleButton SmallPizza;
    public static javax.swing.JTextField SubTotal;
    protected static javax.swing.JToggleButton Table1;
    protected static javax.swing.JToggleButton Table10;
    protected static javax.swing.JToggleButton Table11;
    protected static javax.swing.JToggleButton Table12;
    protected static javax.swing.JToggleButton Table13;
    protected static javax.swing.JToggleButton Table14;
    protected static javax.swing.JToggleButton Table15;
    protected static javax.swing.JToggleButton Table16;
    protected static javax.swing.JToggleButton Table17;
    protected static javax.swing.JToggleButton Table18;
    protected static javax.swing.JToggleButton Table19;
    protected static javax.swing.JToggleButton Table2;
    protected static javax.swing.JToggleButton Table20;
    protected static javax.swing.JToggleButton Table3;
    protected static javax.swing.JToggleButton Table4;
    protected static javax.swing.JToggleButton Table5;
    protected static javax.swing.JToggleButton Table6;
    protected static javax.swing.JToggleButton Table7;
    protected static javax.swing.JToggleButton Table8;
    protected static javax.swing.JToggleButton Table9;
    private javax.swing.JPanel TablesPane;
    public static javax.swing.JTextField TotalAmount;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    protected static javax.swing.JComboBox<String> cmb_Members;
    protected static javax.swing.JComboBox<String> cmb_Waiters;
    public static javax.swing.JTextField discount;
    protected static javax.swing.JLabel firstVisit;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton64;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    protected static javax.swing.JToggleButton jToggleButton1;
    protected static javax.swing.JToggleButton jToggleButton10;
    protected static javax.swing.JToggleButton jToggleButton11;
    protected static javax.swing.JToggleButton jToggleButton12;
    protected static javax.swing.JToggleButton jToggleButton14;
    protected static javax.swing.JToggleButton jToggleButton15;
    protected static javax.swing.JToggleButton jToggleButton16;
    protected static javax.swing.JToggleButton jToggleButton17;
    protected static javax.swing.JToggleButton jToggleButton18;
    protected static javax.swing.JToggleButton jToggleButton2;
    protected static javax.swing.JToggleButton jToggleButton20;
    protected static javax.swing.JToggleButton jToggleButton21;
    protected static javax.swing.JToggleButton jToggleButton7;
    protected static javax.swing.JToggleButton jToggleButton8;
    protected static javax.swing.JToggleButton jToggleButton9;
    private javax.swing.JLabel lbl_Address3;
    private javax.swing.JLabel lbl_Address4;
    private javax.swing.JLabel lbl_CashierPos15;
    private javax.swing.JLabel lbl_CashierPos16;
    private javax.swing.JLabel lbl_Customer3;
    private javax.swing.JLabel lbl_DeliveryCharges3;
    private javax.swing.JLabel lbl_DeliveryCharges4;
    private javax.swing.JLabel lbl_OrderType;
    private javax.swing.JLabel lbl_Phone3;
    protected static javax.swing.JLabel lbl_TableName;
    private javax.swing.JCheckBox onlyCustomerPrint;
    protected static javax.swing.JTextField txt_Customer;
    protected static javax.swing.JTextField txt_DeliveryCharges;
    protected static javax.swing.JTextField txt_Phone;
    protected static javax.swing.JTextField txt_Remarks;
    // End of variables declaration//GEN-END:variables
}
