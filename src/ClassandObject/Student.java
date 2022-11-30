package ClassandObject;

public class Student {
    int rollNo;
    String studentName;
    String address;
    long phoneNo;

    public Student(int rollNo,String studentName){
        this.rollNo=rollNo;
        this.studentName=studentName;
    }
    public Student(String address,long phoneNo){
        this.address=address;
        this.phoneNo=phoneNo;
    }

    public static void main(String[] args) {
        Student student = new Student(2,"john");
        System.out.println(student.rollNo);
        System.out.println(student.studentName);
        Student student1= new Student(1,"sam");
        System.out.println(student1.rollNo);
        System.out.println(student1.studentName);
        Student student2 = new Student("pune",13456789);
        System.out.println(student2.address);
        System.out.println(student2.phoneNo);

    }
}
