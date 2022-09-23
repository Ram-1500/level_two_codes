import java.util.Scanner;

public class ArrayElementRemove {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count1=0,count2=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
            count1++;
        }
        int element=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        	if(arr[i]==element)
        		count2++;        	       		
        }
        int sum=count1-count2;
        System.out.println(sum);

	}

}
