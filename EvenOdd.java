
import java.util.Scanner;

public class EvenOdd
{
	public static void main(String[] args) {
		System.out.print("Enter a no. : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n%2==0)
		System.out.println("The no. is even");
		else
		System.out.println("The no. is odd");
	}
}

