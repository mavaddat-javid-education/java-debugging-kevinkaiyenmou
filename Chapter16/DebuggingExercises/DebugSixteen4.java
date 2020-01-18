// This program shows a customer
// what a shirt looks like in different colors
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class DebugSixteen4 extends JPanel implements ActionListener
{
   JLabel header = new JLabel("Outfit planner");
   JButton changeButton = new JButton("Change clothes");
   int counter = 0;
   int xTop[] = { 20, 40, 50, 60, 80, 75, 62, 66, 40, 38, 25, 20};
   int yTop[] = {140,130,138,130,138,148,142,160,160,142,148,142};
   Color[] colors = {Color.RED, Color.PINK, Color.YELLOW, Color.GREEN, Color.CYAN};
   Font font = new Font("Arial", Font.BOLD, 14);
   final double PRICE = 39.95;
   final int X = 100;
   final int Y = 80;
   final int GAP = 20;
   final static int SIZE = 20;
   int cycle = 0;
   int x = 41;
   int y = 138;
   public DebugSixteen4()
   {
      setBackground(Color.WHITE);
      add(header);
      add(changeButton);
      changeButton.addActionListener(this);
   }
   @Override
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      ++counter;
      g.setFont(font);
      g.setColor(colors[cycle]);
      g.fillPolygon(xTop, yTop, 12);
      g.setColor(Color.BLACK);
      g.drawString("Just look at the colors", X, Y);
      g.drawString("in which you can buy", X, Y + GAP);
      g.drawString("this beautiful shirt", X, Y + GAP*2);
      g.drawString("Only $" + PRICE, X, Y + GAP*3);
      g.drawOval(x, y, SIZE, SIZE); //Note from kevin: I just realized I didn't need to make new variables but I'm not changing it yet to save time.
      g.drawOval(46, 142, 2, 2);
      g.drawOval(55, 142, 2, 2);
      g.drawLine(46, 150, 48, 151);
      g.drawLine(48, 151, 50, 152);
      g.drawLine(50, 152, 52, 152);
      g.drawLine(52, 152, 54, 151);
      g.drawLine(54, 151, 56, 150);
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
      cycle = counter % colors.length;
      repaint();
   }
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.add(new DebugSixteen4());
      frame.setSize(350, 240);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}