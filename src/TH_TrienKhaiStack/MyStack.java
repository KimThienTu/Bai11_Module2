package TH_TrienKhaiStack;

public class MyStack {
    private int arr[];
    private int size;
    private int index = 0;

    public MyStack(int size){
        this.size = size;
        arr = new int[size];
    }

    public void push(int element){
        if (isFull()){
            throw new StackOverflowError("Ngăn xếp đã đầy");
        }
        arr[index] = element;
        index++;
    }

    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Ngăn xếp không có giá trị");
        }
        return arr[--index];
    }

    public boolean isEmpty(){
        return index == 0;

    }

    public boolean isFull() {
        return index == size;
    }

    public int size(){
        return index;
    }
}
