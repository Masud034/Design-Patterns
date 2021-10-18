import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Random random = new Random();
        //random.nextInt produces a number between 0 - 3 as we have given bound -> 4
        int randomNumber = random.nextInt(4);

        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.getVehicle(randomNumber);

        vehicle.accelerator();
        vehicle.braking();
    }
}