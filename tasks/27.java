// Вложение класса Point в интерфейс Drawable
interface Drawable {
    class Point {  // Вложенный класс
        public void draw() {
            System.out.println("Рисуем точку");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Способ вызова: через имя интерфейса
        Drawable.Point point = new Drawable.Point();
        point.draw();  // Вызов метода
    }
}
