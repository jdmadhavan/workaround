package pgms;

import java.sql.Array;

public class FindOddAndEvenNumbers {

	public static void main(String[] args) {
		int value[]= {1,2,34,10,11,23};
		
		
		for (int i=0;i<value.length;i++)
		{
			if(value[i]%2!=0)
			{
				System.out.println("The Number is Odd: "+ value[i]);
				
			}
			else {
				System.out.println("The Number is Even: "+ value[i]);
			}
		}
		
	}

}
