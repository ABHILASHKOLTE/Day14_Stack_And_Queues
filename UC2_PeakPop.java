package com.bridgelabsday14QueueandStack;

public class UC2_PeakPop {
    public Node head;
    public Node tail;
    public static void main(String[] args) {
        UC2_PeakPop list = new UC2_PeakPop();
        list.push(70);
        list.push(30);
        list.push(56);
        list.display();
        System.out.println("Peak Element is = "+list.peak());
        list.pop();
        list.display();
    }
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public void push(int datas){								    // Pushing new datas
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
    public void display() {											 // Display all Node With Value
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        while (current != null) {
            System.out.println(current.data +" ");
            current = current.next;
        }
    }
    public void pop() {												// Using pop method to pop all elements
        Node current = head;
        while (current != null) {
            if (current == head) {
                head = head.next;
                current = head;
            }
        }
    }
    public int peak(){												// Using peak method to find top of the Element
        Node current1 = head;
        return current1.data;
    }
}