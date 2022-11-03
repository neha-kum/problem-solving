public class PyramidStarPattern
{
	public static void main(String[] args) {
		pyramid(3);
	}
	
	static void pyramid(int n){
	    for(int i=1;i<=n;i++){
	        
	        for(int j=1;j<=n-i;j++){
	            System.out.print(" ");
	        }
	        
	        for(int k=1;k<=2*i-1;k++)
	            System.out.print("*");
	        System.out.println();
	    }
	}
}

