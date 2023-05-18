import java.util.Stack;

public class BT_DaoNguocPTMang {
    public static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        // Đưa các phần tử vào Stack.
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        //Lấy các phần tử từ Stack và đưa vào mảng ban đầu.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Mảng trước khi đảo ngược là: ");
        printArray(arr);

        reverseArray(arr);

        System.out.println("Mảng sau khi đảo ngược là: ");
        printArray(arr);
    }

}
