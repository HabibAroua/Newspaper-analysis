package view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import treatment.OperationOfResults;


public class TableAuthor_dim_Result1 
{
	JFrame frame ;
	TableAuthor_dim_Result1()
	{
		frame = new JFrame();
		OperationOfResults o1 =new OperationOfResults(1);
		o1.collectData();
		
		
		String [][] res = new String[o1.getList1().size()][2];
		for(int i=0 ; i<o1.getList1().size() ; i++)
		{
			res[i][0]=o1.getList1().get(i).getVal();
			res[i][1]="\t \t"+o1.getList1().get(i).getNb();
		}
		
		String [] header = {"Author" , "Count"};
		JTable t = new JTable(res,header);
		t.setBounds(30,40,200,300);
		JScrollPane s = new JScrollPane(t);
		frame.add(s);
		frame.setSize(400, 500);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new TableAuthor_dim_Result1();
	}
}
