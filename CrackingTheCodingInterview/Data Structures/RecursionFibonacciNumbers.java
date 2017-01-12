/*
The Fibonacci Sequence 
The Fibonacci sequence begins with  and  as its respective first and second terms. After these first two elements, each subsequent element is equal to the sum of the previous two elements.

Here is the basic information you need to calculate :




Task 
Given , complete the fibonacci function so it returns .

Input Format

Locked stub code in the editor reads a single integer denoting the value of  and passes it to the fibonacci function.

Constraints


Output Format

Locked stub code in the editor prints the value of  returned by the fibonacci function.

Sample Input

3  
Sample Output

2
Explanation

Consider the Fibonacci sequence:

 
 
 
 
 
 
 
...

We want to know the value of . If we look at the sequence above,  evaluates to . Thus, we print  as our answer.
*/


import java.util.*;

public class Solution {

    public static int[] fib = new int[40];
    
    public static int fibonacci(int n) {
        // Complete the function.
        if (fib[n] != 0) return fib[n];
        if (n == 0) {
            fib[0] = 0;
            return 0;
        }
        else if (n == 1) {
            fib[1] = 1;
            return 1;
        }
        else {
            int res = fibonacci(n-2) + fibonacci(n-1);
            fib[n] = res;
            return res;
        }
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}

