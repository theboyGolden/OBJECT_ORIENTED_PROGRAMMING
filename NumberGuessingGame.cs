// Task: Creating a Number Guessing Game

// Create a C# console application for a number guessing game. The game will generate a random number, and the player needs to guess the correct number within a certain range.

// Game Class:

// Create a class called NumberGuessingGame with the following properties and methods:
// SecretNumber (int): The randomly generated secret number.
// MinNumber and MaxNumber (int): The range within which the player needs to guess.
// GenerateSecretNumber(): A method that generates a random number within the specified range.
// PlayGame(): A method that allows the player to guess the number and provides feedback (higher, lower, or correct).



using System;


public Class NumberGuessingGame {
    private int SecretNumber;
    private int MinNumber;
    private int MaxNumber;


    GenerateSecretNumber(){
        Random rand = new Random();
    }


    PlayGame () {
        Console.WriteLine("Welcome to the Number Guessing game!");

        int attempts =0;
        int guess;

        do {
            Console.Write ("Enter your guess: ");
            string input = Console.ReadLine();

            
        }
    }
}