package com.bridgelabz;

public class LinkedList <T> {
    Node<T> head;
    Node<T> tail;

    public void push(T key) {
        Node<T> newNode = new Node(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.next == null) {
                System.out.print(temp.key);
            } else {
                System.out.print(temp.key + " -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public void insert(T key, int position) {
        //Create a new node
        Node<T> newNode = new Node(key);
        if (head == null) {
            // both head and tail would point to new node if list is empty
            head = newNode;
            tail = newNode;
        } else {
            Node temp, current;
            temp = head;
            current = null;
            for (int i = 0; i < position; i++) {
                //current node will point to temp
                current = temp;
                //temp will point to node next.
                temp = temp.next;
            }
            //current will point to new node
            current.next = newNode;
            //new node will point to temp
            newNode.next = temp;
        }
    }

    public void pop() {
        //t first checks whether the head is null (empty list).
        if (head == null) {
            System.out.println("List is empty");
            /*If the list is not empty, it will check whether the list has only one node.
            If the list has only one node, it will set both head and tail to null.
            If the list has more than one node then, the head will point to the next node in the list and delete the old head node.*/

        } else {

            if (head != tail) {
                head = head.next;
            } else {
                head = tail = null;

            }
        }
    }
}





