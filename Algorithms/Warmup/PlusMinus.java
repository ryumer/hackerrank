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
        
        double posCount = 0;
        double negCount = 0;
        double zerCount = 0;
        
        for (int i=0; i<N; i++) {
            int m = in.nextInt();
            if (m < 0){
                negCount++;
            }
            else if (m > 0) {
                posCount++;
            }
            else {
                zerCount++;
            }
        }
        
        System.out.format("%1.3f\n",posCount/N);
        System.out.format("%1.3f\n",negCount/N);
        System.out.format("%1.3f",zerCount/N);
    }
}