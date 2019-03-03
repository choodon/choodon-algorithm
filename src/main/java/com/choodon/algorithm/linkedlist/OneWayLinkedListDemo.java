package com.choodon.algorithm.linkedlist;

/**
 * OneWayLinkedListDemo
 *
 * @author michael
 * @since 2019-03-03
 */
public class OneWayLinkedListDemo {
    public static void main(String[] args) {
        OneWayLinkedList<Integer> oneWayLinkedList = new OneWayLinkedList<>();
        System.out.println(oneWayLinkedList.size());
//        System.out.println(oneWayLinkedList.set(2, 3));
//        System.out.println(oneWayLinkedList.set(1, 4));
//        System.out.println(oneWayLinkedList.remove(null));
//        System.out.println(oneWayLinkedList.get(1));
        System.out.println(oneWayLinkedList.add(1));
        System.out.println(oneWayLinkedList.add(2));
        System.out.println(oneWayLinkedList.add(3));
        System.out.println(oneWayLinkedList.remove(2));

        System.out.println(oneWayLinkedList.size());
        System.out.println(oneWayLinkedList.get(1));
    }
}
