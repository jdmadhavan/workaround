package pgms;

public class Amstrong {

	public static void main(String[] args) {
		int c=0,n=153,a,temp;
		temp=n;
		
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
			
		}
if(temp==c)
{
	System.out.println("yes");
	
	
}
else
{
	System.out.println("No");
}
	}

}
