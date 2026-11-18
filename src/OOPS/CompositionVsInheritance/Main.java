package OOPS.CompositionVsInheritance;

    class Engine {

        void start() {
            System.out.println("Engine started");
        }
    }

    // Inheritance example
    class Vehicle {

        void move() {
            System.out.println("Vehicle is moving");
        }
    }

    class Car extends Vehicle {

        // Composition: Car HAS-A Engine
        private Engine engine;

        Car() {
            engine = new Engine();
        }

        void startCar() {
            engine.start();
            move();
        }
    }

    public class Main {

        public static void main(String[] args) {

            Car car = new Car();

            car.startCar();
        }
    }
