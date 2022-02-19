package src.abstractClass;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Yorkie");
        dog.breath();
        dog.eat();

        Parrot parrot = new Parrot("Australian ring neck");
        parrot.breath();
        parrot.fly();
        parrot.eat();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
