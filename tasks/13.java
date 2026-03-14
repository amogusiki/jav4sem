class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
}
public class Main {
    public static void main(String[] args){
        A.printVars();

        A a = new A();
        a.printVars();

        A b = null;
        b.printVars();
    }
}
