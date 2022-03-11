import java.io.*;
import java.util.*;
class DivideByZero
{
public void get()
{
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the num :");
num=sc.nextInt();
int b=10/num;
if(num==0)
{
throw new ArithmeticException();
}
else
{
System.out.println("The Division :"+b);
}
}
public static void main(String []args)
{
DivideByZero d=new DivideByZero();
try
{
d.get();
}
catch(java.lang.Exception e)
{
System.out.println("Invalid user");
}
}
}


