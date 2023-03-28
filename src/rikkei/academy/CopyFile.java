package rikkei.academy;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        copyFile();
//        // Kiểm tra số lượng tham số truyền vào
//        if (args.length != 2){
//            System.out.println("D:\\Java10f\\module3\\MD3_Lesson16_Exercise1\\src\\rikkei\\academy\\copy.txt");
//            return;
//        }
//        String source = args[0];
//        String destination = args[1];
//
//        try {
//            //Mở các luồng đầu vào và đầu ra
//            BufferedReader reader = new BufferedReader(new FileReader(source));
//            BufferedWriter writer = new BufferedWriter(new FileWriter(destination));
//
//            int c;
//            int count = 0;
//
//            // Đọc từng ký tự từ tệp nguồn và ghi vào tệp đích
//            while ((c = reader.read()) != -1){
//                writer.write(c);
//                count++;
//            }
//            // Đóng các luồng
//            reader.close();
//            writer.close();
//
//            System.out.println("Sao chép thành công!");
//            System.out.println("Tổng số ký tự sao chép: " + count);
//        }catch (FileNotFoundException e){
//            System.out.println("Tệp nguồn không tồn tại?");
//        }catch (IOException e){
//            System.out.println("Lỗi khi sao chép tệp ?");
//        }
    }
    public static void copyFile() throws IOException{
        FileReader fileReader = new FileReader("D:\\Java10f\\module3\\MD3_Lesson16_Exercise1\\src\\rikkei\\academy\\document.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter("D:\\Java10f\\module3\\MD3_Lesson16_Exercise1\\src\\rikkei\\academy\\copy.txt",true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String line = "";
        while ((line = bufferedReader.readLine()) != null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
    }
}
