package CollectionImp;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashset {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add(10);
        set.add(90);
        set.add(30);
        set.add(60);
        set.add(40);
        System.out.println(set);
        set.retainAll(set);
        System.out.println(set);
        // System.out.println(set.iterator());
    }
}
