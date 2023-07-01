package com.stack;

import java.util.Scanner;

public class StackExample {

    int stack[],tos,MaxSize;


    void createStack(int size){

        //Create Array
        stack = new int[size];

//        init maxSize
        MaxSize = size;
        tos = -1;
    }

    void push (int e){
        tos++;
        stack[tos] = e;
    }


    boolean isFull(){
        if(tos == MaxSize-1)
            return  true;
        else
            return false;
        }

        boolean isEmpty(){
        if(tos == -1)
            return true;
        else
            return false;
        }

    int pop(){
      int temp = stack[tos];  //copy old data
      tos --;  //reduce tos
      return (temp);
    }

    int peek(){
        return (stack[tos]);
    }

    void printStack(){

        for(int i =tos;i > -1;i--){
            System.out.println(stack[i]);
        }
    }


    public static void main(String[] args) {


        StackExample obj = new StackExample();
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter size of stack");
        int size = sc.nextInt();
        int choice;

        obj.createStack(size);

        do
        {
            System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Print\n0.Exit");
             choice = sc.nextInt();

            switch (choice){
                case 1: if(!obj.isFull()){
                    System.out.println("Enter element: ");
                    int e = sc.nextInt();
                    obj.push(e);
                }else
                    System.out.println("Stack is full");
                break;

                case 2: if(!obj.isEmpty()){
                    System.out.println(obj.pop());
                }else
                    System.out.println("Stack is Empty..");
                break;

                case 3: if(!obj.isEmpty()){
                    System.out.println(obj.peek());
                }else
                    System.out.println("Stack is Empty..");
                break;

                case 4: if(!obj.isEmpty()){
                    obj.printStack();
                }else
                    System.out.println("Stack is Empty..");
                break;

                case 0:
                    System.out.println("Coded by Aditya");
                    break;

                default:
                    System.out.println("Enter Valid Input..");
            }
        }while (choice != 0);



    }

}


