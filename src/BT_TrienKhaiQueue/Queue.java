package BT_TrienKhaiQueue;

public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    private boolean isEmpty(){
        return front == null;
    }

    public void enQueue(int data){
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
            rear.link = front;  // Hàm đợi liên kết vong.
        } else {
            rear.link = newNode;
            rear = newNode;
            rear.link = front;
        }
    }

    public void deQueue(){
        if (isEmpty()){
            System.out.println("Hàng đợi rỗng!");
        } else if (front == rear){
            front = rear = null;
        } else {
            front = front.link;
            rear.link = front;
        }
    }

    public void displayQueue(){
        if (isEmpty()){
            System.out.println("Hàng đợi rỗng! ");
        } else {
            Node temp = front;
            System.out.println("Hàng đợi là: ");
            do {
                System.out.println(temp.data + " ");
                temp = temp.link;
            } while (temp != front);
            System.out.println();
        }
    }
}
