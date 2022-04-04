class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode start = head;
        ListNode end = head;
        
        int c = 0;
        while(start != null){
            c++;
            if(c == k){
                break;
            }
            start = start.next;
        }
        ListNode help = start;
        
        while(help.next != null){
            help = help.next;
            end = end.next;
            
            
        }
        
        int temp = start.val;
        
        start.val =  end.val;
        end.val = temp;
        
        return head;
        
        
        
        
    }
}