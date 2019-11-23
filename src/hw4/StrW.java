package HW4;
// ЗАДАНИЕ: реализовать метод, который вернет количество слов в строке текста
public class StrW {
    // Метод для нахождения количества слов в предложении
    public static int strLine() {
        int str = 1;
        String q = " ";
        String line = "    реализовать метод, который вернет количество слов в строке текста".trim();
// для подсчета количества строк ищем сумму пробелов между строк +1.
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                str = str + 1;
            }
        }
        return str;
    }


    public static void main(String[] args) {
// Вывод полученного результата.
        System.out.println("Колличество слов в строке = " + strLine());

    }
}
