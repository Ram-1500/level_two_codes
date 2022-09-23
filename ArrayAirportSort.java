import java.util.*;
class ArrayAirportSort
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int countZero=0,countOne=0,countTwo=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
                countZero++;
            else if(arr[i]==1)
                countOne++;
            else if(arr[i]==2)
                countTwo++;
        }
        int j=0;
        while(countZero>0)
        {
            arr[j++]=0;
            countZero--;
        }
        
        while(countOne>0)
        {
            arr[j++]=1;
            countOne--;
        }
        
        while(countTwo>0)
        {
            arr[j++]=2;
            countTwo--;
        }

        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        sc.close();
    }
}
/*Airport security officials confiscated several items of the passengers at the security checkpoint. 
 * All the items have been dumped into a huge box (array). Each item possesses a certain amount of 
 * risk[0,1,2]. Here, the risk severity of the items represents an array[] of N number of integer values. 
 * The task here is to sort the items based on their levels of risk in the array. The risk values range from 0 to 2.
 * Input:7  -> Value of N
		[1,0,2,0,1,0,2]-> Element of arr[0] to arr[N-1], while input each element is separated by new line.
	Output:0 0 0 1 1 2 2  -> Element after sorting based on risk severity 
 */