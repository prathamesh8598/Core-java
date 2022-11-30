package CollectionImp;

public class Book {
    String name;
    int price;
    String authorname;
    int isbnno;
    String publication;

    public Book() {
    }

    public Book(String name, int price, String authorname, int isbnno, String publication) {
        this.name = name;
        this.price = price;
        this.authorname = authorname;
        this.isbnno = isbnno;
        this.publication = publication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", authorname='" + authorname + '\'' +
                ", isbnno=" + isbnno +
                ", publication='" + publication + '\'' +
                '}';
    }
}
