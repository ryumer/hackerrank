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
        
        for (int i=0; i<N; i++) {
            String s = "";
            int spaceCount = N-1-i;
            int fillCount = i+1;
            
            for (int j=0; j<spaceCount; j++) {
                s = s + " ";
            }
            for (int j=0; j<fillCount; j++) {
                s = s + "#";
            }
            System.out.println(s);
        }
    }
}