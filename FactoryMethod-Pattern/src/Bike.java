public class Bike extends Vehicle{
    @Override
    void accelerator() {
        System.out.println("Wriggling the throttle");
    }

    @Override
    void braking() {
        System.out.println("Bike is braking");
    }
}
