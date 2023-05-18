import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeChecker {
    public static boolean isPalindrome(String str){
        // Chuyển đổi chuỗi thành chữ thuường và
        // loại bỏ các ký tự không phải chữ cái.
        String processedStr = str.toLowerCase().replaceAll("[^a-z]", " ");

        // Tạo một stack và queue rỗng.
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Đưa các kí tự chuỗi vào stack và queue.
        for (int i = 0; i < processedStr.length(); i++){
            char c = processedStr.charAt(i);
            stack.push(c);
            queue.add(c);
        }

        // So sánh từng cặp kí tự trong stack và queue.
        while (!stack.isEmpty() && !queue.isEmpty()){
            char stackChar = stack.pop();
            char queueChar = queue.poll();
            if (stackChar != queueChar){
                return false;  // Không phải chuỗi Palindrome.
            }
        }
        return true; // Là chuỗi Palindrome
    }

    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba";
        boolean isPalin = isPalindrome(str);
        System.out.println("Chuỗi " + str + "là Palindrome: " + isPalin);
    }
}
