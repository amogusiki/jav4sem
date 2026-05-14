//1
public class OuterClass {
    
    // public - доступен везде
    public class PublicInner {
        public void show() {
            System.out.println("PublicInner доступен всем");
        }
    }
    
    // protected - доступен в пакете и подклассам
    protected class ProtectedInner {
        public void show() {
            System.out.println("ProtectedInner доступен в пакете и подклассам");
        }
    }
    
    // default (package-private) - только внутри пакета
    class DefaultInner {
        public void show() {
            System.out.println("DefaultInner только в пакете");
        }
    }
    
    // private - только внутри OuterClass
    private class PrivateInner {
        public void show() {
            System.out.println("PrivateInner только внутри OuterClass");
        }
    }
    
    // Демонстрация доступа внутри внешнего класса
    public void testAccess() {
        PublicInner pi = new PublicInner();     // OK
        ProtectedInner protI = new ProtectedInner(); // OK
        DefaultInner di = new DefaultInner();   // OK
        PrivateInner privI = new PrivateInner(); // OK - внутри OuterClass
        privI.show();  // OK
    }
}

// В другом классе (том же пакете)
class SamePackageTest {
    public void test() {
        OuterClass outer = new OuterClass();
        
        OuterClass.PublicInner pi = outer.new PublicInner();    // OK - public
        OuterClass.ProtectedInner protI = outer.new ProtectedInner(); // OK - в пакете
        OuterClass.DefaultInner di = outer.new DefaultInner();  // OK - в пакете
        // OuterClass.PrivateInner privI = outer.new PrivateInner(); // ОШИБКА! private
    }
}
//2
public class Outer {
    private String privateField = "приватное поле";
    public String publicField = "публичное поле";
    protected String protectedField = "защищенное поле";
    String defaultField = "default поле";
    private static String staticField = "статическое поле";
    
    private void privateMethod() {
        System.out.println("Приватный метод внешнего класса");
    }
    
    public class Inner {
        // Внутренний класс имеет доступ КО ВСЕМ полям и методам внешнего!
        public void accessOuterFields() {
            System.out.println(privateField);    // OK - даже к private
            System.out.println(publicField);     // OK
            System.out.println(protectedField);  // OK
            System.out.println(defaultField);    // OK
            System.out.println(staticField);     // OK
            
            privateMethod();  // OK - даже к private методу
        }
    }
    
    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        inner.accessOuterFields();  // Все работает!
    }
}
//3
public class OuterClass {
    
    public class Inner {
        private String innerPrivate = "приватное поле inner";
        public String innerPublic = "публичное поле inner";
        protected String innerProtected = "защищенное поле inner";
        String innerDefault = "default поле inner";
        
        private void innerPrivateMethod() {
            System.out.println("Приватный метод inner");
        }
        
        public void innerPublicMethod() {
            System.out.println("Публичный метод inner");
        }
    }
    
    // Внешний класс имеет доступ ко ВСЕМ полям и методам внутреннего
    public void accessInnerFields() {
        Inner inner = new Inner();  // создаем объект внутреннего
        
        // Доступ к ЛЮБЫМ полям (включая private)
        System.out.println(inner.innerPrivate);    // OK!
        System.out.println(inner.innerPublic);     // OK
        System.out.println(inner.innerProtected);  // OK
        System.out.println(inner.innerDefault);    // OK
        
        // Доступ к ЛЮБЫМ методам (включая private)
        inner.innerPrivateMethod();  // OK!
        inner.innerPublicMethod();   // OK
    }
    
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.accessInnerFields();  // Все работает!
    }
}
