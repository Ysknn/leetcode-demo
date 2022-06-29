package com.nian;

import java.util.*;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 *
 * 示例:
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.min();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.min();   --> 返回 -2.
 *  
 * 提示：
 * 各函数的调用总次数不超过 20000 次
 *
 */

public class MinStack {

    private Deque<Integer> stack;
    private Deque<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        stack.push(x);
        minStack.push(Math.min(x,minStack.getFirst()));
        System.out.println("stack:" + stack);
        System.out.println("minStack:" + minStack);
    }

    public void pop() {
        stack.pop();
        minStack.pop();
        System.out.println("stack:" + stack);
        System.out.println("minStack:" + minStack);
    }

    public int top() {
        return stack.getFirst();
    }

    public int min() {
        return minStack.getFirst();
    }

}

/*public class MinStack {

        private Deque<Integer> stack;
        private Deque<Integer> minStack;

        *//** initialize your data structure here. *//*
        public MinStack() {
            stack = new LinkedList<>();
            minStack = new LinkedList<>();
        }

        public void push(int x) {
            stack.push(x);
            if (minStack.isEmpty() || x < minStack.getFirst()) {
                minStack.push(x);
            } else {
                minStack.push(minStack.getFirst());
            }
            // System.out.println("stack:" + stack);
            // System.out.println("minStack:" + minStack);
        }

        public void pop() {
            stack.pop();
            minStack.pop();
            // System.out.println("stack:" + stack);
            // System.out.println("minStack:" + minStack);
        }

        public int top() {
            return stack.getFirst();
        }

        public int min() {
            return minStack.getFirst();
        }

}*/


/*public class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> stack2;


    *//** initialize your data structure here. *//*
    public MinStack() {
        stack = new Stack();
    }

    public void push(int x) {
        stack.push(x);
        System.out.println(stack);
    }

    public void pop() {
        stack.pop();
        System.out.println(stack);
    }

    public int top() {
        return stack.lastElement();
    }

    public int min() {
        stack2 = new Stack<>();
        stack2.addAll(stack);
        stack2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2){
                    return 1;
                }
                if (o1 < o2){
                    return -1;
                }
                return 0;
            }
        });
        return stack2.firstElement();
    }

}*/
