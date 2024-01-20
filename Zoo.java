// Create an interface called Animal with the following methods:

// void makeSound() - to print the sound the animal makes.
// void move() - to simulate the animal's movement.
// Implement two classes, Lion and Fish, that implement the Animal interface:

// Lion and Fish should have attributes specific to their type (e.g., mane for a lion, fin for a fish).
// Implement the makeSound and move methods in each class.
// Create an abstract class called ZooAnimal with the following attributes:

// name (String)
// age (int)
// Extend the Lion and Fish classes from the ZooAnimal class:

// Add constructors to initialize the attributes in the Lion and Fish classes.
// Implement any additional methods you find necessary in the ZooAnimal class.
// Create a class called Zoo with a main method where you:

// Create instances of Lion and Fish.
// Call their makeSound and move methods.
// Display information about their name, age, and type.


public interface Animal {
    void makeSound();
    void move();
}

class Lion implements Animal {
    private String mane;
    private String name;
    private int age;

    public Lion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println("The Lion is roaring");
    }

    @Override
    public void move() {
        System.out.println("The lion is running.");
    }
}

class Fish implements Animal {
    private String finType;
    private String name;
    private int age;

    public Fish(String name, int age, String finType) {
        this.name = name;
        this.age = age;
        this.finType = finType;
    }

    @Override
    public void makeSound() {
        System.out.println("The Fish makes a splashing sound");
    }

    @Override
    public void move() {
        System.out.println("The fish is moving");
    }
}

public class Zoo {
    public static void main(String[] args) {
        // create objects of each type of animal
        Lion lion1 = new Lion("Simba", 5);
        Fish fish1 = new Fish("Muska", 5, "scalefin");

        lion1.makeSound();
        lion1.move();
        fish1.makeSound();
        fish1.move();
    }
}

