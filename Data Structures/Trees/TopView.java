/*
Problem Statement

You are given a pointer to the root of a binary tree. Print the top view of the binary tree. 
You only have to complete the function. 
For example :

     3
   /   \
  5     2
 / \   / \
1   4 6   7
 \       /
  9     8
Top View : 1 -> 5 -> 3 -> 2 -> 7
Input Format

You are given a function,

void top_view(node * root)
{

}
Output Format

Print the values on a single line separated by space.

Sample Input

     3
   /   \
  5     2
 / \   / \
1   4 6   7
 \       /
  9     8
Sample Output

1 5 3 2 7
Explanation

     3
   /   \
  5     2
 / \   / \
1   4 6   7
 \       /
  9     8
From the top only nodes 1,5,3,2 and 7 will be visible.
*/


/*
    class Node 
    int data;
    Node left;
    Node right;
*/
    
void top_view(Node root)
{
    left_view(root.left);
    System.out.print(root.data + " ");
    right_view(root.right);
}

void left_view(Node root)
{
    if (root == null) return;
    
    left_view(root.left);
    System.out.print(root.data + " ");
}

void right_view(Node root)
{
    if (root == null) return;
    
    System.out.print(root.data + " ");
    right_view(root.right);
}

