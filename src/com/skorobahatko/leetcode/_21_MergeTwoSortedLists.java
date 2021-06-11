package com.skorobahatko.leetcode;

public class _21_MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(3);
        listNode1.next.next = new ListNode(5);

        ListNode listNode2 = new ListNode(2);
        listNode2.next = new ListNode(4);
        listNode2.next.next = new ListNode(6);

        System.out.println(mergeTwoLists(listNode1, listNode2));
    }

    /*
     * Merge two sorted linked lists and return it as a sorted list.
     * The list should be made by splicing together the nodes of the first two lists.
     * Constraints:
     *   The number of nodes in both lists is in the range [0, 50].
     *   -100 <= Node.val <= 100
     *   Both l1 and l2 are sorted in non-decreasing order.
     * */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        ListNode result = new ListNode();
        ListNode currentNode = result;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    currentNode.val = l1.val;
                    l1 = l1.next;
                } else {
                    currentNode.val = l2.val;
                    l2 = l2.next;
                }
            } else if (l1 != null) {
                currentNode.val = l1.val;
                l1 = l1.next;
            } else {
                currentNode.val = l2.val;
                l2 = l2.next;
            }

            if (l1 != null || l2 != null) {
                currentNode.next = new ListNode();
                currentNode = currentNode.next;
            }
        }
        return result;
    }

}

class ListNode {
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

    @Override
    public String toString() {
        var sb = new StringBuilder();
        var listNode = this;
        while (listNode != null) {
            sb.append(" -> ").append(listNode.val);
            listNode = listNode.next;
        }
        return sb.toString();
    }
}