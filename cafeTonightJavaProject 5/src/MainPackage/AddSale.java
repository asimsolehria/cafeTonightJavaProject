
package MainPackage;

import static MainPackage.POS.PurchasedItems;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author Abdul Sami
 */
public class AddSale extends POS
{
        static int OID   = 0;  //order id from db
//        static int ItmId = 0; //itemid get from db
        
//        static  DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
        static DateFormat ReportTime = new SimpleDateFormat("hh:mm:ss aa");
        static	String ReportTimeString = ReportTime.format(new Date());
        static	DateFormat ReportDate = new SimpleDateFormat("yyyy-MM-dd");
        static	String ReportDateString = ReportDate.format(new Date());
        static     java.util.Date dt = new java.util.Date();
        static    java.text.SimpleDateFormat sdf = 
            new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        static String currentTime = sdf.format(dt);
        static java.sql.Timestamp timestamp = new java.sql.Timestamp(dt.getTime());
        static String SaleType = "";
    
 public static void AddTakeAway()
 {
       
     
     int ItmId = 0;
     int itemsqty = 0; //getting items qty from db
        Calendar cal =  Calendar.getInstance();
        SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");
    
          
     try{

                        String sql = "INSERT INTO `sale`(`ItemsQty`, `discount`, `Subtotal`, `Total`, `SaleDate`, `SaleTime`, `Type`, `SaleCategory`, `LogId`) VALUES (?,?,?,?,?,?,?,?,?)";
                        pst = con.prepareStatement(sql);
                         for(int items=0;items<PurchasedItems.getModel().getRowCount();items++)
                        {
                         itemsqty += (int)PurchasedItems.getValueAt(items, 3);
                        }
                        pst.setInt(1, itemsqty);
                        pst.setString(2, discount.getText());
                        pst.setString(3, SubTotal.getText());
                        pst.setString(4, TotalAmount.getText());
                        pst.setString(5, currentTime);
                        pst.setString(6, s.format(cal.getTime()));
//                        pst.setString(6, timestamp.toString());
                        pst.setString(7, SaleType);
                        pst.setString(8, "TakeAway");
                        pst.setInt(9, Login.LOGID);
                        
                        pst.execute();
                        
                        //***************************************************************//GEtting Order It
                        String takeaway = "Select OrderId from Sale ORDER BY OrderId";
                        pst = con.prepareStatement(takeaway);
                        rs = pst.executeQuery();
                        while(rs.next())
                        {
                            OID = rs.getInt("OrderId");
                            
                        }
                        //****************************************************************//Geting Item Id
                        
                        String SoldItems = "INSERT INTO `solditems`(`ItemId`, `ItemsQty`, `OrderId`) VALUES (?,?,?)";
                        String ItemId = "";
                        for(int a=0;a<PurchasedItems.getModel().getRowCount();a++)
                        {
                        if(Membership.isSelected()){
                        ItemId = "Select * from Items Where Name = '"+PurchasedItems.getModel().getValueAt(a, 1)+"' AND Membershiprate = '"+PurchasedItems.getModel().getValueAt(a, 2)+"'";
                        }else{
                        ItemId = "Select * from Items Where Name = '"+PurchasedItems.getModel().getValueAt(a, 1)+"' AND rate = '"+PurchasedItems.getModel().getValueAt(a, 2)+"'";
                        }    
                        pst = con.prepareStatement(ItemId);
                        rs = pst.executeQuery();
                        while(rs.next())
                        {
                        ItmId = rs.getInt("ItemId");
                        }   
                        pst = con.prepareStatement(SoldItems);
                        pst.setInt(1, ItmId);
                        pst.setInt(2, (int)PurchasedItems.getModel().getValueAt(a, 3));
                        pst.setInt(3, OID);
                        pst.execute();
                        
                        } 
                        
//                        int rowCount = model.getRowCount();
//                        //Remove rows one by one from the end of the table
//                        for (int i = rowCount - 1; i >= 0; i--) {
//                            model.removeRow(i);
//                        }
//                        TotalAmount.setText("0.00");
                        
//                        TableForgroundColor.ChangeTableColor();
//                        CancelDineInOrder.CancelDineIn();
                       
//                        JOptionPane.showMessageDialog(null, "<html><font size='6' >Order Saved!</font></html>");
                    }catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null, e+" Error in inserting TakeAway Record!");
                    }
}
 public static void AddDineIn()
 {
     int ItmId = 0;
     int itemsqty = 0; //getting items qty from db
        Calendar cal =  Calendar.getInstance();
        SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");
    
     
     try{
                          String sql = "INSERT INTO `sale`(`ItemsQty`, `discount`, `Subtotal`, `Total`, `SaleDate`, `SaleTime`, `Type`, `SaleCategory`, `LogId`) VALUES (?,?,?,?,?,?,?,?,?)";
                        pst = con.prepareStatement(sql);
                         for(int items=0;items<PurchasedItems.getModel().getRowCount();items++)
                        {
                         itemsqty += (int)PurchasedItems.getValueAt(items, 3);
                        }
                        pst.setInt(1, itemsqty);
                        pst.setString(2, discount.getText());
                        pst.setString(3, SubTotal.getText());
                        pst.setString(4, TotalAmount.getText());
                        pst.setString(5, currentTime);
                        pst.setString(6, s.format(cal.getTime()));
//                        pst.setString(6, timestamp.toString());
                        pst.setString(7, SaleType);
                        pst.setString(8, "DineIn");
                        pst.setInt(9, Login.LOGID);
                        
                        pst.execute();
                        //***************************************************************//GEtting Order It
                        String takeaway = "Select OrderId from Sale ORDER BY OrderId";
                        pst = con.prepareStatement(takeaway);
                        rs = pst.executeQuery();
                        while(rs.next())
                        {
                            OID = rs.getInt("OrderId");
                            
                        }
                        //****************************************************************//Inserting Dine in details
                        
                        
                        String addDineDetails = "INSERT INTO `diningdetails`(`TableNo`, `Waiter`, `Charges`, `OrderId`) VALUES (?,?,?,?)";
                        pst = con.prepareStatement(addDineDetails);
                         
                        pst.setString(1, lbl_TableName.getText());
                        if(cmb_Waiters.getSelectedIndex()==-1){
                        pst.setString(2, "nil");
                        }else{
                        pst.setString(2, cmb_Waiters.getSelectedItem().toString());
                        }
                        if(ServiceCharges.getText().isEmpty())
                        {
                        pst.setString(3, "0");
                        }else
                        {
                        pst.setString(3, ServiceCharges.getText());
                        }
                        pst.setInt(4, OID);
                        pst.execute();
                        
                        //****************************************************************//Geting Item Id
                        
                        String SoldItems = "INSERT INTO `solditems`(`ItemId`, `ItemsQty`, `OrderId`) VALUES (?,?,?)";
                        String ItemId = "";
                        for(int a=0;a<PurchasedItems.getModel().getRowCount();a++)
                        {
                        if(Membership.isSelected()){
                        ItemId = "Select * from Items Where Name = '"+PurchasedItems.getModel().getValueAt(a, 1)+"' AND Membershiprate = '"+PurchasedItems.getModel().getValueAt(a, 2)+"'";
                        }else{
                        ItemId = "Select * from Items Where Name = '"+PurchasedItems.getModel().getValueAt(a, 1)+"' AND rate = '"+PurchasedItems.getModel().getValueAt(a, 2)+"'";
                        }
                        pst = con.prepareStatement(ItemId);
                        rs = pst.executeQuery();
                        while(rs.next())
                        {
                        ItmId = rs.getInt("ItemId");
                        }   
                        pst = con.prepareStatement(SoldItems);
                        pst.setInt(1, ItmId);
                        pst.setInt(2, (int)PurchasedItems.getModel().getValueAt(a, 3));
                        pst.setInt(3, OID);
                        pst.execute();
                        
                        } 
                        
        
//        int rowCount = model.getRowCount();
//        //Remove rows one by one from the end of the table
//        for (int i = rowCount - 1; i >= 0; i--) {
//            model.removeRow(i);
//        }
        
//        TableForgroundColor.ChangeTableColor();
        CancelDineInOrder.CancelDineIn();
//                       JOptionPane.showMessageDialog(null, "<html><font size='6' >Order Saved!</font></html>");
                    }catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null, e+" Error in inserting DineIn Record!");
                    }
 }
 
 public static void AddDelivery()
 {
     int itemsqty = 0; //getting items qty from db
     int ItmId = 0;
        Calendar cal =  Calendar.getInstance();
        SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");
     try{
                        
                 String sql = "INSERT INTO `sale`(`ItemsQty`, `discount`, `Subtotal`, `Total`, `SaleDate`, `SaleTime`, `Type`, `SaleCategory`, `LogId`) VALUES (?,?,?,?,?,?,?,?,?)";
                pst = con.prepareStatement(sql);
                 for(int items=0;items<PurchasedItems.getModel().getRowCount();items++)
                {
                 itemsqty += (int)PurchasedItems.getValueAt(items, 3);
                }
                pst.setInt(1, itemsqty);
                pst.setString(2, discount.getText());
                pst.setString(3, SubTotal.getText());
                pst.setString(4, TotalAmount.getText());
                pst.setString(5, currentTime);
                pst.setString(6, s.format(cal.getTime()));
//                        pst.setString(6, timestamp.toString());
                pst.setString(7, SaleType);
                pst.setString(8, "Home Delivery");
                pst.setInt(9, Login.LOGID);

                pst.execute();
                //***************************************************************//GEtting Order It
                String takeaway = "Select OrderId from Sale ORDER BY OrderId";
                pst = con.prepareStatement(takeaway);
                rs = pst.executeQuery();
                while(rs.next())
                {
                    OID = rs.getInt("OrderId");

                }
                //****************************************************************//Inserting Delivery in details
                 String addDeliveryDetails = "INSERT INTO `deliverydetails`(`Customer`, `Phone`, `Charges`, `Address`, `DeliveryBoy`, `Remarks`, `OrderId`) VALUES (?,?,?,?,?,?,?)";
                pst = con.prepareStatement(addDeliveryDetails);
                pst.setString(1, txt_Customer.getText());
                pst.setString(2, txt_Phone.getText());
                 if(txt_DeliveryCharges.getText().isEmpty())
                {
                pst.setString(3, "0");
                }else
                {
                pst.setString(3, txt_DeliveryCharges.getText());
                }
                pst.setString(4, Area_Address.getText());
                if(DeliveryBoy.getSelectedIndex()==-1){
                pst.setString(5, "nil");
                }else{
                pst.setString(5, DeliveryBoy.getSelectedItem().toString());
                }
                pst.setString(6, txt_Remarks.getText());
                pst.setInt(7, OID);
                pst.execute();

                //****************************************************************//Geting Item Id

                String SoldItems = "INSERT INTO `solditems`(`ItemId`, `ItemsQty`, `OrderId`) VALUES (?,?,?)";
                String ItemId = "";
                for(int a=0;a<PurchasedItems.getModel().getRowCount();a++)
                {
                if(Membership.isSelected()){
                ItemId = "Select * from Items Where Name = '"+PurchasedItems.getModel().getValueAt(a, 1)+"' AND Membershiprate = '"+PurchasedItems.getModel().getValueAt(a, 2)+"'";
                }else{
                ItemId = "Select * from Items Where Name = '"+PurchasedItems.getModel().getValueAt(a, 1)+"' AND rate = '"+PurchasedItems.getModel().getValueAt(a, 2)+"'";
                }
                pst = con.prepareStatement(ItemId);
                rs = pst.executeQuery();
                while(rs.next())
                {
                ItmId = rs.getInt("ItemId");
                }   
                pst = con.prepareStatement(SoldItems);
                pst.setInt(1, ItmId);
                pst.setInt(2, (int)PurchasedItems.getModel().getValueAt(a, 3));
                pst.setInt(3, OID);
                pst.execute();
                }
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e+" Error in inserting Delivery Record!");
            }
 }
 
 
}
