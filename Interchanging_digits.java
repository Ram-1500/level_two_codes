import java.util.*;
class Interchanging_digits 
{
  
    public static TreeSet < Integer > list = new TreeSet <> ();
  
    static void smallestNumber (String str, String ans) 
    {

        if (str.length () == 0)
        {
            list.add (Integer.parseInt (ans));
            return;
        }

        for (int i = 0; i < str.length (); i++)
        {
            char ch = str.charAt (i);
            String ros = str.substring (0, i) + 
            str.substring (i + 1);
    
            smallestNumber (ros, ans + ch);
        } 
    } 
 
    public static void main (String[]args) 
    {
    
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt ();
        int b = sc.nextInt ();
        String s = a + "";
        smallestNumber (s, "");
    
        Iterator<Integer> itr = list.iterator ();
    
        int res = -1;
    
        while (itr.hasNext ())
        {
            int no = (Integer) itr.next ();
            if (no > b)
    	    {
                res = no;
                break;
            }
        }
        System.out.println (res);
        
    }
}
/*Compute the nearest larger number by interchanging its digits updated.Given 2 numbers a and b find the smallest number greater than b by interchanging the digits of a and if not possible print -1.

Input Format
2 numbers a and b, separated by space.
Output Format
A single number greater than b.
If not possible, print -1
*/