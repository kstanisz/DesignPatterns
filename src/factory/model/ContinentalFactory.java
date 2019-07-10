package factory.model;

public class ContinentalFactory implements CarFactory {
    @Override
    public Ford createFord(FordModel fordModel, FuelType fuelType) {
        return new Ford(fuelType, SteeringWheelPosition.RIGHT, fordModel);
    }

    @Override
    public Bmw createBmw(BmwModel bmwModel, FuelType fuelType) {
        return new Bmw(fuelType, SteeringWheelPosition.RIGHT, bmwModel);
    }
}
