package HW4;

import java.util.Scanner;

public class Triangle {
    static void result(int w, int h) {
        // Выводим первую и последнюю строку прямоугольника по ширине
        for (int i = 0; i < h; i++) {
            if (i == 0 || i == h - 1) {
                for (int j = 0; j < w; j++) {
                    System.out.print("+");
                }
            } else {
                // Выводим пермую и последнюю строку прямоугольника по высоте
                for (int j = 0; j < w; j++) {
                    if (j == 0 || j == w - 1) {
                        System.out.print("+");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
// Вводим значения прямоугольника
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ширину прямоугольника");
        int width = scan.nextInt();
        int w = width;

        System.out.println("Введите высоту прямоугольника");
        int height = scan.nextInt();
        int h = height;
        // Передаем полученные значения в метод "result" для работы
        result(w, h);
    }
}
