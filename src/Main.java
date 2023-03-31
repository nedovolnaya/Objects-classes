import one.Author;
import one.Book;

public class Main {

    public static void main(String[] args) {

        Book ulysses = new Book("Улисс", 1920);
        System.out.println("ulysses.bookName = " + ulysses.getBookName());
        System.out.println("ulysses.publishingYear = " + ulysses.getPublishingYear());
        ulysses.setPublishingYear(1921);
        System.out.println("ulysses.getPublishingYear() = " + ulysses.getPublishingYear());
        System.out.println();

        Book annaKarenina = new Book("Анна Каренина", 1878);
        System.out.println("annaKarenina.bookName = " + annaKarenina.getBookName());
        System.out.println("annaKarenina.publishingYear = " + annaKarenina.getPublishingYear());
        annaKarenina.setPublishingYear(1879);
        System.out.println("annaKarenina.getPublishingYear() = " + annaKarenina.getPublishingYear());
        System.out.println();

        Author jamesJoyce = new Author("Джеймс", "Джойс");
        System.out.println("jamesJoyce.authorName = " + jamesJoyce.getAuthorName());
        System.out.println("jamesJoyce.authorSurname = " + jamesJoyce.getAuthorSurname());
        System.out.println();

        Author leoTolstoy = new Author("Лев", "Толстой");
        System.out.println("leoTolstoy.authorName = " + leoTolstoy.getAuthorName());
        System.out.println("leoTolstoy.authorSurname = " + leoTolstoy.getAuthorSurname());

    }
}