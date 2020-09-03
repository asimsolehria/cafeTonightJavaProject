//Printig Recipt
package MainPackage;

import static MainPackage.AddSale.SaleType;
//import static MainPackage.POS.OrderType;
//import static MainPackage.POS.PurchasedItems;
//import static MainPackage.POS.TotalAmount;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.PrintException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.table.DefaultTableModel;
import org.jpedal.exception.PdfException;

public class PrintReceipt extends POS{


    public void PrintReceipt()
    {
        String takeid = null;
        int Customerpageheight = 0;
        int kotpageheight = 320;
        
        switch(OrderType.getSelectedIndex())
        {
            case 0:
            Customerpageheight = 460;
            break;
            case 1:
            Customerpageheight = 550;
            break;
            case 2:
            Customerpageheight = 670;
            break;
        }
      DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
      String oname = (String) OrderType.getSelectedItem();
        int dialogResult = JOptionPane.showConfirmDialog(null, "<html><font size='6' >"+oname+" : Take Away <br>No of Items : "+model.getRowCount()+"<br>Total : "+POS.TotalAmount.getText()+"</font></html>","Print ",2,INFORMATION_MESSAGE);
      
      if(dialogResult == JOptionPane.YES_OPTION)
        {
           
            for(int a=0;a<PurchasedItems.getModel().getRowCount();a++)
        {
         Customerpageheight+=65;
         kotpageheight+=35;
        }
if(POS.Membership.isSelected())
        {
            SaleType = "Member";
        }
        else
        {
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
        java.text.SimpleDateFormat sdf = 
        new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = sdf.format(dt);
        java.sql.Timestamp timestamp = new java.sql.Timestamp(dt.getTime());
        
            //Take Away
            switch (OrderType.getSelectedIndex()) 
            {
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
        
        if(Membership.isSelected())
        {
            MembershipSale.AddMembershipSale();
        }
        
//             Document document = new Document(pagesize);
             Document document = new Document();
            try
              {
//                PdfWriter.getInstance(document, new FileOutputStream("TakeAway.pdf"));
                PdfWriter.getInstance(document, new FileOutputStream("TakeAway.pdf"));
                Rectangle one = new Rectangle(300,Customerpageheight);
                Rectangle two = new Rectangle(300,kotpageheight);
                document.setPageSize(one);
                document.setMargins(20, 20, 30, 20);
                document.open();
                PdfPTable HeadTable = new PdfPTable(1);
                HeadTable.addCell(HeaderCell("Cafe Tonight Larkana"));
                HeadTable.addCell(HeaderCell("Sale Receipt"));
                HeadTable.addCell(FooterCell("------------------------------",14));
//                  HeadTable.addCell(HeaderCell("_______________________"));
//                  HeadTable.addCell(HeaderCell(" "));
                HeadTable.setWidthPercentage(100);
                
                document.add(HeadTable);
                
                
               String SaleId = "Select OrderId from Sale ORDER BY OrderId";
                        pst = con.prepareStatement(SaleId);
                        rs = pst.executeQuery();
                        while(rs.next())
                        {
                            takeid = rs.getString("OrderId");
                            
                        }       
                       
                
                
                PdfPTable DateTable = new PdfPTable(2);
                DateTable.setWidthPercentage(100);
                DateTable.addCell(DateCell("Invoice No:"));
                DateTable.addCell(DateCellRight(takeid));
                if(Membership.isSelected()){
                DateTable.addCell(DateCell("Cust Type:"));
                DateTable.addCell(DateCellRight("Member"));
                                DateTable.addCell(DateCell("Card No:"));
                DateTable.addCell(DateCellRight(MemberCardNo.getSelectedItem().toString()));
                
                }
                DateTable.addCell(DateCell("Order Type: "));
                DateTable.addCell(DateCellRight(OrderType.getSelectedItem().toString()));
                if(OrderType.getSelectedIndex()==1)
                {
                DateTable.addCell(DateCell("Table: "));
                DateTable.addCell(DateCellRight(lbl_TableName.getText()));
                    
                }else if(OrderType.getSelectedIndex()==2)
                {
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
//                DateTable.addCell(DateCell(" "));
//                DateTable.addCell(DateCell(" "));
                document.add(DateTable);
                PdfPTable HeadTable2 = new PdfPTable(1);
                HeadTable2.addCell(FooterCell("------------------------------",14));
//                HeadTable2.addCell(HeaderCell("_______________________"));
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
                
                body.setWidths(new float[] {1.6f,6,3,2.3f,3.5f});
                for(int a=0;a<PurchasedItems.getModel().getRowCount();a++)
                {

                int sno1         = (int) PurchasedItems.getModel().getValueAt(a, 0);
                String name         = (String) PurchasedItems.getModel().getValueAt(a, 1);
                String rate         = (String) PurchasedItems.getModel().getValueAt(a, 2).toString();
                String itemqty      = (String) PurchasedItems.getModel().getValueAt(a, 3).toString();
                String itemtotal    = (String) PurchasedItems.getModel().getValueAt(a, 4).toString();
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
                BillLine.addCell(FooterCell("------------------------------",14));
            
                PdfPTable Bill = new PdfPTable(2);
                BillLine.setWidthPercentage(100);
                Bill.setWidthPercentage(100);
//                body.addCell(BodyCellSpan("Sub Total",2));
                Bill.addCell(BillLeft("Sub Total"));
                Bill.addCell(BillRight(TotalAmount.getText()));
//                body.addCell(BodyCell(""));
//                body.addCell(BodyCell(""));
//                body.addCell(BodyCell(""));
                Float z = null;
                
                if(OrderType.getSelectedIndex()==1)
                {
                Bill.addCell(BillLeft("S.Charges"));
                Bill.addCell(BillRight(ServiceCharges.getText()));
//                body.addCell(BodyCell(""));
//                body.addCell(BodyCell(""));
//                body.addCell(BodyCell(""));
                Float d = Float.parseFloat(ServiceCharges.getText());    
                Float t = Float.parseFloat(TotalAmount.getText());
                z = t+d;
                
                }else if(OrderType.getSelectedIndex()==2)
                {
                Bill.addCell(BillLeft("D.Charges"));
                Bill.addCell(BillRight(txt_DeliveryCharges.getText()));
//                body.addCell(BodyCell(""));
//                body.addCell(BodyCell(""));
//                body.addCell(BodyCell(""));       
                Float S = Float.parseFloat(txt_DeliveryCharges.getText());
                Float t = Float.parseFloat(TotalAmount.getText());    
                 z = t+S;
                }
                
                Bill.addCell(BillLeft("Grand Total"));
                if(OrderType.getSelectedIndex()!=0)
                {
                Bill.addCell(BillRight(Float.toString(z)));
                }   
                
//                body.addCell(BodyCell(""));
//                body.addCell(BodyCell(""));
//                body.addCell(BodyCell(""));
                
                document.add(body);
                document.add(BillLine);
                document.add(Bill); 


                
                PdfPTable FootTable = new PdfPTable(1);
        //                                FootTable.addCell(FooterCell(" "));

               FootTable.addCell(FooterCell("------------------------------",14));
               FootTable.addCell(FooterCell(" ",14));
               FootTable.addCell(FooterCell("Near Khora Comxplex Larkana",14));
               FootTable.addCell(FooterCell("For Delivery Contact:03337101851",16));
        //                                FootTable.addCell(FooterCell("_______________________"));
               FootTable.addCell(FooterCell("-------------------------",14));
        //                                FootTable.addCell(FooterCell(" "));
        //                                FootTable.addCell(FooterCell("Developed By : SamSoft Solutions"));
               FootTable.addCell(FooterCell("TechSAM Solutions",14));
               FootTable.addCell(FooterCell("Developer: 03053729551",14));
               FootTable.addCell(FooterCell("------------------------------",14));
               FootTable.addCell(FooterCell("  ",14));
               FootTable.addCell(FooterCell("  ",14));
               FootTable.setWidthPercentage(100);
               document.add(FootTable);
                
               document.setPageSize(two);
               document.setMargins(20, 20, 20, 20);
               document.newPage();
//               //******************************Kitchen Order Toke***********************************
                PdfPTable KHeadTable = new PdfPTable(1);
                KHeadTable.addCell(HeaderCell("Kitchen Order Token"));
                KHeadTable.addCell(FooterCell("-----------------------------",14));
                KHeadTable.setWidthPercentage(100);
                document.add(KHeadTable);
                
                PdfPTable KDateTable = new PdfPTable(2);
                KDateTable.setWidthPercentage(100);
                KDateTable.addCell(DateCell("Invoice No:"));
                KDateTable.addCell(DateCellRight(takeid));
                 if(Membership.isSelected()){
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
                
                
                Kbody.setWidths(new float[] {1,6,2.5f,1.5f});
                 for(int i=0;i<PurchasedItems.getModel().getRowCount();i++)
                {
                int sn          = (int) PurchasedItems.getModel().getValueAt(i, 0);
                String name         = (String) PurchasedItems.getModel().getValueAt(i, 1);
                int rate         = (int) PurchasedItems.getModel().getValueAt(i, 2);
                String itemqty      = (String) PurchasedItems.getModel().getValueAt(i, 3).toString();
                
                Kbody.addCell(BodyCell(Integer.toString(sn)));
                Kbody.addCell(BodyCell(name));
                Kbody.addCell(BodyCell(Integer.toString(rate)));
                Kbody.addCell(BodyCellCenter(itemqty));
                } 
                 
                document.add(Kbody);
                 PdfPTable KFTable = new PdfPTable(1);
                KFTable.addCell(FooterCell("-----------------------------",14));
                KFTable.setWidthPercentage(100);
                document.add(KFTable);
                
               PdfPTable KitchenBill = new PdfPTable(2);
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
               
               try{
             //  Printing Starts Here
               PrintPdfPages print=new PrintPdfPages("TakeAway.pdf");//pdf file name
                try {
                    if (print.openPDFFile()) 
                    {
                        try {
                            print.printAllPages("BC-80POS");//printer name
                        } catch (PrintException ex) {
                            Logger.getLogger(POS.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } catch (PdfException ex) {         
                    Logger.getLogger(POS.class.getName()).log(Level.SEVERE, null, ex);
                }
                         print.closePDFfile(false);
//                //Ends Here
               }catch(Exception e)
               {
                   JOptionPane.showMessageDialog(null, "Please Connect the printer with System");
               }
                         
                 int rowCount = model.getRowCount();
                        //Remove rows one by one from the end of the table
                        for (int i = rowCount - 1; i >= 0; i--) 
                        {
                            model.removeRow(i);
                        }
                            Membership.setSelected(false);
                            MemershipForm.setVisible(false);
                            if(Membership.isSelected())
                            {
                            SAVEORDER.setEnabled(false);
                            KitchenOrder.setEnabled(false);
                            PrintOrder.setEnabled(false);
                            }
                            jPanel15.removeAll();
                            jPanel15.repaint();
                            jPanel15.revalidate();
                            
                        TotalAmount.setText("0.00");
                        TableForgroundColor.ChangeTableColor();
                         if(OrderType.getSelectedIndex()==2)
                        {
                        txt_Customer.setText("");
                        txt_Phone.setText("");
                        txt_DeliveryCharges.setText("0.0");
                        Area_Address.setText("");
                        txt_Remarks.setText("");
                        }
                         if(OrderType.getSelectedIndex()==1)
                        {
                        ServiceCharges.setText("0.0");

                        }
                      TokenNo++;
                try {
                    Desktop.getDesktop().open(new File("TakeAway.pdf"));
                } catch (IOException ex) {
                    Logger.getLogger(POS.class.getName()).log(Level.SEVERE, null, ex);
                }
           
              }catch(FileNotFoundException | DocumentException | SQLException | NumberFormatException e)
              {
              }
        }
    }   
}
