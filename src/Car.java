package src;

public class Car {
    private int doors, names;
    private int wheels;
    private String model;

    public Car(int doors, String color, String engine) {
        this("Private Model");
        this.doors = doors;
        this.color = color;
        this.engine = engine;
    }

    public Car() {
        this("Default Car Model");
    }
    private Car(String model) {
        this.model = model;
        System.out.println(this.model);
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getNames() {
        return names;
    }

    public void setNames(int names) {
        this.names = names;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    private String color;
    private String engine;

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return this.model;
    }
    public int getDoors() {
        return this.doors;
    }
}
