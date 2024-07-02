class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> lft = new ArrayList<>();
        List<Integer> rgt = new ArrayList<>();
        
        getLeafValues(root1, lft);
        getLeafValues(root2, rgt);
        
        return lft.equals(rgt);
    }
    
    private void getLeafValues(TreeNode root, List<Integer> leaves) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            leaves.add(root.val);
        } else {
            if (root.left != null) {
                getLeafValues(root.left, leaves);
            }
            if (root.right != null) {
                getLeafValues(root.right, leaves);
            }
        }
    }
}