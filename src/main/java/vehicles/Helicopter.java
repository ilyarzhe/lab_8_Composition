package vehicles;
import vehicles.Vehicle;
import vehicles.air.IAirVehicle;
import products.IProduct;

public class Helicopter extends Vehicle implements IAirVehicle{
    private IAirVehicle radar;

   public Helicopter(float weight, int maxSpeed, IProduct baseProduct,IAirVehicle radar){
       super(weight,maxSpeed,baseProduct);
       this.radar = radar;
   }

    @Override
    public int getPassengerCount() {
        return radar.getPassengerCount();
    }

    @Override
    public void setPassengerCount(int amount) {
        radar.setPassengerCount(amount);
    }

    @Override
    public int getSerialNumber() {
        return radar.getSerialNumber();
    }

    @Override
    public void setSerialNumber(int serialNumber) {
       radar.setSerialNumber(serialNumber);

    }
}

