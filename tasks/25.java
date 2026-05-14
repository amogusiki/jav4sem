import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String passportId;
    
    public Person(String name, int age, String passportId) {
        this.name = name;
        this.age = age;
        this.passportId = passportId;
    }
    
    // Геттеры
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPassportId() { return passportId; }
    
    @Override
    public boolean equals(Object obj) {
        // 1. Рефлексивность: x.equals(x) должно быть true
        if (this == obj) return true;
        
        // 2. Сравнение с null: x.equals(null) должно быть false
        if (obj == null) return false;
        
        // 3. Проверка типа (класс должен совпадать)
        if (getClass() != obj.getClass()) return false;
        
        // 4. Приведение типа после проверки
        Person other = (Person) obj;
        
        // 5. Сравнение значимых полей
        return age == other.age &&
               Objects.equals(name, other.name) &&
               Objects.equals(passportId, other.passportId);
    }
    
    @Override
    public int hashCode() {
        // Контракт: если equals() true, hashCode() должны быть равны
        return Objects.hash(name, age, passportId);
    }
    
    public static void main(String[] args) {
        Person p1 = new Person("Дима", 25, "AB123");
        Person p2 = new Person("Дима", 25, "AB123");
        Person p3 = new Person("Дима", 30, "AB123");
        
        System.out.println(p1.equals(p2));  // true
        System.out.println(p1.equals(p3));  // false
        System.out.println(p1.equals(null)); // false
        System.out.println(p1.equals(p1));  // true
    }
}

/*
СОГЛАШЕНИЯ ДЛЯ equals():

1. Рефлексивность: x.equals(x) → true
2. Симметричность: x.equals(y) → true тогда и только тогда y.equals(x) → true
3. Транзитивность: если x.equals(y) = true и y.equals(z) = true, то x.equals(z) = true
4. Постоянство: повторные вызовы дают одинаковый результат (если объекты не изменились)
5. x.equals(null) → false

ВАЖНО:
- Всегда переопределяйте hashCode() вместе с equals()
- Не сравнивайте поля с разными типами
- Не используйте getClass() для проверки типа в иерархиях (может нарушать симметричность)
  (Вместо этого иногда используют instanceof)
*/
