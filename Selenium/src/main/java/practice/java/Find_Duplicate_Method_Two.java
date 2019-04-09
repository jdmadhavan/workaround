package practice.java;

import java.util.Arrays;

public class Find_Duplicate_Method_Two {
	
	public static void main(String[] args) {
		int[] data= {1,3,3,8,8,7};
		Arrays.sort(data);
		
		for (int i = 0; i < data.length-1; i++) {
			
			
			if(data[i]==data[i+1])
					{
				System.out.println("Duplicate value :"+data[i]);
					}
		}
		
	}
	
	
	
	
	

}
