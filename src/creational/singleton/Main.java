package creational.singleton;

public class Main {
    public static void main(String[] args) {



        DatabaseConfig db1 = DatabaseConfig.getInstance();
        DatabaseConfig db2 = DatabaseConfig.getInstance();

        db1.connect();

        System.out.println(db1 == db2); // true








    }
}