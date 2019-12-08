// Demonstrates layout positions
// using BorderLayout
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DebugFifteen2 extends JFrame
{
   JButton wb = new JButton("Left");
   JButton sb = new JButton("Down");
   JButton eb = new JButton("Right");
   JButton cb = new JButton("Center");
   JButton nb = new JButton("Up");
   Container con = null;
   public DebugFifteen2()
   {
      con = this.getContentPane();
      con.setLayout(new BorderLayout());
      con.add(nb,BorderLayout.NORTH);
      con.add(cb,BorderLayout.CENTER);
      con.add(sb,BorderLayout.SOUTH);
      con.add(eb,BorderLayout.EAST);
      con.add(wb,BorderLayout.WEST); //Note from Kevin: only the last shows. is that because they stack on each other?
      setSize(300, 300);
      setVisible(true);
   }
   public static void main(String[] args)
   {
      DebugFifteen2 f = new DebugFifteen2();
      f.setSize(300,300);
      f.setVisible(true);
   }
}