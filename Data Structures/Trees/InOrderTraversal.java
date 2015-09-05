/*
Problem Statement

You are given a pointer to the root of a binary tree; print the values in in-order traversal.

You only have to complete the function.

Input Format 
You are given a function,

void Inorder(node *root) {

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

1 5 4 3 6 2
*/


/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

void Inorder(Node root) {
    if (root == null) return;
    
    Inorder(root.left);
    
    System.out.print(root.data + " ");
    
    Inorder(root.right);
}