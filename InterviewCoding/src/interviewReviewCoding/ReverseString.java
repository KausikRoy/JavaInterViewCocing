package interviewReviewCoding;

public class ReverseString {

	public static void main(String[] args) {
		String word = "abc";
		String rev="";
		
	char[] myArray =word.toCharArray();
	for(int i =word.length()-1; i>=0;i--) {
		rev= rev+myArray[i];
		
		
	}
	System.out.println(rev);

	}

}
