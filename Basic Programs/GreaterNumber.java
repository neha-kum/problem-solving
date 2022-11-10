
import java.util.Scanner;
public class GreaterNumber
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter a : ");
		int a=sc.nextInt();
		System.out.print("Enter b : ");
        int b=sc.nextInt();
		
		System.out.println();
		
		if(a>b)
		System.out.println("a is greater");
		else 
		System.out.println("b is greater");
	}
}

