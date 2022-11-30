package Abstractclass;

public class Syrup extends Medicine{


    public Syrup(String name, String address) {
        super(name, address);
    }

    @Override
    public void displaylabel() {
        super.displaylabel();
        System.out.println("Shake before use");
    }
}
