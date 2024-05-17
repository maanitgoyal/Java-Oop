package inheritance;

public class BoxWeight extends Box {

    double weight;

    public BoxWeight(int l, int w, int h, double weight) {
        super(l, w, h);
        super.l = l;
        super.w = w;
        super.h = h;
        this.weight = weight;
    }

    public BoxWeight() {
    }
}
