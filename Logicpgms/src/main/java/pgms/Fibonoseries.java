package pgms;

public class Fibonoseries {

	public static void main(String[] args) {
		int f1,f2=0,f3=1;
		for(int i=0;i<10;i++)
		{
			f1=f2;
			f2=f3;
			f3=f1+f2;
			System.out.println("VAL**"+f3);
	}
	
		System.out.println("========================================");
		
		
		int n1=0,n2=1,n3=0;
		
		
		for(int i=0;i<10;i++)
		{
			n1=n2;
			n2=n3;
			n3=n1+n2;
			System.out.println("VAL**"+n3);
	}
	
}
}
