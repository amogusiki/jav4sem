//изучил и научился.
class Calculator {
    /**
     * @param a первый параметр
     * @param b второй параметр
     * @return результат сложения
     */
    public static int sum(int a, int b) {
        return a + b;
    }
}
public class Main {
    public static void main(String[] args){
        System.out.println(Calculator.sum(1,2));
    }
}
