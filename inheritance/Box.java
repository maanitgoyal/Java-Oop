package inheritance;

public class Box {

    int l,w,h;


    public Box(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;

    }

    public Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    public static void main(String[] args) {
        Box obj = new Box();
        System.out.println(obj.l);
    }

}
