import java.util.Scanner;
class Account{
	public static int min=500;
	String name;
	int acc_num;
	public float price;
	Scanner sc=new Scanner(System.in);
	public void get_info()
	{
		System.out.println("Enter Name:");
		name=sc.nextLine();
		System.out.println("Enter Account Number:");
		acc_num=sc.nextInt();
		System.out.println("Enter opening amount (must>500):");
		price=sc.nextFloat();
		if(price<500)
			System.out.println("Enter opening amount (must>500):");
	}
	public void show()
	{
		System.out.println("Name:"+name);
		System.out.println("Account_number:"+acc_num);
		System.out.println("Amount:"+price);
	}
}
class Current extends Account{
	float dep,wit,penalty;
	public void deposit()
	{
		System.out.println("Eneter Ammount to deposit") ;
		dep=sc.nextFloat();
		show();
		price+=dep;
		System.out.println("Total Amount is :"+price);
	}
	public void check_Bal()
	{
		if(price<min)
			price-=150;
			System.out.println("Account balance is:"+price);
	}
	public void withdraw_Bal()
	{
		System.out.println("Enter Amount to withdraw");
		wit=sc.nextFloat();
		show();
		if(wit<price)
		{
			price-=wit;
			System.out.println("After withdawal balance amount:"+price);
		}
		else
			System.out.println("Insufficient Balance");
		check_Bal();
	}
}
class Savings extends Account{
	float dep,wit,intr;
	public void deposit()
	{
		System.out.println("Enter amount to be deposited:");
		dep=sc.nextFloat();
		show();
		price+=dep;
		System.out.println("Total Amount:"+price);
	}
	public void check_intr()
	{
		intr=price*2/100;
		price+=intr;
		System.out.println("Total amount with interest:"+price);
	}
	public void withdraw_Bal()
	{
		System.out.println("Enter amount to withdraw:");
		wit=sc.nextFloat();
		show();
		if(wit<price)
		{
			price-=wit;
			System.out.println("After withdrawal balance amount:"+price);
		}
		else
			System.out.println("Insufficient Balance");
	}
}
class labprog5{
	public static void main(String args[]){
		String ch;
		int co=0;
		Scanner sc=new Scanner(System.in);
		Current c1=new Current();
		Savings s1=new Savings();
		System.out.println("Choose Account Type:");
		System.out.println("Press c for Current Account:");
		System.out.println("Press s for Saving Account:");
		ch=sc.next();
		if(ch.equalsIgnoreCase("c"))
		{
			c1.get_info();
			c1.check_Bal();
			while(co!=4)
			{
				System.out.println("1.Display\n2.Deposit\n3.Withdraw\n4.Exit");
				System.out.println("Enter Your Coice");
				int cho=sc.nextInt();
				switch(cho)
				{
					case 1: c1.show();
					break;
					case 2: c1.deposit();
					break;
					case 3: c1.withdraw_Bal();
					break;
					case 4: System.exit(0);
					break;
					default:System.out.println("Wrong Choice");
				}
			}
		}
		else if(ch.equalsIgnoreCase("s"))
		{
			s1.get_info();
			while(co!=5)
			{
				System.out.println("1.Display\n2.Deposit\n3.Withdraw\n4Intrest\n5.Exit");
				System.out.println("Enter Your Coice");
				int cho=sc.nextInt();
				switch(cho)
				{
					case 1: s1.show();
					break;
					case 2: s1.deposit();
					break;
					case 3: s1.withdraw_Bal();
					break;
					case 4: s1.check_intr();
					break;
					case 5: System.exit(0);
					break;
					default:System.out.println("Wrong Choice");
				}
			}
		}
		else
			System.out.println("Wrong choice!");
	}
}































