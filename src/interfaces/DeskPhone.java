package src.interfaces;

public class DeskPhone implements ITelephone {
    private int phoneNumber;
    private boolean isRinging;

    public DeskPhone(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, power button does not exist");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now calling " + phoneNumber + " on desk phone");
        isRinging = true;
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Call Answered");
            isRinging = true;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == this.phoneNumber) {
            isRinging = true;
            System.out.println("Ring Ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
