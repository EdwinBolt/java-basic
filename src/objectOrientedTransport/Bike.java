package objectOrientedTransport;

public class Bike extends Vehicle2{
    protected int speed;
    public Bike(String brand, String color){
    }

    @Override
    public void drive() {
        speed += 2;
    }

    @Override
    public void brake() {
        speed -= 2;
    }
}
