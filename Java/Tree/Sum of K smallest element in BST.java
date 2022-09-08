// Problem Link: https://practice.geeksforgeeks.org/problems/sum-of-k-smallest-elements-in-bst3029/1


/***
 * Approach: we are going in left side because these were 
 * the smallest elements of BST. 
 * and if is exist and target>=0 then we add that node value to 
 * our result and go to right of that root.
 */

/*** 
 * Time Complexity: O(K)
 * Space Complexity: O(1)
 */

class Tree {
    int sum=0,target=0;
    public void getsum(Node root){
        if(root==null || target<=0){
            return;
        }
        getsum(root.left);
        target--;
        if(target>=0){
            sum+=root.data;
            getsum(root.right);
        }
    }
    int sum(Node root, int k) { 
        
        // Code here
        target=k;
        getsum(root);
        return sum;
    } 
}
