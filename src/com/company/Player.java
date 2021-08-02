package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
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

        nextPlayerGuess();
    }

    public void nextPlayerGuess() {

        System.out.println("Next player make your bid: ");
        while (isActiveRound) {
            System.out.println("Enter qty of dice on table: ");
            secondBidHowManyDice = scanner.nextInt();
            System.out.println("Enter face value: ");
            secondBidDiceFaceValue = scanner.nextInt();
            betRecordDisplay = "Player bid: " + secondBidHowManyDice + "x " + secondBidDiceFaceValue;
            validateBid();
        }
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


}