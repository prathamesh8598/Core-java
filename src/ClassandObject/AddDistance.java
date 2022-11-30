package ClassandObject;

public class AddDistance {
     int feet1;
     int feet2;
     int inches1;
     int inches2;
     int total;
     int distance;

     public AddDistance(int feet1, int feet2, int inches1, int inches2) {
          this.feet1 = feet1;
          this.feet2 = feet2;
          this.inches1 = inches1;
          this.inches2 = inches2;
     }

     void getDistance(){
          total=inches1+inches2;
          distance=feet1+feet2+(total/12);
          total=total%12;
          System.out.println("The total distance in feet is :"+distance );
          System.out.println("The total distance in inches is :"+total );

     }

     public static void main(String[] args) {
          AddDistance addDistance = new AddDistance(6,7,8,9);
          addDistance.getDistance();

     }
}
