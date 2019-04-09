package practice.java;

import java.util.HashSet;
import java.util.Set;

public class Find_Duplicate_Third_Method {

	public static void main(String[] args) {
		
		int[] data= {1,3,3,8,8,7};
		Set<Integer> value= new HashSet<Integer>();
		
		for (int i = 0; i < data.length-1; i++) {
			
			boolean add = value.add(data[i]);
			if (add!=true)
			{
				System.out.println(data[i]);
			}
			{
				
			}
			
		}
	}
}
