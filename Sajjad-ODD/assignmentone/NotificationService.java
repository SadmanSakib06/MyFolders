package assignmentone;

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification notification1 = factory.createNotification("EMAIL");
        notification1.notifyUser("Hello via Email!");

        Notification notification2 = factory.createNotification("SMS");
        notification2.notifyUser("Hello via SMS!");

        Notification notification3 = factory.createNotification("PUSH");
        notification3.notifyUser("Hello via Push!");
    }
}

