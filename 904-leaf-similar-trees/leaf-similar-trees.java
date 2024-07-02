/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer>lft=new ArrayList<>();
        ArrayList<Integer>rgt=new ArrayList<>();
        sum(root1,lft);
        sum(root2,rgt);
    
    return lft.equals(rgt);
    }
    public void sum(TreeNode root,ArrayList<Integer>li)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null && root.right==null)

        {
           li.add(root.val);
        }
        else
        {
            if(root.left!=null)
            {
                sum(root.left,li);
            }
            if(root.right!=null)
            {
                sum(root.right,li);
            }
        }
    }
}