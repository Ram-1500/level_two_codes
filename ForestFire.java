import java.util.HashMap;
import java.util.Scanner;

class ForestFire{

    static void print(int [][] arr){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int [][] array = new int[N][N];
        HashMap<Integer, Integer> map = new HashMap<>();scanner.close();

        int powerpoints = 1 + (N*N)/11;

        int counter = 1;
        int row = 0, col = 0; // for the current row/col that we are end
        int endRow = 0, endColumn = 0; // for the row/col where we need to stop

        map.put(0,0);

        for(int i=0;i<N/2;i++){
            row = col = i;
            endColumn = N-i-1;

            while (col < endColumn) {
                array[row][col] = counter;

                if (counter % 11==0)
                    map.put(row,col);

                counter++;
                col++;
            }
            endRow = N-i-1;
            while (row<endRow){
                array[row][col] = counter;
                if (counter % 11==0)
                    map.put(row,col);
                counter++;
                row++;
            }

            endColumn = i;
            while (col>endColumn){
                array[row][col] = counter;
                if (counter % 11==0)
                    map.put(row,col);
                counter++;
                col--;
            }

            endRow = i;
            while (row>endRow){
                array[row][col] = counter;
                if (counter % 11==0)
                    map.put(row,col);
                counter++;
                row--;
            }


        }
        if (N%2==1)
            array[N/2][N/2] = N*N;

        print(array);
        System.out.println("Total Power Points: " + powerpoints);
        for (Integer key: map.keySet()) {
            System.out.println("("+key+ ","+map.get(key)+")");

        }

    }

}

/*Roco is an island near Africa which is very prone to forest fire. Forest fire is such that it destroys the complete forest. Not a single tree is left.This island has been cursed by God , and the curse is that whenever a tree catches fire, it passes the fire to all its adjacent tree in all 8 directions,North, South, East, West, North-East, North-West, South-East, and South-West.And it is given that the fire is spreading every minute in the given manner, i.e every tree is passing fire to its adjacent tree.Suppose that the forest layout is as follows where T denotes tree and W denotes water.

Your task is that given the location of the first tree that catches fire, determine how long would it take for the entire forest to be on fire. You may assume that the lay out of the forest is such that the whole forest will catch fire for sure and that there will be at least one tree in the forest

Input Format:

First line contains two integers, M, N, space separated, giving the size of the forest in terms of the number of rows and columns respectively.
The next line contains two integers X,Y, space separated, giving the coordinates of the first tree that catches the fire.
The next M lines, where ith line containing N characters each of which is either T or W, giving the position of the Tree and Water in the  ith row of the forest.
Output Format:

Single integer indicating the number of minutes taken for the entire forest to catch fire

Constrains:

3 ≤ M ≤ 20
3 ≤ N ≤ 20
Sample Input 1:

3 3
W T T
T W W
W T T
Sample Output 1:

5

Explanation:
In the second minute,tree at (1,2) catches fire,in the third minute,the tree at (2,1) catches fire,fourth minute tree at (3,2) catches fire and in the fifth minute the last tree at (3,3) catches fire.
Sample Input 2:
6 6
1 6
W T T T T T
T W W W W W
W T T T T T
W W W W W T
T T T T T T
T W W W W W

Sample Output 2:

16
*/