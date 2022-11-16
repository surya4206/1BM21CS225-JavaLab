import java.util.Scanner;
class labprog1{
    public static void main(String args[]) {
        Scanner ss=new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter the coefficients a, b and c:");
        a=ss.nextDouble();
        b=ss.nextDouble();
        c=ss.nextDouble();
        double dis=b*b-4*a*c;
        if(dis>0)
        {
            System.out.println("Roots are real and distinct.");
            double r1=-b/(2*a);
            double r2=(Math.sqrt(dis))/(2*a);
            System.out.println("Solution 1="+(r1+r2));
            System.out.println("Solution 2="+(r1-r2));
        }
        else if(dis==0)
        {
            System.out.println("Roots are real and equal.");
            System.out.println("Solution="+(-b/(2*a)));
        }
        else
        System.out.println("No real solutions exist.");
    }
}