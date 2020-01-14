class epam1
{
private static epam1 instance;
	private epam1()
	{
	}
	private static epam1 getinstance()
	{
		if(instance==null)
		{
		instance=new epam1 ();
		}
return instance;
	}
	public static void main(String args[])
	{
		epam1 e1=epam1.getinstance();
		System.out.print(e1);

	}
}