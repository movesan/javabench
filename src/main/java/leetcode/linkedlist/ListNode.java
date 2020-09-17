package leetcode.linkedlist;

/**
 * @description: 链表节点
 * @author: movesan
 * @create: 2020-09-14 16:39
 **/
public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    ListNode(int[] arr) {
        assert (arr != null && arr.length != 0) : "参数为空";
        this.val = arr[0];
        ListNode tmp = this;
        for (int i = 1; i < arr.length; i++) {
            ListNode next = new ListNode(arr[i]);
            tmp.next = next;
            tmp = next;
        }
    }

    public ListNode next(ListNode next) {
        this.next = next;
        return next;
    }

    @Override
    public String toString() {
        return this.next != null ? this.val + " --> " + this.next.toString() : this.val + "";
    }
}
