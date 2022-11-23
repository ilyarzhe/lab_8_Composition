package vehicles;

import products.IProduct;
import vehicles.water.IWaterVehicle;

public final class Speedboat extends Vehicle implements IWaterVehicle, IMotorised {
    
    private String hullType;
    private IMotorised motor;
    
    public Speedboat(float weight, int maxSpeed, IProduct baseProduct, String hullType, IMotorised motor){
        super(weight, maxSpeed, baseProduct);
        this.hullType = hullType;
        this.motor = motor;
    }

    @Override
    public void startEngine() {
        motor.startEngine();
    }

    @Override
    public void stopEngine() {
        motor.stopEngine();
    }

    @Override
    public int getHp() {
        return motor.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.motor.setHp(hp);
    }

    @Override
    public int getFuelLevel() {
        return this.motor.getFuelLevel();
    }

    @Override
    public void setFuelLevel(int fuel) {
        this.motor.setFuelLevel(fuel);
    }

    @Override
    public String getHullType() {
        return hullType;
    }

    @Override
    public void setHullType(String hullType) {
        this.hullType = hullType;
    }
}
