// Demonstrates layout positions
// using BorderLayout
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DebugFifteen2 extends JFrame
{
   JButton nb = new JButton("Left");
   JButton sb = new JButton("Down");
   JButton eb = new JButton("Right");
   JButton wb = new JButton("Center");
   JButton cb = new JButton("Up");
   Container con = null;
   public DebugFifteen2()
   {
      con = this.getContentPane();
      con.setLayout(new BorderLayout());
      con.add(nb);
      con.add(cb);
      con.add(sb);
      con.add(eb);
      con.add(wb); //Note from Kevin: only the last shows. is that because they stack on each other?
      setSize(300, 300);
      setVisible(true);
   }
   public static void main(String[] args)
   {
      DebugFifteen2 f = new DebugFifteen2();
   }
}