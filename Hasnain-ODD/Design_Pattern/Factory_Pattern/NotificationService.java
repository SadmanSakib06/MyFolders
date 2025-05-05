public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();

        Notification smsNotification = notificationFactory.createNotification("SMS");
        Notification emailNotification = notificationFactory.createNotification("EMAIL");
        Notification pushNotification = notificationFactory.createNotification("PUSH");

        smsNotification.notifyUser("Sending SMS Notification");
        pushNotification.notifyUser("Sending PUSH Notification");
        emailNotification.notifyUser("Sending EMAIL Notification");
    }
}
