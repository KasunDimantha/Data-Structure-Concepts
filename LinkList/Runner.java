package LinkList;

public class Runner {
    
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        list.insert(18);
        list.insert(45);
        list.insert(12);

        list.insertAtStart(25);
        list.show();

        list.insertAt(2,55);
        list.show();

        list.deleteAt(3);
        list.show();
    }

}
