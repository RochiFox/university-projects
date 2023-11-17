import java.util.Scanner;

import catalog.ArrayCatalog;
import ui.Redactor;
import ui.Searcher;
import ui.UserCommunicator;
import catalog.Catalog;
import catalog.FileCatalog;

public class Main {
    public static void main(String[] args) {
        // Catalog catalog = new ArrayCatalog();
        Catalog catalog = new FileCatalog();
        UserCommunicator userCommunicator;
        String mainMenu = "Select a mode:\n" +
                "1 - adding to the catalog\n" +
                "2 - search in the catalog\n" +
                "3 - exit from the program\n";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int type;
            while (true) {
                System.out.println(mainMenu);
                if (scanner.hasNextInt()) {
                    type = scanner.nextInt();
                    if (type > 0 && type < 4) {
                        scanner.nextLine();
                        break;
                    } else {
                        System.out.println("Select an option from 1 to 3 ...");
                    }
                } else {
                    System.out.println("Select an option from 1 to 3 ...");
                }
                scanner.nextLine();
            }
            if (type == 1) {
                userCommunicator = new Redactor(catalog);
            } else if (type == 2) {
                userCommunicator = new Searcher(catalog);
            } else {
                return;
            }
            userCommunicator.run();
        }
    }
}