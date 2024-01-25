using System;

class NumberGuessingGame {
    private int SecretNumber;
    private int MinNumber;
    private int MaxNumber;

    public NumberGuessingGame(int min, int max) {
        MinNumber = min;
        MaxNumber = max;
        GenerateSecretNumber();
    }

    private void GenerateSecretNumber() {
        Random random = new Random();
        SecretNumber = random.Next(MinNumber, MaxNumber + 1);
    }

    public void PlayGame() {
        Console.WriteLine($"Welcome to the Number Guessing Game! Guess the number between {MinNumber} and {MaxNumber}");

        int attempts = 0;
        int guess;

        do {
            Console.Write("Enter your guess: ");
            string input = Console.ReadLine();

            if (int.TryParse(input, out guess)) {
                attempts++;

                if (guess < SecretNumber) {
                    Console.WriteLine("Too low! Try again.");
                } else if (guess > SecretNumber) {
                    Console.WriteLine("Too high! Try again.");
                } else {
                    Console.WriteLine($"Congratulations! You guessed the correct number {SecretNumber} in {attempts} attempts.");
                }
            } else {
                Console.WriteLine("Invalid input. Please enter a valid number.");
            }
        } while (guess != SecretNumber);
    }
}

class Program {
    static void Main() {
        // Create an instance of the NumberGuessingGame
        NumberGuessingGame game = new NumberGuessingGame(1, 100);

        // Play the game
        game.PlayGame();
    }
}
