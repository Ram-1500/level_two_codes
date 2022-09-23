import java.util.*;
class ArrayPairs
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int a, sum = 0, c = 0;
    int n = sc.nextInt ();
    for (int i = 0; i < n; i++)
      {
	a = sc.nextInt ();
	if (a != 0)
	  sum += c;
	else
	  c++;      
    
      }  
  System.out.println (sum);
  sc.close();
  }
}
/*Given an array Arr[] of size T, contains binary digits, where 
0 represents a biker running to the north.
1 represents a biker running to the south.
The task is to count crossing biker in such a way that each pair of crossing biker(N, S), 
where 0<=N<S<T, is passing when N is running to the north and S is running to the south.

Constraints:0<=N<S<T
Input :
5 -> Number of elements i.e. T
0 -> Value of 1st element.
1 -> Value of 2nd element
0 -> Value of 3rd element.
1 -> Value of 4th element.
1 -> Value of 5th element
Output :5
Explanation:
The 5 pairs are (Arr[0], Arr[1]), (Arr[0], Arr[3]), (Arr[0], Arr[4]), (Arr[2],Arr[3]) and (Arr[2], Arr[4]).
*/
