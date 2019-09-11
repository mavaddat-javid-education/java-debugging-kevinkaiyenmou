// Allows user to enter a series of words
// and displays them in reverse order
import javax.swing.*;
public class DebugEight4
{
   public static void main(String[] args)
   {
      int x = 0, y;
      final int LIMIT = 100;
      String array[] = new String[LIMIT];
      String entry;
      final String STOP = "XXX";
      StringBuffer message = new
          StringBuffer("The words in reverse order are\n");

      entry = JOptionPane.showInputDialog(null,
        "Enter any word\n" +
        "Enter " + STOP + " when you want to stop");
      while(entry != null && !(entry.equals(STOP)) && x<LIMIT)
      {
         array[x++] = entry;
         entry = JOptionPane.showInputDialog(null,
            "Enter another word\n" +
            "Enter " + STOP + " when you want to stop");
      }
      for(y = x-1; y >= 0; y--)
      {
         message.append(array[y]);
         message.append("\n");
      }
      JOptionPane.showMessageDialog(null, message);
   }
}
