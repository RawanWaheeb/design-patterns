package Behavioral.Strategy;

public class Magroo7a extends  Batta{


    public Magroo7a(){
        super();
//        this.myFlyBehaviour=new FlyWthWings();
    }




    @Override
    protected String display() {
        return "I am  Magroo7a";
    }
    public void  gotshot(){
this.myFlyBehaviour=new FlyNoFly();
    }


}
