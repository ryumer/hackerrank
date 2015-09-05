/*
Problem Statement

You are given a pointer to the root of a binary tree; print the values in post-order traversal.

You only have to complete the function.

Input Format 
You are given a function,

void Postorder(node *root) {

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

1 4 5 6 2 3
*/


/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/
void Postorder(Node root) {
    if (root == null) return;
    
    Postorder(root.left);
    Postorder(root.right);
    
    System.out.print(root.data + " ");
}