package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    public Cup cup = new Cup();
    public Scanner scanner = new Scanner(System.in);
    public String playerName;
    public String betRecordDisplay = "";
    int initialBidHowManyDice;
    int initialBidDiceFaceValue;
    int secondBidHowManyDice;
    int secondBidDiceFaceValue;
    public boolean isActiveRound = true;
    public boolean isALie = false;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public Player () {

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
        betRecordDisplay = "Player bid: " + initialBidHowManyDice + "x " + initialBidDiceFaceValue;
        System.out.println(betRecordDisplay);
        scanner.nextLine();

        nextPlayerGuess();
    }

    public void nextPlayerGuess() {

        System.out.println("Next player type (bid) to bid or (lie) if you think the player bid is a lie.");
        String playerGuess = scanner.nextLine();

        if (playerGuess.equals("bid")) {
            System.out.println("Enter qty of dice on table: ");
            secondBidHowManyDice = scanner.nextInt();
            System.out.println("Enter face value: ");
            secondBidDiceFaceValue = scanner.nextInt();
            betRecordDisplay = "Player bid: " + secondBidHowManyDice + "x " + secondBidDiceFaceValue;
            validateBid();
        } else if (playerGuess.equals("lie")) {
            checkLie();
        }
//        else {
//            System.out.println("invald entry");
//        }
//        while (isActiveRound) {
//            System.out.println("Enter qty of dice on table: ");
//            secondBidHowManyDice = scanner.nextInt();
//            System.out.println("Enter face value: ");
//            secondBidDiceFaceValue = scanner.nextInt();
//            betRecordDisplay = "Player bid: " + secondBidHowManyDice + "x " + secondBidDiceFaceValue;
//            validateBid();
//        }
    }

    public void validateBid() {

        if (secondBidHowManyDice > initialBidHowManyDice) {
            System.out.println("Valid bid");
            isActiveRound = false;

        } else if (secondBidHowManyDice == initialBidHowManyDice
                && secondBidDiceFaceValue > initialBidDiceFaceValue) {
            System.out.println("Valid bid");
            isActiveRound = false;
        } else {
            System.out.println("Invalid bid, bid again");
            //isActiveRound = false;
        }
    }

    public void checkLie() {
        if (cup.diceOnTable.containsKey(initialBidDiceFaceValue) && cup.diceOnTable.containsValue(initialBidHowManyDice)) {
            System.out.println("bid was true challenger loses");
            isALie = false;
            return;

            //below will be used for challenger if they call lie and bidder was telling the truth.
//            myCup.playerHand.remove(0);
//            if (myCup.playerHand.size() == 0) {
//                System.out.println("Player is out of dice. You are out of the game");
//            }
        } else {
//            System.out.println("bid was a lie");
//            System.out.println("Player loses a die.");
//            cup.playerHand.remove(0);
            isALie = true;
//            if (cup.playerHand.size() == 0) {
//                System.out.println("Player is out of dice. You are out of the game");
//            }
        }
        if (isALie = true) {
            System.out.println("bid was a lie");
            System.out.println("Player loses a die.");
            cup.playerHand.remove(0);
            if (cup.playerHand.size() == 0) {
                System.out.println("Player is out of dice. You are out of the game");
            }
        }
    }



}