package ui;

import catalog.Catalog;
import media.Media;

public class Searcher extends UserCommunicator {
    public Searcher(Catalog catalog) {
        super(catalog);
    }

    private String menu = "Find by\n" +
            "1 - Name\n" +
            "2 - Author\n" +
            "3 - Year\n" +
            "4 - Range of years\n" +
            "5 - Rating\n" +
            "6 - Show all\n";

    private String secondMenu = "Try again?\n" +
            "1 - Yes\n" +
            "2 - No, go to the selection menu\n" +
            "3 - No, go to the main menu\n";

    @Override
    public void run() {
        System.out.println(menu);
        int type;
        while (true) {
            if (scanner.hasNextInt()) {
                type = scanner.nextInt();
                if (type > 0 && type < 7) {
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Please choose from 1 to 6 ...");
                }
            } else {
                System.out.println("Please choose from 1 to 6 ...");
            }
            scanner.nextLine();
        }

        if (type == 1) {
            searchByName();
        } else if (type == 2) {
            searchByAuthor();
        } else if (type == 3) {
            searchByYear();
        } else if (type == 4) {
            searchByRangeYear();
        } else if (type == 5) {
            searchByRating();
        } else {
            printAll();
        }
    }

    private int secondMenu() {
        System.out.println(secondMenu);
        int variant;
        while (true) {
            if (scanner.hasNextInt()) {
                variant = scanner.nextInt();
                if (variant > 0 && variant < 4) {
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Please choose from 1 to 3 ...");
                }
            } else {
                System.out.println("Please choose from 1 to 3 ...");
            }
            scanner.nextLine();
        }
        return variant;
    }

    private void searchByName() {
        System.out.println("Enter the name:");

        String name = scanner.nextLine();

        Media[] result = catalog.getByName(name);
        printResult(result);

        int variant = secondMenu();

        if (variant == 1) {
            searchByName();
        } else if (variant == 2) {
            run();
        } else if (variant == 3) {
            return;
        }
    }

    private void searchByAuthor() {
        System.out.println("Enter the author:");

        String author = scanner.nextLine();

        Media[] result = catalog.getByAuthor(author);
        printResult(result);

        int variant = secondMenu();

        if (variant == 1) {
            searchByAuthor();
        } else if (variant == 2) {
            run();
        } else if (variant == 3) {
            return;
        }
    }

    private void searchByYear() {
        System.out.println("Enter the year:");

        int year;

        while (true) {
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                break;
            } else {
                System.out.println("Need to enter a number (year)");
            }
            scanner.nextLine();
        }

        Media[] result = catalog.getByYear(year);
        printResult(result);

        int variant = secondMenu();

        if (variant == 1) {
            searchByYear();
        } else if (variant == 2) {
            run();
        } else if (variant == 3) {
            return;
        }
    }

    private void searchByRangeYear() {
        System.out.println("Enter the start year:");

        int startYear;

        while (true) {
            if (scanner.hasNextInt()) {
                startYear = scanner.nextInt();
                break;
            } else {
                System.out.println("Need to enter a number (start year)");
            }
            scanner.nextLine();
        }

        System.out.println("Enter the end year:");

        int endYear;

        while (true) {
            if (scanner.hasNextInt()) {
                endYear = scanner.nextInt();
                break;
            } else {
                System.out.println("Need to enter a number (end year)");
            }
            scanner.nextLine();
        }

        Media[] result = catalog.getByYear(startYear, endYear);
        printResult(result);

        int variant = secondMenu();

        if (variant == 1) {
            searchByRangeYear();
        } else if (variant == 2) {
            run();
        } else if (variant == 3) {
            return;
        }
    }

    private void searchByRating() {
        System.out.println("Enter the minimum rating:");

        double minRating;

        while (true) {
            if (scanner.hasNextDouble()) {
                minRating = scanner.nextDouble();
                break;
            } else {
                System.out.println("Need to enter a number (minimum rating)");
            }
            scanner.nextLine();
        }

        System.out.println("Enter the maximum rating:");

        double maxRating;

        while (true) {
            if (scanner.hasNextDouble()) {
                maxRating = scanner.nextDouble();
                break;
            } else {
                System.out.println("Need to enter a number (maximum rating)");
            }
            scanner.nextLine();
        }

        Media[] result = catalog.getByRating(minRating, maxRating);
        printResult(result);

        int variant = secondMenu();

        if (variant == 1) {
            searchByRating();
        } else if (variant == 2) {
            run();
        } else if (variant == 3) {
            return;
        }
    }

    private void printAll() {
        printResult(catalog.getAll());
    }

    private void printResult(Media[] result) {
        if (result.length == 0) {
            System.out.println("Nothing found:(");
        }
        for (Media media : result) {
            System.out.println(media);
        }
    }
}
