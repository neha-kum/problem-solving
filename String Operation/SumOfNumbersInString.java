
public class SumOfNumbersInString
{
	public static void main(String[] args) {
	    String s = "4qawain4e5" ;
	    int sum=0;
	    for(char i : s.toCharArray()){
	        if(Character.isDigit(i)){
	            sum+=Character.getNumericValue(i);
	        }
	    }
	    System.out.println(sum);
	    
	    
// 	    Iterator<String> it= s.iterator();
// 		System.out.println(itr);
	}
}



