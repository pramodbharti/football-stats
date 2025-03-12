package com.hyperskill.ui;

import java.util.Scanner;

public class SportsStatisticsInterface {
    private Scanner scanner;

    public SportsStatisticsInterface(FootballStasticsDB footballStasticsDB) {
        footballStasticsDB = new FootballStasticsDB();
        scanner = new Scanner(System.in);
    }

    private void mainMenu() {
        System.out.println("""
                🏆 FOOTBALL STATISTICS SYSTEM 🏆
                  1️⃣ Manage Teams
                  2️⃣ Manage Players
                  3️⃣ Record a Match
                  4️⃣ View Statistics
                  5️⃣ Exit
                  Select an option:
                """);
    }

    public void start() {
        while (true) {
            mainMenu();
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1 -> manageTeams();
                case 2 -> managePlayers();
                case 3 -> recordMatch();
                case 4 -> viewStatistics();
                case 5 -> {
                    return;
                }
                default -> {
                    System.out.println("Invalid choice");
                }
            }
        }
    }

    private void recordMatch() {
        //todo: add match record to database
    }

    private void viewStatistics() {
        //todo: get statistcs from db and show it to user
    }

    private void managePlayers() {
        while (true) {
            System.out.println("""
                    1. Add player
                    2. Remove player
                    3. Exit manage players
                    """);

            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1 -> addPlayer();
                case 2 -> removePlayer();
                case 3 -> {
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }

    private void removePlayer() {
        // todo: remove player from database
    }

    private void addPlayer() {
        // todo: add player to database
    }

    private void manageTeams() {
        while (true) {
            System.out.println("""
                    1. Add team
                    2. Remove team
                    3. Exit manage teams
                    """);

            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1 -> addTeam();
                case 2 -> removeTeam();
                case 3 -> {
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }

    private void removeTeam() {
        // todo: remove team from database
    }

    private void addTeam() {
        // todo: add team to database
    }


}
