package pgms;

import java.util.Arrays;

public class Find_Duplicates_Arrays {

	public static void main(String[] args) {
		int[] values= {1,3,3,4,5,0};
		
		Arrays.sort(values);
		
		
		for(int i=0;i<values.length-1;i++)
		{
			if(values[i]==values[i+1])
			{
				System.out.println("The duplicate value --> "+values[i]);
			}
		}
	}

}
