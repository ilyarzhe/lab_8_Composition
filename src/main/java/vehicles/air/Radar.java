package vehicles.air;

public class Radar implements IAirVehicle{
    private int serialNumber;
    private int passengerCount;

    public Radar(int serialNumber,int passengerCount){
        this.serialNumber = serialNumber;
        this.passengerCount = passengerCount;
    }
    
    @Override
    public int getPassengerCount() {
        return this.passengerCount;
    }

    @Override
    public void setPassengerCount(int amount) {
        this.passengerCount = amount;
    }
}
