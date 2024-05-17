package generics.compare;

public class MainClass implements Comparable<MainClass> {
    int rollno;
    float marks;

    public MainClass(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(MainClass o) {
        int diff = (int)(this.rollno - o.rollno);
        return diff;
    }
}
