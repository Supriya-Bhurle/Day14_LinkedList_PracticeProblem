package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);
        linkedList1.display();

        //LinkedList<Integer> linkedList2 = new LinkedList<>();
        //linkedList1.append(70);
        //linkedList1.append(30);
        //linkedList1.append(56);
        //linkedList2.display();

        linkedList1.pop();
        linkedList1.display();

    }
}
