package pgms;

public class Swap_TwoNumbers {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		
		System.out.println("Before X: "+x);
		System.out.println("Before X: "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After X: "+x);
		System.out.println("After y: "+y);
	}

}
