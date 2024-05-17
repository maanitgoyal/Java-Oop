package access;

public class Access {
    private int num;
    String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Access(int num, String name, int[] arr) {
        this.num = num;
        this.name = name;
        this.arr = arr;
    }
}
