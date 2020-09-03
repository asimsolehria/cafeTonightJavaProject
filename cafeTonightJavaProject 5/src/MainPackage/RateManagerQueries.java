
package MainPackage;




import static MainPackage.TableManagement.*;



import javax.swing.JOptionPane;

/**
 * @author Abdul Sami
 */
public class RateManagerQueries extends TableManagement
{
  
    
    /**
     *
     */
    
//    public static void ShowAllItems(String itemnam)
//    {
//        cmb_LargeAvailable.removeAllItems();
//        
//        cmb_LargeAvailable.removeAllItems();
//
//        String show="SELECT * FROM `items` WHERE `Category` = '"+itemnam+"'";
//       try
//         {
//           pst = con.prepareStatement(show);
//           rs = pst.executeQuery();
//           while(rs.next())
//             {
//               String Iname = rs.getString("Name");
//         switch(itemnam)
//         {
//             case "LargePizza":  
//               cmb_LargeAvailable.addItem(Iname);
//               break;
//               
//         }
//               
//           
//             }
//         }catch(Exception e)
//           {
//             JOptionPane.showMessageDialog(null, e+" Error in Showing "+itemnam+"!");
//           }
//    }
//    
    
    
    public static void LargePizzaItemsShow()
    {

        cmb_LargeAvailable.removeAllItems();

        String show="SELECT * FROM `items` WHERE `Category` = 'LargePizza'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
             {
               String Iname = rs.getString("Name");
               cmb_LargeAvailable.addItem(Iname);
             }
         }catch(Exception e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in Showing Items!");
           }
    }
    
   
   public static void RegularPizzaItemsShow()
    {
        
        cmb_RegularAvailable.removeAllItems();

        String show="SELECT * FROM `items` WHERE `Category` = 'RegularPizza'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
             {
               String Iname = rs.getString("Name");
               cmb_RegularAvailable.addItem(Iname);
             }
         }catch(Exception e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in Showing Items!");
           }
    }
   
   public static void SmallPizzaItemsShow()
    {
        
        cmb_SmallAvailable.removeAllItems();

        String show="SELECT * FROM `items` WHERE `Category` = 'SmallPizza'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
             {
               String Iname = rs.getString("Name");
               cmb_SmallAvailable.addItem(Iname);
             }
         }catch(Exception e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in Showing Items!");
           }
    }
   //***************************************************************************
   //***************************************************************************
      
   public static void RollsShow()
    {
        
        cmb_RollsAvailable.removeAllItems();

        String show="SELECT * FROM `items` WHERE `Category` = 'Rolls'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
             {
               String Iname = rs.getString("Name");
               cmb_RollsAvailable.addItem(Iname);
             }
         }catch(Exception e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in Showing Items!");
           }
    }
   //***************************************************************************
   //***************************************************************************
    
   public static void DealsShow()
    {
        
        cmb_DealsAvailable.removeAllItems();

        String show="SELECT * FROM `items` WHERE `Category` = 'Deals'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
             {
               String Iname = rs.getString("Name");
               cmb_DealsAvailable.addItem(Iname);
             }
         }catch(Exception e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in Showing Items!");
           }
    }
   //***************************************************************************
   //***************************************************************************
    public static void FastFoodShow()
    {
        
        cmb_FastFoodAvailable.removeAllItems();

        String show="SELECT * FROM `items` WHERE `Category` = 'FastFood'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
             {
               String Iname = rs.getString("Name");
               cmb_FastFoodAvailable.addItem(Iname);
             }
         }catch(Exception e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in Showing Items!");
           }
    }
   //***************************************************************************
   //***************************************************************************
   public static void BBQShow()
    {
        
        cmb_BBQAvailable.removeAllItems();

        String show="SELECT * FROM `items` WHERE `Category` = 'BBQ'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
             {
               String Iname = rs.getString("Name");
               cmb_BBQAvailable.addItem(Iname);
             }
         }catch(Exception e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in Showing Items!");
           }
    }
   //***************************************************************************
   //***************************************************************************
    
   public static void BurgersShow()
    {
        
        cmb_BurgersAvailable.removeAllItems();

        String show="SELECT * FROM `items` WHERE `Category` = 'Burgers'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
             {
               String Iname = rs.getString("Name");
               cmb_BurgersAvailable.addItem(Iname);
             }
         }catch(Exception e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in Showing Items!");
           }
    }
   //***************************************************************************
   //***************************************************************************
    public static void BeveragesShow()
    {
        
        cmb_BeveragesAvailable.removeAllItems();

        String show="SELECT * FROM `items` WHERE `Category` = 'Beverages'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
             {
               String Iname = rs.getString("Name");
               cmb_BeveragesAvailable.addItem(Iname);
             }
         }catch(Exception e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in Showing Items!");
           }
    }
   //***************************************************************************
   //***************************************************************************
    public static void SaladRaitaShow()
    {
        
        cmb_SaladRaitaAvailable.removeAllItems();

        String show="SELECT * FROM `items` WHERE `Category` = 'SaladRaita'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
             {
               String Iname = rs.getString("Name");
               cmb_SaladRaitaAvailable.addItem(Iname);
             }
         }catch(Exception e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in Showing Items!");
           }
    }
   //***************************************************************************
   //***************************************************************************
    
   public static void BiryaniShow()
    {
        
        cmb_BiryaniAvailable.removeAllItems();

        String show="SELECT * FROM `items` WHERE `Category` = 'Biryani'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
             {
               String Iname = rs.getString("Name");
               cmb_BiryaniAvailable.addItem(Iname);
             }
         }catch(Exception e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in Showing Items!");
           }
    }
   //***************************************************************************
   //***************************************************************************
    public static void DessertsShow()
    {
        
        cmb_DessertsAvailable.removeAllItems();

        String show="SELECT * FROM `items` WHERE `Category` = 'Desserts'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
             {
               String Iname = rs.getString("Name");
               cmb_DessertsAvailable.addItem(Iname);
             }
         }catch(Exception e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in Showing Items!");
           }
    }
   //***************************************************************************
   //***************************************************************************
    public static void FriesShow()
    {
        
        cmb_FriesAvailable.removeAllItems();

        String show="SELECT * FROM `items` WHERE `Category` = 'Fries'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
             {
               String Iname = rs.getString("Name");
               cmb_FriesAvailable.addItem(Iname);
             }
         }catch(Exception e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in Showing Items!");
           }
    }
   //***************************************************************************
   //***************************************************************************
    
   public static void PastaShow()
    {
        
        cmb_PastaAvailable.removeAllItems();

        String show="SELECT * FROM `items` WHERE `Category` = 'Pasta'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
             {
               String Iname = rs.getString("Name");
               cmb_PastaAvailable.addItem(Iname);
             }
         }catch(Exception e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in Showing Items!");
           }
    }
   //***************************************************************************
   //***************************************************************************
    public static void CheeseGarlicBreadShow()
    {
        
        cmb_CheeseGarlicBreadAvailable.removeAllItems();

        String show="SELECT * FROM `items` WHERE `Category` = 'CheeseGarlicBread'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
             {
               String Iname = rs.getString("Name");
               cmb_CheeseGarlicBreadAvailable.addItem(Iname);
             }
         }catch(Exception e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in Showing Items!");
           }
    }
   //***************************************************************************
   //***************************************************************************
    public static void LasagniaShow()
    {
        
        cmb_LasagniaAvailable.removeAllItems();

        String show="SELECT * FROM `items` WHERE `Category` = 'Lasagnia'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
             {
               String Iname = rs.getString("Name");
               cmb_LasagniaAvailable.addItem(Iname);
             }
         }catch(Exception e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in Showing Items!");
           }
    }
   //***************************************************************************
   //***************************************************************************
    
   public static void OtherShow()
    {
        
        cmb_OtherAvailable.removeAllItems();

        String show="SELECT * FROM `items` WHERE `Category` = 'Other'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
             {
               String Iname = rs.getString("Name");
               cmb_OtherAvailable.addItem(Iname);
             }
         }catch(Exception e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in Showing Items!");
           }
    }
   //***************************************************************************
   //***************************************************************************
    public static void Other2Show()
    {
        
        cmb_Other2Available.removeAllItems();

        String show="SELECT * FROM `items` WHERE `Category` = 'Other2'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
             {
               String Iname = rs.getString("Name");
               cmb_Other2Available.addItem(Iname);
             }
         }catch(Exception e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in Showing Items!");
           }
    }
   //***************************************************************************
   //***************************************************************************
}
