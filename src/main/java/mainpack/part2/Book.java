package mainpack.part2;

public class Book {
    private String title;
    private Publisher publisher;
    private int year;
    private String[] authors;

    public Book(String title, Publisher publisher, int year, String[] authors) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.authors = authors;
    }

    public Book(String title, Publisher publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.authors = new String[]{};
    }

    public Book(String title, Publisher publisher, int year, String author) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.authors = new String[]{author};
    }

    public String getTitle() {
        return title;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public String[] getAuthors() {
        return authors;
    }

    public int getAuthorsCunt(){
        return authors.length;
    }

    public String getAuthors(int index){
        if (index<authors.length) {
            return authors[index];
        }
        throw new IllegalArgumentException("индекс за пределами допустимых значений");
    }

    public void setTitle(String title) {
        if (title == null)
            throw new IllegalArgumentException("название не должно быть пустой ссылкой");
        this.title = title;
    }

    public void setPublisher(Publisher publisher) {
        if (publisher == null)
            throw new IllegalArgumentException("издательство не должно быть пустой ссылкой");
        this.publisher = publisher;
    }

    public void setYear(int year) {
        if (year<=0)
            throw new IllegalArgumentException("год издательства должен быть больше нуля");
        this.year = year;
    }

    public void setAuthors(String[] authors) {
        if (authors == null)
            throw new IllegalArgumentException("массив не должен быть пустой ссылкой");
        for (String author: authors){
            if (author == null)
                throw new IllegalArgumentException("массив не должен содержать пустых ссылок");
        }
        this.authors = authors;
    }

    public void print() {
        System.out.println("название книги " + title + ", издательство " + publisher.getCity()
                + " " + publisher.getName());
        for (String author: authors){
            System.out.print(author + " ");
        }
        System.out.println(", год издания " + year);
        System.out.println();

    }



}
