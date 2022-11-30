package CollectionImp;

import java.util.HashMap;
import java.util.Map;

public class BookImp {
    public static void main(String[] args) {
        Book book1 = new Book("Java",600,"john",123,"Tech Max");
        Book book2 = new Book("HTML",200,"abc",163,"Technical");
        Book book3 = new Book("Python",900,"xyz",224,"Navneet");
        Book book4 = new Book("CSS",400,"pqr",456,"Nirali");
        Book book5 = new Book("JavaScript",300,"efg",789,"Dcode");

        HashMap<Integer, Book> hashMap=new HashMap<>();
        hashMap.put(1,book1);
        hashMap.put(1,book2);
        hashMap.put(1,book3);
        hashMap.put(1,book4);
        hashMap.put(1,book5);

        for (Book book: hashMap.values()) {
            System.out.println(hashMap);
        }

    }
}
