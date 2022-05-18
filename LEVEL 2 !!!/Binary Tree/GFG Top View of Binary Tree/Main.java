class Solution
{
    
    static class Pair {
        Node node;
        int horiz = 0;
    }
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        ArrayList<Integer> retVal = new ArrayList<>();
        
        HashMap<Integer, Node> map = new HashMap<>();
        
        int lv = 0;
        int rv = 0;
        
        Queue<Pair> queue = new LinkedList<>();
        Pair p = new Pair();
        p.node = root;
        p.horiz = 0;
        
        queue.add(p);
        
        while(queue.size() > 0){
            Pair temp = queue.remove();
            
            if(temp.horiz < lv){
                lv = temp.horiz;
            }
            
            if(temp.horiz > rv){
                rv = temp.horiz;
            }
            
            if(map.containsKey(temp.horiz) == false){
                map.put(temp.horiz, temp.node);
            }
            
            if(temp.node.left != null){
                Pair lp = new Pair();
                lp.node = temp.node.left;
                lp.horiz = temp.horiz - 1;
                
                queue.add(lp);
            }
            
            if(temp.node.right != null){
                Pair rp = new Pair();
                rp.node = temp.node.right;
                rp.horiz = temp.horiz + 1;
                
                queue.add(rp);                
            }
        }
        
        for(int i = lv; i <= rv; i++){
            retVal.add(map.get(i).data);
        }
        
        return retVal;
    }
}

