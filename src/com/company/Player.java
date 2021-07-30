package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    public String playerName;
    public Bid bid;
    public Cup cup;
    public boolean isActivePlayer;
    public Scanner scanner = new Scanner(System.in);
    public boolean isActiveRound = true;
    public List<String> playerBids = new ArrayList<>();
    public String betRecord;

    public Player() {
        System.out.println("Enter Player Name: ");
        this.playerName = scanner.nextLine();
    }

    public void makeBid() {
        while (isActiveRound) {

            System.out.println("player make your bid :");
            System.out.println("Enter number of dice on table: ");
            int howManyDice = scanner.nextInt();
            System.out.println("Enter face value: ");
            int diceFaceValue = scanner.nextInt();
            betRecord = "your bet: " + howManyDice + "x " + diceFaceValue;
            playerBids.add(betRecord);
            for (String bids : playerBids) {
                System.out.println(bids);
            }
        }

    }




}
