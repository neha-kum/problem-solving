
import java.util.*;
public class RemoveVowel
{
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String str=sc.nextLine();
     
    //  for(char c : str.toCharArray()){
    //  if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u' ||c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U' )
    //   s=s;
    //   else
    //   s+=c;
    // System.out.println(s);
    
    System.out.println(str.replaceAll("[aeiou]", ""));
    
    
    
    
   }
     
 }





