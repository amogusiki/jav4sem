class A {
    public final int a;
    public A(){
        a=1;
    }
    public A(int b){
        a=b;
    }
}
public class Main {
    public static void main(String[] args){
        A A = new A();
        System.out.println(A.a);
    }
}
