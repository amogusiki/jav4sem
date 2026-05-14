// 1. Интерфейс с default и static методами
interface Vehicle {
    default void honk() {
        System.out.println("Бип-бип");
    }
    
    static void info() {
        System.out.println("Это транспортное средство");
    }
}

class Car implements Vehicle {
    // Можно переопределить default метод
    @Override
    public void honk() {
        System.out.println("Машина сигналит: Бииип!");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.honk();              // вызов переопределенного default метода
        Vehicle.info();          // вызов статического метода через интерфейс
    }
}

// 2. Конфликт одинаковых default методов
interface A {
    default void print() { System.out.println("A"); }
}

interface B {
    default void print() { System.out.println("B"); }
}

class C implements A, B {
    // Обязательно переопределить конфликтующий метод
    @Override
    public void print() {
        A.super.print();  // можно вызвать конкретную реализацию
        System.out.println("C");
    }
}
