package Structural.Facade;

public class Main {

    public static void main(String[] args) {

        HotelKeeper keeper = new HotelKeeperImplementation();

        VegMenu v = keeper.getVegMenu();

        NonVegMenu nv = keeper.getNonVegMenu();

        Both both = keeper.getVegNonMenu();

        System.out.println(v);
        System.out.println(nv);
        System.out.println(both);
    }
}