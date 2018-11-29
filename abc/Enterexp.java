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
public class Enterexp extends JFrame 
{
 //declare variable
	 private JPanel contentPane;
	 private int a,b;

	 public static void main(String[] args)
	 {

		 EventQueue.invokeLater(new Runnable()
		 {
			 public void run()
			 {
			 //try - catch block
			 	try 
			 	{
			 	 		Enterexp frame = new Enterexp();
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
	 public Enterexp()//constructor 
	 {
		 //set frame title
		 setTitle("Exponential");
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
		 
		 JLabel l=new JLabel("Enter the coeff. : for a*e^(b*x)");
		 l.setBounds(50,10,300,30);
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

		JButton button=new JButton("Select");
		button.setBounds(100,220,100,30);
		add(button);
		
		 //add actionListener
		 button.addActionListener(new ActionListener()
		 {
			 public void actionPerformed(ActionEvent arg0)
			 {
				a=Integer.parseInt(value_a.getText());
				b=Integer.parseInt(value_b.getText());
				Exponential frame = new Exponential(a,b);
				 frame.setVisible(true);
				 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						 
			 }
		 });
		
	 }
}