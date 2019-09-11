// Application looks up home price
// for different floor plans
// allows upper or lowercase data entry
import javax.swing.*;
public class DebugEight3
{
   public static void main(String[] args)
   {
      String entry;
      char[] floorPlans = {'A','B','C'};
      int[] pricesInThousands = {145, 190, 235};
      char plan;
      int x, fp = 99;
      do
      {String prompt = "Please select a floor plan\n" +
          "Our floor plans are:\n" + "A - Augusta, a ranch\n" +
          "B - Brittany, a split level\n" +
          "C - Colonial, a two-story\n" +
          "Enter floorPlans letter";
          entry = JOptionPane.showInputDialog(null, prompt);}
          while(entry != null && entry.length() != 1);
          if(entry == null)
            return;
      plan = entry.toUpperCase().charAt(0);
      for(x = 0; x < floorPlans.length; ++x)
	     if(plan == floorPlans[x]) {
         fp = x;
         break;
       }
      if(fp == 99) {
        JOptionPane.showMessageDialog(null,
            "Invalid floor plan code entered");
            main(args);
            }
      else
      {
        JOptionPane.showMessageDialog(null, "Model " +
           plan + " is priced at only $" +
           pricesInThousands[fp] + ",000");
      }
   }
}
