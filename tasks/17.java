import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        // ========== 1. instanceof с generic-классами ==========
        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        Wrapper<String> stringWrapper = new Wrapper<>();
        
        // НЕЛЬЗЯ: проверять конкретный параметр
        // System.out.println(strings instanceof List<String>); // Ошибка!
        
        // МОЖНО: только сырой тип (raw type) или wildcard
        System.out.println(strings instanceof List);        // true
        System.out.println(integers instanceof List<?>);    // true
        System.out.println(stringWrapper instanceof Wrapper);      // true
        System.out.println(stringWrapper instanceof Wrapper<?>);   // true
        
        // ========== 2. <? extends T> и <? super T> ==========
        List<Integer> ints = new ArrayList<>();
        List<Number> nums = new ArrayList<>();
        List<Object> objs = new ArrayList<>();
        
        ints.add(1);
        ints.add(2);
        
        // <? extends T> - Producer Extends (читаем, но не пишем)
        System.out.println("\n--- <? extends Number> ---");
        printNumbers(ints);  // List<Integer> подходит (Integer extends Number)
        printNumbers(nums);  // List<Number> подходит
        
        // <? super T> - Consumer Super (пишем, читаем только как Object)
        System.out.println("\n--- <? super Integer> ---");
        addIntegers(nums);   // List<Number> подходит (Number super Integer)
        addIntegers(objs);   // List<Object> подходит
        // addIntegers(ints); // ОШИБКА! Integer не super Integer
    }
    
    // <? extends T> - можно ТОЛЬКО читать (получать) данные
    public static void printNumbers(List<? extends Number> list) {
        for (Number n : list) {      // читаем как Number
            System.out.println(n);
        }
        // list.add(42);             // ОШИБКА! нельзя писать
        list.add(null);              // только null разрешен
    }
    
    // <? super T> - можно ТОЛЬКО писать (класть) данные
    public static void addIntegers(List<? super Integer> list) {
        list.add(1);                 // можно писать Integer
        list.add(2);
        // Integer i = list.get(0);  // ОШИБКА! нельзя читать как Integer
        Object obj = list.get(0);    // можно читать только как Object
    }
}

class Wrapper<T> {
    private T item;
    public void setItem(T item) { this.item = item; }
    public T getItem() { return item; }
}

/* ВЫВОД:
true
true
true
true

--- <? extends Number> ---
1
2

--- <? super Integer> ---
*/
