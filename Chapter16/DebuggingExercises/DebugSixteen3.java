// This program displays promotional messages
// with the click of a button
// The button is disabled when all messages are on screen
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DebugSixteen3 extends JPanel implements ActionListener
{
   JLabel firstText = new JLabel("Our company is growing!");
   JLabel secText = new JLabel("What makes us better that most?");
   JButton findOutButton = new JButton("Find Out");
   String[] reason = {"Our products","Our people", "Our committment","Our service","YOU!!"};
   Font boldFont =new Font("TimesRoman", Font.BOLD, 20);
   final int GAP = 20;
   int x = 30, y = 50;
   int counter = 0;
   JPanel panel = new JPanel(new FlowLayout());

   public DebugSixteen3()
   {
     panel.setBackground(Color.PINK);
     panel.add(firstText);
     panel.add(secText);
     panel.add(findOutButton);       
     findOutButton.addActionListener(this);
   }

   @Override   
   public void actionPerformed(ActionEvent e)
   {
      ++counter;
      if(counter >= reason.length)
         findOutButton.setEnabled(false);
    //System.out.println(reason[counter]);
   }  
   @Override
   public void paintComponent(Graphics g)
   {
       g.setFont(boldFont);
       g.setColor(Color.BLUE);;
       for(int i = 0; i < counter; ++i)
         g.drawString(reason[i], x, y += GAP);
    }   
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.add(new DebugSixteen3());
      frame.setSize(350, 250);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}