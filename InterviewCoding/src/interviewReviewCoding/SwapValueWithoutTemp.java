package interviewReviewCoding;

public class SwapValueWithoutTemp {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		System.out.println("Value of a and B before swap "+""+ a +" " + b);
		 a = a+b;// 50
		 b = a-b;//20
		 a = a-b; //30
		 System.out.println("Value of a and B after swap "+""+ a +" " + b);
		 
	}

}
