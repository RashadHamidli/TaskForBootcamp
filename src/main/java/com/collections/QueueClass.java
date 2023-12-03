package com.collections;


import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(36);
        queue.add(3);
        queue.add(5);
        queue.add(7);

        Integer element = queue.element();
        System.out.println(element);

        boolean offer = queue.offer(5);
        System.out.println(offer);

        System.out.println(queue);

        Integer peek = queue.peek();
        System.out.println(peek);
        System.out.println(queue);

        Integer poll = queue.poll();
        System.out.println(poll);
        System.out.println(queue);


    }
}
