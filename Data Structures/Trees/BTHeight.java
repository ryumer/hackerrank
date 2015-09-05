/*
Problem Statement

The height of a binary tree is the number of nodes on the largest path from root to any leaf. You are given a pointer to the root of a binary tree. Return the height of the tree. 
You only have to complete the function.

Input Format

You are given a function,

int height_of_bt(node * root)
{

}
Output Format

Return a single value equal to the height of the binary tree.

Sample Input

     3
   /   \
  5     2
 / \    /
1   4  6
      /
     7
Sample Output

4
Explanation

The maximum length root to leaf path is 3->2->6->7. There are 4 nodes in this path. Therefore the height of the binary tree = 4.
*/


/*
    
    class Node 
    int data;
    Node left;
    Node right;
*/
    
int height(Node root)
{
   if (root == null) return 0;
   
   int lh = height(root.left);
   int rh = height(root.right);
   
   return (lh > rh) ? lh + 1 : rh + 1;
}

