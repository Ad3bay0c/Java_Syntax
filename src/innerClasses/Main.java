package src.innerClasses;

public class Main {

    public static void main(String[] args) {
        GearBox mcLean = new GearBox(6);
        mcLean.addGear(1, 5.3);
        mcLean.addGear(2, 10.6);
        mcLean.addGear(3, 15.9);

        mcLean.operateClutch(true);
        mcLean.changeGear(1);
        mcLean.wheelSpeed(1000);

        mcLean.operateClutch(false);
    }
}
