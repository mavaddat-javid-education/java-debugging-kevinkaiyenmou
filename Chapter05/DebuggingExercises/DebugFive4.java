// DebugFive4.java
// Outputs highest of four numbers
import javax.swing.*;
public class DebugFive4
{
  public static void main(String args[])
    {
      int one, two, three, four;
     String output;
     //str = JOptionPane.showInputDialog(null,"Enter an integer");
     one = getInt();
     //str = JOptionPane.showInputDialog(null,"Enter an integer");
     two = getInt();
     //str = JOptionPane.showInputDialog(null,"Enter an integer");
     three = getInt();
     //str = JOptionPane.showInputDialog(null,"Enter an integer");
     four = getInt();
     if(one > two && one > three && one > four)
        output = "Highest is " + one;
     else
        if(two > one && two > three && two > four)
       output = "Highest is " + two;
        else
      if(three > one && three > two && three > four)
        output = "Highest is " + three;
      else
        output = "Highest is " + four;
     JOptionPane.showMessageDialog(null, output);

    }
 public static int getInt()
   {
     String str = JOptionPane.showInputDialog(null,"Enter an integer");
     int a = Integer.parseInt(str);
     return a;
   }
}
