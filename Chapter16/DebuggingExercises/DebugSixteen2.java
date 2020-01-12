// The panel should change color when a user's mouse enters or exits it
// A circle should appear wherever the user clicks
// The circle becomes smaller when the user double-clicks

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class DebugSixteen2 extends JPanel implements MouseListener
{
   int x, y;
   static int size=20;
   static boolean CLICKED = false;

   public DebugSixteen2()
   {
      super();
      JFrame frame = new JFrame();
      frame.add(this);
      frame.addMouseListener(this);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      frame.setSize(250, 150);
      frame.setBackground(Color.WHITE);
   }
   public static void main(String[] args)
   {
     DebugSixteen2 panel = new DebugSixteen2();
     panel.setVisible(true);
   }

   @Override
   public void mousePressed(MouseEvent e)
   {
      x = e.getX();
      y = e.getY();
   }

   @Override
   public void mouseClicked(MouseEvent e)
   {
      CLICKED = true;
      if(e.getClickCount() > 1)
        size -= 2;
      else
        size = 20;
      System.out.println("You clicked " + e.getClickCount() + " times");
     repaint();
   }
   @Override
   public void mouseEntered(MouseEvent e)
   {
      setBackground(Color.ORANGE);
   }
   @Override
   public void mouseExited(MouseEvent e)
   {
      setBackground(new Color( new Random().nextFloat(),new Random().nextFloat(),new Random().nextFloat() ));
   }
   @Override
   public void mouseReleased(MouseEvent e)
   {
   }
   @Override
   public void paintComponent(Graphics g)
   {
     super.paintComponent(g);
     if (CLICKED) 
      g.drawOval(x - size, y - size, size * 2, size * 2);
   }
}