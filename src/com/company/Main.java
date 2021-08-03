package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
//
// 1) single player can roll dice,
//        look at dice
//
// 2) make a bid, make a second valid bid (increase die value, or increase number of dice of any value),
// ask for another bid if invalid bid given
//
// 3) [Liar System]




public class Main {

    public static void main(String[] args) {

        Game liarsDice = new Game();
        liarsDice.play();

    }

}
