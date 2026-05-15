public class MultiCatchExample {
    
    static class Ex1 extends Exception {}
    static class Ex2 extends Ex1 {}
    static class Ex3 extends Ex2 {}
    
    public static void main(String[] args) {
        
        // 1a. Несколько исключений обрабатываются одинаково (оператор |)
        try {
            // может выбросить разные исключения
            throw new NullPointerException();
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Обработано одинаково: " + e.getClass());
        }
        
        // 1b. Иерархия Ex1 ← Ex2 ← Ex3 - порядок важен (от наследника к родителю)
        try {
            throw new Ex3();
        } catch (Ex3 e) {
            System.out.println("Ex3 перехвачен");
        } catch (Ex2 e) {
            System.out.println("Ex2 перехвачен");
        } catch (Ex1 e) {
            System.out.println("Ex1 перехвачен");
        }
        // ОШИБКА: сначала Ex1, потом Ex2 - не скомпилируется (недостижимый код)
        
        // 2. Вложенные try
        try {
            System.out.println("Внешний try");
            try {
                int[] arr = new int[2];
                arr[5] = 10;  // внутренний try не ловит
            } catch (ArithmeticException e) {
                System.out.println("Внутренний catch");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Внешний catch перехватил ArrayIndexOutOfBoundsException");
        }
    }
}
