class Node {
    Node next;
    int data;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    Node head;
    Node tail;
    private int count;
    LinkedList(int data) {
        Node node = new Node(data);
        head = node;
        tail = node;
    }
    void addBack(int data){
        count+=1;
        Node node = new Node(data);
        tail.next = node;
        tail = node;
    }
    void addFront(int data){
        count+=1;
        Node node = new Node(data);
        node.next = this.head;
        head = node;
    }
    void display(){
        int[] answer = new int[count];
        Node node = this.head;
        for (int i = 0; i < count; i++) {
            answer[i] = node.data;
            node = node.next;
        }

        for (int i : answer) {
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        LinkedList test = new LinkedList(1);
        test.addBack(2);
        test.addBack(3);
        test.addBack(4);
        test.addBack(5);
        test.addFront();
        test.display();
    }

}
