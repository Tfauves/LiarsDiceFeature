package com.company;

import java.util.Scanner;

public class Player {
    public String playerName;
    public Bid bid;
    public Cup cup;
    public boolean isActivePlayer;
    public Scanner scanner = new Scanner(System.in);
    public boolean isFirstBid = false;
    public String betRecord;

    public Player() {
        System.out.println("Enter Player Name: ");
        this.playerName = scanner.nextLine();
    }

    public void makeBid() {
        while (!isFirstBid) {
        System.out.println("player make your bid :");
        System.out.println("Enter number of dice on table: ");
        int howManyDice = scanner.nextInt();
        System.out.println("Enter face value: ");
        int diceFaceValue = scanner.nextInt();
        betRecord = "your bet: " + howManyDice + "x " + diceFaceValue;
        System.out.println(betRecord);
        isFirstBid = false;
        }
//        else {
//            System.out.println("player make your bid :");
//            System.out.println("Enter number of dice on table: ");
//            int howManyDice = scanner.nextInt();
//            System.out.println("Enter face value: ");
//            int diceFaceValue = scanner.nextInt();
//            betRecord = "your bet: " + howManyDice + "x " + diceFaceValue;
//            System.out.println(betRecord);
//        }


    }




}
