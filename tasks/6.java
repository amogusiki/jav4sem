// 1)
public class DecodeExample {
    public static void main(String[] args) {
        // Десятичное число
        Integer dec = Integer.decode("42");
        System.out.println(dec);  // 42
        
        // Шестнадцатеричное (0x или #)
        Integer hex1 = Integer.decode("0x2A");
        Integer hex2 = Integer.decode("#2A");
        System.out.println(hex1);  // 42
        System.out.println(hex2);  // 42
        
        // Восьмеричное (с 0)
        Integer oct = Integer.decode("052");
        System.out.println(oct);  // 42
        
        // С отрицательным знаком
        Integer negative = Integer.decode("-42");
        System.out.println(negative);  // -42
    }
}
// 2)
public class Main {
    public static void main(String[] args) {
        Boolean a = true;
        Boolean b = Boolean.valueOf("true");
        Boolean c = Boolean.valueOf("yes");
        Boolean d = Boolean.valueOf("0");
    }
}
// 3)
public class Main {
    public static void main(String[] args) {
        Integer number = null;
        int value = number;
    }
}
// 4)
// a1==i1 true
// b1==i1 true
// a1==b1 false потому что надо было использовать equals
// a1.equals(i1) -> true
// b1.equals(i1) -> true
// a1.equals(b1) -> true
// a2==i2 true
// b2==i2 true
// a2==b2 true
// a2.equals(i2) -> true
// b2.equals(i2) -> true
// a2.equals(b2) -> true
