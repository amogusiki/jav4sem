// 1. Десять методов класса String
public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "   Hello, World!   ";
        String another = "hello, world!";
        
        // length() - возвращает длину строки
        System.out.println("Длина: " + str.length()); // 19
        
        // trim() - удаляет пробелы в начале и конце
        System.out.println("Trim: '" + str.trim() + "'"); // 'Hello, World!'
        
        // toLowerCase() / toUpperCase() - меняет регистр
        System.out.println("Lower: " + str.trim().toLowerCase()); // hello, world!
        System.out.println("Upper: " + str.trim().toUpperCase()); // HELLO, WORLD!
        
        // charAt() - возвращает символ по индексу
        System.out.println("Символ на индексе 1: " + str.charAt(1)); // e
        
        // substring() - вырезает часть строки
        System.out.println("Substring 7-12: " + str.substring(7, 12)); // World
        
        // replace() - заменяет символы
        System.out.println("Replace: " + str.replace('l', 'x')); //   Hexxo, Worxd!   
        
        // contains() - проверяет наличие подстроки
        System.out.println("Contains 'World': " + str.contains("World")); // true
        
        // startsWith() / endsWith() - проверяет начало/конец
        System.out.println("Starts with '   H': " + str.startsWith("   H")); // true
        System.out.println("Ends with '!   ': " + str.endsWith("!   ")); // true
        
        // equals() / equalsIgnoreCase() - сравнение строк
        System.out.println("Equals: " + str.trim().equals(another)); // false
        System.out.println("Equals ignore case: " + str.trim().equalsIgnoreCase(another)); // true
        
        // split() - разбивает строку на массив
        String[] words = str.trim().split(", ");
        System.out.println("Split: " + java.util.Arrays.toString(words)); // [Hello, World!]
    }
}

// 2. StringJoiner - объединение строк с разделителем
import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        // Простой пример
        StringJoiner joiner1 = new StringJoiner(", ");
        joiner1.add("один");
        joiner1.add("два");
        joiner1.add("три");
        System.out.println(joiner1); // один, два, три
        
        // С префиксом и суффиксом
        StringJoiner joiner2 = new StringJoiner(", ", "[", "]");
        joiner2.add("x").add("y").add("z");
        System.out.println(joiner2); // [x, y, z]
    }
}

// 3. Три двойные кавычки (Text Blocks - Java 15+)
public class TextBlockExample {
    public static void main(String[] args) {
        // Без text blocks - неудобно
        String oldWay = "Строка 1\n" +
                       "Строка 2\n" +
                       "Строка 3";
        
        // С text blocks - многострочный текст
        String textBlock = """
               Строка 1
               Строка 2
               Строка 3
               """;
        
        // Сохраняет форматирование (отступы, переносы)
        String json = """
               {
                   "name": "Дима",
                   "age": 25
               }
               """;
        
        System.out.println(textBlock);
        System.out.println(json);
    }
}
