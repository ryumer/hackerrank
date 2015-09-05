/*
Problem Statement

You are given a pointer to the root of a binary search tree and a value to be inserted into the tree. Insert this value into its appropriate position in the binary search tree and return the root of the updated binary tree. You just have to complete the function.

Input Format

You are given a function,

node * insert (node * root ,int value)
{

}
node is defined as :

struct node
{
int data;
node * left;
node * right;
}node;
Output Format

Return the root of the binary search tree after inserting the value into the tree.

Sample Input

        4
       / \
      2   7
     / \
    1   3
The value to be inserted is 6.

Sample Output

         4
       /   \
      2     7
     / \   /
    1   3 6
*/


/* Node is defined as :
    class Node 
    int data;
    Node left;
    Node right;

*/

static Node Insert(Node root,int value)
{
    if (root == null) {
        return createNode(value);
    }
    else if (value >= root.data) {
        if (root.right == null) {
            root.right = createNode(value);
            return root;
        }
        else {
            Insert(root.right, value);
        }
    } else {
        if (root.left == null) {
            root.left = createNode(value);
            return root;
        }
        else {
            Insert(root.left, value);
        }
    }
    return root;
}

static Node createNode(int value) {
    Node n = new Node();
    n.data = value;
    return n;
}

