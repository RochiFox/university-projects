package media;

public class CompactDisc extends Media {
    public CompactDisc(String name, String author, int year, String comment, double rating) {
        super(name, author, year, comment, rating);
    }

    @Override
    public String toString() {
        return "CompactDisc{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", comment='" + comment + '\'' +
                ", rating=" + rating +
                '}';
    }
}