package Behavioral.Strategy;

public abstract class Batta {

private  int id;
private  String name;
private  static  int counter=0;
protected flyBehaviour myFlyBehaviour;


public Batta(){
    this.id=counter++;
    this.name="Batta#"+this.id;
    this.myFlyBehaviour=new FlyWthWings();
}
public  String swim(){
    return "Hey I,m Swimming!";
}
protected  abstract String display();


     public  void  perform (){
    System.out.println("Hi ,I am "+this.name);
    System.out.println(this.swim());
    System.out.println(display());
    System.out.println(this.myFlyBehaviour.fly());
    }

}
