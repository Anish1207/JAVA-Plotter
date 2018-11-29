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
public class PlotOptions extends JFrame 
{
 //declare variable
	 private JPanel contentPane;
	 
	 /**
	 * Launch the application.
	 */
	 //main method
	 public static void main(String[] args)
	 {
	 /* It posts an event (Runnable)at the end of Swings event list and is
	 processed after all other GUI events are processed.*/
		 EventQueue.invokeLater(new Runnable()
		 {
			 public void run()
			 {
			 //try - catch block
			 	try 
			 	{
			 	 		PlotOptions frame = new PlotOptions();
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
	 public PlotOptions()//constructor 
	 {
		 //set frame title
		 setTitle("PLOTTER");
		 //set default close operation
		 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 //set bounds of the frame
		 setBounds(0, 0, 700, 700);
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
		

		JRadioButton rb1=new JRadioButton("Polynomial");
		rb1.setBounds(100,70,200,30);
		JRadioButton rb2=new JRadioButton("Exponential");
		rb2.setBounds(100,120,200,30);
		JRadioButton rb3=new JRadioButton("Trigonometric");
		rb3.setBounds(100,170,200,30);

		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);bg.add(rb2);bg.add(rb3);
		JButton b=new JButton("Select");
		b.setBounds(100,220,100,30);
		
		add(l);
		add(rb1);
		add(rb2);
		add(rb3);
		add(b);
		
		 //add actionListener
		 b.addActionListener(new ActionListener()
		 {
			 public void actionPerformed(ActionEvent arg0)
			 {
				 //call the object of NewWindow and set visible true
				if (rb1.isSelected())
				{Entercoeff frame = new Entercoeff();
				 frame.setVisible(true);
				 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				}	
				else if (rb2.isSelected())
				{Enterexp frame = new Enterexp();
				 frame.setVisible(true);
				 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				}	

				else if (rb3.isSelected())
				{Entertrigno frame = new Entertrigno();
				 frame.setVisible(true);
				 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				}


			 }
		 });
		
	 }
}