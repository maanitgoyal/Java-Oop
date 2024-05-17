package access;

public class Object {

    int num;

    public Object() {
        super();
    }

    public Object(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    @Override
    protected java.lang.Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }


    public static void main(String[] args) {
        Object obj1 = new Object(34);
        Object obj2 = new Object(34);

        System.out.println(obj1.hashCode());
        if (obj1.equals(obj2)) {
            System.out.println("obj1 equals obj2");
        }

    }


}
