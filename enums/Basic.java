package enums;

public class Basic {
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants.
        // public,static, final
        // since its final you cannot create child enums
        // type is week


        Week() {
            System.out.println("Constructor called for " + this);
            // this is not public or protected. This is private or default.
            // why?? we dont what to create new objects because multiple objects is not a concept of enum.
        }
    }

    public static void main(String[] args) {
        Week week = Week.Monday;
//        for (Week w : Week.values()) {
//            System.out.println(w);
//        }
    }
}
