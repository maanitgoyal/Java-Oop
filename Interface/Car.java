package Interface;

public class Car implements Engine{
    @Override
    public void start() {
        System.out.println("Car is running");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopped");
    }

    @Override
    public void acc() {
        System.out.println("Car is accelerated");
    }

    public static void main(String[] args) {
        Car obj = new Car();
        obj.start();
        obj.acc();
        obj.stop();
    }
}
