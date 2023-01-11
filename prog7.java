class a extends Thread
{
	public void run()
	{
		try
		{
		int n=5;
		while(n>0)
		{
			System.out.println("BMS College of Engineering");
			Thread.sleep(10000);
			n--;
		}
		}
		catch(InterruptedException e){}
	}
}
class b extends Thread
{
	public void run()
	{
		try
		{
		int n=25;
		while(n>0)
		{
			System.out.println("CSE");
			Thread.sleep(2000);
			n--;
		}
		}
		catch(InterruptedException e){}
	}
}
class prog7
{
	public static void main(String args[])
	{
		new a().start();
		new b().start();
	}
}
