//Write a Java program to demonstrate single inheritance using a Vehicle superclass and a Car subclass. 

class Que2{
    public static void main(String[] args) {
        Car car = new Car();
        car.horn();
        car.hasFourWheels();
    }
}

class Vehicle{
    public void horn(){
        System.out.println("Vehicle has a horn!");
    }
}

class Car extends Vehicle{
    public void hasFourWheels(){
        System.out.println("Car has a 4 wheels!");
    }
}