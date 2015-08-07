import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws ParseException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ssaa");
        Date date = inputFormat.parse(in.next());
            
        SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
        String s = outputFormat.format(date);
        
        System.out.format(s);
    }
}