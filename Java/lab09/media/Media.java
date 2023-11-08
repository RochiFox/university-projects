package media;

public abstract class Media {
    protected String name;
    protected String author;
    protected int year;
    protected String comment;
    protected double rating;

    public Media(String name, String author, int year, String comment,
            double rating) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.comment = comment;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getComment() {
        return comment;
    }

    public double getRating() {
        return rating;
    }
}
