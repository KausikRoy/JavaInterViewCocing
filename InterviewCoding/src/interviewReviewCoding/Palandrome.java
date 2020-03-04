package interviewReviewCoding;

import java.util.Scanner;

public class Palandrome {

	public static void main(String[] args) {
		String rev = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Please give me a String");

		String str = sc.nextLine();
		char[] myArray = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + myArray[i];

		}
		System.out.print(rev);

		if (rev.equalsIgnoreCase(str)) {
			System.out.println("String is Palandrome");
		} else {
			System.out.println("String is not palandrome");
		}

	}

}
