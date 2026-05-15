import java.util.Date;
import java.util.Formatter;

// 1 и 3 - Примеры использования спецификаторов
public class FormatterExample {
    public static void main(String[] args) {
        // Способ 1: System.out.printf (использует Formatter внутри)
        
        // %s - строковое представление
        System.out.printf("Привет, %s!%n", "Дима");
        
        // %d - десятичное целое
        System.out.printf("Число: %d%n", 42);
        
        // %f - число с плавающей точкой
        System.out.printf("PI: %.2f%n", 3.14159);
        
        // %b - логическое значение
        System.out.printf("Это true? %b%n", true);
        
        // %t - время и дата
        Date now = new Date();
        System.out.printf("Текущее время: %tH:%tM:%tS%n", now, now, now);
        System.out.printf("Текущая дата: %tA, %tB %td%n", now, now, now, now);
        
        // %% - вставка знака процента
        System.out.printf("Скидка 50%%%n");
        
        // Способ 2: явный Formatter
        Formatter formatter = new Formatter();
        formatter.format("Итог: %d + %d = %d", 10, 20, 30);
        System.out.println(formatter);
        
        // 2. flush() - принудительная запись данных из буфера
        // Нужен для потоков вывода. Данные могут накапливаться в буфере.
        // flush() заставляет вывести их немедленно.
        formatter.flush();  // очищает буфер и записывает данные
        formatter.close();
    }
}
