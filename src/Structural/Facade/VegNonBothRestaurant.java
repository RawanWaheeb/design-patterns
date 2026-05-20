package Structural.Facade;

public class VegNonBothRestaurant implements Hotel {

    @Override
    public Menus getMenus() {

        Both b = new Both();
        return b;
    }
}