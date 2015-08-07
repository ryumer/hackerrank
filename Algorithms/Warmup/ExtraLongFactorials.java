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
        BigInteger f = BigInteger.ONE;
        
        for (int i = 0; i < N; i++) {
            f = f.multiply(BigInteger.valueOf(i+1));
        }
        
        if (N == 0) {
            f = BigInteger.ONE;
        }
        System.out.println(f);
    }
}