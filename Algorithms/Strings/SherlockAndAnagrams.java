/*
Given a string S, find the number of unordered anagramic pairs of substrings.

Input Format

First line contains T, the number of testcases. Each testcase consists of string S in one line.

Constraints 
1≤T≤10 
2≤length(S)≤100 
String S contains only the lowercase letters of the English alphabet.

Output Format

For each testcase, print the required answer in one line.

Sample Input

2
abba
abcd
Sample Output

4
0
Explanation

Let's say S[i,j] denotes the substring Si,Si+1,⋯,Sj.

testcase 1: 
For S=abba, anagramic pairs are: {S[1,1],S[4,4]}, {S[1,2],S[3,4]}, {S[2,2],S[3,3]} and {S[1,3],S[2,4]}.

testcase 2: 
No anagramic pairs.
*/

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
            
            for (int size = 1; size < s.length(); size++) {
                
                for (int start = 0; start < s.length() - size + 1; start++) {
                    
                    String s1 = s.substring(start, start + size);
                    
                    for (int cmp = start + 1; cmp < s.length() - size + 1; cmp++) {
                        String s2 = s.substring(cmp, cmp + size);
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
        
        char[] s1array = s1.toCharArray();
        char[] s2array = s2.toCharArray();
        Arrays.sort(s1array);
        Arrays.sort(s2array);
        
        s1 = new String(s1array);
        s2 = new String(s2array);
        
        return s1.equals(s2);
    }
}