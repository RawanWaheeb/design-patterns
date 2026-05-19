package Structural.Bridge;

public class Cube extends Shape {

    public Cube(Key key) {
        super(key);
    }

    @Override
    public void getDescription() {
        System.out.println(
                "Hey I am a Cube I Increase Power by " + this.key.getColor()
        );
    }
}