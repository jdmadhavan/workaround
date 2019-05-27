package pgms;

public class Reverse_String {
	


public static void main(String[] args) {
	//String builder 
	
	String str="madhavan ramalingam $";
	StringBuilder reverse1 = new StringBuilder(str);
	System.out.println(reverse1.reverse());
	System.out.println("get reverse 1"+reverse1);
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
	StringBuffer reverse = new StringBuffer(str);
	reverse.reverse();
	System.out.println("Rev"+reverse);
	
    
	
	
}
}
