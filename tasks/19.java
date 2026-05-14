// ========== 1. Перечисление с инициализацией элементов ==========
enum Planet {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6);
    
    private final double mass;      // масса в кг
    private final double radius;    // радиус в м
    
    // Конструктор - вызывается для каждой константы
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }
    
    public double getMass() { return mass; }
    public double getRadius() { return radius; }
    public double getSurfaceGravity() {
        final double G = 6.67430e-11;
        return G * mass / (radius * radius);
    }
}

// ========== 2. Перечисление с дополнительным методом ==========
enum Operation {
    PLUS {
        @Override
        public double apply(double a, double b) {
            return a + b;
        }
    },
    MINUS {
        @Override
        public double apply(double a, double b) {
            return a - b;
        }
    },
    MULTIPLY {
        @Override
        public double apply(double a, double b) {
            return a * b;
        }
    },
    DIVIDE {
        @Override
        public double apply(double a, double b) {
            if (b == 0) throw new ArithmeticException("На ноль делить нельзя");
            return a / b;
        }
    };
    
    // Абстрактный метод - каждая константа реализует по-своему
    public abstract double apply(double a, double b);
    
    // Обычный метод
    public void printFormula(double a, double b) {
        System.out.println(this.name() + " " + a + " " + b + " = " + apply(a, b));
    }
}

public class EnumExample {
    public static void main(String[] args) {
        // Пример 1: Planet
        System.out.println("--- Планеты ---");
        for (Planet p : Planet.values()) {
            System.out.printf("%s: масса=%.2e, гравитация=%.2f м/с²%n",
                p.name(), p.getMass(), p.getSurfaceGravity());
        }
        
        // Пример 2: Operation
        System.out.println("\n--- Операции ---");
        Operation.PLUS.printFormula(10, 5);
        Operation.MINUS.printFormula(10, 5);
        Operation.MULTIPLY.printFormula(10, 5);
        Operation.DIVIDE.printFormula(10, 5);
    }
}

/* ВЫВОД:
--- Планеты ---
MERCURY: масса=3.30e+23, гравитация=3.70 м/с²
VENUS: масса=4.87e+24, гравитация=8.87 м/с²
EARTH: масса=5.98e+24, гравитация=9.80 м/с²
MARS: масса=6.42e+23, гравитация=3.71 м/с²

--- Операции ---
PLUS 10.0 5.0 = 15.0
MINUS 10.0 5.0 = 5.0
MULTIPLY 10.0 5.0 = 50.0
DIVIDE 10.0 5.0 = 2.0
*/
