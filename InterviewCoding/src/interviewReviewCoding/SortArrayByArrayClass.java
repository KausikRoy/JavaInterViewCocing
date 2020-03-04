package interviewReviewCoding;

import java.util.Arrays;

public class SortArrayByArrayClass {

	public static void main(String[] args) {
		// we can do this with java inbuit Arrays class.
		
		int[]myArray = {1,4,55,67,12,789,};
		Arrays.sort(myArray);
		for(int X:myArray) {
			System.out.println(X);
		}

	}

}
