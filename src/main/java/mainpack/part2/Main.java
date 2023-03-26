package mainpack.part2;

public class Main {
    public static void main(String[] args) {
        Publisher prospect = new Publisher("Проспект", "Москва");
        Publisher piter = new Publisher("Питер", "Санкт-Петербург");
        Publisher bhv = new Publisher("БХВ", "Санкт-Петебург");
        Publisher kiev = new Publisher("Диалектика", "Киев");

        Book[] books = new Book[] {
                new Book("Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных",
                        piter, 2018, new String[]{ "Седжвик Роберт", "Уэйн Кевин"}),
                new Book("Разработка требований к программному обеспечению. 3-е издание, дополненное", bhv, 2019, "Вигерс Карл"),
                new Book("Java. Полное руководство, 10-е издание", kiev, 2018, "Шилдт Герберт"),
                new Book("C/C++. Процедурное программирование", bhv, 2017, "Полубенцева М.И."),
                new Book("Конституция РФ", prospect, 2020)

        };

        for (Book book: books){
            book.print();
        }

        bhv.setCity("Санкт-Петербург");

        for (Book book: books){
            book.print();
        }

    }

}
