package com.bridgelabz;

public class LinkedList <T> {

    Node <T> head;
    Node <T> tail;

    public void push(T key){
        Node <T> newNode = new Node(key);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }

    }

    public void display() {

        Node<T> temp = head;
        while (temp != null){
            System.out.print(temp.key+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}
