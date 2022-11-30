package Methods;

public class Table {
    int num;
    int table;

    public Table(int num) {
        this.num = num;
    }

    void table(){
        for (int i=1;i<=10;i++){
            table=num*i;
            System.out.println(table);
        }
    }

    public static void main(String[] args) {
        Table table1 = new Table(15);
        table1.table();
    }
}
