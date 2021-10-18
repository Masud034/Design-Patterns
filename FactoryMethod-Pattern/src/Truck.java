public class Truck extends Vehicle{
    @Override
    void accelerator() {
        System.out.println("Truck is accelerating");
    }

    @Override
    void braking() {
        System.out.println("Truck is braking");
    }
}
