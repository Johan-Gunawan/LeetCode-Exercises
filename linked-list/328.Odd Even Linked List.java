class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode headEven = head.next;

        while (odd.next != null || even.next != null) {
            if (odd.next.next != null) {
                odd.next = odd.next.next;
                odd = odd.next;
            } else {
                odd.next = null;
            }

            if (even.next != null) {
                if (even.next.next != null) {
                    even.next = even.next.next;
                    even = even.next;
                } else {
                    even.next = null;
                }
            } else {
                even.next = null;
            }
        }

        odd.next = headEven;

        return head;
    }
}