public class Solution2 {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode walker = head;
        ListNode runner = head;
        while(runner.next != null && runner.next.next!=null) {
            runner = runner.next.next;
            walker = walker.next;
            if (runner == walker) return true;
        }
        return false;
    }
}