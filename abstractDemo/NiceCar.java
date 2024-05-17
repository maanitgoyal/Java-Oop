package abstractDemo;

import Interface.Car;
import Interface.Engine;
import Interface.Media;

public class NiceCar {

    private Engine engine;
    private Media player = new CDPlayer();
    public NiceCar() {
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {

        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void mediaStart(){
        player.start();
    }

    public void mediaStop(){
        player.stop();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();

    }

}
