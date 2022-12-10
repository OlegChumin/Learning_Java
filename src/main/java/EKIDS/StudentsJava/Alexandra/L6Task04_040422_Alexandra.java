package EKIDS.StudentsJava.Alexandra;

import java.time.LocalDate;
import java.util.Date;

public class L6Task04_040422_Alexandra {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Гарри Потер и философский камень" ;
        book1.author = "Дж.К.Роулинг";
        book1.year_of_publishing = LocalDate.of(2020,2,5) ;
        book1.country = "Россия";
        book1.age_category = "8+";
        book1.language = "Русский";
        book1.genre = "Фэнтези";
        book1.number_of_pages = 432;
        book1.circulation = 35000;
        System.out.println("Название книги: " + book1.title + ", " + "Автор: " + book1.author + ", " + "Год издания: " + book1.year_of_publishing + ", " + "Страна издания: " + book1.country + ", " + "Возрастная категория: " + book1.age_category +", " + "Язык: " + book1.language +", " + "Жанр: " + book1.genre + ", " + "Количество страниц: " + book1.number_of_pages +", " + "Тираж: " + book1.circulation);

        Book book2 = new Book();
        book2.title = "Принц из парижа" ;
        book2.author = "Екатерина неволина";
        book2.year_of_publishing = LocalDate.of(2014,11,6) ;
        book2.country = "Россия";
        book2.age_category = "10+";
        book2.language = "Русский";
        book2.genre = "Романтические повести";
        book2.number_of_pages = 192;
        book2.circulation = 3000;
        System.out.println("Название книги: " + book2.title + ", " + "Автор: " + book2.author + ", " + "Год издания: " + book2.year_of_publishing + ", " + "Страна издания: " + book2.country + ", " + "Возрастная категория: " + book2.age_category +", " + "Язык: " + book2.language +", " + "Жанр: " + book2.genre + ", " + "Количество страниц: " + book2.number_of_pages +", " + "Тираж: " + book2 .circulation);

        Book book3 = new Book();
        book3.title = "Гороскопы" ;
        book3.author = "В.А.Барановский";
        book3.year_of_publishing = LocalDate.of(2003,12,30) ;
        book3.country = "Беларусь";
        book3.age_category = "7+";
        book3.language = "Русский";
        book3.genre = "Научная фантастика";
        book3.number_of_pages = 352;
        book3.circulation = 5050;
        System.out.println("Название книги: " + book3.title + ", " + "Автор: " + book3.author + ", " + "Год издания: " + book3.year_of_publishing + ", " + "Страна издания: " + book3.country + ", " + "Возрастная категория: " + book3.age_category +", " + "Язык: " + book3.language +", " + "Жанр: " + book3.genre + ", " + "Количество страниц: " + book3.number_of_pages +", " + "Тираж: " + book3 .circulation);

        Book book4 = new Book();
        book4.title = "Победители драконов" ;
        book4.author = "Народное творчество";
        book4.year_of_publishing = LocalDate.of(1993,5,21) ;
        book4.country = "Россия";
        book4.age_category = "7+";
        book4.language = "Русский";
        book4.genre = "Детский триллер";
        book4.number_of_pages = 192;
        book4.circulation = 100000;
        System.out.println("Название книги: " + book4.title + ", " + "Автор: " + book4.author + ", " + "Год издания: " + book4.year_of_publishing + ", " + "Страна издания: " + book4.country + ", " + "Возрастная категория: " + book4.age_category +", " + "Язык: " + book4.language +", " + "Жанр: " + book4.genre + ", " + "Количество страниц: " + book4.number_of_pages +", " + "Тираж: " + book4 .circulation);
    }
}
class Book {
    String title;            /** Название*/
    String author;           /** Автор */
    LocalDate year_of_publishing; /** Год издания */
    String country;          /** Страна издания */
    String age_category;     /** Возрастная категория */
    String language;         /** Язык */
    String genre;            /** Жанр */
    int number_of_pages;     /** Количество страниц */
    int circulation;         /** Тираж */
}
