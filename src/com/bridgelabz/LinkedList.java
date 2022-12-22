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

    public void poplast() {
        //t first checks whether the head is null (empty list).
        if (head == null) {
            System.out.println("List is empty");
            /*If the list is not empty, it will check whether the list has only one node.
            If the list has only one node, it will set both head and tail to null.
            If the list has more than one node then, traverse through the list till node current points to second last node in the list.
            Node current will become the new tail of the list.
            Node next to current will be made null to delete the last node.*/
        } else {
            if(head != tail ) {
                Node current = head;
                while(current.next != tail) {
                    current = current.next;
                }
                tail = current;
                tail.next = null;
            }
            else {
                head = tail = null;

            }
        }
    }
}





