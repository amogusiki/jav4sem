// 1. @Override - проверяет, что метод действительно переопределяет родительский
class Parent {
    void method() {}
}
class Child extends Parent {
    @Override
    void method() {}  // Ошибка если method() не существует в Parent
}

// 2. @Deprecated - помечает элемент как устаревший
class OldClass {
    @Deprecated
    void oldMethod() {
        System.out.println("Устаревший метод");
    }
}
// При использовании появится предупреждение

// 3. @SuppressWarnings - подавляет предупреждения компилятора
@SuppressWarnings("unchecked")
public void method() {
    List list = new ArrayList();  // unchecked предупреждение подавлено
}
