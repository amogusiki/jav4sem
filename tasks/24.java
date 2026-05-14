class A {
    public static void staticMethod() {
        System.out.println("Статический метод A");
    }
    
    public void instanceMethod() {
        System.out.println("Экземплярный метод A");
    }
}

class B extends A {
    // @Override - ОШИБКА! Нельзя переопределить статический метод
    public static void staticMethod() {
        System.out.println("Статический метод B");
    }
    
    @Override
    public void instanceMethod() {
        System.out.println("Экземплярный метод B");
    }
}

public class Main {
    public static void main(String[] args) {
        A ref = new B();
        
        // Вызов статического метода - определяется по ТИПУ ССЫЛКИ (A)
        ref.staticMethod();      // Статический метод A
        
        // Вызов экземплярного метода - определяется по ТИПУ ОБЪЕКТА (B)
        ref.instanceMethod();    // Экземплярный метод B
        
        // Правильный вызов статических методов - через класс
        A.staticMethod();   // Статический метод A
        B.staticMethod();   // Статический метод B
    }
}
