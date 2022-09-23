import java.util.*;
class ArrayPackersMovers
{
     public static int solve(int c,int w[],int val[],int n)
     {
          if(n==0 || c==0)
                return 0;
          if(c<w[n-1])
              return solve(c,w,val,n-1);
          else
              return Math.max(solve(c,w,val,n-1),val[n-1]+solve(c-w[n-1],w,val,n-1));
     }
      public static void main(String[] args)
      {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int c=sc.nextInt();
            int v[]=new int[n];
            int w[]=new int[n];
          
            for(int i=0;i<n;i++)
                   v[i]=sc.nextInt();
            for(int i=0;i<n;i++)
                   w[i]=sc.nextInt();
             System.out.println(solve(c,w,v,n));
             sc.close();
      }
}
/*Mr. Rao is relocating from place A to B. The moving truck has a maximum capacity C.
 *  There are ‘N’ items in the house where each item has a corresponding value (Vi) and weight(Wi). 
 *  Mr. Rao has to carry only the most valuable items whose total weight does not exceed the capacity of truck. 
 *  The task here is to find those items (single or combination of items) whose total value (v) 
 *  will be the maximum and their corresponding weight(w) will not exceed truck capacity(c). Here,
N= No. of items
C= Maximum capacity of the truck, an integer value,
W[0 to N-1]- An array consisting weight of each item
V[0 to N-1] – An array consisting value of each item.
Input :
4  -> Value of N
80 -> Value of C
[10,45,60,90] -> Elements of array v[], where each element is separated by new line.
[15,20,30,40] -> Elements of array  w[], where each element is separated by new line.
Output: 150
*/