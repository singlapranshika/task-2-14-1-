class milk
{
protected int temp;

	public int gettemp()
	{

		return temp;
	}
}
class hotcoffee extends milk
{
	public void settemp(int temp)
	{
		this.temp=temp;
	}
}
class coldcoffee extends milk
{
	public void settemp(int temp)
	{
		this.temp=temp;
	}
}
class inheritance
{
	public static void main(String args[])
	{
		hotcoffee h=new hotcoffee();
		coldcoffee c=new coldcoffee();
		h.settemp(100);
		System.out.println(h.gettemp());
		c.settemp(0);
		System.out.println(c.gettemp());
	}
}