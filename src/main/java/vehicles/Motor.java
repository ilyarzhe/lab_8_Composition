package vehicles;

public class Motor implements IMotorised{
    private int hp;
    private int fuelLevel;

    public Motor(int hp, int fuelLevel ){
        this.hp = hp;
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void startEngine() {
        System.out.println("engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("engine stopped");

    }

    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int getFuelLevel() {
        return this.fuelLevel;
    }

    @Override
    public void setFuelLevel(int fuel) {
        this.fuelLevel = fuel;
    }
}
