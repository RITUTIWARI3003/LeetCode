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
    
  int sum = 0;
    
    public void solve(TreeNode root){
        
        if(root == null) return ;
        
        if(root.left != null && root.left.left == null && root.left.right == null){
            sum += root.left.val;
        }
        
        solve(root.left);
        solve(root.right);
        
    }
    public int sumOfLeftLeaves(TreeNode root) {
        
        //if(root == null) return 0;
        
        //if(root.left == null) return 0;
        solve(root);
       // return sumOfLeftLeaves(root.left)+ sumOfLeftLeaves(root.right.left);
        
        return sum;
        
    }
}