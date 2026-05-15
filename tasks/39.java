public class App {
    final static int START_COUNTER;
    static {
        START_COUNTER = Integer.parseInt("Y-");  // NumberFormatException
    }
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}

// Что произойдет:
// 1. Класс App начнет загружаться в JVM
// 2. Выполнится статический блок инициализации
// 3. Integer.parseInt("Y-") выбросит NumberFormatException (не число)
// 4. Исключение НЕ перехвачено → ExceptionInInitializerError
// 5. Программа аварийно завершится, "Hello" НЕ будет выведено

// Вывод в консоль:
// Exception in thread "main" java.lang.ExceptionInInitializerError
// Caused by: java.lang.NumberFormatException: For input string: "Y-"
