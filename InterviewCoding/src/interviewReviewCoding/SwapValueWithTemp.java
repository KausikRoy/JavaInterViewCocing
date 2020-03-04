package interviewReviewCoding;

public class SwapValueWithTemp {

	public static void main(String[] args) {
		// creating a temp variable to replace
		int a =10;
		int b= 5;
		System.out.println("Before Swap:"+a+"  "+b);
		int temp = b;
		b=a;
		a=temp;
		System.out.println("After Swap:"+a+"  "+b);

	}

}
