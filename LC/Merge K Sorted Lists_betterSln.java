/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // Check if the input array is empty or contains only one list
        if (lists == null || lists.length == 0) {
            return null;
        }
        if (lists.length == 1) {
            return lists[0];
        }

        // Create a priority queue and add the first node of each list to the queue
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, (a, b) -> a.val - b.val);
        for (ListNode node : lists) {
            if (node != null) {
                queue.offer(node);
            }
        }

        // Create a dummy node as the head of the output list
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        // Retrieve the minimum node from the queue, add it to the output list, and add the next node from the list to the queue
        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            curr.next = node;
            curr = curr.next;
            if (node.next != null) {
                queue.offer(node.next);
            }
        }

        return dummy.next;
    }
}
