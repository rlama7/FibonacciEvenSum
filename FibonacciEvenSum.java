/**
 * FibonacciEvenSum.java  --A program to compute the sum of all even-valued Fibonacci terms
 *													less than or equal to some positive integer k.
 * @author    							Ratna Lama
 * @version   							1.0
 * @since     							11/11/2017
*/

public class FibonacciEvenSum {

	/**
	* Calls method EvenFibSum which computes and displays
	* the sum of even valued Fibonacci Sequence.
	* @parm 	args 	the command-line argument
	*/
	public static void main(String[] args) {

		EvenFibSum(40);		// Computes sum of even valued Fibonacci Sequence <= 40

		EvenFibSum(400);	// Computes sum of even valued Fibonacci Sequence <= 400

		EvenFibSum(4000);	// // Computes sum of even valued Fibonacci Sequence <= 4000

	} // end main () method

	/**
	* Computes the sum of all even-valued Fibonacci terms
	* less than or equal to some positive integer k.
	* @parm 	k 	some positive integer
	*/
	public static void EvenFibSum(int k){

		int a=0, b=1, sum=0, evenSum = 0;

		while(sum<=k){
			sum=a+b;
			a=b;
			b=sum;
			if(a%2 ==0){
				System.out.print(a+ " ");
				evenSum +=a;
			}
		}
		System.out.println();
		System.out.println("Sum of all even-valued Fibonacci terms less than or equal to k is: " + evenSum);
		System.out.println("\n----------------------------------------------------------------------------\n");

	} // end EvenFibSum()

} // end FibonacciEvenSum class
