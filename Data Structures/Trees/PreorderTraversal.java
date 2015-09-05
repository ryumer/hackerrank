/*
Problem Statement

You are given a pointer to the root of a binary tree; print the values in preorder traversal.

You only have to complete the function.

Input Format 
You are given a function,

void Preorder(node *root) {

}
Output Format 
Print the values on a single line separated by space.

Sample Input

     3
   /   \
  5     2
 / \    /
1   4  6
Sample Output

3 5 1 4 2 6
*/


/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

void Preorder(Node root) {
    if (root == null) return;
    
    System.out.print(root.data + " ");
    
    Preorder(root.left);
    Preorder(root.right);
}