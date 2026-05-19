package Structural.Bridge;

public class Prism extends Shape {

    public Prism(Key key) {
        super(key);
    }

    @Override
    public void getDescription() {
        System.out.println(
                "Hey I am a Prism I Increase Speed by " + this.key.getColor()
        );
    }
}