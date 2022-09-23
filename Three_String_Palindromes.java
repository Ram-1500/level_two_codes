import java.util.Scanner;

public class Three_String_Palindromes {
	
	public static boolean isPalindrome (String s) 
    {
        
        if (s.length () == 1)
            return true;
        StringBuilder sb = new StringBuilder (s);
        sb = sb.reverse ();
        String rev = new String (sb);
        return s.equals (rev);
    }

	public static void main(String[] args){
		// R_Code Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String str = sc.next (); sc.close();
    
        int len = str.length ();
        String str1 = "", str2 = "", str3 = "";

        boolean flag = false;
    
        for (int i = 1; i < len - 1; i++)
        {
	
            str1 = str.substring (0, i);
            if (isPalindrome (str1))
        	{
                for (int j = 1; j < len - i; j++)
        	    {
		            str2 = str.substring (i, i + j);
                    str3 = str.substring (i + j, len);
                    if (isPalindrome (str2) && isPalindrome (str3))
            		{
                        System.out.println (str1 + "\n" + str2 + "\n" + str3);
                        flag = true;
                        break;
                    }
                }
                if (flag)
                    break;
            }
        }
        if (flag == false)
            System.out.println ("Impossible");
    }
}
/* Problem Description -:  In this 3 Palindrome, Given an input string word, split the string into exactly 3 palindromic substrings. Working from left to right, choose the smallest split for the first substring that still allows the remaining word to be split into 2 palindromes.

Similarly, choose the smallest second palindromic substring that leaves a third palindromic substring.

If there is no way to split the word into exactly three palindromic substrings, print “Impossible” (without quotes). Every character of the string needs to be consumed.

Cases not allowed –

After finding 3 palindromes using above instructions, if any character of the original string remains unconsumed.
No character may be shared in forming 3 palindromes.
Constraints

1 <= the length of input sting <= 1000
Input:
First line contains the input string consisting of characters between [a-z].
Output:
Print 3 substrings one on each line.
*/


