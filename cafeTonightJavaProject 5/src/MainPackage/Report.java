package MainPackage;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.FontSelector;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.lowagie.text.Element;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Report extends javax.swing.JFrame {

    PreparedStatement pst;
    Connection con;
    ResultSet rs;
    Float t = 0f;
    Float di = 0f;
    Float d = 0f;
    Float tdid = 0f;

    public Report() throws SQLException {
        initComponents();
        con = DBConnect.ConnectDB();
//        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/Tailor.png")));
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        showChart();
        //Yesterday
        TakeAwayYesterday.setText("Rs " + takeAwayYesterdaySale("TakeAway"));
        DineInYesterday.setText("Rs " + ShowYesterdaySale("DineIn", "diningdetails"));
        DeliveryYesterday.setText("Rs " + ShowYesterdaySale("Home Delivery", "deliverydetails"));

        //Today
        TakeAwayToday.setText("Rs " + takeAwayTodaySale("TakeAway"));
        DineInToday.setText("Rs " + ShowTodaySale("DineIn", "diningdetails"));
        DeliveryToday.setText("Rs " + ShowTodaySale("Home Delivery", "deliverydetails"));
//
        //Weekly
        TakeAwayWeekly.setText("Rs " + takeAwayWeeklySale("TakeAway"));
        DineInWeekly.setText("Rs " + ShowWeeklySale("DineIn", "diningdetails"));
        DeliveryWeekly.setText("Rs " + ShowWeeklySale("Home Delivery", "deliverydetails"));
//
        //Monthly
        TakeAwayMonthly.setText("Rs " + takeAwayMonthlySale("TakeAway"));
        DineInMonthly.setText("Rs " + ShowMonthlySale("DineIn", "diningdetails"));
        DeliveryMonthly.setText("Rs " + ShowMonthlySale("Home Delivery", "deliverydetails"));
//
        //Total Sale
        TakeAwayTotalSale.setText("Rs " + takeAwayTotalSale("TakeAway"));
        TakeAwayTotalSale1.setText("Rs " + diningTotalSale("DineIn"));
        TakeAwayTotalSale2.setText("Rs " + deliveryTotalSale("Home Delivery"));
//
//
        ShowAll.setText("Rs " + ShowAllSales());
//
        //today orders
        TakeAwayTodayOrder.setText(ShowTodayOrders("TakeAway"));
        TotalOrders.setText(ShowAllOrders("TakeAway"));

        DineInTodayOrder.setText(ShowTodayOrders("DineIn"));
        DineInAllOrders.setText(ShowAllOrders("DineIn"));

        DeliverTodayOrders.setText(ShowTodayOrders("Home Delivery"));
        DeliveryTotalOrders.setText(ShowAllOrders("Home Delivery"));
//

    }

    public static PdfPCell ReportCellBold(String text, int txtSize) {
        FontSelector fs = new FontSelector();
        Font font = FontFactory.getFont(FontFactory.COURIER_BOLD, txtSize);
//		font.setColor(BaseColor.BLACK);
        fs.addFont(font);
        Phrase phrase = fs.process(text);
        PdfPCell cell = new PdfPCell(phrase);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setPaddingBottom(5.5f);
//                cell.setBorder(1);
//                cell.setBorderWidth(0.5f);
        return cell;
    }

    public static PdfPCell ReportCell(String text, int txtSize) {
        FontSelector fs = new FontSelector();
        Font font = FontFactory.getFont(FontFactory.COURIER, txtSize);
//		font.setColor(BaseColor.BLACK);
        fs.addFont(font);
        Phrase phrase = fs.process(text);
        PdfPCell cell = new PdfPCell(phrase);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setPaddingBottom(5.5f);
//                cell.setBorder(1);
//                cell.setBorderWidth(0.5f);
        return cell;
    }

    public static PdfPCell ReportCellColspan(String text, int txtSize, int col) {
        FontSelector fs = new FontSelector();
        Font font = FontFactory.getFont(FontFactory.COURIER, txtSize);
//		font.setColor(BaseColor.BLACK);
        fs.addFont(font);
        Phrase phrase = fs.process(text);
        PdfPCell cell = new PdfPCell(phrase);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setPaddingBottom(5.5f);
//                cell.setBorder(1);
//                cell.setBorderWidth(0.5f);
        cell.setColspan(col);
        return cell;
    }

    //********************************************************************
    //********************************************************************
    public String takeAwayTodaySale(String str) throws SQLException {
        Float GTotal = 0f;
        String sql = "SELECT * FROM `Sale` WHERE SaleCategory = '" + str + "' AND DATE(`SaleDate`) = CURDATE()";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
            Float tot = rs.getFloat("Subtotal");
            GTotal += tot;
        }
        return Float.toString(GTotal);
    }

    public String takeAwayYesterdaySale(String str) throws SQLException {
        Float GTotal = 0f;
        String sql = "SELECT * FROM `Sale` WHERE SaleCategory = '" + str + "' AND DATE(`SaleDate`) = DATE(NOW() - INTERVAL 1 DAY) ";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
            Float tot = rs.getFloat("Subtotal");
            GTotal += tot;
        }
        return Float.toString(GTotal);

    }

    public String takeAwayWeeklySale(String str) throws SQLException {
        Float GTotal = 0f;
        String sql = "SELECT * FROM `Sale` d WHERE SaleCategory = '" + str + "' AND  `SaleDate` BETWEEN SUBDATE(CURDATE(), 7) AND CURDATE() ";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
            Float tot = rs.getFloat("Subtotal");
            GTotal += tot;
        }
        return Float.toString(GTotal);

    }

    public String takeAwayMonthlySale(String str) throws SQLException {
        Float GTotal = 0f;
        String sql = "SELECT * FROM `Sale` WHERE SaleCategory = '" + str + "' AND  `SaleDate` BETWEEN SUBDATE(CURDATE(), 30) AND CURDATE() ";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
            Float tot = rs.getFloat("Subtotal");

            GTotal += tot;
        }
        return Float.toString(GTotal);

    }

    //********************************************************************
    public String ShowTodaySale(String str, String tab) throws SQLException {
        Float GTotal = 0f;
        String sql = "SELECT * FROM `Sale` s, " + tab + " d WHERE SaleCategory = '" + str + "' AND DATE(`SaleDate`) = CURDATE() AND s.OrderId = d.OrderId";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
            Float tot = rs.getFloat("Subtotal");
            Float ch = rs.getFloat("Charges");
            GTotal += tot + ch;
        }
        return Float.toString(GTotal);

    }

    public String ShowYesterdaySale(String str, String tab) throws SQLException {
        Float GTotal = 0f;
        String sql = "SELECT * FROM `Sale`s," + tab + " d WHERE SaleCategory = '" + str + "' AND DATE(`SaleDate`) = DATE(NOW() - INTERVAL 1 DAY) AND s.OrderId = d.OrderId";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
            Float tot = rs.getFloat("Subtotal");
            Float ch = rs.getFloat("Charges");
            GTotal += tot + ch;
        }
        return Float.toString(GTotal);

    }

    public String ShowWeeklySale(String str, String tab) throws SQLException {
        Float GTotal = 0f;
        String sql = "SELECT * FROM `Sale` s," + tab + " d WHERE SaleCategory = '" + str + "' AND  `SaleDate` BETWEEN SUBDATE(CURDATE(), 7) AND CURDATE() AND s.OrderId = d.OrderId";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
            Float tot = rs.getFloat("Subtotal");
            Float ch = rs.getFloat("Charges");
            GTotal += tot + ch;
        }
        return Float.toString(GTotal);

    }

    public String ShowMonthlySale(String str, String tab) throws SQLException {
        Float GTotal = 0f;
        String sql = "SELECT * FROM `Sale` s," + tab + " d WHERE SaleCategory = '" + str + "' AND  `SaleDate` BETWEEN SUBDATE(CURDATE(), 30) AND CURDATE() AND s.OrderId = d.OrderId";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
            Float tot = rs.getFloat("Subtotal");
            Float ch = rs.getFloat("Charges");
            GTotal += tot + ch;
        }
        return Float.toString(GTotal);

    }
    //********************************************************************

    public String ShowTakeAwayTwoDates() throws SQLException {
        Float GTotal = 0f;
        java.util.Date val1 = StartingDate.getDate();
        java.sql.Date sqlval1 = new java.sql.Date(val1.getTime());
        java.util.Date val2 = EndingDate.getDate();
        java.sql.Date sqlval2 = new java.sql.Date(val2.getTime());
        String sql2 = "SELECT * FROM `Sale` WHERE SaleCategory = 'TakeAway' AND  `SaleDate` >= ? AND `SaleDate` <= ? ";
        pst = con.prepareStatement(sql2);
        pst.setDate(1, sqlval1);
        pst.setDate(2, sqlval2);
        rs = pst.executeQuery();
        while (rs.next()) {
            Float tot = rs.getFloat("Subtotal");
            GTotal += tot;
        }
        return Float.toString(GTotal);

    }

    public String ShowDineInTwoDates() throws SQLException {
        Float GTotal = 0f;
        java.util.Date val1 = StartingDateDine.getDate();
        java.sql.Date sqlval1 = new java.sql.Date(val1.getTime());
        java.util.Date val2 = EndingDateDine.getDate();
        java.sql.Date sqlval2 = new java.sql.Date(val2.getTime());
        String sql2 = "SELECT * FROM `Sale` s,diningdetails d WHERE SaleCategory = 'DineIn' AND  `SaleDate` >= ? AND `SaleDate` <= ? AND s.OrderId = d.OrderId";
        pst = con.prepareStatement(sql2);
        pst.setDate(1, sqlval1);
        pst.setDate(2, sqlval2);
        rs = pst.executeQuery();
        while (rs.next()) {
            Float tot = rs.getFloat("Subtotal");
            Float ch = rs.getFloat("Charges");
            GTotal += tot + ch;
        }
        return Float.toString(GTotal);

    }

    public String ShowDeliveryTwoDates() throws SQLException {
        Float GTotal = 0f;
        java.util.Date val1 = StartingDateD.getDate();
        java.sql.Date sqlval1 = new java.sql.Date(val1.getTime());
        java.util.Date val2 = EndingDateD.getDate();
        java.sql.Date sqlval2 = new java.sql.Date(val2.getTime());
        String sql2 = "SELECT * FROM `Sale` s,deliverydetails d WHERE SaleCategory = 'Home Delivery' AND  `SaleDate` >= ? AND `SaleDate` <= ? AND s.OrderId = d.OrderId";
        pst = con.prepareStatement(sql2);
        pst.setDate(1, sqlval1);
        pst.setDate(2, sqlval2);
        rs = pst.executeQuery();
        while (rs.next()) {
            Float tot = rs.getFloat("Subtotal");
            Float ch = rs.getFloat("Charges");
            GTotal += tot + ch;

        }
        return Float.toString(GTotal);
    }

