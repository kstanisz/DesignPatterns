package factory;

import factory.model.*;

class Main {

    public static void main(String[] args) {
        CarFactory commonwealthFactory = new CommonwealthFactory();
        CarFactory continentalFactory = new ContinentalFactory();

        Bmw commonwealthBmw = commonwealthFactory.createBmw(BmwModel.E60, FuelType.BENZINE);
        System.out.println("Commonwealth BMW steering wheel position: " + commonwealthBmw.getSteeringWheelPosition());
        Bmw continentalBmw = continentalFactory.createBmw(BmwModel.E60, FuelType.BENZINE);
        System.out.println("Continental BMW steering wheel position: " + continentalBmw.getSteeringWheelPosition());
        Ford commonwealthFord = commonwealthFactory.createFord(FordModel.CMAX, FuelType.BENZINE);
        System.out.println("Commonwealth Ford steering wheel position: " + commonwealthFord.getSteeringWheelPosition());
        Ford continentalFord = continentalFactory.createFord(FordModel.CMAX, FuelType.BENZINE);
        System.out.println("Continental Ford steering wheel position: " + continentalFord.getSteeringWheelPosition());

        // No public constructor
        //Bmw bmw = new Bmw(FuelType.BENZINE, SteeringWheelPosition.LEFT, BmwModel.E60);
    }

}
