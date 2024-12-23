package abstractDesign.vehicle;

import java.util.HashMap;
import java.util.Map;


public class VehicleFactory {
    private final Map<String, VehicleCreator> registry = new HashMap<>();

    public VehicleFactory() {
        register("car", Car::new);
        register("bike", Bike::new);

    }

    public void register(String type, VehicleCreator creator) {
        registry.put(type, creator);
    }

    public Vehicle createVehicle(String type) {
        VehicleCreator creator = registry.get(type);
        if (creator == null) {
            throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
        return creator.create();
    }
}
