/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        int k = depth(root);
     return d(root,k);
    }

    int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }
    int d(TreeNode root,int k)
    {
        if(root==null)
        {
            return 0;
        }
        if(k==1)
        {
            return root.val;
        }
        return d(root.left,k-1)+d(root.right,k-1);
    }
}