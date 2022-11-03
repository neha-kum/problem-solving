import java.util.Scanner;
public class PrintMatrix
{
	public static void main(String[] args) {
		int a[][]= new int[100][100];
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the no. of rows : " );
		int row = sc.nextInt();
		System.out.print("Enter the no. of columns : ");
		int column= sc.nextInt();
		
		for(int i=1;i<=row;i++){
		    for(int j=1;j<=column;j++){
		        System.out.print("Enter element a" + i + j + " : ");
		        a[i][j]= sc.nextInt();
		        
		    }
		}
		for(int i=1;i<=row;i++){
		    for(int j=1;j<=column;j++){
		        System.out.print(a[i][j]+ "\t");
		    }
		    System.out.println();
		}
	}
}


