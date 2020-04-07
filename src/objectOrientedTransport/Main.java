package objectOrientedTransport;

/* package to practice with object oriented programming
* multiple means of transportation created as classes with multiple forms of extend and implement
 */

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Suzuki", "Grijs");

        car.drive();

        System.out.println(car.toString());


        Bike bike = new Bike("VanMook", "Grijs");

        Tandem tandem = new Tandem("tandem", "rood");
        tandem.setPowerDriver1(1);
        tandem.setPowerDriver2(2);
        tandem.drive();tandem.drive();tandem.brake();

        System.out.println(tandem.toString());

        Truck truck1 = new Truck("Volvo", "Grijs");
        truck1.setMaxLoad(1000);

        RaceCar mySecondCar = new RaceCar("Ferrari", "Red");
        mySecondCar.setTopSpeed(399);


    }
}
