package src;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.tail = tail;
        this.teeth = teeth;
        this.legs = legs;
        this.coat = coat;
    }

    public void chew() {
        System.out.println("Dog.Chew() chew called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.Eat()");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.Walk() called");
    }

    public void run() {
        System.out.println("Dog.Run()");
    }
}
