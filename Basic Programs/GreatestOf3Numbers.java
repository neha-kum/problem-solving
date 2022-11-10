import java.util.Scanner;
public class GreatestOf3Numbers{
	public static void main(String[] args) {
		System.out.print("Enter a : ");
		Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    System.out.print("Enter b : ");
	    int b=sc.nextInt();
	    System.out.print("Enter c : ");
	    int c=sc.nextInt();
	    
	    System.out.println();
	    
	    if(a>b && a>c)
	    System.out.println("a is the greatest");
	    else if (b>a && b>c)
	    System.out.println("b is the greatest");
	    else 
	    System.out.println("c is the greatest");
	    }
	}

