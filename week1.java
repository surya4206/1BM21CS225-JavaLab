class employee
{
	String name;
	int age;
	employee(String n, int a)
	{
		name=n;
		age=a;
	}
	void pri()
	{
		System.out.println("\nName:"+name+"\nAge:"+age);
	}
}
class prog4
{
	Scanner s=new Scanner(System.in);
	String a1=s.next();
	int a2=s.nextInt();
	employee e1=new employee(a1,a2);
	a1=s.next();
	a2=s.nextInt();
	employee e2=new employee(a1,a2);
}
