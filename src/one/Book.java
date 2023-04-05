package one;

import java.util.Objects;

public class Book {
    private final String bookName;
    private int publishingYear;
    private final Author author;

    public Book(String bookName, int publishingYear, Author author) {
        this.bookName = bookName;
        this.publishingYear = publishingYear;
        this.author = author;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override

    public String toString() {
        return "Название книги: " + this.bookName + " Год издания: " + this.publishingYear + this.author;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return this.bookName.equals(book.bookName) && (this.publishingYear == (book.publishingYear)
                && this.author.equals(book.author));
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName, publishingYear, author);
    }
}