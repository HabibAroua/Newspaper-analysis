package view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import treatment.OperationOfResults;

public class TableCountry_dim_Result1
{
	JFrame frame ;
	TableCountry_dim_Result1()
	{
		frame = new JFrame();
		OperationOfResults o3 =new OperationOfResults(3);
		o3.collectData();
		
		
		String [][] res = new String[o3.getList3().size()][2];
		for(int i=0 ; i<o3.getList3().size() ; i++)
		{
			res[i][0]=o3.getList3().get(i).getVal();
			res[i][1]="\t \t"+o3.getList3().get(i).getNb();
		}
		
		String [] header = {"Country" , "Count"};
		JTable t = new JTable(res,header);
		t.setBounds(30,40,200,300);
		JScrollPane s = new JScrollPane(t);
		frame.add(s);
		frame.setSize(400, 500);
		frame.setVisible(true);
	}
	
	public static void main(String args[])
	{
		new TableCountry_dim_Result1();
	}
}
