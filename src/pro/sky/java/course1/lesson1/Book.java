package pro.sky.java.course1.lesson1;

public class Book {
    private String title;
    private Author author;
    private int publishedYear;

    public Book(String title, Author author, int publishedYear) {
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }
}
