package interviewReviewCoding;

public class CalculetingMetrixOfAnumber {

	public static void main(String[] args) {
		// iterate the number twice and then multiple the i and j
		
		int N = 5;
		for(int i = 1;i<=N;i++) {
			for(int j = i;j<=N;j++) {
				
				System.out.print(j*i + " ");
			}
			
			System.out.println();
		}

	}

}
