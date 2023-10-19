package org.example;

import animal.zoo.Cat;
import animal.zoo.Dog;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cat cat = new Cat("The cat");
        Dog dog = new Dog("The dog");
        cat.run();
        cat.sleep();
        cat.say();
        dog.run();
        dog.sleep();
        dog.say();
    }
}