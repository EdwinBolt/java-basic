package objectOrientedTransport;

public class Truck extends Car {

    private int maxLoad;

    public Truck(String brand, String color){
        super(brand, color);
    }

    @Override
    public void drive() {
        speed += 5;
    }

    @Override
    public void brake() {
        speed -= 5;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }
}
