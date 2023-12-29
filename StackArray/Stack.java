package StackArray;

public class Stack {

    int[] stack = new int[10];
    int top = 0;

    public void push(int i) {
        stack[top] = i;
        top++;
    }

    public int pop(){
        int data;
        top--;
        data = stack[top];
        return data;
    }

    public int peak(){
        int data;
        data = stack[top-1];
        return data;
    }

    public void print(){
        System.out.print("[");
        for(int i=top-1; i>=0; i--){
            System.out.print(stack[i] + " ");
        }
        System.out.println("\b]");
    }
    
}
