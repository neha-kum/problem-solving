
public class RemoveBrackets
{
	public static void main(String[] args) {
	    String s = "(a+b)={c";
	    
		System.out.println(s.replaceAll("[(){}]", ""));
	}
}


