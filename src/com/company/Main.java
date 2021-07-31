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
        Player player = new Player();
        Cup myCup = new Cup();
        myCup.roll();
        System.out.println(myCup.displayHand());
        player.makeBid();

//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("amount");
//        int bidQty1 = scanner2.nextInt();
//        System.out.println("enter value");
//        int bidValue1 = scanner2.nextInt();
//        System.out.println(myCup.displayHand());
//        System.out.println(myCup.displayHand());
//
//        System.out.println("amount");
//        int bidQty2 = scanner2.nextInt();
//        System.out.println("enter value");
//        int bidValue2 = scanner2.nextInt();
//
//        if (bidQty2 > bidQty1) {
//            System.out.println("good bid1");
//
//        } else if (bidQty2 == bidQty1 && bidValue2 > bidValue1) {
//            System.out.println("good bid2");
//        } else {
//            System.out.println("bad bid");
//        }
















    }




}
