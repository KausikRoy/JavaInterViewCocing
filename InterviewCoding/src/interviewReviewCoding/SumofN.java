package interviewReviewCoding;

public class SumofN {

	public static void main(String[] args) {
		// to get a sum of a given number.
		// if the number is 5 the we need to get the value (0+1+2+3+4+5)
		// need to use a for loop and iterate N and add all the itaration .

		int N = 20;
		int count = 0;

		for (int i = 0; i <= N; i++) {
			count = count + i;

		}
		System.out.println(count);

	}

}
