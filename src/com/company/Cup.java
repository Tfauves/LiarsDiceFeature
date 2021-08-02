package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cup {
    public List<Die> dice = new ArrayList<>();
    public List<Integer> playerHand = new ArrayList<>();
    public Map<Integer, Integer> diceOnTable = new HashMap<>();


    public Cup() {
        while (dice.size() < 5) {
            dice.add(new Die());
        }
    }

    public void roll() {
        for (Die die : dice) {
            die.roll();
            playerHand.add(die.faceUpValue);
        }
    }

    public void saveHand() {
        for (Integer die : playerHand) {
            if (diceOnTable.containsKey(die)) {
                diceOnTable.put(die, diceOnTable.get(die) + 1);
            } else {
                diceOnTable.put(die, 1);
            }
        }
        System.out.println(diceOnTable);

    }

    public String displayHand() {
        String hand = " ";
        for (Die die : dice) {
            hand += die.faceUpValue + " ";
        }
        return hand.trim();
    }


}
