package interviewReviewCoding;

public class MultiplicationOfNumber {

	public static void main(String[] args) {
		// Print number from 1 to N
		//if number multiplication of 3 print FIZZ
		//If number multiplication of 5 print BUZZ
		//If number Multiplication of 3 and 5 print FIZZ BUZZ.
	// after itaret the N with forloop use if and else if condition.
		
		int N =25;
		for(int i = 1; i<=N;i ++) {
			
			if(i%3==0 && i%5==0) {
				System.out.println("FIZZ BUZZ");
				
			}
			else if(i%3==0) {
				System.out.println("Fizz");
			}
			else if(i%5==0) {
				System.out.println("BUZZ");
			}
			else
			
			System.out.println(i);
			
			
		}
		
		
		
		
		
	}

}
