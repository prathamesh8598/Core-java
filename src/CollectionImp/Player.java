package CollectionImp;

public class Player {
    String name;
    int run;
    int wicket;
    int matches;
    String country;
    int century;
    String categary;

    public Player() {
    }

    public Player(String name, int run, int wicket, int matches, String country, int century, String categary) {
        this.name = name;
        this.run = run;
        this.wicket = wicket;
        this.matches = matches;
        this.country = country;
        this.century = century;
        this.categary = categary;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", run=" + run +
                ", wicket=" + wicket +
                ", matches=" + matches +
                ", country='" + country + '\'' +
                ", century=" + century +
                ", categary='" + categary + '\'' +
                '}';
    }
}
