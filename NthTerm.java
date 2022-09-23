import java.util.*;
public class NthTerm
{
	public static void main(String[] args) {
		//1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243,64, 729, 128, 2187 …
		//(GP-1) At Odd Positions (Powers of 2) – 1, 2, 4, 8, 16, 32, 64, 128
		//(GP-2) At Even Positions (Powers of 3) – 1, 3, 9, 27, 81, 243, 729, 2187
		Scanner sin = new Scanner(System.in);
		int n = sin.nextInt();sin.close();
		System.out.println(n%2==0?(int)Math.pow(3,(n-1)/2):(int)Math.pow(2,(n-1)/2));
	}
}