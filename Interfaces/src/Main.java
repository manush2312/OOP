public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.acc();
        car.stop();
        car.start();

        Media carMedia = new Car();
        carMedia.stop();  // we are trying to stop media but engine is being stopped..so to solve this we need to
        // create seperate classes for this interfaces..

        System.out.println("\n----------------------------------\n");
        NiceCar newcar = new NiceCar();  // here we are calling default constructor or power engine..
        newcar.start();
        newcar.startMusic();

        System.out.println("\n----------------------------------\n");
        System.out.println("I am Upgrading the engine..");
        newcar.upgradeEngine();
        newcar.start();


    }
}
