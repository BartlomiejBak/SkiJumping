package pl.bartekbak.skijumping.ui;

import pl.bartekbak.skijumping.domain.entity.Contest;
import pl.bartekbak.skijumping.domain.entity.Hill;
import pl.bartekbak.skijumping.domain.entity.StartingList;
import pl.bartekbak.skijumping.domain.service.ContestService;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.Scanner;

public class MainView {
    private Scanner scanner;
    public static DecimalFormat noteFormat = new DecimalFormat("#.0");
    private Contest contest;
    private ContestService contestService;

    public MainView(Scanner scanner) {
        this.scanner = scanner;
        setupContest();
        this.contestService = new ContestService(this.contest);
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
                    startQualifications();
                    break;
                case "0":
                    return;
            }
        }
    }

    private void startQualifications() {
        System.out.println("Welcome to " + contest.getHill().getName() + " in " + contest.getHill().getLocation());
        contestService.runQualificationRound();

        System.out.println("Do you want to start first round? (y/n)");
        String command = scanner.nextLine();
        switch (command) {
            case "y":
                startFirstRound();
                break;
            case "n":
                return;

        }
    }

    private void startFirstRound() {
        System.out.println("Welcome to first round");
        contestService.runFirstRound();
        System.out.println("Do you want to start final round? (y/n)");
        String command = scanner.nextLine();
        switch (command) {
            case "y":
                startFinalRound();
                break;
            case "n":
                System.out.println("Thank you for your time, bye!");
                return;
        }
    }

    private void startFinalRound() {
        System.out.println("Welcome to final round!");
        contestService.runSecondRound();
        System.out.println("Thank you for your time, bye!");
    }

    private void setupContest() {
        LocalDateTime dateTime = LocalDateTime.now();
        Hill hill = new Hill("Wielka Krokiew", "Zakopane", 140, 120);
        StartingList startingList = new StartingList(74);
        this.contest = new Contest(dateTime, hill, startingList);
    }

}
