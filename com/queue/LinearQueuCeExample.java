package com.queue;

import java.util.Scanner;

public class LinearQueuCeExample {


    int q[], front, rear, maxSize;

    void createQueue(int size) {

        q = new int[size];

        maxSize = size;
        front = 0;
        rear = -1;
    }

    void Enqueue(int e) {
        rear++;
        q[rear] = e;
    }


    int Dequeue() {

        int temp = q[front];
        front++;
        return temp;
    }

    boolean isFull() {

        if (rear == maxSize-1)
            return true;
        else
            return false;
    }

    boolean isEmpty() {
        if (rear > front)
            return true;
        else
            return false;
    }


    void printQueue() {
        for (int i =front; i<=rear;i++)
            System.out.println(q[i] + "--");
    }


    public static void main(String[] args) {

        int choice;

        LinearQueuCeExample queue = new LinearQueuCeExample();
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
