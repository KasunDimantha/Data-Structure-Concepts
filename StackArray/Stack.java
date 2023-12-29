package StackArray;

public class Stack {

    int[] stack = new int[5];
    int top = 0;

    public void push(int i) {
        if ( top == 5){
            System.out.println("Stack is full.");
        } else {
            stack[top] = i;
            top++;
        }
        
    }

    public void pop(){
        if (top == 0){
            System.out.println("Stack is empty.");
        } else {
            int data;
            top--;
            data = stack[top];
            System.out.println("Pop value is : " + data);
        }
        
    }

    public int peak(){
        int data;
        data = stack[top-1];
        return data;
    }

    public void size(){
        System.out.println("Stack size is : " + top);
    }

    public boolean isFull(){
        if(top == 5){
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty(){
        if(top == 0){
            return true;
        } else {
            return false;
        }
    }

    public void print(){
        System.out.print("[");
        for(int i=top-1; i>=0; i--){
            System.out.print(stack[i] + " ");
        }
        System.out.println("\b]");
    }
    
}
