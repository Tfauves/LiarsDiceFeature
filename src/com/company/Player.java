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
    public String betRecord = "";
    public String betRecord2;

    public Player() {
        System.out.println("Enter Player Name: ");
        this.playerName = scanner.nextLine();
        System.out.println(this.playerName + "s hand is ");
    }

    public void makeBid() {
            System.out.println(betRecord);
            System.out.println("make your bid :");
            System.out.println("Enter qty of dice on table: ");
            int initialBidHowManyDice = scanner.nextInt();
            System.out.println("Enter face value: ");
            int initialBidDiceFaceValue = scanner.nextInt();
            //playerBids.add(betRecord1);
            betRecord = "Player bid: " + initialBidHowManyDice + "x " + initialBidDiceFaceValue;
            System.out.println(betRecord);
            System.out.println("Next player make your bid: ");
        while (isActiveRound) {
            System.out.println("Enter qty of dice on table: ");
            int secondBidHowManyDice = scanner.nextInt();
            System.out.println("Enter face value: ");
            int secondBidDiceFaceValue = scanner.nextInt();
            betRecord = "Player bid: " + secondBidHowManyDice + "x " + secondBidDiceFaceValue;
            //playerBids.add(betRecord2);

            if (secondBidHowManyDice > initialBidHowManyDice) {
                System.out.println("Valid bid");
                isActiveRound = false;
               // playerBids.add(betRecord1);
            } else if (secondBidHowManyDice == initialBidHowManyDice
                    && secondBidDiceFaceValue > initialBidDiceFaceValue) {
                System.out.println("Valid bid");
                isActiveRound = false;
            } else {
                System.out.println("Invalid bid, bid again");
                //isActiveRound = false;
            }

//            for (String bids : playerBids) {
//                System.out.println(bids);
//            }
        }

    }




}
