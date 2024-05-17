package polymorphism;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shapes obj1 = new Shapes();
        Circle obj2 = new Circle();
        Square obj3 = new Square();
        Triangle obj4 = new Triangle();

       obj1.Greeting();
       obj2.Greeting();
       obj3.Greeting();
       obj4.Greeting();
    }
}
