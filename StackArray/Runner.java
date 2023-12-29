package StackArray;

public class Runner {
    public static void main(String[] args) {
        
        Stack stack = new Stack();

        stack.pop();
        System.out.println("Is stack empty : " + stack.isEmpty());
        stack.push(15);
        stack.push(16);
        System.out.println("Is stack empty : " + stack.isEmpty());
        stack.push(17);
        stack.push(18);
        stack.push(19);
        stack.size();
        System.out.println("Stack is full : " + stack.isFull());
        stack.print();

        System.out.println("Peak value is : " + stack.peak());
        stack.print();

        stack.pop();
        stack.print();

        System.out.println("Is Stack full : " + stack.isFull());

        stack.push(20);
        stack.print();
        stack.push(21);
        System.out.println("Is Stack full : " + stack.isFull());
    }
    
}
