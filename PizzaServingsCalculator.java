/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaservingscalculator;

/**
 *
 * @author jkenglish
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class PizzaServingsCalculator extends JPanel
{
    private JTextField display;
    private JTextField display1;
    JLabel calculateservings = new JLabel();
    double servings = 0;
    double size = 0;
    

    public PizzaServingsCalculator()
    {
    	

        
        

        JPanel panel1 = new JPanel();
        setLayout( new GridLayout(4, 1) );

        JLabel title = new JLabel("Pizza Servings Calculator", JLabel.CENTER);

        title.setForeground(Color.red);
        title.setFont(new Font("Serif", Font.BOLD, 18));
        add(title);
        
        panel1.add(new JLabel("Enter the size of the pizza in inches"));
        display1 = new JTextField(4);
        panel1.add(display1);
        add(panel1);
      
        
        

        add(panel1);
        


       
        

        
   
        String text = "Calculate Servings";
        JButton button = new JButton( text );
        button.addActionListener(new CustomActionListener()); 
        button.setBorder( new LineBorder(Color.BLACK) );
        add( button );
        calculateservings = new JLabel();
        add(calculateservings);
        button.addActionListener(new CustomActionListener());
        
    }
    

    class CustomActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
           size = Double.parseDouble(display1.getText());
           servings = Math.pow(size/8, 2);
           calculateservings.setText(String.format("A %s inch pizza will serve %s people", display1.getText(), String.valueOf(servings)));
        }
     }	
    

              

      

    private static void DisplayUI()
    {
        JFrame frame = new JFrame("Pizza Servings Calculator");
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.add( new PizzaServingsCalculator() );
        frame.setSize(350,300);
        frame.pack();
        frame.setLocationRelativeTo( null );
        frame.setVisible(true);
    }
    

    


    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                DisplayUI();
            }
        });
    }
}
