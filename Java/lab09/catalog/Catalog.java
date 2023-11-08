package catalog;

import media.Media;

public interface Catalog {
    Media[] getAll();

    void addMedia(Media media);

    Media[] getByName(String name);

    Media[] getByAuthor(String author);

    Media[] getByYear(int year);

    Media[] getByYear(int fromYear, int toYear);

    Media[] getByRating(double fromRating, double toRating);
}
