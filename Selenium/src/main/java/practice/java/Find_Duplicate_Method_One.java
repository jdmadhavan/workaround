package practice.java;



public class Find_Duplicate_Method_One {

	public static void main(String[] args) {
		int array[]= {1,3,3,7,8,8};
		

		{
			for (int i = 0; i < array.length; i++) {
				
				for (int j=i+1;j<array.length;j++)
				{
					if(array[i]==array[j])
					{
						System.out.println("Duplicate Value is : "+array[i]);
					}
				}
			}
		}
	}

}
