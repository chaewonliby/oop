class PersonalComputer {

    private Computer computer;
    private Monitor monitor;

    public PersonalComputer(Computer computer, Monitor monitor) {
        this.computer = computer;
        this.monitor = monitor;
    }

    public void turnOn(){
        computer.turnOn();
        monitor.turnOn();
    }

    public void printInfo(){
        computer.printInfo();
        monitor.printInfo();
    }
}

class Monitor{

    private String monitorSize = "32 inch";
    private String color = "Black";
    private String power = "45W";

    public  Monitor(String monitorSize, String color, String power) {
        this.monitorSize = monitorSize;
        this.color = color;
        this.power = power;
    }

    public void turnOn(){
        System.out.println("Turning on the monitor." );
    }

    public void printInfo(){
        System.out.println("The spec of the monitor" );
        System.out.println("Size: " + monitorSize);
        System.out.println("Color: " + color);
        System.out.println("Power: " + power);
    }

}

class Computer{
    private String cpu = "Core i7";
    private String memory = "32GB";
    private String hd = "2TB";
    private String color = "White";
    private String power = "500W";

    public Computer(String cpu, String memory, String hd, String color, String power) {
        this.cpu = cpu;
        this.memory = memory;
        this.hd = hd;
        this.color = color;
        this.power = power;
    }

    public void turnOn(){
        System.out.println("Turning on the computer");
    }

    public void printInfo(){
        System.out.println("The spec of the computer" );
        System.out.println("CPU: " + cpu);
        System.out.println("Memory: " + memory);
        System.out.println("HD: " + hd);
        System.out.println("Color: " + color);
        System.out.println("Power: " + power);
    }

}

public class Homework5 {
    public static void main(String[] args) {
        Computer computer = new Computer("Core i7", "16GB", "2TB", "White", "500W");
        Monitor monitor = new Monitor("24 inch", "Black", "45W");

        PersonalComputer pc = new PersonalComputer(computer, monitor);

        pc.turnOn();
        pc.printInfo();
    }
}
