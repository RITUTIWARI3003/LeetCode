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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null) return ans;
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            List<Integer> temp = new LinkedList<Integer>();
            int num = queue.size();
            for(int i = 0; i < num; i ++) {
            TreeNode n = queue.poll();
            temp.add(n.val);
            
            if(n.left!=null)
                    queue.add(n.left);
                if(n.right!=null)
                    queue.add(n.right);
            }
            ans.add(temp);
        }
        
        
        
        return ans;
        
        
        
    }
}