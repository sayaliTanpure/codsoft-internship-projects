import java.util.*;
public class gradecalc {
    public static void main(String args[])
    {
        display();
    }

    public static void display()
    {
        int physics,chemistry,maths;
        System.out.println("Enter the marks of physics,chemistry and maths out of 100");
        Scanner sc = new Scanner(System.in);

        //input
        physics=sc.nextInt();
        chemistry=sc.nextInt();
        maths=sc.nextInt();

        //Total calculation
        int total=physics+chemistry+maths;
        System.out.println("Total marks obtained:"+total);

        //Average percentage calculation
        double average = (total)/3;
        System.out.println("Average percentage is:"+average+"%");

        //grade calculation
        if(average >=80){
            System.out.println("Grade: Distinction");
        }
        else if(average>=70 && average<80){
            System.out.println("Grade: First class");
        }
        else if(average>=60 && average<70){
            System.out.println("Grade: Second class");
        }
        else if(average>=35 && average<60)
        {
            System.out.println("Grade: Pass");
        }
        else
        {
            System.out.println("Grade: Fail");
        }
    }
}
