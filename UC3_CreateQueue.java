package com.bridgelabsday14QueueandStack;


public class UC3_CreateQueue {
    public Node head;
    public Node tail;
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public void append(int datas){								  // Append datas One By One
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
    public void display() {										 // Display all the Node with value
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        while (current != null) {
            System.out.println(current.data +" ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        UC3_CreateQueue operQueue = new UC3_CreateQueue();
        operQueue.append(70);
        operQueue.append(30);
        operQueue.append(56);
        operQueue.display();
    }
}