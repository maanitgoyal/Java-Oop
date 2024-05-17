package static_variable;

public class a {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public a(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        a.population += 1;
    }
}
