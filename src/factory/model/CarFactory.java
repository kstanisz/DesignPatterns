package factory.model;

public interface CarFactory {
    Ford createFord(FordModel fordModel, FuelType fuelType);
    Bmw createBmw(BmwModel bmwModel, FuelType fuelType);
}
