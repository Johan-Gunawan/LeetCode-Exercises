/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        int length = 0;
        if (Objects.isNull(head.next))
            return new ListNode().next;

        ListNode temp = head;
        while (!Objects.isNull(temp.next)) {
            length++;
            temp = temp.next;
        }

        int middle = (int) Math.ceil((double) length / 2);
        System.out.println(length);
        removeMiddleVal(head, middle, 0);

        return head;
    }

    private void removeMiddleVal(ListNode current, int middle, int count) {
        if (current == null)
            return;
        if (count == middle - 1) {
            current.next = current.next.next;
            return;
        } else {
            removeMiddleVal(current.next, middle, count + 1);
        }

    }
}