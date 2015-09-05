/*
Problem Statement

You are given a pointer to the root of a binary tree. You need to print the level order traversal of this tree. In level order traversal, we visit the nodes level by level from left to right. 
You only have to complete the function. 
For example:

         3
       /   \
      5     2
     / \    /
    1   4  6
For the above tree, the level order traversal is 3 -> 5 -> 2 -> 1 -> 4 -> 6.

Input Format

You are given a function,

void level_order(node * root)
{

}
Output Format

Print the values in a single line seperated by a space.

Sample Input

         3
       /   \
      5     2
     / \    /
    1   4  6
Sample Output

3 5 2 1 4 6
Explanation

Level 1:        3
              /   \
Level 2:     5     2
            / \    /
Level 3:   1   4  6
We need to print the nodes level by level. We process each level from left to right. 
Level Order Traversal: 3 -> 5 -> 2 -> 1 -> 4 -> 6
*/


/* 
    class Node 
    int data;
    Node left;
    Node right;
*/

void LevelOrder(Node root)
{
    if (root == null) return;
    
    Queue<Node> q = new LinkedList<Node>();
    q.add(root);
    
    while (!q.isEmpty()) {
        Node n = q.poll();
        System.out.print(n.data + " ");
        
        if (n.left != null) q.add(n.left);
        if (n.right != null) q.add(n.right);
    }
}

