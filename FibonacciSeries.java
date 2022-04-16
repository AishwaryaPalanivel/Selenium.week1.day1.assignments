package week1.day1.assignments1;

public class FibonacciSeries {
	//  * Goal: To find Fibonacci Series for a given range
	// input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	public static void main(String[] args) {
		int n = 8, firstTerm = 0, secondTerm = 1;
		System.out.println("Fibonacci Series till " + n + " terms:");
		
	    for (int i = 1; i <= n; ++i) {
	        System.out.print(firstTerm + ", ");
	        int nextTerm = firstTerm + secondTerm;
	        firstTerm = secondTerm;
	        secondTerm = nextTerm;
	    }
}
}
