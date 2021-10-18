public class VehicleFactory {
    public Vehicle getVehicle(int randomNumber) {
        if (randomNumber == 0)
            return new Car();
        else if (randomNumber == 1)
            return new Bike();
        else if(randomNumber == 2)
            return new Truck();
        else
            return new Bus();
    }
}
