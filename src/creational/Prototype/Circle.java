package creational.Prototype;

public class Circle  implements  Shape {
private  String color;

public  Circle(String color){
    this.color=color;
}
    public Shape clone() {
        return new Circle(this.color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle.");
    }
}
