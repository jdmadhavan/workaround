package pgms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindDuplicateCharactors_Count {

	public static void main(String[] args) {
		String value="Partha Sarathi";
		char[] charValue=value.toCharArray();
		
		Map<Character, Integer> obej=new HashMap<Character,Integer>();
		for(char c:charValue)
		{
		if(obej.containsKey(c)) {
			obej.put(c, obej.get(c)+1);
		}
		else
		{
			obej.put(c,1);
		}
	}
		System.out.println(obej);
	}
	
}
	