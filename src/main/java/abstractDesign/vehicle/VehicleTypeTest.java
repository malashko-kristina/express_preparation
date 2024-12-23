package abstractDesign.vehicle;

public class VehicleTypeTest {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Vehicle car = factory.createVehicle("car");
        car.drive();

        Vehicle bike = factory.createVehicle("bike");
        bike.drive();

        factory.register("taxi", () -> () -> System.out.println("Driving a taxi..."));
        Vehicle taxi = factory.createVehicle("taxi");
        taxi.drive();
    }
}
