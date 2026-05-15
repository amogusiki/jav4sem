public class MyCustomException extends Exception {
    
    // Конструктор без параметров
    public MyCustomException() {
        super();
    }
    
    // Конструктор с сообщением
    public MyCustomException(String message) {
        super(message);
    }
    
    // Конструктор с сообщением и причиной
    public MyCustomException(String message, Throwable cause) {
        super(message, cause);
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        try {
            validateAge(-5);
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());  // Возраст не может быть отрицательным
        }
    }
    
    static void validateAge(int age) throws MyCustomException {
        if (age < 0) {
            throw new MyCustomException("Возраст не может быть отрицательным");
        }
    }
}
