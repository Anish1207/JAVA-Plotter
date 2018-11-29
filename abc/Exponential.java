package abc;
//import statement
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Graphics;
import java.lang.Math.*;
import java.text.*;

//create class and extend with JFrame
public class Exponential extends JFrame 
{
	//declare variable
	private JPanel mainpanel;
	private int a,b;
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
					//Create object of Exponential
					Exponential frame = new Exponential(1,1);
					//set frame visible true
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
	public Exponential(int a,int b) //constructor
	{
		this.a=a;
		this.b=b;

		setTitle("Exponential");								//set frame title
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	//set default close operation	
		setBounds(0, 0, 900, 1100);							//set bounds of the frame
		
		//create object of JPanel
		mainpanel = new JPanel();
		mainpanel.setBackground(Color.CYAN);
		mainpanel.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setmainpanel(mainpanel);
		mainpanel.setLayout(null);

		add(mainpanel);
		

	}

	public void paint(Graphics g)
	{  
		int col=400;
		int row=400;
		int scalex=20,scaley=20;
		int xstart=0;
		int xvisible=50;
		float least_count=(float)0.2;
		int no_points=300;

		//axes
		g.setColor(Color.black);
		g.drawLine(col,0,col,900);
		g.drawLine(0,900-row,900,900-row);  



		//points
		g.setColor(Color.red);  
		float x[] = new float[no_points];
		float y[] = new float[no_points];

		xstart=(900-col)/scalex;
		float xbeg=0;
		for (int j=0;j<no_points;j++)
		{
			x[j]=xbeg-xstart;
			y[j]=a*((float)Math.exp(b*x[j]));
			if (y[j]<900-row)
				xvisible=(int)x[j];
			xbeg+=least_count;

		}

		scalex=(900-col)/xvisible;

		//labels
			//x=0
		for (int j=900;j>=0;j-=20)
		{
			String temp = Integer.toString((900-row-j)/scaley);
			g.drawString(temp,col-35,j+5);
			g.drawLine(col-2,j,col+2,j);
		}
			//y=0
		DecimalFormat df = new DecimalFormat("0.00");//to restrict decimal places
		
		for (int j=0;j<900;j+=40)
		{	
			String temp = df.format(((j-col)/((float)scalex)));
			int xlabel=900-(row-40);
			g.drawString(temp,j-5,xlabel);
			g.drawLine(j,(900-row-2),j,(900-row+2));
		}

		for (int j=0;j<no_points-1;j++)
		{
			float x1 = x[j];
			x1 = scalex*x1;
			x1 = x1+col;

		    float x2 = x[j+1];
			x2 = scalex*x2;
			x2 = x2+col;
			
			float y1 = y[j];
			y1 = scaley*y1;
			y1 =  (900-row) - y1;

			float y2 = y[j+1];
			y2 = scaley*y2;
			y2 =  (900-row) - y2;


			g.drawLine((int)x1,(int)y1,(int)x2,(int)y2);
		}


 
	}  
}