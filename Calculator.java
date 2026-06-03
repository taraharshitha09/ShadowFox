import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        System.out.println("Calculator");
        System.out.println("Enter first number:");
        double num1=a.nextDouble();
        System.out.println("Enter second number:");
        double num2=a.nextDouble();
        System.out.println("Addition = " +(int)(num1+num2));
        System.out.println("Substraction = " +(int)(num1-num2));
        System.out.println("Multiplication = " +(int)(num1*num2));
        System.out.println("Modulus = " +(int)(num1%num2));
        System.out.println("Square Root = " + Math.sqrt(num1));
        System.out.println("Power = " + Math.pow(num1,num2));
        if(num2!=0)
        {
            System.out.println("Division = " +(num1/num2));
            }
            else
            {
                System.out.println("Cannot divide by 0");
            }
            a.close();
        }
    }