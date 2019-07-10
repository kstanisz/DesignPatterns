package factory.model;

abstract class Car {
    private FuelType fuelType;
    private SteeringWheelPosition steeringWheelPosition;

    Car(FuelType fuelType, SteeringWheelPosition steeringWheelPosition) {
        this.fuelType = fuelType;
        this.steeringWheelPosition = steeringWheelPosition;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public SteeringWheelPosition getSteeringWheelPosition() {
        return steeringWheelPosition;
    }
}
