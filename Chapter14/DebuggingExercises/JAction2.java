import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JAction2 extends JFrame implements ActionListener 
{
    JLabel label = new JLabel("Name?");
    JTextField field = new JTextField(12);
    JButton button = new JButton("OK");
    boolean readyToQuit = false;
    public JAction2()
    {
        super("Action");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(label);
        add(field);
        add(button);
        button.addActionListener(this); 
        field.addActionListener(this);

    }
    public static void main(String[] args) 
    {
        JAction2 aFrame = new JAction2();
        final int WIDTH = 250;
        final int HEIGHT = 150;
        aFrame.setSize(WIDTH, HEIGHT);
        aFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Object source = e.getSource();
        if (source == button)
            label.setText("You clicked the button");
        else 
            label.setText("You pressed Enter");
        if(readyToQuit)
            System.exit(0); 
        button.setText("Application done");
        readyToQuit = true;        
    }
}