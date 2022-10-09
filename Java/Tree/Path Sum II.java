import java.util.LinkedList;
import java.util.List;

import javax.swing.tree.TreeNode;

// Problem Link: https://leetcode.com/problems/path-sum-ii/

/****
 * Approach: 
 * we simply move left and right of binary tree and check if current node
 * is null or not.
 * if it is null then do nothing
 * else check node is leaf_node or not.
 * 
 * if it is leaf_node, check its current path sum is same as targetSum
 * if it is add currentList to result
 * else then remove last element from currentList.
 */



/****
 * Time Complexity: O(h) h=height of Tree
 * Space Complexity: O(N)  N=Number of nodes in Binary Tree
 */



class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum){
	List<List<Integer>> result  = new LinkedList<List<Integer>>();
	List<Integer> currentResult  = new LinkedList<Integer>();
	pathSum(root,sum,currentResult,result);
	return result;
}

public void pathSum(TreeNode root, int sum, List<Integer> currentResult,
		List<List<Integer>> result) {

	if (root == null)
		return;
	currentResult.add(new Integer(root.val));
	if (root.left == null && root.right == null && sum == root.val) {
		result.add(new LinkedList(currentResult));
		currentResult.remove(currentResult.size() - 1);//don't forget to remove the last integer
		return;
	} else {
		pathSum(root.left, sum - root.val, currentResult, result);
		pathSum(root.right, sum - root.val, currentResult, result);
	}
	currentResult.remove(currentResult.size() - 1);
    }
}