package view;

import javax.imageio.ImageIO;
import javax.swing.*;    
import java.awt.event.*;
import java.io.File;    
public class Menu implements ActionListener
{    
	JFrame f;    
	JMenuBar mb;    
	JMenu file,edit,help;    
	JMenuItem cut,copy,paste,selectAll;    
	JTextArea ta;    
	Menu() 
	{
		try
		{
			f=new JFrame();    
			f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("image/large.png")))));
			cut=new JMenuItem("First analysis");    
			copy=new JMenuItem("Second analysis");
			paste=new JMenuItem("paste");    
			selectAll=new JMenuItem("selectAll");    
			cut.addActionListener(this);    
			copy.addActionListener(this);    
			paste.addActionListener(this);    
			selectAll.addActionListener(this);    
			mb=new JMenuBar();    
			file=new JMenu("File");    
			edit=new JMenu("Edit");    
			help=new JMenu("Help");     
			edit.add(cut);
			edit.add(copy);
			edit.add(paste);
			edit.add(selectAll);    
			mb.add(file);mb.add(edit);mb.add(help);    
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
		if(e.getSource()==cut)
		{
			new HistogramPanel().run();;
		}
		if(e.getSource()==paste)
		{
			
		}
			  
		if(e.getSource()==copy)    
			//ta.copy();
			new HistogramPanel1().run();;
		if(e.getSource()==selectAll) 
		{
			
		}
			//ta.selectAll();    
	}
	
	public static void main(String[] args)
	{    
		new Menu();    
	}
}    