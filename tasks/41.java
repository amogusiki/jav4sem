import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileExample {
    public static void main(String[] args) {
        // Чтение данных из файла с помощью Scanner
        try (Scanner scanner = new Scanner(new File("input.txt"))) {
            
            // Чтение целого числа
            int number = scanner.nextInt();
            
            // Чтение строки (до пробела)
            String word = scanner.next();
            
            // Чтение всей строки
            scanner.nextLine();
            String line = scanner.nextLine();
            
            // Чтение пока есть данные
            while (scanner.hasNext()) {
                String token = scanner.next();
                System.out.println(token);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}
