package BT_ToChucDLDemerging;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Demerging {
    public static void demergeEmployees(String inputFile, String outputFile){
        try {
            // Đọc dữ liệu từ file input
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;
            Queue<Employee> femaleQueue = new LinkedList<>();
            Queue<Employee> maleQueue = new LinkedList<>();

            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                String gender = fields[1];
                String dateOfBirth = fields[2];

                Employee employee = new Employee(name, gender, dateOfBirth);

                if (gender.equalsIgnoreCase("Female")) {
                    femaleQueue.add(employee);
                } else {
                    maleQueue.add(employee);
                }
            }
            reader.close();

            //Ghi dữ liệu vào file output.
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            while (!femaleQueue.isEmpty()) {
                Employee employee = femaleQueue.poll();
                writer.write(employee.name + "," + employee.gender + "," + employee.dateOfBirth);
                writer.newLine();
            }

            while (!maleQueue.isEmpty()) {
                Employee employee = maleQueue.poll();
                writer.write(employee.name + "," + employee.gender + "," + employee.dateOfBirth);
                writer.newLine();
            }

            writer.close();

            System.out.println("Demergeing đã hoàn tất thành công!");
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        demergeEmployees(inputFile, outputFile);
    }
}
