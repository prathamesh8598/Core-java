package Abstractclass;

public class Tablet extends Medicine{
    public Tablet(String name, String address) {
        super(name, address);
    }

    @Override
    public void displaylabel() {
        super.displaylabel();
        System.out.println("Stored in a dry place");
    }
}
