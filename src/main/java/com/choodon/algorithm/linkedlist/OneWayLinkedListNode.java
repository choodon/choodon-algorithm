package com.choodon.algorithm.linkedlist;

/**
 * OneWayLinkedListNode
 *
 * @author michael
 * @since 2019-03-03
 */
public class OneWayLinkedListNode<E> {

    private E element;
    private OneWayLinkedListNode<E> next;

    public OneWayLinkedListNode(E element) {
        this(element, null);
    }

    public OneWayLinkedListNode(E element, OneWayLinkedListNode<E> next) {
        this.element = element;
        this.next = next;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public OneWayLinkedListNode<E> getNext() {
        return next;
    }

    public void setNext(OneWayLinkedListNode<E> next) {
        this.next = next;
    }
}
