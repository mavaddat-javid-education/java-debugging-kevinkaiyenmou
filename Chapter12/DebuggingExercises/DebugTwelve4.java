// An employee ID can't be more than 999
// Keep executing until user enters four valid employee IDs
// This program throws a DebugEmployeeIDException
import javax.swing.*;
public class DebugTwelve4
{
   public static void main(String[] args)
   {
      int x = 0;
      String inStr="", outString = "";
      final int MAX = 999;
      int[] emp = new int[4];
      for(x = 0; x < emp.length; ++x)
      {
         while(emp[x] == 0) {
            inStr = JOptionPane.showInputDialog(null, "Enter employee ID number for employee " + (x+1));  
            try
            {  
               int temp =  Integer.parseInt(inStr);
               if(temp > MAX)
               {
                  throw(new DebugEmployeeIDException("Number too high: " + temp + "\nNumber must be less than " + MAX));
               } else emp[x] = temp;
            }
            catch(NumberFormatException error)
            {	
               JOptionPane.showMessageDialog(null, inStr + "\nNonnumeric ID");
            }
            catch(DebugEmployeeIDException error)
            {	
               JOptionPane.showMessageDialog(null,error.getMessage());
            }
         }
      }
      
      for(x = 0; x < emp.length; ++x)
      {
         outString = outString + emp[x] + " ";
      }
      JOptionPane.showMessageDialog(null, "Four valid IDS are: " + outString);    
   }
}