import java.util.Map;
import java.util.TreeMap;

public class BT_DemSoLanXuatHien {
    public static void countWords(String text) {
        // Chuyển đổi văn bản thành chữ thường và loại bỏ
        // các kí tự không phải là chữ cái và dấu cách.
        text = text.toLowerCase().replaceAll("[^a-zA-Z\\s]", " ");

        // Tạo 1 TreeMap để lưu trữ từ và số lần xuất hiện.
        Map<String, Integer> soLanLap = new TreeMap<>();

        // Tách cac từ từ văn bản và đếm số làn xuất hiên.
        String[] words = text.split("\\s+");
        for (String word : words) {
            if (soLanLap.containsKey(word)) {
                // Tăng số lần xuất hiện của từ nếu đã từng tồn tại trong mảng.
                soLanLap.put(word, soLanLap.get(word) + 1);
            } else {
                // Thêm từ vào map và đatẹ số lần xuất hiện là 1.
                soLanLap.put(word, 1);
            }
        }

        //Hiển thị các từ va số lần xuất hiện theo thứ tự trong bảng chữ cái.
        for(Map.Entry<String, Integer> entry : soLanLap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String text = "Nhập văn bản mà bạn muốn test ";
        countWords(text);
    }
}