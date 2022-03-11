package com.bridgelabsday14QueueandStack;

public class UC4_DeQueue {
    public Node head;
    public Node tail;
    public static void main(String[] args) {
        UC4_DeQueue operQueue = new UC4_DeQueue();
        operQueue.append(70);
        operQueue.append(30);
        operQueue.append(56);
        operQueue.display();
        operQueue.dequeue();
        operQueue.display();
    }
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public void append(int datas){					// Append datas One By One
        Node newNode = new Node(datas);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void display() {							// Display all the Node with value
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        while (current != null) {
            System.out.println(current.data +" ");
            current = current.next;
        }
    }
    public void dequeue() {								// Dequeue all the elements
        Node current = head;
        while (current != null) {
            if (current == head) {
                head = head.next;
                current = head;
            }
        }
    }
}