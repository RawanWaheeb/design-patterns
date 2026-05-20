package Structural.Proxy;

public class Main {

    public static void main(String[] args) {

        Image image = new ProxyImage("example.jpg");

        image.display(); // loading + display
        image.display(); // display only (cached)
    }
}