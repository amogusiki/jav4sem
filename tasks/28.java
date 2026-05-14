// 1. interface без модификатора (package-private)
interface PackagePrivateInterface {
    // Доступен только внутри своего пакета
}

// 2. public interface
public interface PublicInterface {
    // Доступен везде
}

// 3. protected interface - НЕ СУЩЕСТВУЕТ на уровне интерфейса
// protected interface ProtectedInterface { } // ОШИБКА! Интерфейс не может быть protected

// 4. private interface - существует только для вложенных интерфейсов
public class Outer {
    private interface PrivateInterface {
        // Доступен только внутри класса Outer
    }
}
