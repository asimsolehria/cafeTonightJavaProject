
package MainPackage;


import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Abdul Sami
 */
public class RateManagerCRUD extends TableManagement
{
    
    public static void AddLargePizza()
    {
        if(txt_LargePizza.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Name is required!");
        }else
        {   
        String sql = "INSERT INTO `items`(name,rate,membershiprate,category) VALUES (?,?,?,?)";
       try
         {
           pst = con.prepareStatement(sql);
           pst.setString(1, txt_LargePizza.getText());
           pst.setString(2, txt_LargeRate.getText());
           pst.setString(3, txt_LargeRate1.getText());
           pst.setString(4, "LargePizza");
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Added!");
           txt_LID.setText("");
            txt_LargePizza.setText("");
            txt_LargeRate.setText("");
            txt_LargeRate1.setText("");
           
           RateManagerQueries.LargePizzaItemsShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void DeleteLargePizza()
    {
                if(txt_LID.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Select Item First!");
        }else
        {   
        String delete = "delete from Items where ItemId = '"+txt_LID.getText()+"'";
       try
         {
           pst = con.prepareStatement(delete);
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Deleted!");
            txt_LID.setText("");
            txt_LargePizza.setText("");
            txt_LargeRate.setText("");
            txt_LargeRate1.setText("");
           
           RateManagerQueries.LargePizzaItemsShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void ShowLargePizza()
    {
        String name = null;
        if(cmb_LargeAvailable.getSelectedIndex()!=-1){
       String  delete = "select * from Items where name = '"+cmb_LargeAvailable.getSelectedItem().toString()+"' AND category = 'LargePizza'";
         
       try
            {
           pst = con.prepareStatement(delete);
           rs = pst.executeQuery();
       
            while(rs.next())
            {
                String id = rs.getString("ItemId");
                name = rs.getString("Name");
                String rate = rs.getString("Rate");
                String mrate = rs.getString("MembershipRate");
                txt_LID.setText(id);
                txt_LargePizza.setText(name);
                txt_LargeRate.setText(rate);
                txt_LargeRate1.setText(mrate);
            }
            
            RateManagerQueries.LargePizzaItemsShow();
            cmb_LargeAvailable.setSelectedItem(name);
            
         }catch(Exception e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
         
        }  
        
    }
    //**************************************************************************
    //**************************************************************************
    public static void AddRegularPizza()
    {
                      if(txt_RegularPizza.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Name is required!");
        }else
        {   
         String sql = "INSERT INTO `items`(name,rate,membershiprate,category) VALUES (?,?,?,?)";
       try
         {
           pst = con.prepareStatement(sql);
           pst.setString(1, txt_RegularPizza.getText());
           pst.setString(2, txt_RegularRate.getText());
           pst.setString(3, txt_LargeRate2.getText());
           pst.setString(4, "RegularPizza");
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Added!");
           txt_RID.setText("");
            txt_RegularPizza.setText("");
            txt_RegularRate.setText("");
            txt_LargeRate2.setText("");
           
           RateManagerQueries.RegularPizzaItemsShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void DeleteRegularPizza()
    {
            if(txt_RID.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Select Item First!");
        }else
        {   
        String delete = "delete from Items where ItemId = '"+txt_RID.getText()+"'";
       try
         {
           pst = con.prepareStatement(delete);
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Deleted!");
           txt_RID.setText("");
            txt_RegularPizza.setText("");
            txt_RegularRate.setText("");
            txt_LargeRate2.setText("");
           
           RateManagerQueries.RegularPizzaItemsShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void ShowRegularPizza()
    {
        String name = null;
                if(cmb_RegularAvailable.getSelectedIndex()!=-1){
          String delete = "select * from Items where name = '"+cmb_RegularAvailable.getSelectedItem().toString()+"' AND category = 'RegularPizza'";
       try
         {
           pst = con.prepareStatement(delete);
           rs = pst.executeQuery();
           while(rs.next())
           {
               String id = rs.getString("ItemId");
               name = rs.getString("Name");
               String rate = rs.getString("Rate");
               String mrate = rs.getString("MembershipRate");
               txt_RID.setText(id);
               txt_RegularPizza.setText(name);
               txt_RegularRate.setText(rate);
               txt_LargeRate2.setText(mrate);
               
           }
           
           RateManagerQueries.RegularPizzaItemsShow();
           cmb_RegularAvailable.setSelectedItem(name);
         }catch(Exception e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }   
                }
    }
    //**************************************************************************
    //**************************************************************************
    public static void AddSmallPizza()
    {
                if(txt_SmallPizza.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Name is required!");
        }else
        {   
         String sql = "INSERT INTO `items`(name,rate,membershiprate,category) VALUES (?,?,?,?)";
       try
         {
           pst = con.prepareStatement(sql);
           pst.setString(1, txt_SmallPizza.getText());
           pst.setString(2, txt_SmallRate.getText());
           pst.setString(3, txt_LargeRate3.getText());
           pst.setString(4, "SmallPizza");
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Added!");
           txt_SID.setText("");
            txt_SmallPizza.setText("");
            txt_SmallRate.setText("");
            txt_LargeRate3.setText("");
           
           RateManagerQueries.SmallPizzaItemsShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void DeleteSmallPizza()
    {
                 if(txt_SID.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Select Item First!");
        }else
        {   
        String delete = "delete from Items where ItemId = '"+txt_SID.getText()+"'";
       try
         {
           pst = con.prepareStatement(delete);
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Deleted!");
           txt_SID.setText("");
            txt_SmallPizza.setText("");
            txt_SmallRate.setText("");
            txt_LargeRate3.setText("");
           
           RateManagerQueries.SmallPizzaItemsShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void ShowSmallPizza()
    {
        String name = null;
                if(cmb_SmallAvailable.getSelectedIndex()!=-1){
               String show = "select * from Items where name = '"+cmb_SmallAvailable.getSelectedItem().toString()+"' AND category = 'SmallPizza'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
           {
               String id = rs.getString("ItemId");
               name = rs.getString("Name");
               String rate = rs.getString("Rate");
               String mrate = rs.getString("MembershipRate");
               txt_SID.setText(id);
               txt_SmallPizza.setText(name);
               txt_SmallRate.setText(rate);
               txt_LargeRate3.setText(mrate);
           }
           
           RateManagerQueries.SmallPizzaItemsShow();
           cmb_SmallAvailable.setSelectedItem(name);
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           } 
                }
    }
    
    //**************************************************************************
    //**************************************************************************
    public static void AddRoll()
    {
                if(txt_Roll.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Name is required!");
        }else
        {   
         String sql = "INSERT INTO `items`(name,rate,membershiprate,category) VALUES (?,?,?,?)";
       try
         {
           pst = con.prepareStatement(sql);
           pst.setString(1, txt_Roll.getText());
           pst.setString(2, txt_RollRate.getText());
           pst.setString(3, txt_LargeRate4.getText());
           pst.setString(4, "Rolls");
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Added!");
           txt_RollID.setText("");
            txt_Roll.setText("");
            txt_RollRate.setText("");
            txt_LargeRate4.setText("");
           
           RateManagerQueries.RollsShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void DeleteRoll()
    {
                 if(txt_RollID.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Select Item First!");
        }else
        {   
        String delete = "delete from Items where ItemId = '"+txt_RollID.getText()+"'";
       try
         {
           pst = con.prepareStatement(delete);
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Deleted!");
           txt_RollID.setText("");
            txt_Roll.setText("");
            txt_RollRate.setText("");
            txt_LargeRate4.setText("");
           
           RateManagerQueries.RollsShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void ShowRolls()
    {
        String name = null;
                if(cmb_RollsAvailable.getSelectedIndex()!=-1){
               String show = "select * from Items where name = '"+cmb_RollsAvailable.getSelectedItem().toString()+"' AND category = 'Rolls'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
           {
               String id = rs.getString("ItemId");
                name = rs.getString("Name");
               String rate = rs.getString("Rate");
               String mrate = rs.getString("MembershipRate");
               txt_RollID.setText(id);
               txt_Roll.setText(name);
               txt_RollRate.setText(rate);
               txt_LargeRate4.setText(mrate);
           }
           
           RateManagerQueries.RollsShow();
           cmb_RollsAvailable.setSelectedItem(name);
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           } }
    }
    //**************************************************************************
    //**************************************************************************
    public static void AddDeal()
    {
                if(txt_Deal.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Name is required!");
        }else
        {   
         String sql = "INSERT INTO `items`(name,rate,membershiprate,category) VALUES (?,?,?,?)";
       try
         {
           pst = con.prepareStatement(sql);
           pst.setString(1, txt_Deal.getText());
           pst.setString(2, txt_DealRate.getText());
           pst.setString(3, txt_LargeRate5.getText());
           pst.setString(4, "Deals");
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Added!");
           txt_DealID.setText("");
            txt_Deal.setText("");
            txt_DealRate.setText("");
            txt_LargeRate5.setText("");
           
           RateManagerQueries.DealsShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void DeleteDeal()
    {
                 if(txt_DealID.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Select Item First!");
        }else
        {   
        String delete = "delete from Items where ItemId = '"+txt_DealID.getText()+"'";
       try
         {
           pst = con.prepareStatement(delete);
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Deleted!");
           txt_DealID.setText("");
            txt_Deal.setText("");
            txt_DealRate.setText("");
            txt_LargeRate5.setText("");
           
           RateManagerQueries.DealsShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void ShowDeals()
    {
         String name = null;
                 if(cmb_DealsAvailable.getSelectedIndex()!=-1){
               String show = "select * from Items where name = '"+cmb_DealsAvailable.getSelectedItem().toString()+"' AND category = 'Deals'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
           {
               String id = rs.getString("ItemId");
                name = rs.getString("Name");
               String rate = rs.getString("Rate");
                String mrate = rs.getString("MembershipRate");
               txt_DealID.setText(id);
               txt_Deal.setText(name);
               txt_DealRate.setText(rate);
               txt_LargeRate5.setText(mrate);
           }
           
           RateManagerQueries.DealsShow();
           cmb_DealsAvailable.setSelectedItem(name);
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           } }
                 
    }
    //**************************************************************************
    //**************************************************************************
      public static void AddFastFood()
    {
                if(txt_FastFood.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Name is required!");
        }else
        {   
         String sql = "INSERT INTO `items`(name,rate,membershiprate,category) VALUES (?,?,?,?)";
       try
         {
           pst = con.prepareStatement(sql);
           pst.setString(1, txt_FastFood.getText());
           pst.setString(2, txt_FastFoodRate.getText());
           pst.setString(3, txt_LargeRate6.getText());
           pst.setString(4, "FastFood");
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Added!");
           txt_FastFoodID.setText("");
            txt_FastFood.setText("");
            txt_FastFoodRate.setText("");
            txt_LargeRate6.setText("");
           
           RateManagerQueries.FastFoodShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void DeleteFastFood()
    {
                 if(txt_FastFoodID.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Select Item First!");
        }else
        {   
        String delete = "delete from Items where ItemId = '"+txt_FastFoodID.getText()+"'";
       try
         {
           pst = con.prepareStatement(delete);
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Deleted!");
           txt_FastFoodID.setText("");
            txt_FastFood.setText("");
            txt_FastFoodRate.setText("");
            txt_LargeRate6.setText("");
           
           RateManagerQueries.FastFoodShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void ShowFastFood()
    {
        String name = null ;
                if(cmb_FastFoodAvailable.getSelectedIndex()!=-1){
               String show = "select * from Items where name = '"+cmb_FastFoodAvailable.getSelectedItem().toString()+"' AND category = 'FastFood'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           
           while(rs.next())
           {
               String id = rs.getString("ItemId");
                name = rs.getString("Name");
               String rate = rs.getString("Rate");
               String mrate = rs.getString("MembershipRate");
               
               
               
               txt_FastFoodID.setText(id);
               txt_FastFood.setText(name);
               txt_FastFoodRate.setText(rate);
               txt_LargeRate6.setText(mrate);
           }
           
           RateManagerQueries.FastFoodShow();
           cmb_FastFoodAvailable.setSelectedItem(name);
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           } }
    }
    //**************************************************************************
    //**************************************************************************
    
    public static void AddBBQ()
    {
                if(txt_Roll1.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Name is required!");
        }else
        {   
         String sql = "INSERT INTO `items`(name,rate,membershiprate,category) VALUES (?,?,?,?)";
       try
         {
           pst = con.prepareStatement(sql);
           pst.setString(1, txt_Roll1.getText());
           pst.setString(2, txt_RollRate1.getText());
           pst.setString(3, txt_LargeRate7.getText());
           pst.setString(4, "BBQ");
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Added!");
           txt_RollID1.setText("");
            txt_Roll1.setText("");
            txt_RollRate1.setText("");
            txt_LargeRate7.setText("");
           
           RateManagerQueries.BBQShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void DeleteBBQ()
    {
                 if(txt_RollID1.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Select Item First!");
        }else
        {   
        String delete = "delete from Items where ItemId = '"+txt_RollID1.getText()+"'";
       try
         {
           pst = con.prepareStatement(delete);
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Deleted!");
           txt_RollID1.setText("");
            txt_Roll1.setText("");
            txt_RollRate1.setText("");
            txt_LargeRate7.setText("");
           
           RateManagerQueries.BBQShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void ShowBBQ()
    {
        String name = null;
                if(cmb_BBQAvailable.getSelectedIndex()!=-1){
               String show = "select * from Items where name = '"+cmb_BBQAvailable.getSelectedItem().toString()+"' AND category = 'BBQ'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
           {
               String id = rs.getString("ItemId");
               name = rs.getString("Name");
               String rate = rs.getString("Rate");
               String mrate = rs.getString("MembershipRate");
               txt_RollID1.setText(id);
               txt_Roll1.setText(name);
               txt_RollRate1.setText(rate);
               txt_LargeRate7.setText(mrate);
           }
           
           RateManagerQueries.BBQShow();
           cmb_BBQAvailable.setSelectedItem(name);
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           } }
    }
    //**************************************************************************
    //**************************************************************************
    public static void AddBurger()
    {
                if(txt_Deal1.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Name is required!");
        }else
        {   
         String sql = "INSERT INTO `items`(name,rate,membershiprate,category) VALUES (?,?,?,?)";
       try
         {
           pst = con.prepareStatement(sql);
           pst.setString(1, txt_Deal1.getText());
           pst.setString(2, txt_DealRate1.getText());
           pst.setString(3, txt_LargeRate8.getText());
           pst.setString(4, "Burgers");
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Added!");
           txt_DealID1.setText("");
            txt_Deal1.setText("");
            txt_DealRate1.setText("");
            txt_LargeRate8.setText("");
           
           RateManagerQueries.BurgersShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void DeleteBurger()
    {
                 if(txt_DealID1.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Select Item First!");
        }else
        {   
        String delete = "delete from Items where ItemId = '"+txt_DealID1.getText()+"'";
       try
         {
           pst = con.prepareStatement(delete);
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Deleted!");
           txt_DealID1.setText("");
            txt_Deal1.setText("");
            txt_DealRate1.setText("");
            txt_LargeRate8.setText("");
           
           RateManagerQueries.BurgersShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void ShowBurgers()
    {
        String name = null;
                if(cmb_BurgersAvailable.getSelectedIndex()!=-1){
               String show = "select * from Items where name = '"+cmb_BurgersAvailable.getSelectedItem().toString()+"' AND category = 'Burgers'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
           {
               String id = rs.getString("ItemId");
               name = rs.getString("Name");
               String rate = rs.getString("Rate");
               String mrate = rs.getString("MembershipRate");
               txt_DealID1.setText(id);
               txt_Deal1.setText(name);
               txt_DealRate1.setText(rate);
               txt_LargeRate8.setText(mrate);
           }
           
           RateManagerQueries.BurgersShow();
           cmb_BurgersAvailable.setSelectedItem(name);
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           } }
    }
    //**************************************************************************
    //**************************************************************************
      public static void AddBeverages()
    {
                if(txt_FastFood1.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Name is required!");
        }else
        {   
         String sql = "INSERT INTO `items`(name,rate,membershiprate,category) VALUES (?,?,?,?)";
       try
         {
           pst = con.prepareStatement(sql);
           pst.setString(1, txt_FastFood1.getText());
           pst.setString(2, txt_FastFoodRate1.getText());
           pst.setString(3, txt_LargeRate9.getText());
           pst.setString(4, "Beverages");
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Added!");
           txt_FastFoodID1.setText("");
            txt_FastFood1.setText("");
            txt_FastFoodRate1.setText("");
            txt_LargeRate9.setText("");
           
           RateManagerQueries.BeveragesShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void DeleteBeverages()
    {
                 if(txt_FastFoodID1.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Select Item First!");
        }else
        {   
        String delete = "delete from Items where ItemId = '"+txt_FastFoodID1.getText()+"'";
       try
         {
           pst = con.prepareStatement(delete);
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Deleted!");
           txt_FastFoodID1.setText("");
            txt_FastFood1.setText("");
            txt_FastFoodRate1.setText("");
            txt_LargeRate9.setText("");
           
           RateManagerQueries.BeveragesShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void ShowBeverages()
    {
        String name = null;
                if(cmb_BeveragesAvailable.getSelectedIndex()!=-1){
               String show = "select * from Items where name = '"+cmb_BeveragesAvailable.getSelectedItem().toString()+"' AND category = 'Beverages'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
           {
               String id = rs.getString("ItemId");
                name = rs.getString("Name");
               String rate = rs.getString("Rate");
               String mrate = rs.getString("MembershipRate");
               txt_FastFoodID1.setText(id);
               txt_FastFood1.setText(name);
               txt_FastFoodRate1.setText(rate);
               txt_LargeRate9.setText(mrate);
           }
           
           RateManagerQueries.BeveragesShow();
           cmb_BeveragesAvailable.setSelectedItem(name);
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           } }
    }
    
    ////////////////////////////////////////////////////////////////////////////
    public static void AddSaladRaita()
    {
                if(txt_Roll2.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Name is required!");
        }else
        {   
         String sql = "INSERT INTO `items`(name,rate,membershiprate,category) VALUES (?,?,?,?)";
       try
         {
           pst = con.prepareStatement(sql);
           pst.setString(1, txt_Roll2.getText());
           pst.setString(2, txt_RollRate2.getText());
           pst.setString(3, txt_LargeRate10.getText());
           pst.setString(4, "SaladRaita");
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Added!");
           txt_RollID2.setText("");
            txt_Roll2.setText("");
            txt_RollRate2.setText("");
            txt_LargeRate10.setText("");
           
           RateManagerQueries.SaladRaitaShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void DeleteSaladRaita()
    {
                 if(txt_RollID2.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Select Item First!");
        }else
        {   
        String delete = "delete from Items where ItemId = '"+txt_RollID2.getText()+"'";
       try
         {
           pst = con.prepareStatement(delete);
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Deleted!");
           txt_RollID2.setText("");
            txt_Roll2.setText("");
            txt_RollRate2.setText("");
            txt_LargeRate10.setText("");
           
           RateManagerQueries.SaladRaitaShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void ShowSaladRaita()
    {
        String name = null;
                if(cmb_SaladRaitaAvailable.getSelectedIndex()!=-1){
               String show = "select * from Items where name = '"+cmb_SaladRaitaAvailable.getSelectedItem().toString()+"' AND category = 'SaladRaita'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
           {
               String id = rs.getString("ItemId");
               name = rs.getString("Name");
               String rate = rs.getString("Rate");
               String mrate = rs.getString("MembershipRate");
               txt_RollID2.setText(id);
               txt_Roll2.setText(name);
               txt_RollRate2.setText(rate);
               txt_LargeRate10.setText(mrate);
               
           }
           
           RateManagerQueries.SaladRaitaShow();
           cmb_SaladRaitaAvailable.setSelectedItem(name);
           
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           } }
    }
    //**************************************************************************
    //**************************************************************************
    public static void AddBiryani()
    {
                if(txt_Deal2.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Name is required!");
        }else
        {   
         String sql = "INSERT INTO `items`(name,rate,membershiprate,category) VALUES (?,?,?,?)";
       try
         {
           pst = con.prepareStatement(sql);
           pst.setString(1, txt_Deal2.getText());
           pst.setString(2, txt_DealRate2.getText());
           pst.setString(3, txt_LargeRate11.getText());
           pst.setString(4, "Biryani");
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Added!");
           txt_DealID2.setText("");
            txt_Deal2.setText("");
            txt_DealRate2.setText("");
            txt_LargeRate11.setText("");
           
           RateManagerQueries.BiryaniShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void DeleteBiryani()
    {
                 if(txt_DealID2.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Select Item First!");
        }else
        {   
        String delete = "delete from Items where ItemId = '"+txt_DealID2.getText()+"'";
       try
         {
           pst = con.prepareStatement(delete);
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Deleted!");
           txt_DealID2.setText("");
            txt_Deal2.setText("");
            txt_DealRate2.setText("");
            txt_LargeRate11.setText("");
           
           RateManagerQueries.BiryaniShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void ShowBiryani()
    {
        String name = null;
                if(cmb_BiryaniAvailable.getSelectedIndex()!=-1){
               String show = "select * from Items where name = '"+cmb_BiryaniAvailable.getSelectedItem().toString()+"' AND category = 'Biryani'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
           {
               String id = rs.getString("ItemId");
               name = rs.getString("Name");
               String rate = rs.getString("Rate");
               String mrate = rs.getString("MembershipRate");
               txt_DealID2.setText(id);
               txt_Deal2.setText(name);
               txt_DealRate2.setText(rate);
               txt_LargeRate11.setText(mrate);
           }
           
           RateManagerQueries.BiryaniShow();
           cmb_BiryaniAvailable.setSelectedItem(name);
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           } }
    }
    //**************************************************************************
    //**************************************************************************
      public static void AddDesserts()
    {
                if(txt_FastFood2.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Name is required!");
        }else
        {   
         String sql = "INSERT INTO `items`(name,rate,membershiprate,category) VALUES (?,?,?,?)";
       try
         {
           pst = con.prepareStatement(sql);
           pst.setString(1, txt_FastFood2.getText());
           pst.setString(2, txt_FastFoodRate2.getText());
           pst.setString(3, txt_LargeRate12.getText());
           pst.setString(4, "Desserts");
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Added!");
           txt_FastFoodID2.setText("");
            txt_FastFood2.setText("");
            txt_FastFoodRate2.setText("");
            txt_LargeRate12.setText("");
           
           RateManagerQueries.DessertsShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void DeleteDesserts()
    {
                 if(txt_FastFoodID2.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Select Item First!");
        }else
        {   
        String delete = "delete from Items where ItemId = '"+txt_FastFoodID2.getText()+"'";
       try
         {
           pst = con.prepareStatement(delete);
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Deleted!");
           txt_FastFoodID2.setText("");
            txt_FastFood2.setText("");
            txt_FastFoodRate2.setText("");
            txt_LargeRate12.setText("");
           
           RateManagerQueries.DessertsShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void ShowDesserts()
    {
        String name = null;
                if(cmb_DessertsAvailable.getSelectedIndex()!=-1){
        String show = "select * from Items where name = '"+cmb_DessertsAvailable.getSelectedItem().toString()+"' AND category = 'Desserts'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
           {
               String id = rs.getString("ItemId");
               name = rs.getString("Name");
               String rate = rs.getString("Rate");
               String mrate = rs.getString("MembershipRate");
               txt_FastFoodID2.setText(id);
               txt_FastFood2.setText(name);
               txt_FastFoodRate2.setText(rate);
               txt_LargeRate12.setText(mrate);
           }
           
           RateManagerQueries.DessertsShow();
           cmb_DessertsAvailable.setSelectedItem(name);
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           } }
    }
    
    ////////////////////////////////////////////////////////////////////////////
    public static void AddFries()
    {
                if(txt_Roll3.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Name is required!");
        }else
        {   
         String sql = "INSERT INTO `items`(name,rate,membershiprate,category) VALUES (?,?,?,?)";
       try
         {
           pst = con.prepareStatement(sql);
           pst.setString(1, txt_Roll3.getText());
           pst.setString(2, txt_RollRate3.getText());
           pst.setString(3, txt_LargeRate13.getText());
           pst.setString(4, "Fries");
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Added!");
           txt_RollID3.setText("");
            txt_Roll3.setText("");
            txt_RollRate3.setText("");
            txt_LargeRate13.setText("");
           
           RateManagerQueries.FriesShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void DeleteFries()
    {
                 if(txt_RollID3.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Select Item First!");
        }else
        {   
        String delete = "delete from Items where ItemId = '"+txt_RollID3.getText()+"'";
       try
         {
           pst = con.prepareStatement(delete);
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Deleted!");
           txt_RollID3.setText("");
            txt_Roll3.setText("");
            txt_RollRate3.setText("");
            txt_LargeRate13.setText("");
           
           RateManagerQueries.FriesShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void ShowFries()
    {
        String name = null;
                if(cmb_FriesAvailable.getSelectedIndex()!=-1){
               String show = "select * from Items where name = '"+cmb_FriesAvailable.getSelectedItem().toString()+"' AND category = 'Fries'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
           {
               String id = rs.getString("ItemId");
               name = rs.getString("Name");
               String rate = rs.getString("Rate");
               String mrate = rs.getString("MembershipRate");
               txt_RollID3.setText(id);
               txt_Roll3.setText(name);
               txt_RollRate3.setText(rate);
               txt_LargeRate13.setText(mrate);
           }
           
           RateManagerQueries.SaladRaitaShow();
           cmb_FriesAvailable.setSelectedItem(name);
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           } }
    }
    //**************************************************************************
    //**************************************************************************
    public static void AddPasta()
    {
                if(txt_Deal3.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Name is required!");
        }else
        {   
         String sql = "INSERT INTO `items`(name,rate,membershiprate,category) VALUES (?,?,?,?)";
       try
         {
           pst = con.prepareStatement(sql);
           pst.setString(1, txt_Deal3.getText());
           pst.setString(2, txt_DealRate3.getText());
           pst.setString(3, txt_LargeRate14.getText());
           pst.setString(4, "Pasta");
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Added!");
           txt_DealID3.setText("");
            txt_Deal3.setText("");
            txt_DealRate3.setText("");
            txt_LargeRate14.setText("");
           
           RateManagerQueries.PastaShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void DeletePasta()
    {
                 if(txt_DealID3.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Select Item First!");
        }else
        {   
        String delete = "delete from Items where ItemId = '"+txt_DealID3.getText()+"'";
       try
         {
           pst = con.prepareStatement(delete);
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Deleted!");
           txt_DealID3.setText("");
            txt_Deal3.setText("");
            txt_DealRate3.setText("");
            txt_LargeRate14.setText("");
           
           RateManagerQueries.PastaShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void ShowPasta()
    {
        String name = null;
                if(cmb_PastaAvailable.getSelectedIndex()!=-1){
               String show = "select * from Items where name = '"+cmb_PastaAvailable.getSelectedItem().toString()+"' AND category = 'Pasta'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
           {
               String id = rs.getString("ItemId");
                name = rs.getString("Name");
               String rate = rs.getString("Rate");
               String mrate = rs.getString("MembershipRate");
               txt_DealID3.setText(id);
               txt_Deal3.setText(name);
               txt_DealRate3.setText(rate);
               txt_LargeRate14.setText(mrate);
           }
           
           RateManagerQueries.PastaShow();
           cmb_PastaAvailable.setSelectedItem(name);
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           } }
    }
    //**************************************************************************
    //**************************************************************************
      public static void AddCheeseGarlicBread()
    {
                if(txt_FastFood3.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Name is required!");
        }else
        {   
         String sql = "INSERT INTO `items`(name,rate,membershiprate,category) VALUES (?,?,?,?)";
       try
         {
           pst = con.prepareStatement(sql);
           pst.setString(1, txt_FastFood3.getText());
           pst.setString(2, txt_FastFoodRate3.getText());
           pst.setString(3, txt_LargeRate15.getText());
           pst.setString(4, "CheeseGarlicBread");
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Added!");
           txt_FastFoodID3.setText("");
            txt_FastFood3.setText("");
            txt_FastFoodRate3.setText("");
            txt_LargeRate15.setText("");
           
           RateManagerQueries.CheeseGarlicBreadShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void DeleteCheeseGarlicBread()
    {
                 if(txt_FastFoodID3.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Select Item First!");
        }else
        {   
        String delete = "delete from Items where ItemId = '"+txt_FastFoodID3.getText()+"'";
       try
         {
           pst = con.prepareStatement(delete);
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Deleted!");
           txt_FastFoodID3.setText("");
            txt_FastFood3.setText("");
            txt_FastFoodRate3.setText("");
            txt_LargeRate15.setText("");
           
           RateManagerQueries.CheeseGarlicBreadShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void ShowCheeseGarlicBread()
    {
        String name = null;
                if(cmb_CheeseGarlicBreadAvailable.getSelectedIndex()!=-1){
               String show = "select * from Items where name = '"+cmb_CheeseGarlicBreadAvailable.getSelectedItem().toString()+"' AND category = 'CheeseGarlicBread'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
           {
               String id = rs.getString("ItemId");
                name = rs.getString("Name");
               String rate = rs.getString("Rate");
               String mrate = rs.getString("MembershipRate");
               txt_FastFoodID3.setText(id);
               txt_FastFood3.setText(name);
               txt_FastFoodRate3.setText(rate);
               txt_LargeRate15.setText(mrate);
           }
           
           RateManagerQueries.CheeseGarlicBreadShow();
           cmb_CheeseGarlicBreadAvailable.setSelectedItem(name);
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           } }
    }
    
    ////////////////////////////////////////////////////////////////////////////
    public static void AddLasagnia()
    {
                if(txt_Roll4.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Name is required!");
        }else
        {   
         String sql = "INSERT INTO `items`(name,rate,membershiprate,category) VALUES (?,?,?,?)";
       try
         {
           pst = con.prepareStatement(sql);
           pst.setString(1, txt_Roll4.getText());
           pst.setString(2, txt_RollRate4.getText());
           pst.setString(3, txt_LargeRate16.getText());
           pst.setString(4, "Lasagnia");
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Added!");
           txt_RollID4.setText("");
            txt_Roll4.setText("");
            txt_RollRate4.setText("");
            txt_LargeRate16.setText("");
           
           RateManagerQueries.LasagniaShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void DeleteLasagnia()
    {
                 if(txt_RollID4.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Select Item First!");
        }else
        {   
        String delete = "delete from Items where ItemId = '"+txt_RollID4.getText()+"'";
       try
         {
           pst = con.prepareStatement(delete);
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Deleted!");
           txt_RollID4.setText("");
            txt_Roll4.setText("");
            txt_RollRate4.setText("");
            txt_LargeRate16.setText("");
           
           RateManagerQueries.LasagniaShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void ShowLasagnia()
    {
        String name = null;
                if(cmb_LasagniaAvailable.getSelectedIndex()!=-1){
               String show = "select * from Items where name = '"+cmb_LasagniaAvailable.getSelectedItem().toString()+"' AND category = 'Lasagnia'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
           {
               String id = rs.getString("ItemId");
               name = rs.getString("Name");
               String rate = rs.getString("Rate");
               String mrate = rs.getString("MembershipRate");
               txt_RollID4.setText(id);
               txt_Roll4.setText(name);
               txt_RollRate4.setText(rate);
               txt_LargeRate16.setText(mrate);
           }
           
           RateManagerQueries.LasagniaShow();
           cmb_LasagniaAvailable.setSelectedItem(name);
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           } }
    }
    //**************************************************************************
    //**************************************************************************
    public static void AddOther()
    {
                if(txt_Deal4.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Name is required!");
        }else
        {   
         String sql = "INSERT INTO `items`(name,rate,membershiprate,category) VALUES (?,?,?,?)";
       try
         {
           pst = con.prepareStatement(sql);
           pst.setString(1, txt_Deal4.getText());
           pst.setString(2, txt_DealRate4.getText());
           pst.setString(3, txt_LargeRate17.getText());
           pst.setString(4, "Other");
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Added!");
           txt_DealID4.setText("");
            txt_Deal4.setText("");
            txt_DealRate4.setText("");
            txt_LargeRate17.setText("");
           
           RateManagerQueries.OtherShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void DeleteOther()
    {
                 if(txt_DealID4.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Select Item First!");
        }else
        {   
        String delete = "delete from Items where ItemId = '"+txt_DealID4.getText()+"'";
       try
         {
           pst = con.prepareStatement(delete);
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Deleted!");
           txt_DealID4.setText("");
            txt_Deal4.setText("");
            txt_DealRate4.setText("");
            txt_LargeRate17.setText("");
           
           RateManagerQueries.OtherShow();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void ShowOther()
    {
        String name = null;
                if(cmb_OtherAvailable.getSelectedIndex()!=-1){
               String show = "select * from Items where name = '"+cmb_OtherAvailable.getSelectedItem().toString()+"' AND category = 'Other'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
           {
               String id = rs.getString("ItemId");
               name = rs.getString("Name");
               String rate = rs.getString("Rate");
               String mrate = rs.getString("MembershipRate");
               txt_DealID4.setText(id);
               txt_Deal4.setText(name);
               txt_DealRate4.setText(rate);
               txt_LargeRate17.setText(mrate);
           }
           
           RateManagerQueries.OtherShow();
           cmb_OtherAvailable.setSelectedItem(name);
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           } }
    }
    //**************************************************************************
    //**************************************************************************
      public static void AddOther2()
    {
                if(txt_FastFood4.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Name is required!");
        }else
        {   
         String sql = "INSERT INTO `items`(name,rate,membershiprate,category) VALUES (?,?,?,?)";
       try
         {
           pst = con.prepareStatement(sql);
           pst.setString(1, txt_FastFood4.getText());
           pst.setString(2, txt_FastFoodRate4.getText());
           pst.setString(3, txt_LargeRate18.getText());
           pst.setString(4, "Other2");
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Added!");
           txt_FastFoodID4.setText("");
            txt_FastFood4.setText("");
            txt_FastFoodRate4.setText("");
            txt_LargeRate18.setText("");
           
           RateManagerQueries.Other2Show();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void DeleteOther2()
    {
                 if(txt_FastFoodID4.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Select Item First!");
        }else
        {   
        String delete = "delete from Items where ItemId = '"+txt_FastFoodID4.getText()+"'";
       try
         {
           pst = con.prepareStatement(delete);
           pst.execute();
           JOptionPane.showMessageDialog(null, "Item Deleted!");
           txt_FastFoodID4.setText("");
            txt_FastFood4.setText("");
            txt_FastFoodRate4.setText("");
            txt_LargeRate18.setText("");
           
           RateManagerQueries.Other2Show();
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           }
        }
    }
    public static void ShowOther2()
    {
        String name = null;
                if(cmb_Other2Available.getSelectedIndex()!=-1){
               String show = "select * from Items where name = '"+cmb_Other2Available.getSelectedItem().toString()+"' AND category = 'Other2'";
       try
         {
           pst = con.prepareStatement(show);
           rs = pst.executeQuery();
           while(rs.next())
           {
               String id = rs.getString("ItemId");
               name = rs.getString("Name");
               String rate = rs.getString("Rate");
               String mrate = rs.getString("MembershipRate");
               txt_FastFoodID4.setText(id);
               txt_FastFood4.setText(name);
               txt_FastFoodRate4.setText(rate);
               txt_LargeRate18.setText(mrate);
           }
           
           RateManagerQueries.Other2Show();
           cmb_Other2Available.setSelectedItem(name);
         }catch(SQLException | HeadlessException e)
           {
             JOptionPane.showMessageDialog(null, e+" Error in adding Item!");
           } }
    }
    
    
}
