# Fantasy Animals Adventure

## Deadline
Please complete this task by the end of the week, prior to the next exercise session.

## Instructions
You can check the assignment submission guidelines on the course webpage, under the assignments section.

## Preparation
- Ensure you have completed and understood Module 2: Looking Inside Classes.
- Familiarize yourself with the relevant materials accessible via the course's resources page.

## Learning Goals
- Understand the structure and purpose of Java classes.
- Explore instance variables and methods including constructors, getters, and setters.
- Practice object instantiation and method invocation.
- Conceptualize the use of encapsulation in software design.
- Manipulate object fields using methods to maintain privacy.

## Assignment

In the mythical land of Codelandia, a variety of Fantasy Animals roam the landscapes. Your mission is to model these enchanted creatures using Java, bringing them to life through code. Let your imagination run wild; these creatures can be anything from flying cats to swimming dragons.

### Exercise A: Introduction to Fantasy Animals

Start by creating a new Java file named `FantasyAnimal.java` and define a class within it named `FantasyAnimal`. This class is where you will describe the features and behaviors of your fantasy animals.

In the `main` method, declare variables to represent one fantasy animal's name, health points, magical power, and whether it is enchanted. Initialize these variables with appropriate values.

```java
class FantasyAnimal {
    public static void main(String[] args) {
        // Declare variables here
    }
}
```

Test your code to ensure it runs without errors.

### Exercise B: A Family of Fantasy Animals

Expand your fantasy world by creating two more fantasy animals, adding up to a total of three. Print information about each animal separately.

```java
class FantasyAnimal {
    public static void main(String[] args) {
        // Declare more animals and print their info
    }
}
```

### Exercise C: Fields and Objects

Refactor your code to utilize class fields (variables defined inside the class but outside any method). Instead of holding data for a fantasy animal in the `main` method, these fields should represent the state of a fantasy animal object.

- String name
- int healthPoints
- int magicalPower
- boolean enchanted

Instantiate new `FantasyAnimal` objects in the `main` method and assign them properties.

### Exercise D: Constructors and Encapsulation

To make creating fantasy animals easier, implement a constructor in the `FantasyAnimal` class. This constructor should take parameters for name, healthPoints, magicalPower, and enchanted status, and assign these to the object's fields.

Incorporate encapsulation by setting fields to `private` and creating getters and setters for each field.

### Exercise E: Let Them Interact

Add methods to your `FantasyAnimal` class, so the animals can interact. For instance, create a method that allows one animal to transfer some of its magical power to another.

### Exercise F: Beyond the Basics

1. Implement a `displayInfo()` method that prints all details about the fantasy animal.
2. Simulate an interaction in the main method where one fantasy animal transfers some of its magical power to another.

### Exercise G: Understanding Encapsulation

Examine examples of variable shadowing and how to use the `this` keyword to resolve ambiguity related to field and parameter names. Be prepared to discuss your findings and solutions.
