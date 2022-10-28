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
    
    public void searchBT(TreeNode root,String path,List<String> l){
        if(root.left == null && root.right == null) l.add(path + root.val);
         if (root.left != null) searchBT(root.left, path + root.val + "->", l);
    if (root.right != null) searchBT(root.right, path + root.val + "->", l);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> l = new ArrayList<String>();
    if (root != null) searchBT(root, "", l);
    return l;
        
    }
}