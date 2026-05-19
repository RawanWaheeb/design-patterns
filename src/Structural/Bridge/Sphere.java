package Structural.Bridge;

public class Sphere extends Shape {

    public Sphere(Key key) {
        super(key);
    }

    @Override
    public void getDescription() {
        System.out.println(
                "Hey I am a Sphere I Increase Health by " + this.key.getColor()
        );
    }
}