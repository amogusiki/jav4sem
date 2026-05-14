public class OverloadOverrideExample {
    
    // ========== 1. ПЕРЕГРУЖЕННЫЕ МЕТОДЫ (overloading) ==========
    // Совпадают: имя метода, тип возвращаемого значения
    // Отличаются: параметры (количество, тип, порядок)
    
    class Calculator {
        // Версия 1: без параметров
        public int sum() {
            return 0;
        }
        
        // Версия 2: один int
        public int sum(int a) {
            return a;
        }
        
        // Версия 3: два int
        public int sum(int a, int b) {
            return a + b;
        }
        
        // Версия 4: три int
        public int sum(int a, int b, int c) {
            return a + b + c;
        }
        
        // Версия 5: double (другой тип)
        public double sum(double a, double b) {
            return a + b;
        }
        
        // Версия 6: другой порядок параметров
        public int sum(int a, double b) {
            return a + (int)b;
        }
        
        public int sum(double a, int b) {
            return (int)a + b;
        }
    }
    
    // ========== 2. ПЕРЕОПРЕДЕЛЕННЫЙ МЕТОД (overriding) ==========
    
    class Parent {
        public String getMessage() {
            return "Сообщение от Parent";
        }
        
        public Number getValue() {
            return 42;
        }
    }
    
    class Child extends Parent {
        @Override
        public String getMessage() {  // OK - полностью совпадает
            return "Сообщение от Child";
        }
        
        // ОШИБКА! Тип возвращаемого значения не совпадает
        // @Override
        // public Integer getValue() {  // Integer - подтип Number? Да, это ковариантность!
        //     return 100;
        // }
        // Начиная с Java 5, можно возвращать подтип (ковариантный тип)
        // В Java 5+: разрешено, если тип возврата - подкласс исходного типа
        
        // НО если тип НЕ является подтипом - ошибка:
        // @Override
        // public String getValue() {  // String - не подтип Number - ОШИБКА!
        //     return "ошибка";
        // }
    }
    
    // ========== 3. @Override помогает обнаружить ошибку ==========
    
    class Animal {
        public void makeSound() {
            System.out.println("Животное издает звук");
        }
    }
    
    class Cat extends Animal {
        // БЕЗ @Override - ошибка останется незамеченной
        public void makeSoud() {  // Опечатка: пропущена буква 'n'
            System.out.println("Мяу");
        }
        
        // С @Override - компилятор покажет ошибку
        @Override
        public void makeSound() {  // Правильное имя
            System.out.println("Мяу");
        }
        
        // Пример другой частой ошибки: несовпадение параметров
        // @Override
        // public void makeSound(String volume) {  // Ошибка! параметры не совпадают
        //     System.out.println("Мяу громкостью: " + volume);
        // }
    }
    
    // Еще один пример: изменение спецификатора доступа
    class ParentMethod {
        protected void doSomething() {
            System.out.println("Parent");
        }
    }
    
    class ChildMethod extends ParentMethod {
        @Override
        public void doSomething() {  // OK: public шире чем protected
            System.out.println("Child");
        }
        
        // @Override
        // private void doSomething() {  // Ошибка! private уже protected (сужает)
        //     System.out.println("Child");
        // }
    }
    
    public static void main(String[] args) {
        System.out.println("Примеры скомпилируются без ошибок (кроме закомментированных)");
    }
}

/* 
ВАЖНО о переопределении:
- Тип возврата должен совпадать или быть подтипом (ковариантность с Java 5)
- Спецификатор доступа не может быть уже (protected → private нельзя)
- Нельзя переопределять static, final, private методы
- @Override заставляет компилятор проверить, что метод действительно переопределяет родительский
*/
