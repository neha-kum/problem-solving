import java.util.*;
public class Anagram
{
    static boolean isAnagram(String str1, String str2){
        String s1= str1.replaceAll("[\\s]", "");
        String s2= str2.replaceAll("[\\s]", "");
        boolean status = true;
        
        if(s1.length()!=s2.length())
           status=false;
        
        else{
            char[] c1= s1.toLowerCase().toCharArray();
            char[] c2= s2.toLowerCase().toCharArray();
                
             Arrays.sort(c1);
             Arrays.sort(c2);
             status = Arrays.equals(c1, c2);
        }
        return status;
    }
    
	public static void main(String[] args) {
     String s1 = "race";
     String s2 = "care";
     
     boolean status = isAnagram(s1, s2);
     
     if(status)
         System.out.println("Anagram");
     else
     System.out.println("Not anagram");
	}
}
