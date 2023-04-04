package one;

public class Author {
    private String authorName;
    private String authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorSurname() {
        return this.authorSurname;
    }
    @Override

    public String toString() {
        return " Имя автора: " + this.authorName + " Фамилия автора: " + this.authorSurname;
    }
    @Override

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        return authorName.equals(author.authorName) && authorSurname.equals(author.authorSurname);
    }
   @Override
   public int hashCode() {
       return java.util.Objects.hash(authorName, authorSurname);
   }
}
