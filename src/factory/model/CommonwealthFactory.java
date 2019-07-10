package factory.model;

public class CommonwealthFactory implements CarFactory {

    @Override
    public Ford createFord(FordModel fordModel, FuelType fuelType) {
        return new Ford(fuelType, SteeringWheelPosition.LEFT, fordModel);
    }

    @Override
    public Bmw createBmw(BmwModel bmwModel, FuelType fuelType) {
        return new Bmw(fuelType, SteeringWheelPosition.LEFT, bmwModel);
    }
}
