package Behavioral.Strategy;

public class Le3ba extends Batta{


    public  Le3ba(){
        super();
        this.myFlyBehaviour=new FlyNoFly();
    }




    @Override
    protected String display() {
        return "I am Le3ba";
    }

}
