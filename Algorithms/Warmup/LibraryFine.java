import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        int dA = in.nextInt();
        int mA = in.nextInt();
        int yA = in.nextInt();
        
        int dE = in.nextInt();
        int mE = in.nextInt();
        int yE = in.nextInt();
        
        int fee = 0;
        if (yA>yE) {
            fee = 10000;
        }
        else if (yA==yE && mA>mE) {
            fee = 500 * (mA-mE);
        }
        else if (yA==yE && mA==mE && dA>dE) {
            fee = 15 * (dA-dE);
        }
        
        System.out.println(fee);
    }
}