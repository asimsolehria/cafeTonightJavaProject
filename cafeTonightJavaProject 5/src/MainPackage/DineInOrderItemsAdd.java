
package MainPackage;

/**
 *
 * @author Abdul Sami
 */
public class DineInOrderItemsAdd extends POS
{
    public static void AddDineInItems()
    {
        
        if(OrderType.getSelectedIndex()==1)
        {
            
        
            if(Table1.isSelected())
             {
                 a1.clear();
                 
                 for(int a=0;a<PurchasedItems.getModel().getRowCount();a++)
                {
//                    a1.add(PurchasedItems.getModel().getValueAt(a, 0));    
                    a1.add(PurchasedItems.getModel().getValueAt(a, 1));  //Name  
                    a1.add(PurchasedItems.getModel().getValueAt(a, 2));  //Rate 
                    a1.add(PurchasedItems.getModel().getValueAt(a, 3));  //Quantity
                    a1.add(PurchasedItems.getModel().getValueAt(a, 4));  //Total
                }
      
                 
             }else if(Table2.isSelected())
             {
                 a2.clear();
                 for(int a=0;a<PurchasedItems.getModel().getRowCount();a++)
                {
//                    a2.add(PurchasedItems.getModel().getValueAt(a, 0));    
                    a2.add(PurchasedItems.getModel().getValueAt(a, 1));    
                    a2.add(PurchasedItems.getModel().getValueAt(a, 2));    
                    a2.add(PurchasedItems.getModel().getValueAt(a, 3));    
                    a2.add(PurchasedItems.getModel().getValueAt(a, 4));
                }
               
                 
             }else if(Table3.isSelected())
             {
                 a3.clear();
                 for(int a=0;a<PurchasedItems.getModel().getRowCount();a++)
                {
//                    a2.add(PurchasedItems.getModel().getValueAt(a, 0));    
                    a3.add(PurchasedItems.getModel().getValueAt(a, 1));    
                    a3.add(PurchasedItems.getModel().getValueAt(a, 2));    
                    a3.add(PurchasedItems.getModel().getValueAt(a, 3));    
                    a3.add(PurchasedItems.getModel().getValueAt(a, 4));
                }
               
             }else if(Table4.isSelected())
             {
                 a4.clear();
                 for(int a=0;a<PurchasedItems.getModel().getRowCount();a++)
                {
//                    a2.add(PurchasedItems.getModel().getValueAt(a, 0));    
                    a4.add(PurchasedItems.getModel().getValueAt(a, 1));    
                    a4.add(PurchasedItems.getModel().getValueAt(a, 2));    
                    a4.add(PurchasedItems.getModel().getValueAt(a, 3));    
                    a4.add(PurchasedItems.getModel().getValueAt(a, 4));
                }
                 
             }else if(Table5.isSelected())
             {
                 a5.clear();
                 for(int a=0;a<PurchasedItems.getModel().getRowCount();a++)
                {
//                    a2.add(PurchasedItems.getModel().getValueAt(a, 0));    
                    a5.add(PurchasedItems.getModel().getValueAt(a, 1));    
                    a5.add(PurchasedItems.getModel().getValueAt(a, 2));    
                    a5.add(PurchasedItems.getModel().getValueAt(a, 3));    
                    a5.add(PurchasedItems.getModel().getValueAt(a, 4));
                }
                 
             }else if(Table6.isSelected())
             {
                 a6.clear();
                 for(int a=0;a<PurchasedItems.getModel().getRowCount();a++)
                {
//                    a2.add(PurchasedItems.getModel().getValueAt(a, 0));    
                    a6.add(PurchasedItems.getModel().getValueAt(a, 1));    
                    a6.add(PurchasedItems.getModel().getValueAt(a, 2));    
                    a6.add(PurchasedItems.getModel().getValueAt(a, 3));    
                    a6.add(PurchasedItems.getModel().getValueAt(a, 4));
                }
                 
             }else if(Table7.isSelected())
             {
                 a7.clear();
                 for(int a=0;a<PurchasedItems.getModel().getRowCount();a++)
                {
//                    a2.add(PurchasedItems.getModel().getValueAt(a, 0));    
                    a7.add(PurchasedItems.getModel().getValueAt(a, 1));    
                    a7.add(PurchasedItems.getModel().getValueAt(a, 2));    
                    a7.add(PurchasedItems.getModel().getValueAt(a, 3));    
                    a7.add(PurchasedItems.getModel().getValueAt(a, 4));
                }
                 
             }else if(Table8.isSelected())
             {
                 a8.clear();
                 for(int a=0;a<PurchasedItems.getModel().getRowCount();a++)
                {
//                    a2.add(PurchasedItems.getModel().getValueAt(a, 0));    
                    a8.add(PurchasedItems.getModel().getValueAt(a, 1));    
                    a8.add(PurchasedItems.getModel().getValueAt(a, 2));    
                    a8.add(PurchasedItems.getModel().getValueAt(a, 3));    
                    a8.add(PurchasedItems.getModel().getValueAt(a, 4));
                }
                 
             }else if(Table9.isSelected())
             {
                 a9.clear();
                 for(int a=0;a<PurchasedItems.getModel().getRowCount();a++)
                {
//                    a2.add(PurchasedItems.getModel().getValueAt(a, 0));    
                    a9.add(PurchasedItems.getModel().getValueAt(a, 1));    
                    a9.add(PurchasedItems.getModel().getValueAt(a, 2));    
                    a9.add(PurchasedItems.getModel().getValueAt(a, 3));    
                    a9.add(PurchasedItems.getModel().getValueAt(a, 4));
                }
                 
             }else if(Table10.isSelected())
             {
                 a10.clear();
                 for(int a=0;a<PurchasedItems.getModel().getRowCount();a++)
                {
//                    a2.add(PurchasedItems.getModel().getValueAt(a, 0));    
                    a10.add(PurchasedItems.getModel().getValueAt(a, 1));    
                    a10.add(PurchasedItems.getModel().getValueAt(a, 2));    
                    a10.add(PurchasedItems.getModel().getValueAt(a, 3));    
                    a10.add(PurchasedItems.getModel().getValueAt(a, 4));
                }
                 
             }else if(Table11.isSelected())
             {
                 a11.clear();
                 for(int a=0;a<PurchasedItems.getModel().getRowCount();a++)
                {
//                    a2.add(PurchasedItems.getModel().getValueAt(a, 0));    
                    a11.add(PurchasedItems.getModel().getValueAt(a, 1));    
                    a11.add(PurchasedItems.getModel().getValueAt(a, 2));    
                    a11.add(PurchasedItems.getModel().getValueAt(a, 3));    
                    a11.add(PurchasedItems.getModel().getValueAt(a, 4));
                }
                 
             }else if(Table12.isSelected())
             {
                 a12.clear();
                 for(int a=0;a<PurchasedItems.getModel().getRowCount();a++)
                {
//                    a2.add(PurchasedItems.getModel().getValueAt(a, 0));    
                    a12.add(PurchasedItems.getModel().getValueAt(a, 1));    
                    a12.add(PurchasedItems.getModel().getValueAt(a, 2));    
                    a12.add(PurchasedItems.getModel().getValueAt(a, 3));    
                    a12.add(PurchasedItems.getModel().getValueAt(a, 4));
                }
                 
             }else if(Table13.isSelected())
             {
                 a13.clear();
                 for(int a=0;a<PurchasedItems.getModel().getRowCount();a++)
                {
//                    a2.add(PurchasedItems.getModel().getValueAt(a, 0));    
                    a13.add(PurchasedItems.getModel().getValueAt(a, 1));    
                    a13.add(PurchasedItems.getModel().getValueAt(a, 2));    
                    a13.add(PurchasedItems.getModel().getValueAt(a, 3));    
                    a13.add(PurchasedItems.getModel().getValueAt(a, 4));
                }
                 
             }else if(Table14.isSelected())
             {
                 a14.clear();
                 for(int a=0;a<PurchasedItems.getModel().getRowCount();a++)
                {
//                    a2.add(PurchasedItems.getModel().getValueAt(a, 0));    
                    a14.add(PurchasedItems.getModel().getValueAt(a, 1));    
                    a14.add(PurchasedItems.getModel().getValueAt(a, 2));    
                    a14.add(PurchasedItems.getModel().getValueAt(a, 3));    
                    a14.add(PurchasedItems.getModel().getValueAt(a, 4));
                }
                 
             }else if(Table15.isSelected())
             {
                 a15.clear();
                 for(int a=0;a<PurchasedItems.getModel().getRowCount();a++)
                {
//                    a2.add(PurchasedItems.getModel().getValueAt(a, 0));    
                    a15.add(PurchasedItems.getModel().getValueAt(a, 1));    
                    a15.add(PurchasedItems.getModel().getValueAt(a, 2));    
                    a15.add(PurchasedItems.getModel().getValueAt(a, 3));    
                    a15.add(PurchasedItems.getModel().getValueAt(a, 4));
                }
                 
             }else if(Table16.isSelected())
             {
                 a16.clear();
                 for(int a=0;a<PurchasedItems.getModel().getRowCount();a++)
                {
//                    a2.add(PurchasedItems.getModel().getValueAt(a, 0));    
                    a16.add(PurchasedItems.getModel().getValueAt(a, 1));    
                    a16.add(PurchasedItems.getModel().getValueAt(a, 2));    
                    a16.add(PurchasedItems.getModel().getValueAt(a, 3));    
                    a16.add(PurchasedItems.getModel().getValueAt(a, 4));
                }
                 
             }else if(Table17.isSelected())
             {
                 a17.clear();
                 for(int a=0;a<PurchasedItems.getModel().getRowCount();a++)
                {
//                    a2.add(PurchasedItems.getModel().getValueAt(a, 0));    
                    a17.add(PurchasedItems.getModel().getValueAt(a, 1));    
                    a17.add(PurchasedItems.getModel().getValueAt(a, 2));    
                    a17.add(PurchasedItems.getModel().getValueAt(a, 3));    
                    a17.add(PurchasedItems.getModel().getValueAt(a, 4));
                }
                 
             }else if(Table18.isSelected())
             {
                 a18.clear();
                 for(int a=0;a<PurchasedItems.getModel().getRowCount();a++)
                {
//                    a2.add(PurchasedItems.getModel().getValueAt(a, 0));    
                    a18.add(PurchasedItems.getModel().getValueAt(a, 1));    
                    a18.add(PurchasedItems.getModel().getValueAt(a, 2));    
                    a18.add(PurchasedItems.getModel().getValueAt(a, 3));    
                    a18.add(PurchasedItems.getModel().getValueAt(a, 4));
                }
                 
             }else if(Table19.isSelected())
             {
                 a19.clear();
                 for(int a=0;a<PurchasedItems.getModel().getRowCount();a++)
                {
//                    a2.add(PurchasedItems.getModel().getValueAt(a, 0));    
                    a19.add(PurchasedItems.getModel().getValueAt(a, 1));    
                    a19.add(PurchasedItems.getModel().getValueAt(a, 2));    
                    a19.add(PurchasedItems.getModel().getValueAt(a, 3));    
                    a19.add(PurchasedItems.getModel().getValueAt(a, 4));
                }
                 
             }else if(Table20.isSelected())
             {
                 a20.clear();
                 for(int a=0;a<PurchasedItems.getModel().getRowCount();a++)
                {
//                    a2.add(PurchasedItems.getModel().getValueAt(a, 0));    
                    a20.add(PurchasedItems.getModel().getValueAt(a, 1));    
                    a20.add(PurchasedItems.getModel().getValueAt(a, 2));    
                    a20.add(PurchasedItems.getModel().getValueAt(a, 3));    
                    a20.add(PurchasedItems.getModel().getValueAt(a, 4));
                }
                 
             }
        }
    }        
}
