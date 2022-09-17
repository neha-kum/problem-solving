
import java.util.Scanner;
public class ReverseNumber
{
	public static void main(String[] args) {
		System.out.print("Enter the no. : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int rev=0;
		int r;
		
		while(n!=0){
		    r=n%10;
		    rev=rev*10+r;
		    n=n/10;
		}
		System.out.println("Reverse of the no. : " +rev);
	}
}


