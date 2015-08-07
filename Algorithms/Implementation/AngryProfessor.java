import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        int T = in.nextInt();
        
        for (int i=0; i<T; i++) {
            int N = in.nextInt();
            int K = in.nextInt();
            
            int onTime = 0;
            
            for (int j=0; j<N; j++) {
                int arrival = in.nextInt();
                
                if (arrival <= 0) {
                    onTime++;
                }
            }
            
            if (onTime >= K) {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
        
        
        
        
    }
}