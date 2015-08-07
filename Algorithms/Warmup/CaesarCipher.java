import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        int len = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        char a = 'a';
        char z = 'z';

        char A = 'A';
        char Z = 'Z';

        char[] chars = new char[len];

        for (int i = 0; i < len; i++) {
            int c = s.charAt(i);

            if (c >= a && c<=z) {
                c = (c+k);
                while (c > z) {
                    c = (c % z + a - 1);
                }
            }
            else if (c >= A && c<=Z) {
                c = (c+k);
                while (c > Z) {
                    c = (c % Z + A - 1);
                }
            }

            chars[i] = (char)c;
        }

        String e = new String(chars);

        System.out.println(e);
    }
}