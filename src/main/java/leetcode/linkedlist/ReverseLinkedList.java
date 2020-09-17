package leetcode.linkedlist;

/**
 * @description: 反转链表 ===: 206
 * @author: movesan
 * @create: 2020-09-15 15:28
 **/
public class ReverseLinkedList {

    public static ListNode reverse(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(new int[]{1, 2, 3, 4, 5});
        System.out.println(reverse(node));
    }
}
