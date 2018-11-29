package abc;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
 
//create class and extend with JFrame
public class Entercoeff extends JFrame 
{
 //declare variable
	 private JPanel contentPane;
	 private int a,b,c,d;

	 public static void main(String[] args)
	 {

		 EventQueue.invokeLater(new Runnable()
		 {
			 public void run()
			 {
			 //try - catch block
			 	try 
			 	{
			 	 		Entercoeff frame = new Entercoeff();
			 			frame.setVisible(true); 
			 	} 
			 	catch (Exception e)
			 	{
			 			e.printStackTrace();
			 	}
			 }
		 });
	 }
	 
	 /**
	 * Create the frame.
	 */
	 public Entercoeff()//constructor 
	 {
		 //set frame title
		 setTitle("Polynomial");
		 //set default close operation
		 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 //set bounds of the frame
		 setBounds(100, 100, 700, 700);
		 //create object of JPanel
		 contentPane = new JPanel();
		 //set border
		 contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		 //set ContentPane
		 setContentPane(contentPane);
		 //set null
		 contentPane.setLayout(null);
		 
		 JLabel l=new JLabel("Enter the coefficients:\n\tfor a(x^3)+b(x^2)+c(x)+d");
		 l.setBounds(50,10,700,30);
		 add(l);

		 JLabel a1=new JLabel("a:");
		 a1.setBounds(90,100,20,20);
		 add(a1);
		 JTextField value_a=new JTextField();
		 value_a.setBounds(130,100,20,20);
		 add(value_a);

		 JLabel b1=new JLabel("b:");
		 b1.setBounds(90,140,20,20);
		 add(b1);
		 JTextField value_b=new JTextField();
		 value_b.setBounds(130,140,20,20);
		 add(value_b);

		 JLabel c1=new JLabel("c:");
		 c1.setBounds(90,180,20,20);
		 add(c1);
		 JTextField value_c=new JTextField();
		 value_c.setBounds(130,180,20,20);
		 add(value_c);

		 JLabel d1=new JLabel("d:");
		 d1.setBounds(90,220,20,20);
		 add(d1);
		 JTextField value_d=new JTextField();
		 value_d.setBounds(130,220,20,20);
		 add(value_d);
		

		JButton button=new JButton("Select");
		button.setBounds(100,300,100,30);
		add(button);
		
		 //add actionListener
		 button.addActionListener(new ActionListener()
		 {
			 public void actionPerformed(ActionEvent arg0)
			 {
				 //call the object of Polynomial and set visible true
				a=Integer.parseInt(value_a.getText());
				b=Integer.parseInt(value_b.getText());
				c=Integer.parseInt(value_c.getText());
				d=Integer.parseInt(value_d.getText());
				Polynomial frame = new Polynomial(a,b,c,d);
				 frame.setVisible(true);
				 //set default close operation
				 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						 
			 }
		 });
		
	 }
}