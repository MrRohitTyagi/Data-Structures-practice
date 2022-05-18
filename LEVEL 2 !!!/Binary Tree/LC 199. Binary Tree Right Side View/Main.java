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
    public List<Integer> rightSideView(TreeNode root) {
        
        
        ArrayList<Integer> ar = new ArrayList<>();
         if(root == null ) return ar;
        Queue<TreeNode>q = new LinkedList<>();
        
        q.add(root);
        while(q.size()!= 0 ){
            
            int size = q.size();
            
            for(int i = 0 ; i< size ; i++){
                TreeNode rem = q.remove();
                if(i== size -1 ){
                    ar.add(rem.val);
                }
                if(rem.left != null){
                    q.add(rem.left);
                }
                if(rem.right != null){
                    q.add(rem.right);
                }
            }
            
        }
        return ar;
        
    }
}