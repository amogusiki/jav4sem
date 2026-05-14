public class A {
    // Метод для Integer
    public void printNum(Integer i) {
        System.out.printf("Integer = %d%n", i);
    }
    
    // Метод для int
    public void printNum(int i) {
        System.out.printf("int = %d%n", i);
    }
    
    // Метод для Float
    public void printNum(Float f) {
        System.out.printf("Float = %.4f%n", f);
    }
    
    // Метод для Number (родитель всех числовых оберток)
    public void printNum(Number n) {
        System.out.println("Number=" + n);
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        
        // Массив типа Number содержит разные объекты
        Number[] num = {new Integer(1), 11, 1.11f, 11.11};
        
        // (1) ЦИКЛ - переменная n имеет тип Number
        for (Number n : num) {
            // ВСЕГДА вызывается printNum(Number n)
            //因为编译期只知道 n 是 Number，不管实际是什么对象
            a.printNum(n);  // 4 раза -> Number=...
        }
        
        System.out.println("---");
        
        // (2) ПРЯМЫЕ ВЫЗОВЫ - тип аргумента известен явно
        
        // Аргумент Integer -> выбирается самый конкретный: printNum(Integer)
        a.printNum(new Integer(1));  // Integer = 1
        
        // Аргумент int (примитив) -> printNum(int)
        a.printNum(11);              // int = 11
        
        // Аргумент float (примитив) -> автоматически в Float? Нет!
        // Сначала ищет printNum(float) - нет
        // Потом расширение до Float (обертка) -> printNum(Float) ЕСТЬ!
        a.printNum(1.11f);           // Float = 1.1100
        
        // Аргумент double -> printNum(double) нет
        // Расширение до Number -> printNum(Number)
        a.printNum(11.11);           // Number=11.11
    }
}

/* ВЫВОД:
Number=1
Number=11
Number=1.11
Number=11.11
---
Integer = 1
int = 11
Float = 1.1100
Number=11.11
*/
