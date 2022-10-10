
import java.util.*;
public class CapitaliseCharacter
{
	public static void main(String[] args) {
	
	    String s = "hello world";
	    String newstr = "" ;
	    
	    String[] str=s.split("[\\s]");
	    
	    for(String string : str){
	        int length = string.length();
	        String firstChar = string.substring(0,1);
	        String restChar = string.substring(1,length-1);
	        String lastChar = string.substring(length-1);
	        
	       // System.out.println(firstChar);
	       // System.out.println(restChar);
	       // System.out.println(lastChar);
	         
	         newstr= newstr + firstChar.toUpperCase() + restChar + lastChar.toUpperCase() + " ";
	    }
	    
		System.out.println(newstr);
	}
}


