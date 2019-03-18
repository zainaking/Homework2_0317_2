import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework2 {





    //rite a program that Scans for ANY two inputs from a user:
    //
    //Enter the first number
    //45
    //Enter the second number
    //9
    //
    //The result of
    //num1 plus num2 is : 54.0
    //num1 minus num2 is : 36.0
    //num1 multiplied by num2 is : 405.0
    //num1 divided num2 is : 5.0
    //Square of num1 is : 2025.0
    //Square root of num1 is : 6.708203932499369
    //num1 raised to the power of num2 is : 7.56680642578125E14
    //Sine of num1 is : 0.7071067811865475
    //Cosine of num1 is : 0.7071067811865476


    public static void main(String args[]){

        Scanner dd = new Scanner(System.in);

        System.out.println("Enter first number.");
        int a = dd.nextInt();
        System.out.println("Enter second number.");
        int b = dd.nextInt();


        System.out.println(a + b);
        System.out.println(a -b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a*a);
        System.out.println( Math.sqrt(a));
        System.out.println(Math.pow(a,b));
        System.out.println(Math.sin(a));
        System.out.println((Math.cos(a)));
    }



}
