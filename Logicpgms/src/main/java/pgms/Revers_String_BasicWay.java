package pgms;

public class Revers_String_BasicWay {

	public static void main(String[] args) {
		String inputValue="Madhavan";
		char [] charValue=inputValue.toCharArray();
		String reverseValue="";
		for(int i=inputValue.length()-1;i>=0;i--)
		{
			reverseValue=reverseValue+charValue[i];
			
			
		}
		System.out.println(reverseValue);

	}

}
