package practice.java;

public class Variable  {
	int a= 1;
    static int c=10;
	public  void localVariable()
	{
	     a++;
		
		 c++;
		
		System.out.println(c);
		System.out.println(a);
	}
	
	public  void localVariable1()
	{
	    
		 a++;
		
		 c++;
		
		System.out.println(c);
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		
		Variable v= new Variable();
		Variable v1= new Variable();
		 v.localVariable();
		 v.localVariable();
		 v1.localVariable1();
		
	}
}
