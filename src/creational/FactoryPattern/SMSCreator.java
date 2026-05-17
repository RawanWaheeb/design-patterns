package creational.FactoryPattern;

public class SMSCreator extends NotificationCreator{
    public  Notification createNotification(){
        return  new SMSNotification();
    }
}
