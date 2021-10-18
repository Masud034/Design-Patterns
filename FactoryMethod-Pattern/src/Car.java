public class Car extends Vehicle {
    @Override
    void accelerator() {
        System.out.println("Car is accelerating");
    }

    @Override
    void braking() {
        System.out.println("Car is braking");
    }
}
