package src.interfaces;

public class Main {
    public static void main(String[] args) {
        ITelephone timPhone = new DeskPhone(1234567);
        timPhone.powerOn();
        timPhone.callPhone(12345676);
        timPhone.answer();

        timPhone = new MobilePhone(12345);
        //timPhone.powerOn();
        timPhone.callPhone(34223);
        timPhone.answer();
    }
}
