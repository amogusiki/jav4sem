import java.io.*;

public class IoStreamsExample {
    public static void main(String[] args) {
        
        // 1. InputStream - чтение из файла
        try (FileInputStream input = new FileInputStream("test.txt")) {
            int data = input.read();  // читает один байт (-1 если конец)
            System.out.println("Прочитан байт: " + data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // 2. OutputStream - запись в файл
        try (FileOutputStream output = new FileOutputStream("output.txt")) {
            output.write(65);  // записывает байт (65 = 'A')
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // 3. Зачем Reader/Writer? - для работы с символами (Unicode), а не байтами
        // InputStream читает байты, Reader читает символы (2 байта для Unicode)
        try (FileReader reader = new FileReader("test.txt")) {
            int ch = reader.read();  // читает символ, а не байт
        } catch (IOException e) {}
        
        // 4. AutoCloseable - автоматическое закрытие ресурсов (try-with-resources)
        class MyResource implements AutoCloseable {
            public void use() { System.out.println("Использую ресурс"); }
            @Override
            public void close() { System.out.println("Ресурс закрыт"); }
        }
        
        try (MyResource res = new MyResource()) {
            res.use();
        } catch (Exception e) {}
        // Ресурс закроется автоматически, даже если будет исключение
    }
}
