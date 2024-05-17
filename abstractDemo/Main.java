package abstractDemo;

public class Main {
    public static void main(String[] args) {
        NiceCar niceCar = new NiceCar();

        niceCar.start();
        niceCar.stop();
        niceCar.mediaStart();
        niceCar.upgradeEngine();
        niceCar.stop();
    }
}
