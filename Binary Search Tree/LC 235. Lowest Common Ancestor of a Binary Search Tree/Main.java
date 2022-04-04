class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode curr = root;
        if(q.val < curr.val && p.val < curr.val){
            TreeNode ans = lowestCommonAncestor(root.left , p , q );
            return ans;
        }
        else if(q.val > curr.val && p.val > curr.val){
            TreeNode ans = lowestCommonAncestor(root.right , p , q );
            return ans;
        }

        else{
            return curr;
        }

    }
}