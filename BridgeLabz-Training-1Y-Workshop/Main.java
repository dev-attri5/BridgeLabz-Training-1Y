class Vehicle {
    int speed = 60;
}

class Car extends Vehicle {
    int speed = 100;

    void displaySpeed() {
        int totalSpeed = super.speed + speed;

        System.out.println("Parent speed: " + super.speed);
        System.out.println("Car speed: " + speed);
        System.out.println("Total speed: " + totalSpeed);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.displaySpeed();
    }
}
