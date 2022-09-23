import java.util.*;
class ArrayWireCost
{
   public static int solve (int arr[], int n)
   {
       PriorityQueue <Integer> queue = new PriorityQueue<Integer>();
      
       for (int i = 0; i < n; i++)
           queue.add (arr[i]);
      
       int sum = 0, temp1, temp2;
      
       while (queue.size () >= 2)
       {
            temp1 = queue.poll ();
            temp2 = queue.poll ();
            sum += temp1 + temp2;
            queue.add (temp1 + temp2);
       }
       return sum;
   }

   public static void main (String[]args)
   {
       Scanner sc = new Scanner (System.in);
       int n = sc.nextInt ();
       int arr[] = new int[n];
  
       for (int i = 0; i < n; i++)
           arr[i] = sc.nextInt ();
      
       System.out.println (solve (arr, n));
       sc.close();
   }
   /*Given N gold wires, each wire has a length associated with it. At a time, 
    * only two adjacent small wires are assembled at the end of a large wire and 
    * the cost of forming is the sum of their length. Find the minimum cost when 
    * all wires are assembled to form a single wire.

For Example:Input 1st line N, 2nd line array
Suppose, Arr[]={7,6,8,6,1,1,}

{7,6,8,6,1,1}-{7,6,8,6,2} , cost =2

{7,6,8,6,2}- {7,6,8,8}, cost = 8

{7,6,8,8} – {13,8,8}, cost=13

{13,8,8} -{13,16}, cost=16

{13, 16} – {29}, cost =29

2+8+13+16+29=68
Hence , the minimum cost to assemble all gold wires is 68.
Constraints:
1<=N<=30
1<= Arr[i]<=100
*/
}