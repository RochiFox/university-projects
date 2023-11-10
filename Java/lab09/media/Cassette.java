package media;

public class Cassette extends Media {
    public Cassette(String name, String author, int year, String comment, double rating) {
        super(name, author, year, comment, rating);
    }

    @Override
    public String toString() {
        return "Cassette{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", comment='" + comment + '\'' +
                ", rating=" + rating +
                '}';
    }
}
