import java.util.*;
class water 
{
private int temp;
	public void settemp(int temp)
	{
		this.temp=temp;
	}
	public int gettemp()
	{
		return temp;
	}
}
class coffee
{
private water w;
	public coffee()
	{
		this.w=new water();
		w.settemp(100);
	}
	public int gettemp()
	{
		return w.gettemp();
	}
}
class composition
{
	public static void main(String args[])
	{
		coffee c= new coffee();
		System.out.print(c.gettemp());
	}
}
