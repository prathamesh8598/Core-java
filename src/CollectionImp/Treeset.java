package CollectionImp;

import java.util.Set;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        Set set = new TreeSet<>();
        set.add(40);
        set.add(10);
        set.add(30);
        set.add(80);
        set.add(70);
        System.out.println(set);
        set.remove(30);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.spliterator());
    }
}
