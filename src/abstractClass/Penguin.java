package src.abstractClass;

public class Penguin extends Bird{
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I'm not good at flying, can I swim instead");
    }
}
