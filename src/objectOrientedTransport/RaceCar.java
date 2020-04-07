package objectOrientedTransport;

public class RaceCar extends Car{
    private int topSpeed;
    public RaceCar (String brand, String color){
        super (brand, color);
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    @Override
    public void drive() {
        speed += 20;
    }

    @Override
    public void brake() {
        speed -= 20;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}