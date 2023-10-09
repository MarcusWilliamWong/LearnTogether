package code;

class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) {
            return head;
        }
        //设置虚拟头节点
        ListNode dummy = new ListNode(-1, head);//值为-1，指向head节点
        ListNode pre = dummy;
        ListNode cur = head;
        while(cur != null) {
            if(cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}