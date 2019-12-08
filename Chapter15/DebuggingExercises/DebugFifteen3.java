// Lets user type keys
// Displays each key typed
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class DebugFifteen3 extends JFrame implements KeyListener // DebugFifteen3 is not abstract and does not override abstract method keyPressed(KeyEvent) in KeyListener
{
   char key;
   Container con = null; //new JFrame().getContentPane();
   GridLayout grid = new GridLayout(2, 1);
   JLabel label = new JLabel("Key Typed:");
   JTextArea textArea = new JTextArea(4, 25);
   public DebugFifteen3()
   {
      con = this.getContentPane();
      this.setTitle("Debug Key Frame");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      con.setLayout(grid);
      con.add(textArea);
      con.add(label);
      this.addKeyListener(this);
      textArea.addKeyListener(this);
   }

   @Override
   public void keyTyped(KeyEvent e)
   {
      char c = e.getKeyChar();
      label.setText("Key Typed: " + c);
   }

   @Override
   public void keyReleased(KeyEvent e)
   {
   }

   @Override
   public void keyPressed(KeyEvent e)
   {
   }
   public static void main(String[] args)
   {
      DebugFifteen3 frame = new DebugFifteen3();
      frame.setSize(300, 200);
      frame.setVisible(true);
   }
}


