import java.io.*;
import java.util.*;
class Negat
{
public void get()
{
int amt;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the amount :");
amt=sc.nextInt();
if(amt<0)
{
throw new ArithmeticException("Invalid amt");
}
else
{
System.out.println("Amount Deposited");
}
}
public static void main(String []args)
{
Negat n=new Negat();
try
{
n.get();
}
catch(java.lang.Exception e)
{
System.out.println("e");
}
}
}


