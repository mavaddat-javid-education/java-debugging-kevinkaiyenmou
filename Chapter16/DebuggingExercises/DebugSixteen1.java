// This program should display a bullseye, not a cone
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

public class DebugSixteen1 extends JPanel
{
   String msg = "This is a bull's eye";
   int radius;
   final static int SIZE = 34;
   public DebugSixteen1()
   {
      setBackground(Color.WHITE);
   }
   @Override
   public void paintComponent(Graphics gr)
   {
      super.paintComponent(gr);
      
      System.out.println("x"+ "\t\t"+"y");
      for(radius = 1; radius < SIZE/2; radius += 1)
      {
         if(radius < 50)
            gr.setColor(Color.RED);
         else if(radius < 100)
            gr.setColor(Color.GREEN);
         else if (radius < 150)
            gr.setColor(Color.YELLOW);
         else
            gr.setColor(Color.BLUE);
         int x = SIZE/2-radius, y=SIZE/2-radius;
         gr.drawOval(x,y, radius*2, radius*2);
         System.out.println(x+ "\t\t"+y);
      }
      gr.setFont(new Font("Arial", Font.ITALIC, 20));
      gr.setColor(Color.BLACK);
      gr.drawString(msg, 100, 150);
   }
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.add(new DebugSixteen1());
      frame.setSize(SIZE, SIZE);
      frame.getContentPane().setPreferredSize(new DimensionUIResource(SIZE, SIZE));
      frame.pack();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}