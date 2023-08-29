package com.aurion.main;

import java.util.Scanner;

public class Game {
    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        String choice;

        System.out.println("Welcome to Treasure Island. Your mission is to find the treasure.");
        System.out.println("You find yourself at a crossroads. Do you want to go left or right?");
        choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("left")) {
            System.out.println("You've chosen to go left.");
            System.out.println("You come across a river. Do you want to swim or wait?");
            choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("swim")) {
                System.out.println("You start swimming across the river and are attacked by trout. Game Over.");
            } else if (choice.equalsIgnoreCase("wait")) {
                System.out.println("You wait by the river and see a boat arrive. It takes you safely to the other side.");
                System.out.println("You continue walking and encounter a wall of fire. Do you want to try to run through the fire (red door) or choose a different path?");
                choice = scanner.nextLine();

                if (choice.equalsIgnoreCase("red")) {
                    System.out.println("You try to run through the fire and get burned. Game Over.");
                } else {
                    System.out.println("You choose a different path and come to three doors: blue, yellow, and green.");
                    System.out.println("Which door do you want to enter?");
                    choice = scanner.nextLine();

                    if (choice.equalsIgnoreCase("blue")) {
                        System.out.println("You enter the blue door and are eaten by beasts. Game Over.");
                    } else if (choice.equalsIgnoreCase("yellow")) {
                        System.out.println("Congratulations! You win! You found the treasure!");
                    } else {
                        System.out.println("You enter the green door and find yourself in a lush forest, but there's no treasure here. Game Over.");
                    }
                }
            } else {
                System.out.println("Invalid choice. Game Over.");
            }
        } else if (choice.equalsIgnoreCase("right")) {
            System.out.println("You've chosen to go right and fall into a hole. Game Over.");
        } else {
            System.out.println("Invalid choice. Game Over.");
        }
    }
}
