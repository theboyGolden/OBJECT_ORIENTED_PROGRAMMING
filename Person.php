<!-- Task: Create a Simple Class

Create a PHP class called Person that represents a person. The class should have the following properties:

$firstName: The first name of the person.
$lastName: The last name of the person.
$age: The age of the person.
The class should also have the following methods:

getFullName(): A method that returns the full name of the person by combining the first name and last name.
getAge(): A method that returns the age of the person.
Finally, create an instance of the Person class, set values for the properties, and call the methods to display the full name and age. -->

<?php

Class Person {
    public $firstName;
    public $lastName;
    public $age;

    public function getFullName () {
        echo "$this->firstName $this->lastName";
    }

    public function getAge () {
        echo "$this->age";
    }

}

$person = new Person ();



$person->firstName = "Golden";
$person->lastName = "Boy";
$person->age = 19;


echo 'Full Name: ' . $person->getFullName () . '<br>';
echo 'Age: ' . $person->getAge () . '<br>';

?>