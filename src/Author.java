import java.util.Objects;
public class Author {
    private String authorName;
    private String lastName;
    public Author(String authorName, String lastName) {
        this.authorName = authorName;
        this.lastName = lastName;
    }
    public String getAuthorName() {
        return this.authorName ;
    }
    public String getLastName() {
        return this.lastName;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author carroll = (Author) other;
        return authorName.equals(carroll.authorName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(authorName);
    }
    public String toString() {
        return "Имя автора: " + this.authorName + "\nФамилия: " + this.lastName;
    }
}