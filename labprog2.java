import java.util.Scanner;
class Student{
    String usn,name;
    int credits[]=new int[10];
    int marks[]=new int[10];
    void accept()
    {
        Scanner ss=new Scanner(System.in);
	  System.out.println("Enter name:");
	  name=ss.next();
	  System.out.println("Enter usn:");
	  usn=ss.next();
        System.out.println("Enter the credits of the course and the respective marks:");
        for(int i=0;i<10;i++)
        {
            credits[i]=ss.nextInt();
            marks[i]=ss.nextInt();
        }
    }
    void display()
    {
	  System.out.println("Name:"+name+"\nUSN:"+usn);
        for(int i=0;i<10;i++)
        {
            System.out.println("\nCourse "+(i+1));
            System.out.println("Credits:"+credits[i]);
            System.out.println("Marks:"+marks[i]);
        }
    }
    double calculate()
    {
        int num=0,den=0;
	  double sgpa;
        for(int i=0;i<10;i++)
        { 
	  if(marks[i]<40)
	  num+=0;
	  else if(marks[i]/10<10)
        num+=credits[i]*(((int)marks[i]/10)+1);
	  else if(marks[i]/10==10)
	  num+=credits[i]*((int)marks[i]/10);
        den+=credits[i];
        }
        sgpa=(double)num/den;
        return sgpa;
    }
}
class labprog2{
    public static void main(String args[]){
        Student s1=new Student();
        s1.accept();
        s1.display();
        System.out.println("\nSGPA of student:"+s1.calculate());
    }
}
