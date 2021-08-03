package com.company;

import java.util.*;

public class Game {
    public Scanner scanner = new Scanner(System.in);

    public Player player;
    public List<Player> players = new ArrayList<>();
    public String betRecordDisplay = "";
    int initialBidHowManyDice;
    int initialBidDiceFaceValue;
    int secondBidHowManyDice;
    int secondBidDiceFaceValue;
    public boolean isActiveRound = true;
    public boolean isALie = false;
    private final int MAX_PLAYERS = 6;
    private final int MIN_PLAYERS = 1;


    public Game() {
        System.out.println("Enter amount of players: ");
        int numOfPlayers;
        do {
            numOfPlayers = scanner.nextInt();
            scanner.nextLine();
        }  while (numOfPlayers < MIN_PLAYERS || numOfPlayers > MAX_PLAYERS);

        while (players.size() < numOfPlayers) {
            System.out.println("Enter Player One Name: ");
            players.add(new Player((scanner.nextLine()).trim()));
        }

        player = players.get(0);

    }

    public void play() {
        player.cup.roll();
        System.out.println(player.cup.displayHand());
        makeBid();

    }

    public void round() {

    }

    public void turn() {

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
        if (player.cup.diceOnTable.containsKey(initialBidDiceFaceValue) && player.cup.diceOnTable.get(initialBidDiceFaceValue) >= initialBidHowManyDice) {
            System.out.println("bid was true challenger loses");
            isALie = false;
            return;

            //below will be used for challenger if they call lie and bidder was telling the truth.
//            myCup.playerHand.remove(0);
//            if (myCup.playerHand.size() == 0) {
//                System.out.println("Player is out of dice. You are out of the game");
//            }
        } else {
            isALie = true;
//            if (cup.playerHand.size() == 0) {
//                System.out.println("Player is out of dice. You are out of the game");
//            }
        }
        if (isALie = true) {
            System.out.println("bid was a lie");
            System.out.println("Player loses a die.");
            player.cup.playerHand.remove(0);

            if (player.cup.playerHand.size() == 0 && player.cup.diceOnTable.isEmpty()) {
                System.out.println("Player is out of dice. You are out of the game");
            }
        }
    }





}
