package interviewReviewCoding;

public class SortArrayByManually {

	public static void main(String[] args) {
		// Need to create duplicate for lOOP AND SWAP THE VALUE IN TEMP VARIABLE
		int[] myArray = {1, 4, 55, 67, 12, 87};
		int temp;
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray.length; j++) {

				if (myArray[i] < myArray[j]) {
					temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = temp;

				}

			}

		}
		for (int X : myArray) {
			System.out.println(X);

		}
	}

}
