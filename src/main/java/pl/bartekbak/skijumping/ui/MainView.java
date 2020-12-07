package pl.bartekbak.skijumping.ui;

import java.util.Scanner;

public class MainView {
    private Scanner scanner;

    public MainView(Scanner scanner) {
        this.scanner = scanner;
    }

    public void init() {
        System.out.println("Welcome to SkiJumping Tournament");

        while(true) {
            System.out.println("Choose one of options");
            System.out.println("1. Start competition - enter 1");
            System.out.println("0. Quit - enter 0");

            String command = scanner.nextLine();
            switch (command) {
                case "1":
                    startCompetition();
                    break;
                case "0":
                    return;
            }

        }

    }

    private void startCompetition() {

    }
}
