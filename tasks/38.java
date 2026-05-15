public class TryFinallyExample {
    
    // 1. try без catch и finally - НЕЛЬЗЯ (ошибка компиляции)
    // try {
    //     System.out.println("Hello");
    // }
    
    // 2. try только с finally - МОЖНО
    public static void tryWithFinally() {
        try {
            int result = 10 / 0;
        } finally {
            System.out.println("finally выполнится всегда");
        }
    }
    
    // 3. try с двумя finally - НЕЛЬЗЯ (ошибка компиляции)
    // try {
    //     System.out.println("Hello");
    // } finally {
    //     System.out.println("first");
    // } finally {
    //     System.out.println("second");
    // }
    
    public static void main(String[] args) {
        tryWithFinally();
        System.out.println("Программа продолжает работу? Да, но исключение не перехвачено");
    }
}
