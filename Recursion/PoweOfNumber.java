public class PowerOfNumber
{
    public static boolean isPrime(int n, int i){
        if(n<=2)
        return (n==2)? true : false;
        
        if(n%i==0)
        return false;
        
        if(i*i>n)
        return true;
        
        return isPrime(n,i+1);
    }
    
	public static void main(String[] args) {
	    int n = 7;
	    if(isPrime(n,2))
	    System.out.println("It is a prime no.");
	    else 
	    System.out.println("It is not a prime no.");
	}
}
