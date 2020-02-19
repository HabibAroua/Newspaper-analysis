package treatment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import model.Newspaper;

public class Operation 
{
	public ArrayList<Newspaper> lists;
	public String url;
	
	public Operation()
	{
		lists=new ArrayList<Newspaper>();
	}
	
	public Operation(String url)
	{
		lists=new ArrayList<Newspaper>();
		this.url=url;
	}
	
	public  Newspaper getLine(String s)
	{
		try
		{
			String[] data = s.split(":", 7);
			Newspaper newspaper = new Newspaper();
			System.out.println("Id = "+data[0]); 
			newspaper.setId(Integer.parseInt(data[0]));
			System.out.println("Name = "+data[1]);
			newspaper.setName(data[1]);
			System.out.println("Country "+data[2]);
			newspaper.setCountry(data[2]);
			System.out.println("Date = "+data[3]);
			newspaper.setDate(data[3]);
			System.out.println("Title = "+data[4]);
			newspaper.setTitle(data[4]);
			System.out.println("Author = "+data[5]);
			newspaper.setAuthor(data[5]);
			System.out.println("Content = "+data[6]);
			newspaper.setContent(data[6]);
			return newspaper;
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
		catch(Exception ex)
		{
			System.out.println("Error : "+ex.getMessage());
			return null;
		}
	}
	
	public  void collectData()
	{
		try
		{
			File file = new File(this.url);   
			BufferedReader br = new BufferedReader(new FileReader(file));   
			String st; 
			while ((st = br.readLine()) != null)
			{
			    //System.out.println(st);
			    this.lists.add(getLine(st));
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
	
	public void showAllNewSpapers()
	{
		try
		{
			for(int i=0; i<this.lists.size(); i++)
			{
				System.out.println(lists.get(i).toString());
			}
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Error : "+ex.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println("Error : "+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
		}
	}
	
	public ArrayList<String> getAllcountry()
	{
		try
		{
			ArrayList<String> countries=new ArrayList<String>();
			countries.add(this.lists.get(0).getCountry());
			for(int i=1; i<this.lists.size(); i++)
			{
				if(countries.contains(this.lists.get(i).getCountry()))
				{
					continue;
				}
				else
				{
					countries.add(this.lists.get(i).getCountry());
				}
			}
			return countries;
		}
		catch(NullPointerException e)
		{
			System.out.println("Error : "+e.getMessage());
			return null;
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
			return null;
		}
	}
	
	public ArrayList<String> getAllAuthors()
	{
		try
		{
			ArrayList<String> authors=new ArrayList<String>();
			authors.add(this.lists.get(0).getCountry());
			for(int i=1; i<this.lists.size(); i++)
			{
				if(authors.contains(this.lists.get(i).getAuthor()))
				{
					continue;
				}
				else
				{
					authors.add(this.lists.get(i).getAuthor());
				}
			}
			return authors;
		}
		catch(NullPointerException e)
		{
			System.out.println("Error : "+e.getMessage());
			return null;
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
			return null;
		}
	}
	
	public int countNewSpaperByAuthor(String author)
	{
		try
		{
			int nb=0;
			for(int i=0 ; i<this.lists.size() ; i++)
			{
				if(this.lists.get(i).getAuthor().equals(author))
				{
					nb++;
				}
			}
			return nb;
		}
		catch(NullPointerException e)
		{
			System.out.println("Error : "+e.getMessage());
			return -1;
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
			return -1;
		}
	}
	
	public int countNumberNewSpaperByCountry(String country)
	{
		try
		{
			int nb=0;
			for(int i=0 ; i<this.lists.size() ; i++)
			{
				if(this.lists.get(i).getCountry().equals(country))
				{
					nb++;
				}
			}
			return nb;
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Error : "+ex.getMessage());
			return -1;
		}
		catch(NullPointerException e)
		{
			System.out.println("Error : "+e.getMessage());
			return -1;
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
			return -1;
		}
	}
	
	public void numberNewSpapersByCountry(ArrayList<String>l)
	{
		try
		{
			for(int i=0 ; i<l.size() ; i++)
			{
				System.out.println("country : "+l.get(i)+" number : "+countNumberNewSpaperByCountry(l.get(i))); //if result -1 that means that there are error or exception in your data
			}
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Error : "+ex.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println("Error : "+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
		}
	}
	
	public void countNewSpaperByAuthors(ArrayList<String>l)
	{
		try
		{
			for(int i=0 ; i<l.size() ; i++)
			{
				System.out.println("country : "+l.get(i)+" number : "+countNewSpaperByAuthor(l.get(i))); //if result -1 that means that there are error or exception in your data
			}
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Error : "+ex.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println("Error : "+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
		}
	}
	
	//To test Operation class
	public static void main(String args[])
	{
		Operation o=new Operation("C:/Users/lenovo/workspace/Newspaper-analysis/src/treatment/journal.txt");
		o.collectData();
		//o.showAllNewSpapers();
		//o.showAllcountry();
		//o.numberNewSpapersByCountry(o.getAllcountry());
		o.countNewSpaperByAuthors(o.getAllAuthors());
	}

}
