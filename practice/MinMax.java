import java.io.*;
import java.util.*;
class MaxMin<T extends Comparable<T>>
{
T n[];
MaxMin(T[] a)
{
n=a;
}
void disp()
{
int size=n.length;
T min=n[0];
T max=n[0];
for(int i=0; i<size; i++)
{
if(n[i].compareTo(min)<0)
{
n[i]=min;
}
}
System.out.println("The minimum element is :\n"+min);
for(int i=0; i<size; i++)
{
if(n[i].compareTo(max)>0)
{
max=n[i];
}
}
System.out.println("The maximum element is :\n"+max);
}
public static void main(String args[])
{
Integer arr[]={34,5,56,65,4};
MaxMin<Integer> g=new MaxMin<Integer>(arr);
g.disp();
String arr1[]={"a","b","c","D"};
MaxMin<String> g1=new MaxMin<String>(arr1);
g1.disp();
}
}