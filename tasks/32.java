// 1. Десять методов StringBuilder / StringBuffer
public class StringBuilderExample {
    public static void main(String[] args) {
        // StringBuilder (непотокобезопасный, но быстрее)
        StringBuilder sb = new StringBuilder("Hello");
        
        // append() - добавляет в конец
        sb.append(" World");
        System.out.println(sb); // Hello World
        
        // insert() - вставляет по индексу
        sb.insert(5, ",");
        System.out.println(sb); // Hello, World
        
        // replace() - заменяет часть строки
        sb.replace(7, 12, "Java");
        System.out.println(sb); // Hello, Java
        
        // delete() - удаляет часть строки
        sb.delete(5, 6);
        System.out.println(sb); // Hello Java
        
        // reverse() - переворачивает строку
        System.out.println(sb.reverse()); // avaJ olleH
        System.out.println(sb.reverse()); // Hello Java
        
        // charAt() / setCharAt() - получение/установка символа
        sb.setCharAt(0, 'h');
        System.out.println(sb); // hello Java
        
        // substring() - вырезает подстроку
        String sub = sb.substring(6);
        System.out.println(sub); // Java
        
        // indexOf() / lastIndexOf() - поиск индекса
        System.out.println(sb.indexOf("Java")); // 6
        System.out.println(sb.lastIndexOf("a")); // 10
        
        // length() / capacity() - длина и вместимость
        System.out.println("Length: " + sb.length());     // 10
        System.out.println("Capacity: " + sb.capacity()); // 21
        
        // toString() - преобразование в String
        String result = sb.toString();
        System.out.println(result); // hello Java
    }
}

// 2. Преобразование между String, StringBuilder, StringBuffer
public class ConversionExample {
    public static void main(String[] args) {
        
        // String → StringBuilder / StringBuffer
        String str = "Hello";
        StringBuilder sb = new StringBuilder(str);
        StringBuffer sBuf = new StringBuffer(str);
        
        // StringBuilder / StringBuffer → String
        String fromBuilder = sb.toString();
        String fromBuffer = sBuf.toString();
        
        // StringBuilder → StringBuffer (через String)
        StringBuffer sBufFromBuilder = new StringBuffer(sb.toString());
        
        // StringBuffer → StringBuilder (через String)
        StringBuilder sbFromBuffer = new StringBuilder(sBuf.toString());
        
        // StringBuffer → StringBuilder (append)
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sBuf);
        
        System.out.println("Все преобразования выполнены");
    }
}
