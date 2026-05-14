package LLD.SolidPrinciples.LiskovSubstitutionPrinciple;

public class Main {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification text = new TextNotification();

        email.send();
        text.send();
    }
}
