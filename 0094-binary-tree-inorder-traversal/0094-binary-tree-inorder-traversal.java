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


class Pair{
    TreeNode n;
    int f;
    public Pair(TreeNode n , int f){
        this.n = n;
        this.f = f;
    }
}
class Solution {
         
    public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> ans = new ArrayList<>();
   Stack<Pair> stk = new Stack<>();
        stk.push(new Pair(root,0));
       while(!stk.empty() && root != null){
        Pair p = stk.pop();
      if(p.f == 1)ans.add(p.n.val);
        else{
            if(p.n.right != null){
            stk.push(new Pair(p.n.right,0));
        }
            stk.push(new Pair(p.n,1));
        if(p.n.left != null){
            stk.push(new Pair(p.n.left,0));
        }
       }
       }
        
        
        return ans;
    }
    
}