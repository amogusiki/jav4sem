// 1)
public class AllOperatorsExample {
    public static void main(String[] args) {
        // = - присваивание
        int a = 10;
        
        // += -= *= /= %=
        a += 5;  // a = a + 5  (15)
        a -= 3;  // a = a - 3  (12)  
        a *= 2;  // a = a * 2  (24)
        a /= 4;  // a = a / 4  (6)
        a %= 2;  // a = a % 2  (0)
        
        // ?: - тернарный оператор
        int b = a > 5 ? 100 : 200;  // 200 (a=0)
        
        // && - логическое И, || - логическое ИЛИ
        boolean bool1 = (a > 0) && (b < 100);  // false
        boolean bool2 = (a > 0) || (b < 100);  // false
        
        // & | ^ - битовые операции (для чисел)
        int x = 5;  // 0101
        int y = 3;  // 0011
        int and = x & y;  // 0001 (1)
        int or = x | y;   // 0111 (7)
        int xor = x ^ y;  // 0110 (6)
        
        // == - сравнение
        boolean isEqual = (a == b);  // false
        
        // > >= < <=
        boolean greater = a > b;      // false
        boolean greaterEqual = a >= b; // false  
        boolean less = a < b;          // true
        boolean lessEqual = a <= b;    // true
        
        // >> >>> << - битовые сдвиги
        int shiftRight = 16 >> 2;      // 16 / 4 = 4
        int shiftRightUnsigned = -16 >>> 2; // беззнаковый сдвиг
        int shiftLeft = 3 << 2;        // 3 * 4 = 12
        
        // + - сложение
        int sum = a + b;  // 0 + 200 = 200
        
        // - * / %
        int sub = b - a;    // 200 - 0 = 200
        int mult = b * a;   // 200 * 0 = 0
        int div = b / 2;    // 100
        int mod = b % 3;    // 200 % 3 = 2
        
        // ++ -- ~ !
        int c = 5;
        System.out.println(c++);  // постфикс: 5 (потом c=6)
        System.out.println(++c);  // префикс: c=7 (потом вывод 7)
        System.out.println(c--);  // постфикс: 7 (потом c=6)
        System.out.println(--c);  // префикс: c=5 (потом вывод 5)
        
        int d = ~5;        // побитовое НЕ: -6
        boolean not = !true;  // false
        
        // ( ) [ ] - скобки и индексы
        int[] array = new int[3];
        array[0] = (a + b) * 2;
        
        // С String
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + " " + s2;  // конкатенация строк
        s1 += "!";  // s1 = "Hello!"
        
        System.out.println("Результаты: " + s3 + ", " + and + ", " + or);
    }
}
// 2)
public class InstanceofExample {
    public static void main(String[] args) {
        String text = "Hello";
        Integer number = 42;
        String nullString = null;
        
        System.out.println(text instanceof String);      // true
        System.out.println(text instanceof Object);      // true (String наследник Object)
        
        // Несовместимые типы - ошибка компиляции
        // System.out.println(text instanceof Integer); // Ошибка
        
        // null всегда false
        System.out.println(nullString instanceof String);  // false
        System.out.println(null instanceof Object);        // false
    }
}
