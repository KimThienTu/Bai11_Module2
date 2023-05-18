package TH_TrienKhaiStack;

public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("1.Kích thước ngăn xếp sau thao tác đẩy: " + stack.size());
        System.out.println("2. ");

        while (stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("Kích thước ngăn xếp sau khi xóa là: " + stack.size());
    }
}
