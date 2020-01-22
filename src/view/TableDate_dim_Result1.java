package view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import treatment.OperationOfResults;

public class TableDate_dim_Result1 
{
	JFrame frame ;
	TableDate_dim_Result1 ()
	{
		frame = new JFrame();
		OperationOfResults o2 =new OperationOfResults(2);
		o2.collectData();
		
		
		String [][] res = new String[o2.getList2().size()][2];
		for(int i=0 ; i<o2.getList2().size() ; i++)
		{
			res[i][0]=o2.getList2().get(i).getVal();
			res[i][1]="\t \t"+o2.getList2().get(i).getNb();
		}
		
		String [] header = {"Date" , "Count"};
		JTable t = new JTable(res,header);
		t.setBounds(30,40,200,300);
		JScrollPane s = new JScrollPane(t);
		frame.add(s);
		frame.setSize(400, 500);
		frame.setVisible(true);
	}
	
	public static void main(String args[])
	{
		new TableDate_dim_Result1();
	}

}
