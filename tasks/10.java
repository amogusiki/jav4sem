// 1) а1 будет присвоен указатель на а2.
// 2) 
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        int[] numbers = {5, 2, 8, 1, 9};
        int[] copy = {5, 2, 8, 1, 9};

        // toString - преобразует массив в строку
        System.out.println(Arrays.toString(numbers)); // [5, 2, 8, 1, 9]

        // sort - сортировка
        Arrays.sort(numbers);

        // binarySearch - бинарный поиск (массив должен быть отсортирован)
        int index = Arrays.binarySearch(numbers, 5);
        System.out.println("Индекс числа 5: " + index); // 2

        // equals - сравнение массивов
        boolean isEqual = Arrays.equals(numbers, copy);
        System.out.println("Массивы равны: " + isEqual); // false (разные порядки)

        // compare - лексикографическое сравнение (Java 9+)
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 4};
        int comparison = Arrays.compare(arr1, arr2);
        System.out.println("Сравнение: " + comparison); // -1 (arr1 < arr2)
    }
}
