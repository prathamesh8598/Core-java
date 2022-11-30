package CollectionImp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayerImp {
    public static void main(String[] args) {
        Player player1 = new Player("abc", 5000, 200, 300, "india", 150, null);
        Player player2 = new Player("xyz", 25000, 600, 500, "india", 300, null);
        Player player3 = new Player("pqr", 10000, 700, 1000, "india", 40, null);
        Player player4 = new Player("efg", 20000, 1000, 800, "india", 215, null);
        Player player5 = new Player("lmn", 16000, 70, 700, "india", 60, null);

        List <Player>list= new ArrayList<>();
        list.add(player1);
        list.add(player2);
        list.add(player3);
        list.add(player4);
        list.add(player5);

        for (Object player:list) {
            System.out.println(player);
        }
        System.out.println("========================================================================================");

        Collections.sort(list,(e1,e2)-> e1.name.compareTo(e2.name));
        System.out.println(list);
        System.out.println("===================================================================================================");

        for (Player player:list) {
            if (player.run>=10000){
                System.out.println(player);
            }
        }
        List<Player>List = new ArrayList<>();
        for (Player list1:list) {
            if (list1.century>100){
                list1.categary="A";
            }
            else {
                list1.categary="B";
            }
        }
        list.forEach(System.out::println);
    }
}
