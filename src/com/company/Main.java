package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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
        Player player = new Player();
        Cup myCup = new Cup();
        myCup.roll();
        System.out.println(myCup.displayHand());
        player.makeBid();








    }




}
