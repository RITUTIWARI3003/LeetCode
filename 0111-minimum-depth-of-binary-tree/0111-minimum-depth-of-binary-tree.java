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
    int ans = Integer.MAX_VALUE;
    public void minHt(TreeNode root,int l){
        if(root == null) return ;
        
        
        if(root.left == null && root.right == null) {
            ans = Math.min(l,ans);
            return;
        }
        
         minHt(root.left,l+1);
         minHt(root.right,l+1);
    }
    
    public int minDepth(TreeNode root) {
        
        if(root == null) return 0;
        
        
            minHt(root,1);
        return ans;
        
    }
}