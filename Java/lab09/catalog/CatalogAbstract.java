package catalog;

import java.util.ArrayList;
import java.util.List;

import media.Media;

public abstract class CatalogAbstract implements Catalog {
    final int capacity = 10000;
    Media[] mediaCollection = new Media[capacity];
    int size = 0;

    @Override
    public Media[] getAll() {
        Media[] allMedia = new Media[size];
        for (int i = 0; i < size; i++) {
            allMedia[i] = mediaCollection[i];
        }
        return allMedia;
    }

    @Override 
    public abstract void addMedia(Media media);

    @Override
    public Media[] getByName(String name) {
        List<Media> list = new ArrayList<>();
        for (Media m : mediaCollection) {
            if (m == null) {
                break;
            }
            if (m.getName().equals(name)) {
                list.add(m);
            }
        }
        Media[] result = new Media[list.size()];
        return list.toArray(result);
    }

    @Override
    public Media[] getByAuthor(String author) {
        List<Media> list = new ArrayList<>();
        for (Media m : mediaCollection) {
            if (m == null) {
                break;
            }
            if (m.getAuthor().equals(author)) {
                list.add(m);
            }
        }
        Media[] result = new Media[list.size()];
        return list.toArray(result);
    }

    @Override
    public Media[] getByYear(int year) {
        List<Media> list = new ArrayList<>();
        for (Media m : mediaCollection) {
            if (m == null) {
                break;
            }
            if (m.getYear() == year) {
                list.add(m);
            }
        }
        Media[] result = new Media[list.size()];
        return list.toArray(result);
    }

    @Override
    public Media[] getByYear(int fromYear, int toYear) {
        List<Media> list = new ArrayList<>();
        for (Media m : mediaCollection) {
            if (m == null) {
                break;
            }
            if (m.getYear() >= fromYear && m.getYear() <= toYear) {
                list.add(m);
            }
        }
        Media[] result = new Media[list.size()];
        return list.toArray(result);
    }

    @Override
    public Media[] getByRating(double fromRating, double toRating) {
        List<Media> list = new ArrayList<>();
        for (Media m : mediaCollection) {
            if (m == null) {
                break;
            }
            if (m.getRating() >= fromRating && m.getRating() <= toRating) {
                list.add(m);
            }
        }
        Media[] result = new Media[list.size()];
        return list.toArray(result);
    }
}
