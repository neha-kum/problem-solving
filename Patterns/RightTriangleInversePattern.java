public class RightTriangleInversePattern
{
	public static void main(String[] args) {
		pattern(5);
		pattern2(5);
		}
	
	static void pattern(int n){
	    for(int i=1;i<=n;i++){
	        for(int j=n;j>=i;j--){
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
	static void pattern2(int n){
	    for(int i=0;i<=n;i++){
	        for(int j=1;j<=n-i;j++){       //or if i=1, n+1-i;  
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
}


