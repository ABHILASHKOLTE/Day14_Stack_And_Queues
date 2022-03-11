package com.bridgelabsday14QueueandStack;

public class UC1_CreateStack {
    public Node head;
    public Node tail;
    public static void main(String[] args) {
        UC1_CreateStack operStack = new UC1_CreateStack();
        operStack.push(70);
        operStack.push(30);
        operStack.push(56);
        operStack.display();
    }
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public void push(int datas){					    // Pushing new datas
        Node newNode = new Node(datas);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void display() {								// Display all Node With Value
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        while (current != null) {
            System.out.println(current.data +" ");
            current = current.next;
        }
    }
}