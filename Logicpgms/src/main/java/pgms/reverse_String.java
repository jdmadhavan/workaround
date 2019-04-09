package pgms;

public class reverse_String {
	
private static StringBuffer reverse;

public static void main(String[] args) {
	//String builder 
	StringBuilder reverse1 = new StringBuilder();
	String str="madhavan ramalingam $";
	//String str="12345 787";
	// System.out.println(str.length());
	
	System.out.println(str.replaceAll("\\d", ""));
	
	//reverse string using Iterator 
	
	String reversestr="";
	char charStr[]=str.toCharArray();
	
	for(int i=str.length()-1;i>=0;i--)
	{
		reverse1.append(charStr[i]);
		
	}
	System.out.println(reverse1);
	
	
	//reverse string using string buffer
	reverse = new StringBuffer(str).reverse();
	System.out.println(reverse);
	
    
	
	
}
}
