public class NiceCar {
    private Engine engine; // this car is having internal engine of its own of engine type..
    private  Media player = new CDPlayer();
    public NiceCar(){
        this.engine = new PowerEngine();
    }

    public NiceCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
}
