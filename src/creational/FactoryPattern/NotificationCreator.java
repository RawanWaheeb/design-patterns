package creational.FactoryPattern;

// Creator (Abstract)
public  abstract class NotificationCreator {

// Factory Method
public abstract Notification createNotification();

// common logic
public void notifyUser(String message) {
    Notification n = createNotification();
    n.send(message);
}


}
