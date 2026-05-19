

package Structural.Bridge;

public abstract class Shape {
    protected Key key;

    public Shape(Key key) {
        this.key = key;
    }

    public abstract void getDescription();
}