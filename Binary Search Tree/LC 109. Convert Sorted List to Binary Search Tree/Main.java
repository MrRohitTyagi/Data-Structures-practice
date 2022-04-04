class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        return createTree(head, null);
    }
    
    TreeNode createTree (ListNode head, ListNode tail) {
        if (head == tail) return null;
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return new TreeNode(slow.val, createTree(head, slow), createTree(slow.next, tail));
    }
}