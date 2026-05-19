package Structural.Bridge;

public class Main {
    public static void main(String[] args) {

        new Sphere(new RedKey()).getDescription();
        new Sphere(new GreenKey()).getDescription();
        new Sphere(new BlueKey()).getDescription();

        new Prism(new RedKey()).getDescription();
        new Cube(new GreenKey()).getDescription();
    }
}