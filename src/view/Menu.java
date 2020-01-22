package view;

import javax.imageio.ImageIO;
import javax.swing.*;    
import java.awt.event.*;
import java.io.File;    
public class Menu implements ActionListener
{    
	JFrame f;    
	JMenuBar mb;    
	JMenu file,result,help;    
	JMenuItem c1,c2,c3,c4,c5;    
	JTextArea ta;    
	Menu() 
	{
		try
		{
			f=new JFrame();    
			f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("image/large.png")))));
			c1=new JMenuItem("First analysis");    
			c2=new JMenuItem("Second analysis");
			c3=new JMenuItem("Table Author by newspaper");    
			c4=new JMenuItem("Table Country by newspaper"); 
			c5=new JMenuItem("Table date by newspaper");
			c1.addActionListener(this);    
			c2.addActionListener(this);    
			c3.addActionListener(this);    
			c4.addActionListener(this);
			c5.addActionListener(this);
			mb=new JMenuBar();    
			file=new JMenu("File");    
			result=new JMenu("Result");    
			help=new JMenu("Help");     
			result.add(c1);
			result.add(c2);
			result.add(c3);
			result.add(c4);    
			result.add(c5);
			mb.add(file);mb.add(result);mb.add(help);    
			f.add(mb);//f.add(ta);    
			f.setJMenuBar(mb);  
			f.setLayout(null);    
			f.setSize(600,500);    
			f.setVisible(true);    
		}
		catch(Exception e)
		{
			
		}
	}     
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==c1)
		{
			new HistogramPanel().run();;
		}
		
		if(e.getSource()==c2)
		{
			//ta.copy();
			new HistogramPanel1().run();
		}
		
		if(e.getSource()==c3)
		{
			new TableAuthor_dim_Result1();
		}
			  
		if(e.getSource()==c4) 
		{
			new TableCountry_dim_Result1();
		}
		
		if(e.getSource()==c5)
		{
			new TableDate_dim_Result1();
		}
			//ta.selectAll();    
	}
	
	public static void main(String[] args)
	{    
		new Menu();    
	}
}    