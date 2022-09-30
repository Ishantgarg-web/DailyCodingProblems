class Solution {
    List<Integer> ans=new ArrayList<>();
        public List<Integer> inorderTraversal(TreeNode root) {
            helper(root);
            return ans;
    }
    void helper(TreeNode root)
    {
        if(root==null)
            return;
        helper(root.left);
        ans.add(root.val);
        helper(root.right);
    }
}
