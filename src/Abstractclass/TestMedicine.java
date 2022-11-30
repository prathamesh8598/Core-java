package Abstractclass;

public class TestMedicine {
    public static void main(String[] args) {
        Medicine medicine=new Syrup("sam","pune");
        medicine.displaylabel();
        System.out.println("==============================================================");
        Medicine medicine1=new Ointment("Sam","Pune");
        medicine1.displaylabel();
        System.out.println("==============================================================");
        Medicine medicine2=new Tablet("Sam","Pune");
        medicine2.displaylabel();
    }
}
