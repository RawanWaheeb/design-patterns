package Structural.Facade;

public class HotelKeeperImplementation implements HotelKeeper {

    @Override
    public VegMenu getVegMenu() {

        VegRestaurant v = new VegRestaurant();

        return (VegMenu) v.getMenus();
    }

    @Override
    public NonVegMenu getNonVegMenu() {

        NonVegRestaurant nv = new NonVegRestaurant();

        return (NonVegMenu) nv.getMenus();
    }

    @Override
    public Both getVegNonMenu() {

        VegNonBothRestaurant b = new VegNonBothRestaurant();

        return (Both) b.getMenus();
    }
}