package src.interfaces;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile Phone powered on");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now calling " + phoneNumber + " on desk phone");
            isRinging = true;
        } else {
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the Mobile Phone");
            isRinging = true;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == this.myNumber && isOn) {
            isRinging = true;
            System.out.println("Ring Ring");
        } else {
            isRinging = false;
            System.out.println("Number not different or phone not on");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
