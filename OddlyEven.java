import java.util.*;
public class OddlyEven
{
	public static void main(String[] args) {
		//Given a maximum of 100 digit numbers as input, 
		//find the difference between the sum of odd and even position digits
		Scanner sin = new Scanner(System.in);
		String s=sin.nextLine();
		
                long num = 0, num1 = 0;
		num=num + s.charAt(0)-'0';
		
                for(int i=1;i<s.length();i++)
		{
		    if(i%2==0)
		        num = num + s.charAt(i)-'0';
		   else
		     num1 = num1 + s.charAt(i)-'0';
		}
		System.out.println(Math.abs(num-num1));
		sin.close();
	}
}