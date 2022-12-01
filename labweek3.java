import java.util.Scanner;
class Books
{
	String title,author; 
	int price,num_pages;
	Books()
	{
		title = new String();
		author = new String();
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the name of the book:");
		title = ss.next();
		System.out.println("Enter the name of the author:");
		author = ss.next();
		System.out.println("Enter the price:");
		price = ss.nextInt();
		System.out.println("Enter the total number of pages:");
		num_pages = ss.nextInt();
    }
    public String toString() 
    {
        return "Book Title: "+title +"\nWritten by: "+author +"\nCost: "+price +"\nPages: "+num_pages;
    }
}
class prog3
{
	public static void main(String args[])
	{
		int total;
		System.out.println("Enter number of books to record: ");
		try (Scanner ss = new Scanner(System.in))
		{
			total = ss.nextInt();
			Books one[] = new Books[total];
			for(int i=0;i<total;i++)
			{
				System.out.println("Book "+(i+1)+":");
				one[i] = new Books();
			}
			for(int i = 0; i<total;i++)
			{
				System.out.println("Book "+(i+1)+":");
				System.out.println(one[i]);
			}
		}
	}
}
