package inheritance;

public class BoxPrice extends BoxWeight{

    double price;

    BoxPrice(){
        super();
        this.price = -1;
    }

    public BoxPrice(int l, int w, int h, double weight, double price) {
        super(l, w, h, weight);
        this.price = price;
    }
}
