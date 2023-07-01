package com.queue;

import java.util.Scanner;

public class CircularQueue {

    int q[], front, rear, maxSize;
    int count = 0;


    void createQueue(int size) {

        q = new int[size];

        maxSize = size;
        front = 0;
        rear = -1;
    }

    void Enqueue(int e) {
        rear = (rear + 1) % maxSize;
        count ++;
        q[rear] = e;
    }


    int Dequeue() {


        int temp = q[front];
        front = (front + 1) %maxSize;
        count --;
        return temp;
    }

    boolean isFull() {

        if (count == maxSize)
            return true;
        else
            return false;
    }

    boolean isEmpty() {
        if (count == 0)
            return true;
        else
            return false;
    }


    void printQueue() {
        int i = front;   //i do printing
        int c = 0;  // counts and stops

        while (c<count){
            System.out.println(q[i] + "--");
            i = (i+1)%maxSize;
            c++;
        }
    }


    public static void main(String[] args) {

        int choice;

        CircularQueue queue = new CircularQueue();
        Scanner sc =new Scanner(System.in);


        System.out.println("Enter Size of Queue: ");
        int size = sc.nextInt();

        queue.createQueue(size);

        do {
            System.out.print("\n1.Enqueue\n2.Dequeue\n3.Print\n0.Exit:\n");

            choice  = sc.nextInt();

            switch (choice){
                case 1:
                    if(queue.isFull()!=true)//not full
                    {
                        System.out.println("Enter element:");
                        int e=sc.nextInt();
                        queue.Enqueue(e);
                    }
                    else
                    {
                        System.out.println("Queue is full:");
                    }
                    break;
                case 2:
                    if(queue.isEmpty()!=true)//not empty
                    {
                        System.out.println("Element Dequeued:"+queue.Dequeue());
                    }
                    else
                    {
                        System.out.println("Queue is Empty:");
                    }
                    break;
                case 3:
                    if(queue.isEmpty()!=true)//not empty
                    {
                        System.out.println("Element in Queue");
                        queue.printQueue();
                    }
                    else
                    {
                        System.out.println("Queue is Empty:");
                    }
                    break;
                case 0:
                    System.out.print("Coded by Aditya");
                    break;
                default:
                    System.out.print("Wrong input:");
                    break;
            }
        }while(choice != 0);


    }
}
