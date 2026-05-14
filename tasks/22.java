//1
class Parent {
    protected int field = 10;
    
    public Parent() {
        System.out.println("Конструктор Parent");
    }
    
    public Parent(int value) {
        System.out.println("Конструктор Parent с параметром: " + value);
    }
    
    public void method() {
        System.out.println("Метод Parent");
    }
}

class Child extends Parent {
    protected int field = 20;
    
    // 1. Вызов конструктора суперкласса
    public Child() {
        super();  // вызов Parent()
        System.out.println("Конструктор Child");
    }
    
    public Child(int value) {
        super(value);  // вызов Parent(int)
        System.out.println("Конструктор Child с параметром");
    }
    
    public void method() {
        // 2. Доступ к методу суперкласса
        super.method();  // вызов метода Parent
        
        // 3. Доступ к полю суперкласса
        System.out.println("super.field = " + super.field);  // 10
        System.out.println("this.field = " + this.field);    // 20
    }
}
//2
class A {
    int a;
    void method() {
        System.out.println("Метод A");
    }
}

class B extends A {
    // a и method() не определены - наследуются от A
}

class C extends B {
    void method() {
        int a = super.a;    // super.a обращается к a из A (через B)
        super.method();     // super.method() обращается к method() из A
        System.out.println("Метод C, a=" + a);
    }
}

// При вызове new C().method():
// - super.a найдет поле a в классе A (через иерархию B→A)
// - super.method() найдет метод method() в классе A
// ВЫВОД: Метод A\nМетод C, a=0
//3
class A {
    int a;
    int b;
    int c;
    int z;

    public A() {
        this(0, 0, 0);  // вызов конструктора с 3 параметрами
    }

    public A(int a) {
        this(a, 0, 0);  // вызов конструктора с 3 параметрами
    }

    public A(int a, int b) {
        this(a, b, 0);  // вызов конструктора с 3 параметрами
    }

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.z = 1;     // общая инициализация только здесь
    }
}
