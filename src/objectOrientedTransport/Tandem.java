package objectOrientedTransport;

public class Tandem extends Bike {
    private int powerDriver1, powerDriver2;
    public Tandem(String brand, String color) {
        super(brand, color);
    }

    public int getPowerDriver1() {
        return powerDriver1;
    }

    public void setPowerDriver1(int powerDriver1) {
        this.powerDriver1 = powerDriver1;
    }

    public int getPowerDriver2() {
        return powerDriver2;
    }

    public void setPowerDriver2(int powerDriver2) {
        this.powerDriver2 = powerDriver2;
    }

    @Override
    public void drive() {
        speed = speed + powerDriver1 + powerDriver2;
    }

    @Override
    public void brake() {
        speed -= 3;
    }
}
