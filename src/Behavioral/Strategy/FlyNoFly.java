package Behavioral.Strategy;

public class FlyNoFly implements  flyBehaviour{

    @Override
    public String fly() {
        return "I can,t fly";
    }
}
