package com.nian;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 *
 * 示例:
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *  
 * 限制：
 * 0 <= 节点个数 <= 5000
 *
 */

public class ReverseList {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */

    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode pre = null;


        while (current != null) {
            ListNode temp = current.next;
            current.next = pre;

            pre = current;
            current = temp;
        }

        return pre;
    }

    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
