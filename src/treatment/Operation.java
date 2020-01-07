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
	
	public static Newspaper collectData(String s)
	{
		try
		{
			String[] data = s.split(":", 6);
			Newspaper newspaper = new Newspaper();
			System.out.println("Id = "+data[0]); 
			newspaper.setId(Integer.parseInt(data[0]));
			System.out.println("Name = "+data[1]);
			newspaper.setName(data[1]);
			System.out.println("Date = "+data[2]);
			newspaper.setDate(data[2]);
			System.out.println("Title = "+data[3]);
			newspaper.setTitle(data[3]);
			System.out.println("Author = "+data[4]);
			newspaper.setAuthor(data[4]);
			System.out.println("Content = "+data[5]);
			newspaper.setContent(data[5]);
			return new Newspaper();
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Error : "+ex.getMessage());
			return null;
		}
		catch(Exception ex)
		{
			System.out.println("Error : "+ex.getMessage());
			return null;
		}
	}
	public static void main(String args[])
	{
		collectData("1 : Sunday time : 07/01/2020: kill :Foulen Ben Foulen : eaeaeaeaeaeaeaeaeaeaeaeaeaeaeeaeaee");
	}
}

