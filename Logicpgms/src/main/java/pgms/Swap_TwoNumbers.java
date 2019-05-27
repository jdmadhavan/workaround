package pgms;

public class Swap_TwoNumbers {

	public static void main(String[] args) {
		int x=10,y=30;
		
		
		System.out.println("Before X: "+x);
		System.out.println("Before X: "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After X: "+x);
		System.out.println("After y: "+y);
		
		
		int z=x+y;
		x=z-x;
		y=z-y;
		System.out.println("After X: "+x);
		System.out.println("After y: "+y);
		
		
	}

}
