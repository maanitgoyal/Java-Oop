package abstractDemo;

public class Son extends Abstract{

    @Override
    void career(String name) {
        System.out.println("I am going to be a doctor");
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love " + name + " she is " + age + " years old");
    }
}
