package factory.model;

public class Ford extends Car {
    private FordModel fordModel;

    Ford(FuelType fuelType, SteeringWheelPosition steeringWheelPosition, FordModel fordModel) {
        super(fuelType, steeringWheelPosition);
        this.fordModel = fordModel;
    }

    public FordModel getFordModel() {
        return fordModel;
    }
}
