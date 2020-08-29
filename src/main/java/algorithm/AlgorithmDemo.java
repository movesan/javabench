package algorithm;

/**
 * @description:
 * @author: movesan
 * @create: 2020-07-28 16:25
 **/
public class AlgorithmDemo {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    static class Solution {
        public static ListNode sortList(ListNode head) {
            if (head == null) {
                return null;
            }
            // 递归结束条件
            if (head.next == null){
                return head;
            }
            ListNode p1 = head;
            ListNode p2 = head;
            // 快慢指针找到中间节点
            while (p2.next != null && p2.next.next != null) {
                p1 = p1.next;
                p2 = p2.next.next;
            }
            // 把链表从中间断开
            ListNode tail = p1;
            p1 = p1.next;
            tail.next = null;

            // 左边排序后返回左链表的开头
            ListNode L = sortList(head);
            // 右边排序后返回右链表的开头
            ListNode R = sortList(p1);
            return mergeTwoLists(L, R);
        }

        public static ListNode merge(ListNode left, ListNode right){
            ListNode pre = new ListNode(0);
            ListNode cur = pre;

            // 比较左右链表
            while (left != null && right != null) {
                if (left.val <= right.val) {
                    cur.next = left;
                    cur = left;
                    left = left.next;
                } else {
                    cur.next = right;
                    cur = right;
                    right = right.next;
                }
            }
            if (left != null) {
                cur.next = left;
            }
            if (right != null) {
                cur.next = right;
            }

            return pre.next;
        }



        public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if(l1 == null) {
                return l2;
            }
            if(l2 == null) {
                return l1;
            }

            if(l1.val < l2.val) {
                l1.next = mergeTwoLists(l1.next, l2);
                return l1;
            } else {
                l2.next = mergeTwoLists(l1, l2.next);
                return l2;
            }
        }


    }


    public static void main(String[] args) {
        ListNode node1= new ListNode(2);
        node1.next=new ListNode(4);
        ListNode node2= new ListNode(1);
        node2.next=new ListNode(3);
        ListNode merge = Solution.merge(node1, node2);
        System.out.println(merge);

//        ListNode node= new ListNode(4);
//        node.next=new ListNode(2);
//        node.next.next=new ListNode(3);
//        node.next.next.next=new ListNode(1);
//        node.next.next.next.next=new ListNode(5);
//        ListNode listNode = Solution.sortList(node);
//        System.out.println(listNode);
    }
}
