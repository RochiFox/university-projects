package catalog;

import media.Media;

public class ArrayCatalog extends CatalogAbstract {
    @Override
    public void addMedia(Media media) {
        mediaCollection[size] = media;
        size++;
    }
}