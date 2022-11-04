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

    public Pair getHt(TreeNode root){
        if(root==null) return new Pair(true,0);
        Pair lh = getHt(root.left);
        Pair rh = getHt(root.right);
        
        boolean f=lh.f && rh.f &&( Math.abs(lh.y-rh.y)<1 || Math.abs(lh.y-rh.y)==1);
        
        int h = 1+Math.max(lh.y,rh.y);
        
        return new Pair(f,h);
    }
    public boolean isBalanced(TreeNode root) {
        
       Pair p =  getHt(root);
        return p.f;
    }
}

   class Pair
  {

    boolean f;

    int y;

    public Pair (boolean f, int y)
    {

      this.f = f;

      this.y = y;

    }

  }