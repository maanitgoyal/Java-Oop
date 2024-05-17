package cloning;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Human maanit = new Human(18, "Maanit Goyal");

        Human twin = maanit.clone();

        System.out.println(twin.age + " " + twin.name);
    }



}
