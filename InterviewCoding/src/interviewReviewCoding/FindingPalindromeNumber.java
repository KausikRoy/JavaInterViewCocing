package interviewReviewCoding;

public class FindingPalindromeNumber {

	public static void main(String[] args) {
		// Need to create three variable and use a while loop.
		// need to find the rev value by arithmetical process
		// hold the num value in temp bcs we will be changing the original value.
		int num = 165;
		int rev = 0;
		int temp = num;

		while (num > 0) {

			rev = rev * 10;
			rev = rev + num % 10;
			num = num / 10;
		}
		if (rev == temp) {
			System.out.println("Given number is palindrome");
		} else {
			System.out.println("Given number is not palindrom");
		}

	}

}
