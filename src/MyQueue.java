public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize){
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull(){
        boolean status = false;
        if (currentSize == capacity){
            status = true;
        }
        return status;
    }

    public void enqueue(int item){
        if (isQueueFull()){
            System.out.println("Đã đầy ! Không thể thêm phần tử " + item);
        } else {
            tail++;
            if (tail == capacity - 1){
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Phần tử: " + item + " được đẩy vào hàng đợi ");
        }
    }

    public void dequeue(){
        if (isQueueEmpty()){
            System.out.println("Chảy tràn! Không thể xóa phần tử khỏi hàng đợi");
        } else {
            head++;
            if (head == capacity -1){
                System.out.println("Thao tác xóa đã hoàn tất! Loại bỏ: " + queueArr[head -1]);
                head = 0;
            } else {
                System.out.println("Thao tác xóa đã hoàn tất! Loại bỏ: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }

    private boolean isQueueEmpty() {
        return currentSize == 0;
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(24);
        queue.dequeue();
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(23);
        queue.enqueue(435);
    }
}
