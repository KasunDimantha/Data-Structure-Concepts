package StackArray;

public class Runner {
    public static void main(String[] args) {
        
        Stack stack = new Stack();

        stack.push(15);
        stack.push(16);
        stack.push(17);
        stack.push(18);
        stack.push(19);
        stack.print();

        System.out.println("Peak value is : " + stack.peak());
        stack.print();

        System.out.println("Pop value is : " + stack.pop());
        stack.print();

        stack.push(20);
        stack.push(21);
        stack.print();
    }
    
}
