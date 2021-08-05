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
    public boolean isActiveRound = false;
    public boolean isALie = false;
    private final int MAX_PLAYERS = 6;
    private final int MIN_PLAYERS = 1;
    public int turnCount = 0;


    public Game() {
        System.out.println("Enter amount of players: ");
        int numOfPlayers;
        do {
            numOfPlayers = scanner.nextInt();
            scanner.nextLine();
        }  while (numOfPlayers < MIN_PLAYERS || numOfPlayers > MAX_PLAYERS);

        while (players.size() < numOfPlayers) {
            System.out.println("Enter Player Name: ");
            players.add(new Player((scanner.nextLine()).trim()));
        }
    }

    public void play() {
        isActiveRound = true;
        while (isActiveRound) {
            round();
        }

//        for (int i = 0; i < players.size(); i++) {
//            if (players.get(i).cup.playerHand.size() == 0) {
//                System.out.println("Display losers");
//                isActiveRound = false;
//            }
//        }
    }

    public void round() {
        for (Player activePlayer : players) {
            player = activePlayer;
            turn(player);
        }
    }

    public void turn(Player player) {
        System.out.println(player.playerName + "'s turn");
        if (turnCount <= 0){
        player.cup.roll();
        }
        if (betRecordDisplay.equals("")) {
            makeBid();
        } else {
            nextPlayerGuess();
        turnCount += 1;
        }
    }

    public void makeBid() {
//        System.out.println(betRecordDisplay);
        System.out.println("make your bid :");
        System.out.println("Enter qty of dice on table: ");
        initialBidHowManyDice = scanner.nextInt();
        System.out.println("Enter face value: ");
        initialBidDiceFaceValue = scanner.nextInt();
        betRecordDisplay = player.playerName + "'s bid: " + initialBidHowManyDice + "x " + initialBidDiceFaceValue;
        System.out.println(betRecordDisplay);
        scanner.nextLine();

    }

    public void nextPlayerGuess() {
        System.out.println("Type (bid) to bid or (lie) if you think the bid is a lie.");
        String playerGuess = scanner.nextLine();
        if (playerGuess.equals("bid")) {
            System.out.println("Enter qty of dice on table: ");
            secondBidHowManyDice = scanner.nextInt();
            System.out.println("Enter face value: ");
            secondBidDiceFaceValue = scanner.nextInt();
            betRecordDisplay = player.playerName + " 's bid is: " + secondBidHowManyDice + "x " + secondBidDiceFaceValue;
            validateBid();


        } else if (playerGuess.equals("lie")) {
            checkLie();
        }
    }

    public void validateBid() {
        if (secondBidHowManyDice > initialBidHowManyDice) {
            System.out.println("Valid bid");


        } else if (secondBidHowManyDice == initialBidHowManyDice
                && secondBidDiceFaceValue > initialBidDiceFaceValue) {
            System.out.println("Valid bid");


        } else {
            System.out.println("Invalid bid, bid again");
        }
    }

    public void checkLie() {
        if (player.cup.diceOnTable.containsKey(initialBidDiceFaceValue) && player.cup.diceOnTable.get(initialBidDiceFaceValue) >= initialBidHowManyDice) {
            System.out.println("bid was true challenger loses");
            isALie = false;
            return;

        } else {
            isALie = true;
        }
        if (isALie) {
            System.out.println("bid was a lie");
            System.out.println(player.playerName + " loses a die.");
            player.cup.playerHand.remove(0);

            if (player.cup.playerHand.size() == 0) {
                System.out.println(player.playerName + " is out of dice. You are out of the game");
            }
        }
    }


}
