package treatment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import model.Author_dim_Result1;
import model.Date_dim_Result1;
import model.Country_dim_Result1;

public class OperationOfResults 
{
	private ArrayList<Author_dim_Result1> list1;
	private ArrayList<Date_dim_Result1> list2;
	private ArrayList<Country_dim_Result1> list3;
	private int val_init;
	
	public OperationOfResults(int val_init)
	{
		super();
		this.val_init=val_init;
		switch(this.val_init)
		{
			case 1 : list1 =new ArrayList<Author_dim_Result1>();
				break;
			case 2 : list2 =new ArrayList<Date_dim_Result1>();
				break;
			case 3 : list3 =new ArrayList<Country_dim_Result1>();
				break;
			default : list1 =new ArrayList<Author_dim_Result1>();
					  list2 =new ArrayList<Date_dim_Result1>();
					  list3 =new ArrayList<Country_dim_Result1>();
				break;
		}
	}
	
	public Author_dim_Result1 getAuthor_dim_Result1(String str)
	{
		try
		{
			String[] data = str.split("\t", 2);
			Author_dim_Result1 obj = new Author_dim_Result1();
			System.out.println("Val : "+data[0]);
			obj.setVal(data[0]);
			System.out.println("Nb : "+data[1]);
			obj.setNb(Integer.parseInt(data[1]));
			return obj;
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Error : "+ex.getMessage());
			return null;
		}
		catch(NullPointerException  ex)
		{
			System.out.println("Error : "+ex.getMessage());
			return null;
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
			return null;
		}
	}
	
	public ArrayList<Author_dim_Result1> getList1()
	{
		return this.list1;
	}

	public Date_dim_Result1 getDate_dim_Result1(String str)
	{
		try
		{
			String[] data = str.split("\t", 2);
			Date_dim_Result1 obj = new Date_dim_Result1();
			System.out.println("Val : "+data[0]);
			obj.setVal(data[0]);
			System.out.println("Nb : "+data[1]);
			obj.setNb(Integer.parseInt(data[1]));
			return obj;
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Error : "+ex.getMessage());
			return null;
		}
		catch(NullPointerException  ex)
		{
			System.out.println("Error : "+ex.getMessage());
			return null;
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
			return null;
		}
	}
	
	public ArrayList<Date_dim_Result1> getList2() 
	{
		return this.list2;
	}
	
	public Country_dim_Result1 getCountry_dim_Result1(String str)
	{
		try
		{
			String[] data = str.split("\t", 2);
			Country_dim_Result1 obj = new Country_dim_Result1();
			System.out.println("Val : "+data[0]);
			obj.setVal(data[0]);
			System.out.println("Nb : "+data[1]);
			obj.setNb(Integer.parseInt(data[1]));
			return obj;
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Error : "+ex.getMessage());
			return null;
		}
		catch(NullPointerException  ex)
		{
			System.out.println("Error : "+ex.getMessage());
			return null;
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
			return null;
		}
	}

	public ArrayList<Country_dim_Result1> getList3() 
	{
		return this.list3;
	}
	
	public ArrayList<Country_dim_Result1> getAllCountry_dimResult1()
	{
		return null;
	}
	
	public ArrayList<Date_dim_Result1> getAllDate_dimResult1()
	{
		return null;
	}
	
	private void collectAuthor_dim_Result1(String url)
	{
		try
		{
			File file = new File(url);   
			BufferedReader br = new BufferedReader(new FileReader(file));   
			String st; 
			while ((st = br.readLine()) != null)
			{
			    this.list1.add(getAuthor_dim_Result1(st));
			}
		}
		catch(IOException ex)
		{
			System.out.println("Error : "+ex.getMessage());
		}
		catch(Exception ex)
		{
			System.out.println("Error : "+ex.getMessage());
		}
	}
	
	private void collectDate_dim_Result1(String url)
	{
		try
		{
			File file = new File(url);   
			BufferedReader br = new BufferedReader(new FileReader(file));   
			String st; 
			while ((st = br.readLine()) != null)
			{
			    //System.out.println(st);
			    this.list2.add(getDate_dim_Result1(st));
			}
		}
		catch(IOException ex)
		{
			System.out.println("Error : "+ex.getMessage());
		}
		catch(Exception ex)
		{
			System.out.println("Error : "+ex.getMessage());
		}
	}
	
	private void collectCountry_dim_Result1(String url)
	{
		try
		{
			File file = new File(url);   
			BufferedReader br = new BufferedReader(new FileReader(file));   
			String st; 
			while ((st = br.readLine()) != null)
			{
			    //System.out.println(st);
			    this.list3.add(getCountry_dim_Result1(st));
			}
		}
		catch(IOException ex)
		{
			System.out.println("Error : "+ex.getMessage());
		}
		catch(Exception ex)
		{
			System.out.println("Error : "+ex.getMessage());
		}
	}
	
	public void collectData()
	{
		try
		{
			switch(this.val_init)
			{
				case 1 : collectAuthor_dim_Result1("__Path__/out3.txt");
					break;
				case 2 : collectDate_dim_Result1("__Path__/out2.txt");
					break;
				case 3 : collectCountry_dim_Result1("__Path__/out1.txt");
					break;
			}
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
		}
	}
	
	public static void main (String args[])
	{
		OperationOfResults o1 =new OperationOfResults(1);
		o1.collectData();
		for(int i=0 ; i<o1.getList1().size() ; i++)
		{
			System.out.println(o1.getList1().get(i).toString());
		}
		
		OperationOfResults o2 =new OperationOfResults(2);
		o2.collectData();
		for(int i=0 ; i<o2.getList2().size() ; i++)
		{
			System.out.println(o2.getList2().get(i).toString());
		}
		
		OperationOfResults o3 =new OperationOfResults(3);
		o3.collectData();
		for(int i=0 ; i<o3.getList3().size() ; i++)
		{
			System.out.println(o3.getList3().get(i).toString());
		}
	}	
}
