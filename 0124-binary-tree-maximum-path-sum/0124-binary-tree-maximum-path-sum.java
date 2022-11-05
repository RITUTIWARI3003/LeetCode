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
class Pair
  {

    int ans;

    int uni;

    public Pair (int ans, int uni)
    {

      this.ans = ans;

      this.uni = uni;

    }

  }
class Solution {
    public Pair getMaxPathSum(TreeNode root) {
        
        if(root == null ) return new Pair(Integer.MIN_VALUE,0);
        
        Pair lst = getMaxPathSum(root.left);
        Pair rst = getMaxPathSum(root.right);
        
        int x = Math.max(
                             (root.val + Math.max(0,lst.uni)+Math.max(0,rst.uni)),
                              lst.ans);
                 int maxSumPath   = Math.max(x,rst.ans);
        
        int y = Math.max(0,lst.uni);
        int uniSumPath = root.val+Math.max(y,rst.uni);
        
        return new Pair(maxSumPath,uniSumPath);
        
    }
    public int maxPathSum(TreeNode root) {
        
        if(root == null ) return 0;
        
        Pair p = getMaxPathSum(root);
        
        return p.ans;
        
    }
}