import java.util.Objects;
public class Book {
    private String name;
    private int yearPublication;
    private Author author;
    public Book(String name, int yearPublication, Author author) {
        this.name = name;
        this.yearPublication = yearPublication;
        this.author = author;
    }
    public String getName() {
        return this.name;
    }
    public int getYearPublication() {
        return this.yearPublication;
    }
    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
    public Author getAuthor() {
        return author;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book2 = (Book) other;
        return name.equals(book2.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    public String toString() {
        return "Название книги: " + this.name + "\nГод публикации: " + this.yearPublication + "\n" + this.author;
    }
}