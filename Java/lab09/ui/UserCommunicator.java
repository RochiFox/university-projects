package ui;

import java.util.Scanner;
import catalog.Catalog;

public abstract class UserCommunicator {
    protected Scanner scanner = new Scanner(System.in);
    protected Catalog catalog;

    public UserCommunicator(Catalog catalog) {
        this.catalog = catalog;
    }

    public abstract void run();
}
