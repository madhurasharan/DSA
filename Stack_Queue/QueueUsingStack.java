package Stack_Queue;

import java.util.*;

class QueueUsingStack{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    /** Initialize your data structure here. */
    public QueueUsingStack() {}

    /** Push element x to the back of queue. */
    public void push(int x) {
        while (!s1.empty()) {
            s2.push(s1.pop());
        }

        System.out.println("The element pushed is " + x);
        s1.push(x);

        while (!s2.empty()) {
            s1.push(s2.pop());
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (s1.empty()) {
            System.out.println("Queue is empty");
            return -1; // or throw exception
        }
        int val = s1.peek();
        s1.pop();
        return val;
    }

    /** Get the front element. */
    public int peek() {
        if (s1.empty()) {
            System.out.println("Queue is empty");
            return -1; // or throw exception
        }
        return s1.peek();
    }

    /** Returns the size of the queue. */
    public int size() {
        return s1.size();
    }
}

class TUF {
    public static void main(String args[]) {
        QueueUsingStack q = new QueueUsingStack();
        q.push(3);
        q.push(4);
        System.out.println("The element popped is " + q.pop());
        q.push(5);
        System.out.println("The front element is " + q.peek());
        System.out.println("The size of the queue is " + q.size());
    }
}
