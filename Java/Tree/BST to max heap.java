  import java.util.ArrayList;

// problem Link: https://practice.geeksforgeeks.org/problems/bst-to-max-heap/1


/****
 * Approach: first we do inorder traversal(Left,root,right) of given BST, such that we get
 * sorted list of integers.
 * 
 * Then we are doing preorder traversal(Left,right,root) of tree and put that
 * list values inplace of tree values. 
 */

/*****
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */

class Solution
{
    static ArrayList<Integer> al=new ArrayList<>();
    static int i=0;
    public static void inorder(Node root){
        if(root == null) return ;
        inorder(root.left);
        al.add(root.data);
        inorder(root.right);
    }

    public static void preorder(Node root){
        if(root == null )return; 
        preorder(root.left);
        preorder(root.right);
        root.data= al.get(i++);
    }
    public static void convertToMaxHeapUtil(Node root)
    {
        //code here
        inorder(root);
        preorder(root);
    }
}
