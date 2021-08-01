package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    public String playerName;
    public Cup cup;
    public boolean isActivePlayer;
    int initialBidHowManyDice;
    int initialBidDiceFaceValue;
    public Scanner scanner = new Scanner(System.in);
    public boolean isActiveRound = true;
    public String betRecordDisplay = "";
    public String betRecord2;
    public boolean isALie = false;

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

//    public void catchALie() {
//        if (cup.diceOnTable.containsKey(initialBidDiceFaceValue) && cup.diceOnTable.containsValue(initialBidHowManyDice)) {
//            System.out.println("bid was true challenger loses");
//            isALie = false;
//            cup.playerHand.remove(0);
////            if (cup.playerHand.size() == 0) {
////                System.out.println("Player is out of dice. You are out of the game");
////            }
//        } else {
//            System.out.println("bid was a lie");
//            cup.playerHand.remove(0);
//            if (cup.playerHand.size() == 0) {
//                System.out.println("Player is out of dice. You are out of the game");
//            }
//        }
//
//
//    }
}