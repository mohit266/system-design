package LLD.SolidPrinciples.LiskovSubstitutionPrinciple;

public class EmailNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Email sent.");
    }
}