//**************************************************************************
    public String takeAwayTotalTwoDates() throws SQLException {
        Float GTotal = 0f;
        java.util.Date val1 = StartingDateD1.getDate();
        java.sql.Date sqlval1 = new java.sql.Date(val1.getTime());
        java.util.Date val2 = EndingDateD1.getDate();
        java.sql.Date sqlval2 = new java.sql.Date(val2.getTime());
        String sql = "SELECT * FROM `Sale` WHERE `SaleDate` >= ? AND `SaleDate` <= ? AND SaleCategory = 'TakeAway' ";
//             String sql2 = "SELECT * FROM `DineIn` WHERE `SaleDate` >= ? AND `SaleDate` <= ? ";
        //String sql3 = "SELECT * FROM `Delivery` WHERE `SaleDate` >= ? AND `SaleDate` <= ? ";
        pst = con.prepareStatement(sql);
        pst.setDate(1, sqlval1);
        pst.setDate(2, sqlval2);
        rs = pst.executeQuery();
        while (rs.next()) {
            Float tot = rs.getFloat("Subtotal");
            GTotal += tot;
        }
        return Float.toString(GTotal);
    }

    public String diningTotalTwoDates() throws SQLException {
        Float GTotal = 0f;
        java.util.Date val1 = StartingDateD1.getDate();
        java.sql.Date sqlval1 = new java.sql.Date(val1.getTime());
        java.util.Date val2 = EndingDateD1.getDate();
        java.sql.Date sqlval2 = new java.sql.Date(val2.getTime());
        String sql = "SELECT * FROM `Sale` s, diningdetails d WHERE `SaleDate` >= ? AND `SaleDate` <= ? AND s.OrderId = d.OrderId";
//             String sql2 = "SELECT * FROM `DineIn` WHERE `SaleDate` >= ? AND `SaleDate` <= ? ";
        //String sql3 = "SELECT * FROM `Delivery` WHERE `SaleDate` >= ? AND `SaleDate` <= ? ";
        pst = con.prepareStatement(sql);
        pst.setDate(1, sqlval1);
        pst.setDate(2, sqlval2);
        rs = pst.executeQuery();
        while (rs.next()) {
            Float tot = rs.getFloat("Subtotal");
            Float ch = rs.getFloat("Charges");
            GTotal += tot + ch;

        }
        return Float.toString(GTotal);
    }

    public String deliveryTotalTwoDates() throws SQLException {
        Float GTotal = 0f;
        java.util.Date val1 = StartingDateD1.getDate();
        java.sql.Date sqlval1 = new java.sql.Date(val1.getTime());
        java.util.Date val2 = EndingDateD1.getDate();
        java.sql.Date sqlval2 = new java.sql.Date(val2.getTime());
        String sql = "SELECT * FROM `Sale` s, deliverydetails d WHERE `SaleDate` >= ? AND `SaleDate` <= ? AND s.OrderId = d.OrderId ";
//             String sql2 = "SELECT * FROM `DineIn` WHERE `SaleDate` >= ? AND `SaleDate` <= ? ";
        //String sql3 = "SELECT * FROM `Delivery` WHERE `SaleDate` >= ? AND `SaleDate` <= ? ";
        pst = con.prepareStatement(sql);
        pst.setDate(1, sqlval1);
        pst.setDate(2, sqlval2);
        rs = pst.executeQuery();
        while (rs.next()) {
            Float tot = rs.getFloat("Subtotal");
            Float ch = rs.getFloat("Charges");
            GTotal += tot + ch;

        }
        return Float.toString(GTotal);
    }

    public String allSaleTwoDates() throws SQLException {
        Float GTotal;

        Float tAT = Float.parseFloat(takeAwayTotalTwoDates());
        Float dTT = Float.parseFloat(diningTotalTwoDates());
        Float dTTT = Float.parseFloat(deliveryTotalTwoDates());

        GTotal = tAT + dTT + dTTT;
        return Float.toString(GTotal);
    }

    //Total Sale
    public String takeAwayTotalSale(String str) throws SQLException {
        Float GTotal = 0f;
        String sql = "SELECT * FROM `Sale`  WHERE SaleCategory = '" + str + "' ";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
            Float tot = rs.getFloat("Subtotal");
            GTotal += tot;
        }
        return Float.toString(GTotal);

    }

    public String diningTotalSale(String str) throws SQLException {
        Float GTotal = 0f;
        String sql = "SELECT * FROM `Sale` s,diningdetails d  WHERE SaleCategory = '" + str + "' AND s.OrderId = d.OrderId";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
            Float tot = rs.getFloat("Subtotal");
            Float ch = rs.getFloat("Charges");
            GTotal += tot + ch;

        }
        return Float.toString(GTotal);

    }

    public String deliveryTotalSale(String str) throws SQLException {
        Float GTotal = 0f;
        String sql = "SELECT * FROM `Sale` s,deliverydetails d  WHERE SaleCategory = '" + str + "' AND s.OrderId = d.OrderId";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
            Float tot = rs.getFloat("Subtotal");
            Float ch = rs.getFloat("Charges");
            GTotal += tot + ch;

        }
        return Float.toString(GTotal);

    }

    public String ShowAllSales() throws SQLException {
        Float GTotal = 0f;
        Float t = 0f;
        Float dining = 0f;
        Float delivery = 0f;

        t = Float.parseFloat(takeAwayTotalSale("TakeAway"));
        dining = Float.parseFloat(diningTotalSale("DineIn"));
        delivery = Float.parseFloat(deliveryTotalSale("Home Delivery"));

        GTotal = t + dining + delivery;
//            String T  = "SELECT * FROM Sale";
////            String DI = "SELECT * FROM `DineIn`";
////            String D  = "SELECT * FROM `delivery`";
//            pst = con.prepareStatement(T);
//            rs = pst.executeQuery();
//            while(rs.next())
//            {
//                Float tot  = rs.getFloat("Subtotal");
//                GTotal +=tot;
//            }
        return Float.toString(GTotal);
//
    }

    //Show No of Orders
    public String ShowTodayOrders(String cat) throws SQLException {
        int totNo = 0;
        String sql = "Select Count(*) as 'rowcount' from Sale WHERE SaleCategory = '" + cat + "' AND DATE(`SaleDate`) = CURDATE()";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        rs.next();
        int tno = rs.getInt("rowcount");
        return Integer.toString(tno);
    }

    public String ShowAllOrders(String str) throws SQLException {
        int totNo = 0;
        String sql = "Select Count(*) as 'rowcount' from Sale WHERE SaleCategory = '" + str + "' ";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        rs.next();
        int tno = rs.getInt("rowcount");
        return Integer.toString(tno);
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        TakeAwayToday = new javax.swing.JLabel();
        TakeAwayWeekly = new javax.swing.JLabel();
        TakeAwayMonthly = new javax.swing.JLabel();
        TakeAwayYesterday = new javax.swing.JLabel();
        TakeAwayMonthly3 = new javax.swing.JLabel();
        TakeAwayWeekly1 = new javax.swing.JLabel();
        TakeAwayToday1 = new javax.swing.JLabel();
        TakeAwayYesterday1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        DineInToday = new javax.swing.JLabel();
        DineInWeekly = new javax.swing.JLabel();
        DineInMonthly = new javax.swing.JLabel();
        DineInYesterday = new javax.swing.JLabel();
        TakeAwayMonthly4 = new javax.swing.JLabel();
        DineInWeekly1 = new javax.swing.JLabel();
        DineInToday1 = new javax.swing.JLabel();
        DineInYesterday1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        DeliveryToday = new javax.swing.JLabel();
        DeliveryWeekly = new javax.swing.JLabel();
        DeliveryMonthly = new javax.swing.JLabel();
        DeliveryYesterday = new javax.swing.JLabel();
        TakeAwayMonthly5 = new javax.swing.JLabel();
        DeliveryWeekly1 = new javax.swing.JLabel();
        DeliveryToday1 = new javax.swing.JLabel();
        DeliveryYesterday1 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TakeAwayTotalSale = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        ShowAll = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        TakeAwayTotalSale1 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        TakeAwayTotalSale2 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        EndingDateD1 = new com.toedter.calendar.JDateChooser();
        StartingDateD1 = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        TakeAwayToday15 = new javax.swing.JLabel();
        SALEDELIVERY1 = new javax.swing.JLabel();
        hPanel = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LogDetailsTable = new javax.swing.JTable();
        ReportShow = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        EndingDate = new com.toedter.calendar.JDateChooser();
        StartingDate = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        SALE = new javax.swing.JLabel();
        TakeAwayToday5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        TakeAwayToday9 = new javax.swing.JLabel();
        TotalOrders = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        TakeAwayToday10 = new javax.swing.JLabel();
        TakeAwayTodayOrder = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        EndingDateDine = new com.toedter.calendar.JDateChooser();
        StartingDateDine = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        SALEDINE = new javax.swing.JLabel();
        TakeAwayToday7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        TakeAwayToday11 = new javax.swing.JLabel();
        DineInAllOrders = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        TakeAwayToday12 = new javax.swing.JLabel();
        DineInTodayOrder = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        EndingDateD = new com.toedter.calendar.JDateChooser();
        StartingDateD = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        SALEDELIVERY = new javax.swing.JLabel();
        TakeAwayToday8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        TakeAwayToday13 = new javax.swing.JLabel();
        DeliveryTotalOrders = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        TakeAwayToday14 = new javax.swing.JLabel();
        DeliverTodayOrders = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(31, 58, 147), 5, true));

        jTabbedPane1.setBackground(new java.awt.Color(51, 0, 153));
        jTabbedPane1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTabbedPane1.setOpaque(true);
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(200, 100));
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Take Away Sale", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        TakeAwayToday.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        TakeAwayToday.setForeground(new java.awt.Color(255, 0, 0));
        TakeAwayToday.setText("Today");

        TakeAwayWeekly.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        TakeAwayWeekly.setForeground(new java.awt.Color(255, 0, 0));
        TakeAwayWeekly.setText("Weekly");

        TakeAwayMonthly.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        TakeAwayMonthly.setForeground(new java.awt.Color(255, 0, 0));
        TakeAwayMonthly.setText("Monthly");

        TakeAwayYesterday.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        TakeAwayYesterday.setForeground(new java.awt.Color(255, 0, 0));
        TakeAwayYesterday.setText("Yesterday");

        TakeAwayMonthly3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        TakeAwayMonthly3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TakeAwayMonthly3.setText("Monthly");

        TakeAwayWeekly1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        TakeAwayWeekly1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TakeAwayWeekly1.setText("Weekly");

        TakeAwayToday1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        TakeAwayToday1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TakeAwayToday1.setText("Today");

        TakeAwayYesterday1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        TakeAwayYesterday1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TakeAwayYesterday1.setText("Yesterday");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TakeAwayMonthly3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TakeAwayWeekly1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TakeAwayToday1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TakeAwayYesterday1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TakeAwayWeekly, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TakeAwayToday, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TakeAwayYesterday, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                    .addComponent(TakeAwayMonthly, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TakeAwayYesterday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TakeAwayYesterday1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TakeAwayToday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TakeAwayToday1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TakeAwayWeekly, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TakeAwayWeekly1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TakeAwayMonthly3)
                    .addComponent(TakeAwayMonthly, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dine In Sale", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        DineInToday.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        DineInToday.setForeground(new java.awt.Color(255, 0, 0));
        DineInToday.setText("Today");

        DineInWeekly.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        DineInWeekly.setForeground(new java.awt.Color(255, 0, 0));
        DineInWeekly.setText("Weekly");

        DineInMonthly.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        DineInMonthly.setForeground(new java.awt.Color(255, 0, 0));
        DineInMonthly.setText("Monthly");

        DineInYesterday.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        DineInYesterday.setForeground(new java.awt.Color(255, 0, 0));
        DineInYesterday.setText("Yesterday");

        TakeAwayMonthly4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        TakeAwayMonthly4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TakeAwayMonthly4.setText("Monthly");

        DineInWeekly1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        DineInWeekly1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DineInWeekly1.setText("Weekly");

        DineInToday1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        DineInToday1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DineInToday1.setText("Today");

        DineInYesterday1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        DineInYesterday1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DineInYesterday1.setText("Yesterday");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(DineInToday1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DineInYesterday1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(DineInWeekly1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TakeAwayMonthly4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DineInWeekly, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DineInToday, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DineInYesterday, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(DineInMonthly, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DineInYesterday1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DineInYesterday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DineInToday1)
                    .addComponent(DineInToday, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DineInWeekly1)
                    .addComponent(DineInWeekly, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TakeAwayMonthly4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DineInMonthly, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Delivery Sales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        DeliveryToday.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        DeliveryToday.setForeground(new java.awt.Color(255, 0, 0));
        DeliveryToday.setText("Today");

        DeliveryWeekly.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        DeliveryWeekly.setForeground(new java.awt.Color(255, 0, 0));
        DeliveryWeekly.setText("Weekly");

        DeliveryMonthly.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        DeliveryMonthly.setForeground(new java.awt.Color(255, 0, 0));
        DeliveryMonthly.setText("Monthly");

        DeliveryYesterday.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        DeliveryYesterday.setForeground(new java.awt.Color(255, 0, 0));
        DeliveryYesterday.setText("Yesterday");

        TakeAwayMonthly5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        TakeAwayMonthly5.setText("Monthly");

        DeliveryWeekly1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        DeliveryWeekly1.setText("Weekly");

        DeliveryToday1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        DeliveryToday1.setText("Today");

        DeliveryYesterday1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        DeliveryYesterday1.setText("Yesterday");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TakeAwayMonthly5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(DeliveryWeekly1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DeliveryToday1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DeliveryYesterday1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(0, 0, 0)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(DeliveryWeekly, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeliveryToday, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeliveryYesterday, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(DeliveryMonthly, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DeliveryYesterday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeliveryYesterday1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(DeliveryToday1)
                        .addGap(2, 2, 2)
                        .addComponent(DeliveryWeekly1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(DeliveryToday)
                        .addGap(2, 2, 2)
                        .addComponent(DeliveryWeekly)))
                .addGap(2, 2, 2)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeliveryMonthly)
                    .addComponent(TakeAwayMonthly5))
                .addGap(2, 2, 2))
        );

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ALL TIME SALE", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jPanel13.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Take Away");

        TakeAwayTotalSale.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        TakeAwayTotalSale.setForeground(new java.awt.Color(255, 255, 255));
        TakeAwayTotalSale.setText("0");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TakeAwayTotalSale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TakeAwayTotalSale, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jPanel22.setBackground(new java.awt.Color(204, 0, 0));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Total ");

        ShowAll.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ShowAll.setForeground(new java.awt.Color(255, 255, 255));
        ShowAll.setText("0");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel18.setBackground(new java.awt.Color(255, 102, 0));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Dine In");

        TakeAwayTotalSale1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        TakeAwayTotalSale1.setForeground(new java.awt.Color(255, 255, 255));
        TakeAwayTotalSale1.setText("0");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TakeAwayTotalSale1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TakeAwayTotalSale1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel19.setBackground(new java.awt.Color(204, 0, 204));

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Delivery");

        TakeAwayTotalSale2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        TakeAwayTotalSale2.setForeground(new java.awt.Color(255, 255, 255));
        TakeAwayTotalSale2.setText("0");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TakeAwayTotalSale2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(TakeAwayTotalSale2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 324, Short.MAX_VALUE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 37, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Search Between two Dates", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("From");

        EndingDateD1.setDateFormatString("yyyy-MM-dd");
        EndingDateD1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        StartingDateD1.setDateFormatString("yyyy-MM-dd");
        StartingDateD1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("To");

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Show Sale");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        TakeAwayToday15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TakeAwayToday15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TakeAwayToday15.setText("SALE");

        SALEDELIVERY1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SALEDELIVERY1.setForeground(new java.awt.Color(255, 0, 0));
        SALEDELIVERY1.setText("0.0");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(TakeAwayToday15, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SALEDELIVERY1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SALEDELIVERY1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(TakeAwayToday15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(StartingDateD1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                    .addComponent(EndingDateD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(181, 181, 181))
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(StartingDateD1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(EndingDateD1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel28Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {EndingDateD1, StartingDateD1});

        hPanel.setBackground(new java.awt.Color(255, 255, 255));
        hPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Charts", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 18))); // NOI18N

        javax.swing.GroupLayout hPanelLayout = new javax.swing.GroupLayout(hPanel);
        hPanel.setLayout(hPanelLayout);
        hPanelLayout.setHorizontalGroup(
            hPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 785, Short.MAX_VALUE)
        );
        hPanelLayout.setVerticalGroup(
            hPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel7, jPanel8, jPanel9});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(hPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(161, 161, 161))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel7, jPanel8, jPanel9});

        jTabbedPane1.addTab("Dashboard", jPanel2);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "USER SALE REPORT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        LogDetailsTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LogDetailsTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        LogDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "LOGID", "Username", "Date", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        LogDetailsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogDetailsTable.setFillsViewportHeight(true);
        LogDetailsTable.setRowHeight(35);
        LogDetailsTable.setRowMargin(5);
        LogDetailsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogDetailsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(LogDetailsTable);
        if (LogDetailsTable.getColumnModel().getColumnCount() > 0) {
            LogDetailsTable.getColumnModel().getColumn(1).setMinWidth(150);
            LogDetailsTable.getColumnModel().getColumn(1).setPreferredWidth(150);
            LogDetailsTable.getColumnModel().getColumn(1).setMaxWidth(0);
        }

        ReportShow.setBackground(new java.awt.Color(51, 0, 153));
        ReportShow.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ReportShow.setForeground(new java.awt.Color(255, 255, 255));
        ReportShow.setText("Show");
        ReportShow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReportShow.setEnabled(false);
        ReportShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ReportShow, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(ReportShow, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(343, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("User Sales", jPanel11);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Search Between two Dates", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Starting Date");

        EndingDate.setDateFormatString("yyyy-MM-dd");
        EndingDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        StartingDate.setDateFormatString("yyyy-MM-dd");
        StartingDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Ending Date");

        SALE.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        SALE.setForeground(new java.awt.Color(255, 0, 0));
        SALE.setText("0.0");

        TakeAwayToday5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TakeAwayToday5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TakeAwayToday5.setText("SALE");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Show SALE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TakeAwayToday5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SALE, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StartingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EndingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel14Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {EndingDate, StartingDate});

        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EndingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StartingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SALE, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TakeAwayToday5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        jPanel20.setBackground(new java.awt.Color(255, 0, 0));

        TakeAwayToday9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        TakeAwayToday9.setForeground(new java.awt.Color(255, 255, 255));
        TakeAwayToday9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TakeAwayToday9.setText("Total Orders");

        TotalOrders.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        TotalOrders.setForeground(new java.awt.Color(255, 255, 255));
        TotalOrders.setText("1");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(TakeAwayToday9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TotalOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(TakeAwayToday9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(TotalOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel21.setBackground(new java.awt.Color(102, 102, 255));

        TakeAwayToday10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        TakeAwayToday10.setForeground(new java.awt.Color(255, 255, 255));
        TakeAwayToday10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TakeAwayToday10.setText("Today's Orders");

        TakeAwayTodayOrder.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        TakeAwayTodayOrder.setForeground(new java.awt.Color(255, 255, 255));
        TakeAwayTodayOrder.setText("1");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TakeAwayToday10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TakeAwayTodayOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(TakeAwayToday10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(TakeAwayTodayOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(428, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(345, 345, 345))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(369, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Take Away", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Search Between two Dates", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Starting Date");

        EndingDateDine.setDateFormatString("yyyy-MM-dd");
        EndingDateDine.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        StartingDateDine.setDateFormatString("yyyy-MM-dd");
        StartingDateDine.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Ending Date");

        SALEDINE.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        SALEDINE.setForeground(new java.awt.Color(255, 0, 0));
        SALEDINE.setText("0.0");

        TakeAwayToday7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TakeAwayToday7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TakeAwayToday7.setText("SALE");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Show SALE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TakeAwayToday7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SALEDINE, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StartingDateDine, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EndingDateDine, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EndingDateDine, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StartingDateDine, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SALEDINE, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TakeAwayToday7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        jPanel24.setBackground(new java.awt.Color(255, 0, 0));

        TakeAwayToday11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        TakeAwayToday11.setForeground(new java.awt.Color(255, 255, 255));
        TakeAwayToday11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TakeAwayToday11.setText("Total Orders");

        DineInAllOrders.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        DineInAllOrders.setForeground(new java.awt.Color(255, 255, 255));
        DineInAllOrders.setText("1");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(TakeAwayToday11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DineInAllOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(TakeAwayToday11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(DineInAllOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel25.setBackground(new java.awt.Color(102, 102, 255));

        TakeAwayToday12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        TakeAwayToday12.setForeground(new java.awt.Color(255, 255, 255));
        TakeAwayToday12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TakeAwayToday12.setText("Today's Orders");

        DineInTodayOrder.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        DineInTodayOrder.setForeground(new java.awt.Color(255, 255, 255));
        DineInTodayOrder.setText("1");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(TakeAwayToday12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DineInTodayOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(TakeAwayToday12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(DineInTodayOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(427, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(346, 346, 346))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(390, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dine In", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Search Between two Dates", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Starting Date");

        EndingDateD.setDateFormatString("yyyy-MM-dd");
        EndingDateD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        StartingDateD.setDateFormatString("yyyy-MM-dd");
        StartingDateD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Ending Date");

        SALEDELIVERY.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        SALEDELIVERY.setForeground(new java.awt.Color(255, 0, 0));
        SALEDELIVERY.setText("0.0");

        TakeAwayToday8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TakeAwayToday8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TakeAwayToday8.setText("SALE");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Show SALE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TakeAwayToday8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SALEDELIVERY, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StartingDateD, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EndingDateD, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EndingDateD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StartingDateD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SALEDELIVERY, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TakeAwayToday8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        jPanel26.setBackground(new java.awt.Color(255, 0, 51));

        TakeAwayToday13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        TakeAwayToday13.setForeground(new java.awt.Color(255, 255, 255));
        TakeAwayToday13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TakeAwayToday13.setText("Total Orders");

        DeliveryTotalOrders.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        DeliveryTotalOrders.setForeground(new java.awt.Color(255, 255, 255));
        DeliveryTotalOrders.setText("1");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(TakeAwayToday13)
                .addGap(5, 5, 5)
                .addComponent(DeliveryTotalOrders, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeliveryTotalOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TakeAwayToday13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jPanel27.setBackground(new java.awt.Color(102, 102, 255));

        TakeAwayToday14.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        TakeAwayToday14.setForeground(new java.awt.Color(255, 255, 255));
        TakeAwayToday14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TakeAwayToday14.setText("Today's orders");

        DeliverTodayOrders.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        DeliverTodayOrders.setForeground(new java.awt.Color(255, 255, 255));
        DeliverTodayOrders.setText("1");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(TakeAwayToday14)
                .addGap(5, 5, 5)
                .addComponent(DeliverTodayOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeliverTodayOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TakeAwayToday14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(427, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(346, 346, 346))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(365, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Delivery", jPanel5);

        jPanel6.setBackground(new java.awt.Color(51, 0, 153));

        jButton18.setBackground(new java.awt.Color(255, 255, 255));
        jButton18.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("-");
        jButton18.setBorder(null);
        jButton18.setContentAreaFilled(false);
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(255, 255, 255));
        jButton17.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("X");
        jButton17.setBorder(null);
        jButton17.setBorderPainted(false);
        jButton17.setContentAreaFilled(false);
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1292, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(80, 54, 1356, 868);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged

    }//GEN-LAST:event_formMouseDragged

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        this.setState(1);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            //TwoDates
            SALE.setText("Rs " + ShowTakeAwayTwoDates());
        } catch (SQLException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            //TwoDates
            SALEDINE.setText("Rs " + ShowDineInTwoDates());
        } catch (SQLException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            //TwoDates
            SALEDELIVERY.setText("Rs " + ShowDeliveryTwoDates());
        } catch (SQLException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {
            //TwoDates
            SALEDELIVERY1.setText("Rs " + allSaleTwoDates());
        } catch (SQLException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        if (jTabbedPane1.getSelectedIndex() == 1) {
            String getLog = "SELECT LogId AS 'Login Id', Username AS 'Username', logDate AS 'Login Date', LogTime AS 'Login Time' from LogDetails ORDER BY LogId DESC";
            try {
                pst = con.prepareStatement(getLog);
                rs = pst.executeQuery();
                LogDetailsTable.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e + " Error in getting LogDetails!");
            }
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void ReportShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportShowActionPerformed

        String Loginname = "";
        DefaultTableModel model = (DefaultTableModel) LogDetailsTable.getModel();
        if (jTabbedPane1.getSelectedIndex() == 1) {
            String getName = "SELECT * from Login where Username = '" + Login.USERNAME + "'";
            try {
//               }
                //**************************************************
                pst = con.prepareStatement(getName);
                rs = pst.executeQuery();
                while (rs.next()) {
                    Loginname = rs.getString("Name");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e + " Error in getting totals!");
            }
        }

//        DateFormat ReportTime = new SimpleDateFormat("hh:mm:ss aa");
        Date date = new Date();
        DateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss aa");
        DateFormat ReportTime = new SimpleDateFormat("hh:mm aa");
        String ReportTimeString = ReportTime.format(new Date());
        DateFormat ReportDate = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat ReportDatePrint = new SimpleDateFormat("dd-MM-yyyy");
        String ReportDateString = ReportDate.format(new Date());
        ReportDateString += " " + ReportTimeString;
        String ReportDateString2 = ReportDatePrint.format(new Date());
        Font f1 = new Font(FontFamily.TIMES_ROMAN, 25.0f, Font.NORMAL, BaseColor.RED);
        Font f2 = new Font(FontFamily.TIMES_ROMAN, 20.0f, Font.UNDERLINE, BaseColor.BLACK);
        Font f3 = new Font(FontFamily.TIMES_ROMAN, 15.0f, Font.NORMAL, BaseColor.BLACK);
        Font f4 = new Font(FontFamily.TIMES_ROMAN, 18.0f, Font.BOLD, BaseColor.BLACK);
        Document document = new Document(PageSize.A4);
        try {
            PdfWriter.getInstance(document, new FileOutputStream(Login.USERNAME + " " + dateTimeFormat.format(date) + " SALES REPORT.pdf"));

//                Rectangle one = new Rectangle(300,ReportSize);
//                document.setPageSize(one);
            document.setMargins(30, 30, 30, 30);
            document.open();
            Paragraph P1 = new Paragraph("Restauran Name", f1);
            P1.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(P1);
            Paragraph P2 = new Paragraph("USER SALE REPORT", f2);
            P2.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(P2);
            Paragraph P3 = new Paragraph("--------------------------------------------------------------------------------------------------", f3);
            P3.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(P3);
            document.add(new Paragraph("User/Cashier: " + Login.USERNAME, f3));
            document.add(new Paragraph("Date & Time: " + ReportDateString, f3));
            document.add(P3);
            document.add(new Paragraph("SALES REPORT", f4));
            document.add(new Paragraph("Login Id : " + model.getValueAt(LogDetailsTable.getSelectedRow(), 0), f3));
//                document.add(new Paragraph("Username : "));
            document.add(new Paragraph("Username : " + Loginname, f3));
            document.add(new Paragraph("From Date: " + model.getValueAt(LogDetailsTable.getSelectedRow(), 2), f3));
            document.add(new Paragraph("From Time: " + model.getValueAt(LogDetailsTable.getSelectedRow(), 3), f3));
            document.add(new Paragraph("__________________________________________________________________", f3));
            document.add(new Paragraph("Sale by Order Type: ", f3));
            document.add(new Paragraph(" ", f3));

            PdfPTable RTable = new PdfPTable(4);
            RTable.setWidthPercentage(100);

            RTable.addCell(ReportCellBold("TakeAway ", 14));
            RTable.addCell(ReportCell("" + ShowSale("TakeAway"), 14));
            RTable.addCell(ReportCellBold("Orders", 14));
            RTable.addCell(ReportCell("" + ShowOrders("TakeAway"), 14));

            RTable.addCell(ReportCellBold("Dine In ", 14));
            RTable.addCell(ReportCell("" + ShowSale("DineIn"), 14));
            RTable.addCell(ReportCellBold("Orders", 14));
            RTable.addCell(ReportCell("" + ShowOrders("DineIn"), 14));

            RTable.addCell(ReportCellBold("Home Delivery", 14));
            RTable.addCell(ReportCell("" + ShowSale("Home Delivery"), 14));
            RTable.addCell(ReportCellBold("Orders", 14));
            RTable.addCell(ReportCell("" + ShowOrders("Home Delivery"), 14));

            RTable.addCell(ReportCellColspan(" ", 14, 4));

            document.add(RTable);

            PdfPTable ITable = new PdfPTable(3);
            ITable.setWidthPercentage(100);

            //Cat
            ITable.addCell(ReportCellColspan(" ", 14, 4));
            ITable.addCell(ReportCellBold("Burgers", 14));
            ITable.addCell(ReportCellBold("Rolls/Dry", 14));
            ITable.addCell(ReportCellBold("BBQ", 14));
            //Rate
            ITable.addCell(ReportCell("Rs" + ShowItemsTotal("Burgers") + " (" + ShowItemsQty("Burgers") + ")", 14));
            ITable.addCell(ReportCell("Rs" + ShowItemsTotal("Rolls") + " (" + ShowItemsQty("Rolls") + ")", 14));
            ITable.addCell(ReportCell("Rs" + ShowItemsTotal("BBQ") + " (" + ShowItemsQty("BBQ") + ")", 14));

            //Cat
            ITable.addCell(ReportCellColspan(" ", 14, 4));
            ITable.addCell(ReportCellBold("Fries", 14));
            ITable.addCell(ReportCellBold("Shawarma", 14));
            ITable.addCell(ReportCellBold("Chai/Tea", 14));
            //Rate
            ITable.addCell(ReportCell("Rs" + ShowItemsTotal("Fries") + " (" + ShowItemsQty("Fries") + ")", 14));
            ITable.addCell(ReportCell("Rs" + ShowItemsTotal("Other") + " (" + ShowItemsQty("Other") + ")", 14));
            ITable.addCell(ReportCell("Rs" + ShowItemsTotal("Other2") + " (" + ShowItemsQty("Other2") + ")", 14));

            //Cat
            ITable.addCell(ReportCellColspan(" ", 14, 4));
            ITable.addCell(ReportCellBold("Deals", 14));
            ITable.addCell(ReportCellBold("Fast Food", 14));
            ITable.addCell(ReportCellBold("Beverages", 14));
            //Rate
            ITable.addCell(ReportCell("Rs" + ShowItemsTotal("Deals") + " (" + ShowItemsQty("Deals") + ")", 14));
            ITable.addCell(ReportCell("Rs" + ShowItemsTotal("FastFood") + " (" + ShowItemsQty("FastFood") + ")", 14));
            ITable.addCell(ReportCell("Rs" + ShowItemsTotal("Beverages") + " (" + ShowItemsQty("Beverages") + ")", 14));
            document.add(ITable);
//
//                document.add(new Paragraph("---------------------------------------------------------------------------------------------------",f3));
            document.add(new Paragraph(" ", f3));
            document.add(new Paragraph("Total Sale  : " + (ShowSale("TakeAway") + ShowSale("DineIn") + ShowSale("Home Delivery")), f1));
            document.add(new Paragraph("Total Orders: " + (ShowOrders("TakeAway") + ShowOrders("DineIn") + ShowOrders("Home Delivery")), f1));
            document.add(new Paragraph("---------------------------------------------------------------------------------------------------", f3));
            document.close();

            try {

                File pdfFile = new File(Login.USERNAME + " " + dateTimeFormat.format(date) + " SALES REPORT.pdf");
                if (pdfFile.exists()) {

                    if (Desktop.isDesktopSupported()) {
                        Desktop.getDesktop().open(pdfFile);
                    } else {

                        JOptionPane.showMessageDialog(null, "Desktop is not supported!");
                    }

                } else {

                    JOptionPane.showMessageDialog(null, "File is not exists!");
                }

                pdfFile.deleteOnExit();

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_ReportShowActionPerformed

    private void LogDetailsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogDetailsTableMouseClicked
        ReportShow.setEnabled(true);

    }//GEN-LAST:event_LogDetailsTableMouseClicked

    public float ShowSale(String str) {
        float TotalAmount = 0;
        int SoldOrders = 0;
        String getSale = "SELECT * from Sale where SaleCategory = '" + str + "' AND LogId = '" + LogDetailsTable.getValueAt(LogDetailsTable.getSelectedRow(), 0) + "'";
        try {
            pst = con.prepareStatement(getSale);
            rs = pst.executeQuery();
            while (rs.next()) {
                TotalAmount += rs.getFloat("Subtotal");
                SoldOrders++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + " Error in " + str);
        }
        return TotalAmount;
    }

    public float ShowMemberSale() {
        float TotalAmount = 0;

        String getSale = "SELECT * from Sale where Type = 'Member' AND LogId = '" + LogDetailsTable.getValueAt(LogDetailsTable.getSelectedRow(), 0) + "'";
        try {
            pst = con.prepareStatement(getSale);
            rs = pst.executeQuery();
            while (rs.next()) {
                TotalAmount += rs.getFloat("Subtotal");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + " Error in showMemberSale");
        }
        return TotalAmount;
    }

    public int ShowOrders(String str) {
        int SoldOrders = 0;
        String getSale = "SELECT * from Sale where SaleCategory = '" + str + "' AND LogId = '" + LogDetailsTable.getValueAt(LogDetailsTable.getSelectedRow(), 0) + "'";
        try {
            pst = con.prepareStatement(getSale);
            rs = pst.executeQuery();
            while (rs.next()) {
                SoldOrders++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + " Error in " + str);
        }
        return SoldOrders;
    }

    public int ShowMemberOrders() {
        int SoldOrders = 0;
        String getSale = "SELECT * from Sale where Type = 'Member' AND LogId = '" + LogDetailsTable.getValueAt(LogDetailsTable.getSelectedRow(), 0) + "'";
        try {
            pst = con.prepareStatement(getSale);
            rs = pst.executeQuery();
            while (rs.next()) {
                SoldOrders++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + " Error in ShowMemberOrders");
        }
        return SoldOrders;
    }

    public int ShowItemsQty(String salcat) {
        int itmqty = 0;
        String sql = "SELECT Sale.OrderId, Sale.LogId, SoldItems.ItemsQty ,solditems.ItemId, Items.Category "
                + "from ((Sale INNER JOIN solditems ON Sale.OrderId = SoldItems.OrderId) "
                + "INNER JOIN Items ON SoldItems.ItemId = Items.ItemId) where Sale.LogId = '" + LogDetailsTable.getValueAt(LogDetailsTable.getSelectedRow(), 0) + "' AND Items.Category = '" + salcat + "'";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                itmqty += rs.getInt("ItemsQty");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + " Error in geting ShwoItemsQty");
        }

        return itmqty;
    }

    public int ShowItemsTotal(String salcat) {
        int itmtot = 0;
        String sql = "SELECT Sale.OrderId, Items.Rate, Sale.LogId, SoldItems.ItemsQty ,solditems.ItemId, Items.Category "
                + "from ((Sale INNER JOIN solditems ON Sale.OrderId = SoldItems.OrderId) "
                + "INNER JOIN Items ON SoldItems.ItemId = Items.ItemId) where Sale.LogId = '" + LogDetailsTable.getValueAt(LogDetailsTable.getSelectedRow(), 0) + "' AND Items.Category = '" + salcat + "'";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                itmtot += rs.getInt("Rate");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + " Error in geting ShwoItemsQty");
        }

        return itmtot;
    }

    public void showChart() throws SQLException {
//      String a = takeAwayTotalSale("TakeAway");
//      String b = diningTotalSale("Dine In");
//      String c = deliveryTotalSale("Delivery");
//
//      if(a.isEmpty()||b.isEmpty()||c.isEmpty())
//      {
//          a = "0";
//          b = "0";
//          c = "0";
//      }
        int aI = 43434;//Integer.parseInt(a);
        int bI = 55553;//Integer.parseInt(b);
        int cI = 3230;//;Integer.parseInt(c);

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(aI, "Take Away", "2-3-2020");
        dataset.setValue(bI, "Dine In", "3-3-2020");
        dataset.setValue(cI, "Delivery", "4-3-2020");
        JFreeChart chart = ChartFactory.createBarChart("Today's Sale", "Date", "Amount of Sale", dataset, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.black);
        hPanel.setLayout(new java.awt.BorderLayout());
        ChartPanel CP = new ChartPanel(chart);
        hPanel.add(CP, BorderLayout.CENTER);
        hPanel.validate();
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new Report().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DeliverTodayOrders;
    private javax.swing.JLabel DeliveryMonthly;
    private javax.swing.JLabel DeliveryToday;
    private javax.swing.JLabel DeliveryToday1;
    private javax.swing.JLabel DeliveryTotalOrders;
    private javax.swing.JLabel DeliveryWeekly;
    private javax.swing.JLabel DeliveryWeekly1;
    private javax.swing.JLabel DeliveryYesterday;
    private javax.swing.JLabel DeliveryYesterday1;
    private javax.swing.JLabel DineInAllOrders;
    private javax.swing.JLabel DineInMonthly;
    private javax.swing.JLabel DineInToday;
    private javax.swing.JLabel DineInToday1;
    private javax.swing.JLabel DineInTodayOrder;
    private javax.swing.JLabel DineInWeekly;
    private javax.swing.JLabel DineInWeekly1;
    private javax.swing.JLabel DineInYesterday;
    private javax.swing.JLabel DineInYesterday1;
    private com.toedter.calendar.JDateChooser EndingDate;
    private com.toedter.calendar.JDateChooser EndingDateD;
    private com.toedter.calendar.JDateChooser EndingDateD1;
    private com.toedter.calendar.JDateChooser EndingDateDine;
    private javax.swing.JTable LogDetailsTable;
    private javax.swing.JButton ReportShow;
    private javax.swing.JLabel SALE;
    private javax.swing.JLabel SALEDELIVERY;
    private javax.swing.JLabel SALEDELIVERY1;
    private javax.swing.JLabel SALEDINE;
    private javax.swing.JLabel ShowAll;
    private com.toedter.calendar.JDateChooser StartingDate;
    private com.toedter.calendar.JDateChooser StartingDateD;
    private com.toedter.calendar.JDateChooser StartingDateD1;
    private com.toedter.calendar.JDateChooser StartingDateDine;
    private javax.swing.JLabel TakeAwayMonthly;
    private javax.swing.JLabel TakeAwayMonthly3;
    private javax.swing.JLabel TakeAwayMonthly4;
    private javax.swing.JLabel TakeAwayMonthly5;
    private javax.swing.JLabel TakeAwayToday;
    private javax.swing.JLabel TakeAwayToday1;
    private javax.swing.JLabel TakeAwayToday10;
    private javax.swing.JLabel TakeAwayToday11;
    private javax.swing.JLabel TakeAwayToday12;
    private javax.swing.JLabel TakeAwayToday13;
    private javax.swing.JLabel TakeAwayToday14;
    private javax.swing.JLabel TakeAwayToday15;
    private javax.swing.JLabel TakeAwayToday5;
    private javax.swing.JLabel TakeAwayToday7;
    private javax.swing.JLabel TakeAwayToday8;
    private javax.swing.JLabel TakeAwayToday9;
    private javax.swing.JLabel TakeAwayTodayOrder;
    private javax.swing.JLabel TakeAwayTotalSale;
    private javax.swing.JLabel TakeAwayTotalSale1;
    private javax.swing.JLabel TakeAwayTotalSale2;
    private javax.swing.JLabel TakeAwayWeekly;
    private javax.swing.JLabel TakeAwayWeekly1;
    private javax.swing.JLabel TakeAwayYesterday;
    private javax.swing.JLabel TakeAwayYesterday1;
    private javax.swing.JLabel TotalOrders;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    public static javax.swing.JPanel hPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton17;
    public javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
