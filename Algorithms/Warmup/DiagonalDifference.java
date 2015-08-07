import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        
        int d1Sum = 0;
        int d2Sum = 0;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int m = in.nextInt();
                
                if (i == j) {
                    d1Sum = d1Sum + m;
                }
                
                if (i == (N-1-j)) {
                    d2Sum = d2Sum + m;
                }
            }
        }
        
        System.out.println(Math.abs(d1Sum - d2Sum));
    }
}