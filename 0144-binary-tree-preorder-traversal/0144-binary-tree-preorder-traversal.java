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
          List<Integer> ans = new ArrayList<>();
    
        
    
    public List<Integer> preorderTraversal(TreeNode root) {
   Stack<TreeNode> stk = new Stack<>();
        stk.push(root);
       while(!stk.empty() && root != null){
        TreeNode n = stk.pop();
        ans.add(n.val);
        if(n.right != null){
            stk.push(n.right);
        }
        if(n.left != null){
            stk.push(n.left);
        }
       }
        
        
        return ans;
        
    }
}