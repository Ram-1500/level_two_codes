import java.util.Scanner;

public class Permutations_EvenSum {
	public static int evenSum (int m, int n, int k, int N) 
    {
    
        if (k == 1)
            return n;
        else
            return (N - (m - n) * evenSum (m, n, k - 1, n) % (1000000007));
    }
  
    public static void main (String[]args) 
    {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt ();
        int high = sc.nextInt ();
        int k = sc.nextInt ();sc.close();
        int diff = high - low + 1;
        int out, n, N, m;
    
        if (diff % 2 == 0)
        {
            m = diff / 2;
            n = m;
        }
        else
        {
	    
            if (low % 2 == 0)
    	    {
                m = (diff - 1) / 2;
                n = m + 1;
            }
        	else
    	    {
                m = (diff + 1) / 2;
                n = m - 1;
            }
        }
        N = m;
        for (int i = 0; i < k - 1; i++)
            N = (N * (m + n)) % 1000000007;
        out = evenSum (m, n, k, N) % 1000000007;
        System.out.println (out);
    } 

}
/*
Problem Statement -: In this even odd problem Given a range [low, high] (both inclusive), select K numbers from
the range (a number can be chosen multiple times) such that sum of those K numbers is even.
Calculate the number of all such permutations.
As this number can be large, print it modulo (1e9 +7).
Constraints:0 <= low <= high <= 10^9
K <= 10^6.
Input:First line contains two space separated integers denoting low and high respectively
Second line contains a single integer K.
Output:Print a single integer denoting the number of all such permutations
Input:
4 5
3
Output:4
Explanation:There are 4 valid permutations viz. {4, 4, 4}, {4, 5, 5}, {5, 4, 5} and {5, 5, 4} which sum up to an even number.
*/
