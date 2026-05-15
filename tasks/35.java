public class ExceptionPropagation {
    
    // Метод, который генерирует исключение (не перехватывает)
    public static void methodWithException() {
        int[] arr = new int[2];
        arr[5] = 10;  // ArrayIndexOutOfBoundsException - НЕ перехвачено → аварийная остановка
    }
    
    // Метод, который перехватывает исключение
    public static void methodWithCatch() {
        try {
            int result = 10 / 0;  // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Исключение перехвачено: " + e);
        }
    }
    
    public static void main(String[] args) {
        // Это исключение будет перехвачено
        methodWithCatch();  // Работает, программа продолжает выполнение
        
        // Это исключение НЕ будет перехвачено → аварийная остановка
        methodWithException();  // Программа упадет с ArrayIndexOutOfBoundsException
        
        // Этот код НЕ выполнится
        System.out.println("Эта строка не будет напечатана");
    }
}
