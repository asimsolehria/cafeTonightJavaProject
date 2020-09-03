
package MainPackage;

import javax.swing.JOptionPane;

/**
 *
 * @author Abdul Sami
 */
public class MembershipSale extends POS
{
    public static void AddMembershipSale()
    {
            int mid =0;
            int oid =0;
            String getmemebrid = "SELECT * FROM members where Name = '"+cmb_Members.getSelectedItem()+"'";
            String insertmember = "INSERT INTO `membership`(`M_Id`, `OrderId`) VALUES (?,?)";
            String getOrderId = "Select OrderId from Sale ORDER BY OrderId";
            try
            {
            //get m id    
             pst = con.prepareStatement(getmemebrid);
            rs = pst.executeQuery();
            while(rs.next())
            {
                mid = rs.getInt("M_Id");

            }   
            //get id
            pst = con.prepareStatement(getOrderId);
            rs = pst.executeQuery();
            while(rs.next())
            {
                oid = rs.getInt("OrderId");

            }   
            //insert record    
            pst = con.prepareStatement(insertmember);
            pst.setInt(1, mid);
            pst.setInt(2, oid);
            pst.execute();
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e+" Error in AddMembership Sale!");
            }
    }
    
}
