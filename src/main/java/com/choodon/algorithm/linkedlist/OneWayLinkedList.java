package com.choodon.algorithm.linkedlist;

import java.util.Objects;

/**
 * OneWayLinkedList
 *
 * @author michael
 * @since 2019-03-03
 */
public class OneWayLinkedList<E> {
    private OneWayLinkedListNode<E> head;

    public boolean add(E e) {
        if (head == null) {
            head = new OneWayLinkedListNode(e);
            return true;
        }
        OneWayLinkedListNode currentOneWayLinkedListNode = head;
        OneWayLinkedListNode preOneWayLinkedListNode = null;
        while (currentOneWayLinkedListNode != null) {
            preOneWayLinkedListNode = currentOneWayLinkedListNode;
            currentOneWayLinkedListNode = currentOneWayLinkedListNode.getNext();
        }
        preOneWayLinkedListNode.setNext(new OneWayLinkedListNode(e));
        return true;
    }

    public boolean remove(E e) {
        if (head == null) {
            return false;
        }
        OneWayLinkedListNode preOneWayLinkedListNode = null;
        OneWayLinkedListNode currentOneWayLinkedListNode = head;
        while (currentOneWayLinkedListNode != null) {
            if (Objects.equals(currentOneWayLinkedListNode.getElement(), e)) {
                if (preOneWayLinkedListNode == null) {
                    head = currentOneWayLinkedListNode.getNext();
                    return true;
                }
                preOneWayLinkedListNode.setNext(currentOneWayLinkedListNode.getNext());
                return true;
            }
            preOneWayLinkedListNode = currentOneWayLinkedListNode;
            currentOneWayLinkedListNode = currentOneWayLinkedListNode.getNext();
        }
        return false;
    }

    public E set(int index, E e) {
        OneWayLinkedListNode<E> currentOneWayLinkedListNode = head;
        OneWayLinkedListNode<E> preOneWayLinkedListNode = null;
        int num = 0;
        if (head == null) {
            head = new OneWayLinkedListNode(null);
            currentOneWayLinkedListNode = head;
            if (index == 0) {
                head.setElement(e);
                return null;
            }
            while (num < index) {
                if (++num == index) {
                    currentOneWayLinkedListNode.setNext(new OneWayLinkedListNode(e));
                    return null;
                }
                currentOneWayLinkedListNode.setNext(new OneWayLinkedListNode(null));
                currentOneWayLinkedListNode = currentOneWayLinkedListNode.getNext();
            }

        }
        while (currentOneWayLinkedListNode != null) {
            if (num++ == index) {
                E oldVal = currentOneWayLinkedListNode.getElement();
                currentOneWayLinkedListNode.setElement(e);
                return oldVal;
            }
            preOneWayLinkedListNode = currentOneWayLinkedListNode;
            currentOneWayLinkedListNode = currentOneWayLinkedListNode.getNext();
        }
        if (num == index) {
            preOneWayLinkedListNode.setNext(new OneWayLinkedListNode(e));
            return null;
        } else if (num < index) {
            preOneWayLinkedListNode.setNext(new OneWayLinkedListNode(null));
            currentOneWayLinkedListNode = preOneWayLinkedListNode.getNext();
            while (num < index) {
                if (++num == index) {
                    currentOneWayLinkedListNode.setNext(new OneWayLinkedListNode(e));
                    return null;
                }
                currentOneWayLinkedListNode.setNext(new OneWayLinkedListNode(null));
                currentOneWayLinkedListNode = currentOneWayLinkedListNode.getNext();
            }
        }
        return null;
    }

    public E get(int index) {
        if (head == null) {
            throw new IndexOutOfBoundsException();
        }
        OneWayLinkedListNode<E> currentOneWayLinkedListNode = head;
        int num = 0;
        while (currentOneWayLinkedListNode != null) {
            if (num++ == index) {
                return currentOneWayLinkedListNode.getElement();
            }
            currentOneWayLinkedListNode = currentOneWayLinkedListNode.getNext();
        }
        throw new IndexOutOfBoundsException();
    }


    public int size() {
        if (head == null) {
            return 0;
        }
        int size = 0;
        OneWayLinkedListNode currentOneWayLinkedListNode = head;
        while (currentOneWayLinkedListNode != null) {
            size++;
            currentOneWayLinkedListNode = currentOneWayLinkedListNode.getNext();
        }
        return size;
    }


}
