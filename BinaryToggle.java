import java.util.*;
class BinaryToggle
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int no = sc.nextInt ();
        String bin = "";

        while (no != 0)
        {
	        bin = (no & 1) + bin;
	        no = no >> 1;
        }
        bin = bin.replaceAll ("1", "2");
        bin = bin.replaceAll ("0", "1");
        bin = bin.replaceAll ("2", "0");
    
        int res = Integer.parseInt (bin, 2);
        System.out.println (res);
        sc.close();
    }
}
/*The problem statement is “A positive integer has been given as an input. 
 * Convert decimal value to binary representation. Toggle all bits of it after 
 * the most significant bit including the most significant bit. 
 * Print the positive integer value after toggling all bits”.
 * INPUT:10 -> OUTPUT:5
 * Explanation:Binary representation of 10 is 1010. After toggling the bits(1010), 
 * will get 0101 which represents “5”. Hence output will print “5”.
 */