import java.util.Scanner;
class Student{
    String usn,name;
    int credits[]=new int[10];
    int marks[]=new int[10];
}
class labprog2{
    public static void main(String args[]){
        Student s1=new Student();
        Scanner ss=new Scanner(System.in);
        s1.accept();
        s1.display();
        s1.calculate();
    }
}