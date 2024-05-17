package cloning;

import access.Object;

public class Human implements Cloneable {

    int age;
    String name;

    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human clone() throws CloneNotSupportedException {

        // this is a shallow copy
        // both original and copy changes 
        return (Human) super.clone();
    }

}
