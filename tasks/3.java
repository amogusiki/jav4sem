1)
public class Main {
    public static void main(String[] args){
        byte a = 123;
        short b = 12345;
        int c = -1234567;
        long d = 1234567890L;
        float e = 0.123f;
        double f = -0.123781253871123;
        char g = 'A';
        boolean h = false;
    }
}
2)
public class Main {
    public static void main(String[] args){
        System.out.println("\u0414\u0438\u043C\u0430");
    }
}
3)
java: cannot find symbol
  symbol:   variable b
  location: class Main
b хранит свое значение только внутри скобок
4)
public class Main {
    public static void main(String[] args){
        String a = "darova";
        int b = 4;
        System.out.println(a+b);
    }
}
5)
public class Main {
    public static void main(String[] args){
        byte a = 1;
        int b = -12312;
        int c = a+b;
        System.out.println(c);
    }
}
ну все нормально работает не знаю что тут объяснять a переконвертировалось в int
6)
int i = 100;
byte b = (byte) i;

double a = 0.1231;
float b = (float)a;
7)
b - ошибка тк не конвертировали 
c = -126 тк вышли за границу применения byte
d - ошибка тк не конвертировали 
8)
public class Main {
    public static void main(String[] args){
        var text = "Привет";           // String
        var number = 42;                // int
        var price = 99.99;
        System.out.println(text + number + price);
    }
}
