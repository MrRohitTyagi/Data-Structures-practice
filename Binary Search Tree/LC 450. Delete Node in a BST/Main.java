class Solution {

    public int max(TreeNode node){
        TreeNode curr = node;
        while(curr.right != null){
            curr = curr.right;
        }
        return curr.val;
    }
    public TreeNode deleteNode(TreeNode root, int key) {

        if(root == null){
            return null;
        }


        if(key < root.val){
            root.left = deleteNode(root.left,key);
        }
         else if(key > root.val){
            root.right = deleteNode(root.right,key);
        }

        else{
            if(root.left  == null  || root.right == null ){
                return root.left != null ? root.left : root.right;
            }
        

        int maxEle = max(root.left);
        root.val = maxEle;
        root.left = deleteNode(root.left, maxEle);
        }

        return root;
    }
}