import one.Author;
import one.Book;

public class Main {

    public static void main(String[] args) {

        Author joyce = new Author("Джеймс", "Джойс");
        Book ulysses = new Book("Улисс", 1920, joyce);

        System.out.println("ulysses.bookName = " + ulysses.getBookName());
        System.out.println("ulysses.getAuthor() = " + ulysses.getAuthor().getAuthorName() + " " +
                ulysses.getAuthor().getAuthorSurname());
        System.out.println("ulysses.publishingYear = " + ulysses.getPublishingYear());
        ulysses.setPublishingYear(1921);
        System.out.println("ulysses.getPublishingYear() = " + ulysses.getPublishingYear());
        System.out.println(ulysses);
        System.out.println();

        Author tolstoy = new Author("Лев", "Толстой");
        Book annaKarenina = new Book("Анна Каренина", 1878, tolstoy);
        System.out.println("annaKarenina.bookName = " + annaKarenina.getBookName());
        System.out.println("annaKarenina.author = " + annaKarenina.getAuthor().getAuthorName() +
                annaKarenina.getAuthor().getAuthorSurname());
        System.out.println("annaKarenina.publishingYear = " + annaKarenina.getPublishingYear());
        annaKarenina.setPublishingYear(1879);
        System.out.println("annaKarenina.getPublishingYear() = " + annaKarenina.getPublishingYear());
        System.out.println(annaKarenina);
        System.out.println();

        Author jamesJoyce = new Author("Джеймс", "Джойс");
        System.out.println("jamesJoyce.authorName = " + jamesJoyce.getAuthorName());
        System.out.println("jamesJoyce.authorSurname = " + jamesJoyce.getAuthorSurname());
        System.out.println();

        Author leoTolstoy = new Author("Лев", "Толстой");
        System.out.println("leoTolstoy.authorName = " + leoTolstoy.getAuthorName());
        System.out.println("leoTolstoy.authorSurname = " + leoTolstoy.getAuthorSurname());
        System.out.println(tolstoy.equals(joyce));
        System.out.println(annaKarenina.equals(ulysses));

    }
}