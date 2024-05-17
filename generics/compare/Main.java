package generics.compare;

public class Main {
    public static void main(String[] args) {
        MainClass rahul = new MainClass(12, 90.0f);
        MainClass kunal = new MainClass(13, 90.0f);

        if(rahul.compareTo(kunal) == 0) {
            System.out.println("Rahul is equal Kunal");
        }
        else if(rahul.compareTo(kunal) < 0) {
            System.out.println("Rahul is less than Kunal");
        }
        else {
            System.out.println("Rahul is greater than Kunal");
        }
    }
}
