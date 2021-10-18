public class Bus extends Vehicle{
    @Override
    void accelerator() {
        System.out.println("Bus is accelerating");
    }

    @Override
    void braking() {
        System.out.println("Bus is braking");
    }
}
