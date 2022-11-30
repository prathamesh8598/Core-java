package Abstractclass;

public class Ointment extends Medicine{

    public Ointment(String name, String address) {
        super(name, address);
    }

    @Override
    public void displaylabel() {
        super.displaylabel();
        System.out.println("For external use only");
    }
}
