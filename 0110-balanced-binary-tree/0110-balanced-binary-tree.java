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
    boolean ans = true;
    public int getHt(TreeNode root){
        if(root==null) return 0;
        int lh = getHt(root.left);
        int rh = getHt(root.right);
        
        if(Math.abs(lh-rh)>1) ans = false;
        
        return 1+Math.max(lh,rh);
    }
    public boolean isBalanced(TreeNode root) {
        
        getHt(root);
        return ans;
    }
}