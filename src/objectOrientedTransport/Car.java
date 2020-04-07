package objectOrientedTransport;

public class Car extends Vehicle2 {
    private String brand, color;
    protected int speed;


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }

    public Car (String brand, String color){
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }


    public void drive(){
        speed += 10;
    }

    public void brake(){
        speed -= 10;
    }

}
