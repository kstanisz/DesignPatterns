package factory.model;

public class Bmw extends Car {
    private BmwModel bmwModel;

    Bmw(FuelType fuelType, SteeringWheelPosition steeringWheelPosition, BmwModel bmwModel) {
        super(fuelType, steeringWheelPosition);
        this.bmwModel = bmwModel;
    }

    public BmwModel getBmwModel() {
        return bmwModel;
    }
}
