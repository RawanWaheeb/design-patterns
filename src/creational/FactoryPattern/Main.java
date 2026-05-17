package creational.FactoryPattern;



// Client
public class Main {
    public static void main(String[] args) {

        NotificationCreator creator = new EmailCreator();
        creator.notifyUser("Hello!");


        NotificationCreator creatorr = new SMSCreator();
        creatorr.notifyUser("Code 1234");


    }
}
