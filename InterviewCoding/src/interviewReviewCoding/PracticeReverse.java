package interviewReviewCoding;

public class PracticeReverse {

	public static void main(String[] args) {
		// need to create two variable word is the original and rev for rev
		
		String word = "madam";
		String rev ="";
		
		// given string breaking to charactor 
		char [] myArray = word.toCharArray();
		//itarate reverse with reverse for loop and storing in rev var
		
		for(int i = myArray.length-1;i>=0;i--) {
			rev = rev + myArray[i];
		}
		System.out.println("Reverse of the given string  :"+rev);
		if(rev.equalsIgnoreCase(word)) {
			System.out.println("Given word is palindrome");
		}
		else {
			System.out.println("Given string is not palindrome");
		}

	}

}
