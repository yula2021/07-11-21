

package org.itstep;
import java.awt.print.Book;
import java.text.ParseException;
import java.util.ArrayList;

//Book: id, название, автор, издательство, год издания, количество страниц, цена, тип переплёта.
//Вывести: а) список книг заданного автора,
// б) список книг, выпущенных издательством,
// в) список книг, выпущенных после заданного года.

public class BookZ {
    public static void main(String[] args) throws ParseException {
        ArrayList<Book> books = new ArrayList<>();

            Book book1 = new Book(100501, "Как закалялась сталь", "Н.Островский", "Молодая гвардия", 1986, 220, 10.19, "типографский переплёт");
            books.add(book1);
            System.out.println(book1.toString());
            Book book2 = new Book(101003, "Рассказы", "Н.Носов", "Лабиринт", 1995, 156, 12.25, "типографский переплёт");
            books.add(book2);
            System.out.println(book2.toString());
            Book book3 = new Book(103015, "Вождь краснокожих", "О.Генри", "Аст", 2012, 204, 15.72, "типографский переплёт");
            books.add(book3);
            System.out.println(book3.toString());
            Book book4 = new Book(105110, "Дочь Монтесумы", "Генри Райдер Хаггард", "Лира", 2015, 480, 22.99, "французский переплёт");
            books.add(book4);
            System.out.println(book4.toString());
            Book book5 = new Book(105318, "Властелин колец", "Джон Р.Р.Толкин", "Аст", 2010, 418, 31.99, "французский переплёт");
            books.add(book5);
            System.out.println(book5.toString());
            Book book6 = new Book(105344, "Хоббит", "Джон Р.Р.Толкин", "Аст", 2011, 386, 35.99, "французский переплёт");
            books.add(book6);
            System.out.println(book6.toString());
            Book book7 = new Book(108002, "Живая шляпа", "Н.Носов", "Детская литература", 2002, 106, 11.22, "типографский переплёт");
            books.add(book7);
            System.out.println(book7.toString());


        //список книг, выпущенных издательством:
        String pbl = "Аст";
            for (Book bookTmp: books) {
            if (pbl.equals(bookTmp.getPublisher().equals(pbl)))
                    System.out.println("Список книг, выпущенных издательством " + pbl + ": " + bookTmp.toString());
            }
    }


        static class Book {
            private int id;
            private String title;
            private String author;
            private String publisher;
            private int publishingYear;
            private int pagesNumber;
            private double price;
            private String bindingType;

            public Book(int id, String title, String author, String publisher, int publishingYear,
                        int pagesNumber, double price, String bindingType) {
                this.id = id;
                this.title = title;
                this.author = author;
                this.publisher = publisher;
                this.publishingYear = publishingYear;
                this.pagesNumber = pagesNumber;
                this.price = price;
                this.bindingType = bindingType;
            }


            public String toString() {
                String result = String.format("id: %d;%nНаименование: \"%s\";%nАвтор: %s;%nИздательство: \"%s\";%n" +
                                "Год издания: %s;%nКоличество страниц: %s;%nЦена: %s руб.;%nТип переплёта: %s.%n",
                        id, title, author, publisher, publishingYear, pagesNumber, price, bindingType);
                return result;
            }

            public int getId() {
                return id;
            }

            public String getTitle() {
                return title;
            }

            public String getAuthor() {
                return author;
            }

            public String getPublisher() {
                return publisher;
            }

            public int getPublishingYear() {
                return publishingYear;
            }

            public int getPagesNumber() {
                return pagesNumber;
            }

            public double getPrice() {
                return price;
            }

            public String getBindingType() {
                return bindingType;
            }

            public void setId(int id) {
                this.id = id;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public void setPublisher(String publisher) {
                this.publisher = publisher;
            }

            public void setPublishingYear(int publishingYear) {
                this.publishingYear = publishingYear;
            }

            public void setPagesNumber(int pagesNumber) {
                this.pagesNumber = pagesNumber;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            public void setBindingType(String bindingType) {
                this.bindingType = bindingType;
            }
        }
    }

