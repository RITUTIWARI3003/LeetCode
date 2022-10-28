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
    int ans = 0;
    public void ht(TreeNode root,int l ){
        if(root == null) return;
        
        if(root.left == null && root.right == null) {
            ans = Math.max(ans,l);
            return;
        }
        
        ht(root.left,l+1);
        ht(root.right,l+1);
    }
    public int maxDepth(TreeNode root) {
        
        if(root == null) return 0;
        
        ht(root,1);
        
        return ans;
        
    }
}