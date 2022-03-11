
import java.util.*;
import java.io.*;
import distance1.Distance;
import time1.time;
import currency1.currency;
public class conversion
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int choice,ch;
       currency x=new currency();
       Distance d=new Distance();
       time t=new time();
       do
       {
          System.out.println();
          System.out.println("1.Dollars to Rupees");
          System.out.println("2.Rupee to Dollars");
          System.out.println("3.Euro to Rupees");
          System.out.println("4.Rupees to Euro");
          System.out.println("5.Yen to Rupee");
          System.out.println("6.Rupee to Yen");
          System.out.println("7.Meter to kilometer ");
          System.out.println("8.kilometer to meter ");
          System.out.println("9.Miles  to kilometer ");
          System.out.println("10.kilometer to miles");
          System.out.println("11.Hours to Minutes");
          System.out.println("12.Hours to Seconds");
          System.out.println("13.Seconds to Hours");
          System.out.println("14.Minutes to Hours");
          System.out.println();
          System.out.print("Enter your choice :");
          choice=sc.nextInt();
          switch(choice)
          {
			case 1:
			{
				x.dollartorupee();
				break;
			}
			case 2:
			{
				x.rupeetodollar();
				break;
			}
			case 3:
			{
				x.eurotorupee();
				break;
			}
			case 4:
			{
				x.rupeetoeuro();
				break;
			}
			case 5:
			{
				x.yentorupee();
				break;
			}
			case 6:
			{
				x.rupeetoyen();
				break;
			}
            case 7:
            {
				d.mtokm();
                break;
            }
            case 8:
            {
                d.kmtom();
                break;
            }
            case 9:
            {
                d.milestokm();
                break;
            }
            case 10:
            {
                d.kmtomiles();
                break;
            }
            case 11:
            {
                t.hourstominutes();
                break;
            }
            case 12:
            {
                t.hourstoseconds();
                break;
            }
            case 13:
            {
                t.secondstohours();
                break;
            }
            case 14:
            {
                t.minutestohours();
                break;
            }
		  }
		  System.out.println();
		  System.out.println("Enter 1 to continue and 0 to continue :");
          ch=sc.nextInt();
	  }
	  while(ch==1);
  }
}