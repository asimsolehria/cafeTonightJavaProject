package MainPackage;

import static MainPackage.POS.PurchasedItems;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Category extends POS
{
         
      static int Sno=1;                  
      static  int quantity = 1;           //use for qty
      static  boolean ItemFound = false; //Used for quantity 
      static  int CurrentRow = 0;   
      static int no=0;
      static int srno=1;
      
      
      public static void AllItems(String EnteritemName)
      {
       
      int countItems;
      int temp = 0;
      int x = 3;
      int y = 15;
      int itemRate = 0;
//      model1 = (DefaultTableModel) PurchasedItems.getModel();
//      model2 = (DefaultTableModel) PurchasedItems.getModel();
      DefaultTableModel model = (DefaultTableModel) PurchasedItems.getModel();
      String getitemsno = "Select Count(*) as 'rowcount' from Items where category = '"+EnteritemName+"'";
      String getitems = "SELECT * FROM `items` where `Category` = '"+EnteritemName+"' order by `Name`";
      try
      {
          pst = con.prepareStatement(getitemsno);
          rs = pst.executeQuery();
          rs.next();
          countItems = rs.getInt("rowcount");
      
            JButton button[] = new JButton[countItems];
            jPanel15.removeAll();
            jPanel15.repaint();
            jPanel15.validate();
            if(countItems==0)
            {
                jPanel15.removeAll();
                jPanel15.repaint();
                jPanel15.validate();
            }
            pst = con.prepareStatement(getitems);
            rs = pst.executeQuery();
           while(rs.next())
          {
              
            String itemName = rs.getString("Name");
            if(Membership.isSelected())
            {
            itemRate = rs.getInt("MembershipRate");

            }else
            {
            itemRate = rs.getInt("Rate");
            }
            
            if(itemRate>0)
            {
            button[temp] = new JButton("<html><center><font><b>"+(itemName)+"<font color=red><br>Rs "+itemRate+"</font></b></font></center></html>");
            }
            
            if(itemName.length()>30)
            {

                button[temp].setFont(new java.awt.Font("Arial",java.awt.Font.PLAIN,10));
            }else if(itemName.length()>25)
            {

                button[temp].setFont(new java.awt.Font("Arial",java.awt.Font.PLAIN,11));
            }else
            {
                button[temp].setFont(new java.awt.Font("Arial",java.awt.Font.PLAIN,12));
            }
            button[temp].addActionListener(new ActionListener() 
            {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            discount.setText("0");
              int frstindex  = e.getSource().toString().indexOf("<b>")+3;
              int lastindex  = e.getSource().toString().indexOf("<font color=red>", e.getSource().toString().indexOf("<b>"));
                
              int ratefirstindex  = e.getSource().toString().indexOf("<br>Rs ")+7;
              int rateLastindex  = e.getSource().toString().indexOf("</font></b>", e.getSource().toString().indexOf("<br>Rs "));
                
               String itemFound =  e.getSource().toString().substring(frstindex,lastindex);             
               String rateFound = e.getSource().toString().substring(ratefirstindex,rateLastindex);
         String sql = "";
         if(Membership.isSelected())
         {
         sql ="select * from Items where Name = '"+itemFound+"' AND MembershipRate = '"+rateFound+"' AND category = '"+EnteritemName+"'";
         }else
         {
         sql ="select * from Items where Name = '"+itemFound+"' AND Rate = '"+rateFound+"' AND category = '"+EnteritemName+"'";
         } 
       try
       {
        String name = "";
        int itemrate = 0;
         pst = con.prepareStatement(sql);
         rs = pst.executeQuery();
         if(Membership.isSelected())
         {
          rs.next();
          name = rs.getString("Name");
          itemrate = rs.getInt("MembershipRate");
         }else
            {
            rs.next();
             name = rs.getString("Name");
             itemrate = rs.getInt("Rate");       
            }
             for(int i = 0; i < PurchasedItems.getRowCount(); i++)
             {//For each row
                if(PurchasedItems.getModel().getValueAt(i, 1).equals(name)&&PurchasedItems.getModel().getValueAt(i, 2).equals(itemrate))
            {   
                ItemFound=true;
                CurrentRow = i;
            }
    }       
             if(Membership.isSelected())
             {
                 quantity =2;
             }else
             {
                 quantity=1;
             }
             
             if(ItemFound)
             {
                String QtyStr = PurchasedItems.getValueAt(CurrentRow, 3).toString();
                int ItemQty = Integer.parseInt(QtyStr);

//                PurchasedItems.setValueAt(Sno, CurrentRow, 0);
                PurchasedItems.setValueAt(name, CurrentRow, 1);
                PurchasedItems.setValueAt(itemrate, CurrentRow, 2);
                if(Membership.isSelected())
                {
                    PurchasedItems.setValueAt(ItemQty+2, CurrentRow, 3);
                    PurchasedItems.setValueAt(((ItemQty+2)/2)*itemrate, CurrentRow, 4);
                }else
                {
                PurchasedItems.setValueAt(ItemQty+1, CurrentRow, 3);
                PurchasedItems.setValueAt((ItemQty+1)*itemrate, CurrentRow, 4);
                }
                ItemFound=false;
             }else
             {
                 if(Membership.isSelected())
                 {
                 model.addRow(new Object[]{PurchasedItems.getRowCount()+1,name, itemrate, quantity,((quantity-1)*itemrate)});
                 }else
                 {
                 model.addRow(new Object[]{PurchasedItems.getRowCount()+1,name, itemrate, quantity,(quantity*itemrate)});
                 }
                 ItemFound=false;                 
             }
            //Dine In Orders Add
            DineInOrderItemsAdd.AddDineInItems();
            //Changing table for color;
            TableForgroundColor.ChangeTableColor();
            
            if(Membership.isSelected())
            {
            Float GTotals = + itemrate * (quantity-1) + Float.parseFloat(TotalAmount.getText());
            TotalAmount.setText(Float.toString(GTotals));    
            SubTotal.setText(Float.toString(GTotals));    
            }else
            {
            Float GTotals = + itemrate * quantity + Float.parseFloat(TotalAmount.getText());
            TotalAmount.setText(Float.toString(GTotals));
            SubTotal.setText(Float.toString(GTotals));
            }
          
        //Buttons Validation
          
          if(Membership.isSelected())
          {
           if(cmb_Members.getSelectedIndex()!=0)
            {
                SAVEORDER.setEnabled(true);
                PDI.setEnabled(true);
                KitchenOrder.setEnabled(true);
                PrintOrder.setEnabled(true);
            }
          }else
          {
                SAVEORDER.setEnabled(true);
                PDI.setEnabled(true);
                KitchenOrder.setEnabled(true);
                PrintOrder.setEnabled(true);
          }
       }catch(Exception ex)
         {
             JOptionPane.showMessageDialog(null, ex+" Error in "+EnteritemName+"");
         }
            }
        });
            button[temp].setBackground(Color.getHSBColor(260, 100, 0));
            
            
            button[temp].setForeground(java.awt.Color.WHITE);            
            button[temp].setBounds(x, y, 100, 120);
            button[temp].setCursor(new Cursor(Cursor.HAND_CURSOR));
            
            switch (button[temp].getX()) 
              {
                  case 3:
                      x=104;
                      break;
                    case 104:
                        x=206;
                        break;
                  case 206:
                      x=308;
                      break;
                  case 308:
                      x=3;
                      y += 120; //size of y and + y variable initial value
                      break;
                  default:
                      break;
              }

            jPanel15.add(button[temp]);
            Dimension dim = new Dimension(x,y+120);
           jPanel15.setPreferredSize(dim);
            
                jPanel15.repaint();
                jPanel15.validate();
            
            
            temp++;
          }
        
        }catch(Exception e)
      {
          
      }  
    }
      
}