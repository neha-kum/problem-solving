
import java.util.Scanner;
public class LeapYear
{
	public static void main(String[] args) {
		System.out.print("Enter the year : ");
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		
		System.out.println();
		
		if(y%4==0 && y%100!=0 || y%400==0)
		System.out.println("Leap year");
		else
		System.out.println("Not a leap year");
		
	}
}


