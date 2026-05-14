//1
class Parent {
    protected int value = 10;
    
    public Parent() {
        System.out.println("Конструктор Parent");
    }
    
    public Parent(int value) {
        this.value = value;
        System.out.println("Конструктор Parent с параметром");
    }
    
    void show() {
        System.out.println("Метод Parent");
    }
}

class Child extends Parent {
    private int value = 20;
    
    public Child() {
        super();              // вызов конструктора родителя (должен быть первым)
        System.out.println("Конструктор Child");
    }
    
    public Child(int value) {
        super(value);         // вызов конструктора Parent(int)
        System.out.println("Конструктор Child с параметром");
    }
    
    void show() {
        super.show();                  // вызов метода родителя
        System.out.println("Метод Child");
        System.out.println("super.value = " + super.value);  // 10 (родитель)
        System.out.println("this.value = " + this.value);    // 20 (свой)
    }
}
//2
class A {
    int a1;           // default (package-private) - виден в пакете
    public int a2;    // public - везде
    protected int a3; // protected - пакет + подклассы
    private int a4;   // private - ТОЛЬКО внутри A
    
    void method1() {}          // default
    public void method2() {}   // public
    protected void method3() {}// protected
    private void method4() {}  // private
}

class B extends A {
    // ДОСТУПНО:
    // - a1 (default) - если B в том же пакете
    // - a2 (public) - всегда
    // - a3 (protected) - всегда
    // - method1(), method2(), method3()
    
    // НЕДОСТУПНО:
    // - a4 (private)
    // - method4()
    
    void test() {
        a2 = 1;  // public - OK
        a3 = 2;  // protected - OK
        // a4 = 3;   // private - ОШИБКА!
        
        method2();  // public - OK
        method3();  // protected - OK
        // method4(); // private - ОШИБКА!
    }
}

class C extends B {
    // Те же правила, что и для B
    // НЕЛЬЗЯ получить доступ к private членам A
    // default члены A - только если весь пакет тот же
}
