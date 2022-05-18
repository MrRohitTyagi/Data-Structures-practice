class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> t = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode y = q.remove();
                t.add(y.val);
                if(y.left!=null) q.add(y.left);
                if(y.right!=null) q.add(y.right);
            }
            ans.add(0,t);
        }
        return ans;
    }
}