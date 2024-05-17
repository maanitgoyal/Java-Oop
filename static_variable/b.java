package static_variable;

public class b {
    static int num;

    static void pr(int num) {
        b.num = num;
        System.out.println(b.num);
    }

    public static void main(String[] args) {
        System.out.println(a.population);
        pr(2);
    }

}
