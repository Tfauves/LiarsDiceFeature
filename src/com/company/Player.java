package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    public String playerName;

    public boolean isActivePlayer;
    int initialBidHowManyDice;
    int initialBidDiceFaceValue;
    public Scanner scanner = new Scanner(System.in);
    public boolean isActiveRound = true;
    public String betRecordDisplay = "";
    public String betRecord2;

    public Player() {
        System.out.println("Enter Player Name: ");
        this.playerName = scanner.nextLine();
        System.out.println(this.playerName + "s hand is ");

    }

    public void makeBid() {
            System.out.println(betRecordDisplay);
            System.out.println("make your bid :");
            System.out.println("Enter qty of dice on table: ");
            initialBidHowManyDice = scanner.nextInt();
            System.out.println("Enter face value: ");
            initialBidDiceFaceValue = scanner.nextInt();
            //playerBids.add(betRecord1);
            betRecordDisplay = "Player bid: " + initialBidHowManyDice + "x " + initialBidDiceFaceValue;
            System.out.println(betRecordDisplay);
            System.out.println("Next player make your bid: ");
        while (isActiveRound) {
            System.out.println("Enter qty of dice on table: ");
            int secondBidHowManyDice = scanner.nextInt();
            System.out.println("Enter face value: ");
            int secondBidDiceFaceValue = scanner.nextInt();
            betRecordDisplay = "Player bid: " + secondBidHowManyDice + "x " + secondBidDiceFaceValue;
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
