package interviewReviewCoding;

public class PrintOddEvenNumber {

	public static void main(String[] args) {
		// Find all the odd number from 1 to N

		int N = 20;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 1) {
				System.out.println(i + " :is an Odd Number");
			}
			else {
				System.out.println(i);
			}
		}

	}

}
