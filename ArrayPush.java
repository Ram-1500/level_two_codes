import java.util.*;
class ArrayPush
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int arr[] = new int[n];
    
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt ();

        int count = 0;
    
        for(int i = 0; i < n; i++)
            if (arr[i] != 0)
	            arr[count++] = arr[i];
        for(int i = count; i < n; i++)
            arr[i] = 0;

        for (int i = 0; i < n; i++)
            System.out.print (arr[i] + " ");
        sc.close();
    }
}
//A chocolate factory is packing chocolates into packets. The chocolate packets here represent 
//an array arrt of N number of integer values. The task is to find the empty packets(0) of chocolate and 
//push it to the end of the conveyor belt(array).
//For Example:
//N=7 and arr = [4,5,0,1.9,0,5,0].
//There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of the array