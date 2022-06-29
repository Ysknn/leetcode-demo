package com.nian;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class DemoTest {

    @Test
    public void replaceSpaceTest() {
        System.out.println(ReplaceSpace.replaceSpace("We are happy."));
    }

    @Test
    public void reverseLeftWordsTest() {
        System.out.println(ReverseLeftWords.reverseLeftWords("abcdefg",2));
        System.out.println(ReverseLeftWords.reverseLeftWords("lrloseumgh",6));
    }

    @Test
    public void findRepeatNumberTest() {
        // int[] array = {2, 3, 1, 0, 2, 5, 3};
        int[] array = {3, 4, 2, 0, 0, 1};
        System.out.println(FindRepeatNumber.findRepeatNumber(array));
    }

    @Test
    public void CQueueTest() {
        CQueue queue = new CQueue();
        System.out.println(queue.deleteHead());
        queue.appendTail(5);
        queue.appendTail(2);
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
    }

    @Test
    public void MinStackTest() {
        /*MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.min());*/

        /*MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-1);
        System.out.println(minStack.min());
        System.out.println(minStack.top());
        minStack.pop();
        System.out.println(minStack.min());*/

        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.min());

        /*MinStack minStack = new MinStack();
        minStack.push(0);
        minStack.push(1);
        minStack.push(0);
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.min());*/
    }

    @Test
    public void ReversePrintTest() {
        ReversePrint.ListNode listNode1 = new ReversePrint.ListNode(1);
        ReversePrint.ListNode listNode2 = new ReversePrint.ListNode(3);
        ReversePrint.ListNode listNode3 = new ReversePrint.ListNode(2);

        listNode1.next = listNode2;
        listNode2.next=listNode3;

        ReversePrint reversePrint = new ReversePrint();
        int[] print = reversePrint.reversePrint(listNode1);
        System.out.println(Arrays.toString(print));
    }

    @Test
    public void ReverseListTest() {
        ReverseList.ListNode listNode1 = new ReverseList.ListNode(1);
        ReverseList.ListNode listNode2 = new ReverseList.ListNode(2);
        ReverseList.ListNode listNode3 = new ReverseList.ListNode(3);
        ReverseList.ListNode listNode4 = new ReverseList.ListNode(4);
        ReverseList.ListNode listNode5 = new ReverseList.ListNode(5);


        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        ReverseList reverseList = new ReverseList();
        ReverseList.ListNode node = reverseList.reverseList(listNode1);
        System.out.println(node.val);
        System.out.println(node.next.val);
        System.out.println(node.next.next.val);
        System.out.println(node.next.next.next.val);
        System.out.println(node.next.next.next.next.val);
        System.out.println(Objects.isNull(node.next.next.next.next.next));
    }

    @Test
    public void SearchTest() {
        int[] nums = {5,7,7,8,8,10};
        Search search = new Search();
        System.out.println(search.search(nums, 8));

        /*int[] nums = {5,7,7,8,8,10};
        int count = Search.search(nums, 8);
        System.out.println(count);*/
    }

}
