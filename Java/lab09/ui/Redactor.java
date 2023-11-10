package ui;

import catalog.Catalog;

import media.CompactDisc;
import media.VinylRecord;
import media.Cassette;
import media.Media;

public class Redactor extends UserCommunicator {
    public Redactor(Catalog catalog) {
        super(catalog);
    }

    @Override
    public void run() {
        System.out.println("Enter the name of the disk you want to add (0 exit to the main menu):");
        String name = scanner.nextLine();

        if (name.equals("0")) {
            return;
        }

        System.out.println("Enter the author:");
        String author = scanner.nextLine();

        System.out.println("Enter the year:");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter a comment:");
        String comment = scanner.nextLine();

        System.out.println("Enter the rating:");
        double rating = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Choose a media type:");
        System.out.println("1 - Compact disc");
        System.out.println("2 - Vinyl record");
        System.out.println("3 - Cassette");

        int type = scanner.nextInt();
        scanner.nextLine();
        Media media = null;

        if (type == 1) {
            media = new CompactDisc(name, author, year, comment, rating);
        } else if (type == 2) {
            media = new VinylRecord(name, author, year, comment, rating);
        } else if (type == 3) {
            media = new Cassette(name, author, year, comment, rating);
        }

        if (media != null) {
            catalog.addMedia(media);
        }
    }
}
