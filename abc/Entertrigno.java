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
public class Entertrigno extends JFrame 
{
 //declare variable
	 private JPanel contentPane;
	 private int a;

	 public static void main(String[] args)
	 {

		 EventQueue.invokeLater(new Runnable()
		 {
			 public void run()
			 {
			 //try - catch block
			 	try 
			 	{
			 	 		Entertrigno frame = new Entertrigno();
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
	 public Entertrigno()//constructor 
	 {
		 //set frame title
		 setTitle("Trigonometric");
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
		 
 		JLabel l=new JLabel("Enter the type of graph you want to plot:");
		l.setBounds(50,10,500,30);
		

		JRadioButton rb1=new JRadioButton("Sine");
		rb1.setBounds(100,70,200,30);
		JRadioButton rb2=new JRadioButton("Cosine");
		rb2.setBounds(100,120,200,30);
	

		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);bg.add(rb2);
		JButton b=new JButton("Select");
		b.setBounds(100,220,100,30);
		
		add(l);
		add(rb1);
		add(rb2);
		add(b);
		
		 //add actionListener
		 b.addActionListener(new ActionListener()
		 {
			 public void actionPerformed(ActionEvent arg0)
			 {
				 //call the object of NewWindow and set visible true
				if (rb1.isSelected())
				{Trigonometric frame = new Trigonometric(1);
				 frame.setVisible(true);
				 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				}	
				else if (rb2.isSelected())
				{ Trigonometric frame = new Trigonometric(2);
				 frame.setVisible(true);
				 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				}	


			 }
		 });
		
	 }
}