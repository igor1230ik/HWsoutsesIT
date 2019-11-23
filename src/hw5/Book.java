package hw5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Класс для хранения переменных для выполнения задачи
class Books implements Comparable<Books> {
    String id;
    String name;                // Название книги
    String author;              // Имя Автора
    String publishing_house;    // Издательство
    int year;                // Год издания
    String num_peages;          // Количество страниц
    String prise;               // Цена
    String cover1;               // Тип переплета: 0-мягкий, 1-твердый


    //   Конструктор для указания параметров
    Books(String id, String name, String author, String publishing_house, int year,
          String num_peages, String prise, String cover1) {
        System.out.println("Передача параметров");
        this.id = id;
        this.name = name;                              // Название книги
        this.author = author;                          // Имя Автора
        this.publishing_house = publishing_house;                 // Издательство
        this.year = year;                              // Год издания
        this.num_peages = num_peages;                     // Количество страниц
        this.prise = prise;                           // Цена
        this.cover1 = cover1;                         // Тип переплета: 0-мягкий, 1-твердый

    }

    @Override
    public String toString() {
        return "Books{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishing_house='" + publishing_house + '\'' +
                ", year='" + year + '\'' +
                ", num_peages='" + num_peages + '\'' +
                ", prise='" + prise + '\'' +
                ", cover1='" + cover1 + '\'' +
                '}';
    }

    @Override
    public int compareTo(Books result) {

        if (this.name.compareTo(result.name) != 0) {
            return this.name.compareTo(result.name);
        } else if (this.author.compareTo(result.author) != 0) {
            return this.author.compareTo(result.author);
        }
        return 0;
    }
}
public class Book {
    public static void main(String[] args) {


//  Первая книга
        Books myBooks = new Books("1", "Java полное руководство. 10-е издание 1", "Герберт Шилдт",
                "Диалектика", 2019, "1 487", "1 200", "1");
//  Вторая книга
        Books myBooks_2 = new Books("1", "Java полное руководство. 10-е издание 5", "Герберт Шилдт",
                "Диалектика", 2018, "1 487", "1 200", "1");
// Третья книга
        Books myBooks_3 = new Books("1", "Java полное руководство. 10-е издание a", "Герберт Шилдт",
                "Диалектика", 2017, "1 487", "1 200", "1");
// Четвертая книга
        Books myBooks_4 = new Books("1", "Java полное руководство. 10-е издание b", "Герберт Шилдт",
                "Диалектика", 2016, "1 487", "1 200", "1");
//  Пятая книга
        Books myBooks_5 = new Books("2", "Java. Методы программировани", "И.Н. Блинов",
                "Четыре четверти", 2013, "897", "899", "0");
// Шестая книга
        Books myBooks_6 = new Books("3", "Java полное руководство. 6-е издание", "Герберт Шилдт",
                "Диалектика", 2013, "1 487", "1 000", "1");

        List<Books> booksList = new ArrayList<>();
        booksList.add(myBooks);
        booksList.add(myBooks_2);
        booksList.add(myBooks_3);
        booksList.add(myBooks_4);
        booksList.add(myBooks_5);
        booksList.add(myBooks_6);

        Collections.sort(booksList);

        for (Books books : booksList) {
            if (books.year > 2013) {
                System.out.print("Год выпуска книги: " + books.year + ", ");
            }
            if (books.author.equalsIgnoreCase("Герберт Шилдт"))
                System.out.print("Автор: " + books.name);
            System.out.println();


        }
        for (Books books : booksList) {
            if (books.publishing_house.equalsIgnoreCase("Диалектика")) {
                System.out.println("Книги изнательства Диалектика " + booksList);
            }
        }
    }
}
