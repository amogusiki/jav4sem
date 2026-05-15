// 1. Назначение основных классов исключений
/*
- Throwable: родитель всех исключений и ошибок
- Error: критические проблемы JVM (невозможно обработать). Например: OutOfMemoryError
- Exception: исключения, которые можно обработать (проверяемые)
- RuntimeException: исключения времени выполнения (непроверяемые, возникают из-за ошибок в коде)
*/

// 2. Примеры исключений
public class ExceptionsExample {
    public static void main(String[] args) {
        
        // ArithmeticException - деление на ноль
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");
        }
        
        // ArrayIndexOutOfBoundsException - выход за границы массива
        try {
            int[] arr = new int[3];
            int val = arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: индекс вне границ массива");
        }
        
        // IllegalArgumentException - некорректный аргумент метода
        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        
        // ClassCastException - некорректное приведение типов
        try {
            Object obj = "Hello";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("Ошибка: нельзя привести String к Integer");
        }
        
        // NullPointerException - обращение к null
        try {
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            System.out.println("Ошибка: обращение к null объекту");
        }
    }
    
    static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
    }
}
