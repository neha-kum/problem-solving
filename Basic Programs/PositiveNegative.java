
public class PositiveNegative
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no. : ");
		int n=sc.nextInt();
         
         if (n>0)
             System.out.println("The no. is positive");
         else if(n<0)
             System.out.println("The no. is negative");
             else
             System.out.println("The no. is 0");
             }
}

