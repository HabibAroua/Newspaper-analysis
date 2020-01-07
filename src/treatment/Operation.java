package treatment;

import java.util.ArrayList;
import model.Newspaper;

public class Operation 
{
	public ArrayList<Newspaper> lists;
	
	public Operation()
	{
		lists=new ArrayList<Newspaper>();
	}
	
	public static void collectData(String s)
	{
		try
		{
		String[] data = s.split(":", 2);
		System.out.println("Id = "+data[0]); 
		System.out.println("Name = "+data[1]);
		System.out.println("Date = "+data[2]);
		System.out.println("Author = "+data[3]);
		System.out.println("Content = "+data[4]);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Error : "+ex.getMessage());
		}
		catch(Exception ex)
		{
			System.out.println("Error : "+ex.getMessage());
		}
	}
	public static void main(String args[])
	{
		collectData("1 : Sunday time : 07/01/2020: kill :Foulen Ben Foulen : eaeaeaeaeaeaeaeaeaeaeaeaeaeaeeaeaee");
	}
}

