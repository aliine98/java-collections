package br.com.aline.collections.list;

public class Book {
    private final String author;
    private final String title;
    private final int pubYear;

    public Book(String title, String author, int pubYear) {
        this.title = title;
        this.author = author;
        this.pubYear = pubYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPubYear() {
        return pubYear;
    }

    @Override
    public String toString() {
        return "Book {\n " +
                "  author: '" + author + '\'' +
                ", title: '" + title + '\'' +
                ", pubYear: " + pubYear +
                "\n}";
    }
}
