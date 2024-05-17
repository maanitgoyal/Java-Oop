package BasicJava;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your height: ");
        int height = sc.nextInt();

        System.out.println("Enter your weight: ");
        double weight = sc.nextDouble();

        System.out.println("Your name is" + " " + name);
        System.out.println("Your age is" + " " + age);
        System.out.println("Your height is" + " " + height);
        System.out.println("Your weight is" + " " + weight);
    }


}
