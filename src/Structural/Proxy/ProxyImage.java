package Structural.Proxy;

public class ProxyImage implements Image {

    private String filename;
    private RealImage image;

    public ProxyImage(String filename) {
        this.filename = filename;
        this.image = null;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new RealImage(filename);
        }
        image.display();
    }
}