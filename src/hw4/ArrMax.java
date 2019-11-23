package HW4;
/* написать метод, который принимает массив целых чисел и возвращает максимальное
 */
public class ArrMax {
    // Метод для вычисления максимального значения массива.
    static int number_max(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(max,arr[i]);
        }

        return max;
    }

    public static void main(String[] args) {
        // Инициализация массива
        int arr[] = new int[10];
        int rand = 0;
        // Заполнение массива случайными числами
        for (int i = 0; i < 10; i++) {
            rand = (int) (Math.random() * 100);
            System.out.print(rand + " ");
            arr[i] = rand;
        }
        System.out.println();
        // Выводим результат вычисления в методе "number_max".
        System.out.println("Максимальное значение в массиве: " + number_max(arr));
    }
}
