package creational.FactoryPattern;

// Concrete Products

public class SMSNotification implements  Notification{
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}




