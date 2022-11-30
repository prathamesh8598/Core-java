package CollectionImp;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class Retainall {
    public static void main(String[] args) {
        Set set = new TreeSet<>();
        set.add(10);
        set.add(50);
        set.add(70);
        set.add(30);
        set.add(40);
        set.add(100);
        set.add(20);
        set.add(60);
        set.add(45);
        System.out.println(set);

        Collection collection = new TreeSet<>();
        collection.add(10);
        collection.add(20);
        collection.add(30);
        collection.add(40);
        collection.add(50);
        System.out.println(collection);
    }
}
