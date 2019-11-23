package HW4;
// ЗАДАНИЕ: написать метод, который принимает массив строк и возвращает массив строк в которых больше 3 символов
public class StrArr {
    // Метод для вічисления значений массива в которых больше 3-х символов.
    static String[] arr(String[] linearr) {
        int numStr = 0;
        int sumStr = 0;
        int j = 0;
// Нахождение колличества значений в массиве.
        for (int i = 0; i < linearr.length; i++) {
            numStr = linearr[i].length();
            System.out.print(numStr + " ");

            if (numStr > 3) {
                sumStr = sumStr + 1;   // Колличество нужных значений в массиве.
            }
        }

        System.out.println("\n" + "length 1 arr = " + linearr.length + " summ = " + sumStr);
// Создание второго массива для хранения необходимых значений.
        String lineArr2[] = new String[sumStr];
// Инициализация значений в массив.
        for (int i = 0; i < linearr.length; i++) {
            numStr = linearr[i].length();
            if (numStr > 3) {
                lineArr2[j] = linearr[i];
                j++;
            }
        }
        return lineArr2;
    }


    public static void main(String[] args) {

// Массив строк для нахождения строки со значениями больше 3-х символов.
        String linearr[] = {"реализовать", "метод", ",", "который", "вернет", "количество",
                "слов", "в", "строке", "текста" };

// Вывод массива строк со значениями больше 3-х символов.
        for (String s : arr(linearr)) {
            System.out.print(s + " ");
        }

    }
}
