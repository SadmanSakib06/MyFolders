public class NotificationFactory {
    private static NotificationFactory notificationFactory = new NotificationFactory();

    private NotificationFactory() {}

    public static NotificationFactory getInstance(){
        return notificationFactory;
    }

    public Notification createNotification(String notificationType) {
        if (notificationType.equals("SMS")) {
            return new SMSNotification();
        }
        else if (notificationType.equals("EMAIL")) {
            return new EmailNotification();
        }
        else if (notificationType.equals("PUSH")) {
            return new PushNotification();
        }
        else {
            return null;
        }
    }
}
