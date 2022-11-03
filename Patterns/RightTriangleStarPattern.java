public class RightTriangleStarPattern
{
	public static void main(String[] args) {
	    pattern(4);
	}
	
	static void pattern(int n){
	for(int i=1; i<=n; i++){
	    for(int j=1; j<=i; j++){
	        System.out.print("*");
	    }
	    System.out.println();
	}
}
}



