package br.com.aline.collections.list;

import java.util.ArrayList;
import java.util.List;

public class BooksCatalog {
    private final List<Book> bookList = new ArrayList<>();

    void addBook(String title, String author, int pubYear) {
        this.bookList.add(new Book(title, author, pubYear));
    }

    List<Book> searchByAuthor(String author) {
        List<Book> matchedBooks = new ArrayList<>();

        for (Book book : bookList) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                matchedBooks.add(book);
            }
        }

        return matchedBooks;
    }

    Book searchByTitle(String title) {
        Book matchedBook = null;

        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                matchedBook = book;
                break;
            }
        }

        return matchedBook;
    }

    List<Book> searchByPubYear(int year) {
        List<Book> matchedBooks = new ArrayList<>();

        for (Book book : bookList) {
            if (book.getPubYear() == year) {
                matchedBooks.add(book);
            }
        }

        return matchedBooks;
    }

    List<Book> searchByYearInterval(int initialYear, int finalYear) {
        List<Book> matchedBooks = new ArrayList<>();

        for (Book book : bookList) {
            if (book.getPubYear() >= initialYear && book.getPubYear() <= finalYear) {
                matchedBooks.add(book);
            }
        }

        return matchedBooks;
    }
}
