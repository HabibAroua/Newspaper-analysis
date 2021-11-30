package model;

public class Newspaper 
{
	private int id;
	private String name;
	private String country;
	private String date;
	private String title;
	private String author;
	private String content;
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getDate() 
	{
		return date;
	}
	
	public String getCountry()
	{
		return this.country;
	}
	
	public void setCountry(String country)
	{
		this.country=country;
	}
	
	public void setDate(String date)
	{
		this.date = date;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title) 
	{
		this.title = title;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public String getContent()
	{
		return content;
	}
	
	public void setContent(String content)
	{
		this.content = content;
	}

	public Newspaper(int id, String name, String country , String date, String title, String author, String content)
	{
		super();
		this.id = id;
		this.name = name;
		this.country=country;
		this.date = date;
		this.title = title;
		this.author = author;
		this.content = content;
	}
	
	public Newspaper()
	{
		super();
	}

	@Override
	public String toString() 
	{
		return "Newspaper 
		[
			id=" + id + ", 
			name=" + name + ", 
			country=" + country + ", 
			date=" + date + ", 
			title=" + title+ ", 
			author=" + author + ", 
			content=" + content + 
		"]";
	}

}
