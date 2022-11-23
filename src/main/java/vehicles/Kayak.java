package vehicles;

import products.IProduct;
import vehicles.water.IWaterVehicle;

public final class Kayak extends Vehicle implements IWaterVehicle {

    private String hullType;

    public Kayak(float weight, int maxSpeed, IProduct baseProduct, String hullType){
        super(weight, maxSpeed, baseProduct);
        this.hullType = hullType;
    }

    @Override
    public float getPrice() {
        return baseProduct.getPrice();
    }

    @Override
    public long getInventory() {
        return baseProduct.getInventory();
    }

    @Override
    public void setPrice(float price) {
        baseProduct.setPrice(price);
    }

    @Override
    public void setInventory(long amount) {
        baseProduct.setInventory(amount);
    }

    @Override
    public void setTitle(String title) {
        baseProduct.setTitle(title);
    }

    @Override
    public String getTitle() {
        return baseProduct.getTitle();
    }

    @Override
    public void addInventory(long amount) {
        baseProduct.addInventory(amount);
    }

    @Override
    public void removeInventory(long amount) throws Exception {
        baseProduct.removeInventory(amount);
    }

    @Override
    public float getWeight() {
        return this.weight;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public void setMaxSpeed(int speed) {
        this.maxSpeed = speed;
    }

    @Override
    public String getHullType() {
        return this.hullType;
    }

    @Override
    public void setHullType(String hullType) {
        this.hullType = hullType;
    }
}
