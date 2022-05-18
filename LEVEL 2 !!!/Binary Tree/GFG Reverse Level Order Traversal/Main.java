class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        ArrayList<Integer> ar = new ArrayList<>();
        Queue<Node>q = new LinkedList<>();
        Stack<Node> st = new Stack<>();
        
        q.add(node);
        
        while(q.size() != 0 ){
            Node temp = q.remove();
            st.push(temp);
            
            if(temp.right != null){
                
            q.add(temp.right);
            }
            if(temp.left != null){
                
            q.add(temp.left);
            }
            
            
            
            
        }
        while(st.size() != 0){
            Node val = st.pop();
            ar.add(val.data);
        }
        return ar;
    }
}    

