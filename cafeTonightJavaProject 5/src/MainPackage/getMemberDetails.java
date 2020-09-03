
package MainPackage;

import javax.swing.JOptionPane;

public class getMemberDetails extends POS
{
    
    public static int getMemberId(int oid)
    {
         String sql = "SELECT * FROM `membership` where OrderId = '"+oid+"'";
         int memberid = 0;
         try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
           while(rs.next())
           {
               
               memberid =  rs.getInt("M_Id");
           }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e+" Error in getMemberId");
        }
        return memberid;
    }
    
    public static String getMemberInfo(int id,String ColName)
    {
         String sql = "Select * from Members where M_Id = '"+id+"'";
         String str ="";
         try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
           while(rs.next())
           {
               str =  rs.getString(ColName);
           }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e+" Error in getMemberInfo");
        }
        return str;
    }
    
}
