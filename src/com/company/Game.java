package com.company;

import java.util.*;

public class Game {
    public Scanner scanner = new Scanner(System.in);

    public Player player;
    public List<Player> players = new ArrayList<>();
    //public List<Integer> playerHand = new ArrayList<>();
    public Map<Integer, Integer> diceOnTable = new HashMap<>();
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

        //player = new Player((scanner.nextLine()).trim());

    }





}
