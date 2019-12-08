import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
public class DebugFifteen1 extends JFrame implements ActionListener
{
   JButton mrRed = new JButton("Red");
   JButton mrPink = new JButton("Pink");
   JButton mrOrange = new JButton("Orange");
   JButton mrYellow = new JButton("Yellow");
   JButton mrBlack = new JButton("Black");

   JPanel panel2 = new JPanel(new FlowLayout());
 //JPanel panel1 = new JPanel();

   public DebugFifteen1()
   {
      setLayout(new GridLayout(1, 2));
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //add(panel1);
      add(panel2);
      panel2.add(mrRed);
      panel2.add(mrPink);
      panel2.add(mrOrange);
      panel2.add(mrYellow);
      panel2.add(mrBlack);
      mrRed.addActionListener(this);
      mrPink.addActionListener(this);
      mrOrange.addActionListener(this);
      mrYellow.addActionListener(this);
      mrBlack.addActionListener(this);
      setSize(400, 200);
      setVisible(true);
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      if(source == mrRed)   
         panel2.setBackground(Color.RED); //Note from Kevin: these all make half of the background red, pink, orange etc. is that int
      else if(source == mrPink)
         panel2.setBackground(Color.PINK);//Note from Kevin: colour problem is fixed 
      else if(source == mrOrange)
         panel2.setBackground(Color.ORANGE);
      else if(source == mrYellow)         
         panel2.setBackground(Color.YELLOW);
      else if(source == mrBlack)
         panel2.setBackground(Color.BLACK);
   }
   public static void main(String[] args)
   {
      DebugFifteen1 frame = new DebugFifteen1();
   }
}
