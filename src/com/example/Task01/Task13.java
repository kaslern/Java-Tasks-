package com.example.Task01;

import java.util.Random;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int randomNumber = rand.nextInt(3) + 1;
        System.out.println("Choose your move:\n s - Scissors - r - Rock - p - Paper");
        String humanMove = input.nextLine();
        String computerMove = "";

        switch (randomNumber) {
            case 1 -> computerMove = "r";
            case 2 -> computerMove = "p";
            case 3 -> computerMove = "s";
        }

        System.out.println("Computer Move: " + computerMove);

        if (humanMove.equals(computerMove)){
            System.out.println("Draw");

        } else if (humanMove.equals("r") && computerMove.equals("s") || humanMove.equals("p") && computerMove.equals("r")
        || humanMove.equals("s") && computerMove.equals("p")) {
            System.out.println("You won");
        }

    else {
            System.out.println("Computer won");
        }
    }
}






