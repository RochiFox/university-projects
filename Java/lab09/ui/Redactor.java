package ui;

import catalog.Catalog;
import media.CompactDisc;
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

        Media media = new CompactDisc(name, author, year, comment, rating);
        catalog.addMedia(media);
    }
}
