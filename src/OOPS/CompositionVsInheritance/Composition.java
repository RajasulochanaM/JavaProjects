package OOPS.CompositionVsInheritance;

class Processor {

    void process() {
        System.out.println("Processor is working");
    }
}

class Computer {

    private Processor processor;

    Computer() {
        processor = new Processor();
    }

    void startComputer() {
        processor.process();
        System.out.println("Computer is started");
    }
}

public class Composition {

    public static void main(String[] args) {

        Computer computer = new Computer();

        computer.startComputer();
    }
}

