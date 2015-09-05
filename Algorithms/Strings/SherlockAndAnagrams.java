import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        int T = Integer.parseInt(in.nextLine());
        
        for (int i = 0; i < T; i++) {
            String s = in.nextLine();
            int len = s.length();
            
            int sum = 0;
            
            for (int j = 0; j < len; j++) { //j0
                int maxLen = len - j;
                for (int l = 1; l < maxLen; l++) {
                    
                    for (int k = j+1; j + k + 1 < len; k++) {
                        String s1 = s.substring(j, len - l - j);
                        String s2 = s.substring(k, len - l - k);
                        if (isAnagram(s1, s2)) {
                            sum++;
                        }
                    }
                }
            }
            
            System.out.println(sum);
        }
    }
    
    public static boolean isAnagram(String s1, String s2) {
        int[] s1Histogram = new int[256];
        int[] s2Histogram = new int[256];

        Arrays.fill(s1Histogram, 0);
        Arrays.fill(s2Histogram, 0);

        int len = s1.length();

        

        for (int i = 0; i < len; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            s1Histogram[c1] = s1Histogram[c1] + 1;
            s2Histogram[c2] = s2Histogram[c2] + 1;
        }

        for (int i = 0; i < s1Histogram.length; i++) {
            if (s1Histogram[i] != s2Histogram[i]) {
                return false;
            }
        }
        return true;
    }
}