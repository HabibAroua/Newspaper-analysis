package model;

public class Date_dim_Result1 
{
	private String val;
	private int nb;
	
	public Date_dim_Result1(String val, int nb)
	{
		super();
		this.val = val;
		this.nb = nb;
	}
	
	public Date_dim_Result1()
	{
		super();
	}

	public String getVal() 
	{
		return this.val;
	}

	public void setVal(String val) 
	{
		this.val = val;
	}

	public int getNb() 
	{
		return this.nb;
	}

	public void setNb(int nb)
	{
		this.nb = nb;
	}

	@Override
	public String toString()
	{
		return "Date_dim_Result1 [val=" + val + ", nb=" + nb + "]";
	}

}
