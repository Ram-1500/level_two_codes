
public class Repeated_digits {
	static int find(int n1, int n2) {
        int count = 0;
        for (int i = n1 ; i <= n2 ; i++) {
            int num = i;

            boolean[] visited = new boolean[10];

            while (num > 0) {
                if (visited[num % 10] == true)
                    break;
                visited[num % 10] = true;
                num /= 10;
            }

            if (num == 0)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n1 = 101, n2 = 200;
        System.out.println(find(n1, n2));
    }

}

/*There is the number 11, which has repeated digits, but 12, 13, 14 and 15 have no repeated digits. So, the output is 4.
Example1: Input:
11 — Vlaue of n1
15 — value of n2
Output:4
*/
