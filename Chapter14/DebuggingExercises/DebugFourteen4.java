// Beverage selector
// Milk and cola are $3
// all other drinks are $2
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DebugFourteen4 extends JFrame implements ItemListener
{
   FlowLayout flow = new FlowLayout();
   JLabel title = new JLabel("Beverage Selector");
   Font bigFont = new Font("Arial", Font.PLAIN, 24);
   ButtonGroup drinkGrp = new ButtonGroup();
   JRadioButton cola = new JRadioButton("Cola",false);
   JRadioButton lemon = new JRadioButton("Lemonade",false);
   JRadioButton tea = new JRadioButton("Iced tea",false);
   JRadioButton milk = new JRadioButton("Milk",false);
   JRadioButton coffee = new JRadioButton("Coffee",false);
   JTextField totPrice = new JTextField(10);
   String output;
   int totalPrice = 0;
   final int HIGH_PRICE = 3;
   final int LOW_PRICE = 2;
   public DebugFourteen4()
   {
      super("Beverage Selector");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flow);
      add(cola);
      add(lemon);
      add(tea);
      add(milk);
      add(coffee);
      add(totPrice);
      tea.addItemListener(this);
      cola.addItemListener(this);
      milk.addItemListener(this);
      lemon.addItemListener(this);
      coffee.addItemListener(this);

      drinkGrp.add(cola);
      drinkGrp.add(lemon);
      drinkGrp.add(milk);
      drinkGrp.add(coffee);
      drinkGrp.add(tea);
      totPrice.setText("0");
   }
   public static void main(String[] arguments)
   {
      JFrame jFrame = new DebugFourteen4();
      jFrame.setSize(350, 100);
      jFrame.setVisible(true);
   } 
   @Override
   public void itemStateChanged(ItemEvent check)
   {
      Object source = check.getItem();
      if(source == cola || source == milk)
      {
         totPrice.setText("$" + HIGH_PRICE);
      }
      else
      {
         totPrice.setText("$" + LOW_PRICE);
      }
   }
}