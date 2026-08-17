import java.util.HashMap;

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
    public int pairSum(ListNode head) {
        HashMap<Integer, Integer> tempResult = new HashMap<>();
        int count = 0;
        while (head != null) {
            tempResult.put(count, head.val);
            head = head.next;
            count++;
        }

        Integer max = 0;
        for (Integer key : tempResult.keySet()) {
            Integer newValue = tempResult.get(key) + tempResult.getOrDefault(count - 1 - key, 0);
            tempResult.put(key, newValue);
            max = Math.max(max, newValue);
        }

        return max;
    }
}