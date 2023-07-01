package com.linkedlist;

//linked uses container sice linkedlist has a node

import java.util.Scanner;

public class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;

    }

}
     class LinearLinkedList {
         Node root;


         void createList() {

             root = null;
         }

         void insertLeft(int e) {

             Node node = new Node(e);  //node created

             if (root == null)
                 root = node;
             else {
                 node.next = root;
                 root = node;
             }
         }

         void insertRight(int e) {

             Node node = new Node(e);  //node created

             if (root == null)
                 root = node;
             else {
                 Node t = root;
                 while (t.next != null)
                     t = t.next;
                 t.next = node;
                 System.out.println("inserted to right");
             }
         }

         void deleteLeft() {

             if (root != null) {
                 Node t = root;
                 root = root.next;
                 System.out.println("Deleted " + t.data);
             } else {
                 System.out.println("Empty List");
             }
         }

         void deleteRight() {

             if (root != null) {
                 Node t = root;
                 Node t2 = t;
                 while (t.next != null) {
                     t2 = t;
                     t = t.next;
                 }
                 if (t == root) //single node
                     root = null;
                 else
                     t2.next = null;
                 System.out.println("Deleted " + t.data);
             } else {
                 System.out.println("Empty List");
             }
         }

         void printList() {

             if (root == null) {
                 System.out.println("List is Empty");
             } else {
                 Node t = root;
                 while (t != null) {
                     System.out.print("|" + t.data + "-->");
                     t = t.next;
                 }
             }
         }


         void searchList(int key) {

             if (root == null) {  //no root
                 System.out.println("Empty List");
             } else {
                 Node t = root;
                 while (t != null && t.data != key) {
                     t = t.next;

                 }
                 if (t == null)
                     System.out.println("Not Found");
                 else
                     System.out.println(key + " Found");;
             }
         }


         public static void main(String[] args) {

             int choice;

             LinearLinkedList list = new LinearLinkedList();
             Scanner sc =new Scanner(System.in);


             System.out.println("Enter Size of Queue: ");
             int size = sc.nextInt();

             list.createList();

             do {
                 System.out.print("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete right:\n5.Search\n6.Print\n0.Exit\n");

                 choice  = sc.nextInt();

                 switch (choice){
                     case 1:
                         System.out.println("Enter element: ");
                         int e = sc.nextInt();
                         list.insertLeft(e);
                         break;
                     case 2:
                         System.out.println("Enter element: ");
                          e = sc.nextInt();
                         list.insertRight(e);

                         break;
                     case 3:
                        list.deleteLeft();
                         break;
                     case 4:
                         list.deleteRight();
                         break;
                     case 5:
                         System.out.println("Enter element: ");
                         e = sc.nextInt();
                         list.searchList(e);
                         break;
                     case 6:
                         list.printList();
                         break;
                     case 0:
                         System.out.println("Coded By Aditya");
                         break;

                     default:
                         System.out.print("Wrong input:");
                         break;
                 }
             }while(choice != 0);


         }


     }