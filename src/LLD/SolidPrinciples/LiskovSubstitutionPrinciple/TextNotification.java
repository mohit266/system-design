package LLD.SolidPrinciples.LiskovSubstitutionPrinciple;

public class TextNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Text sent.");
    }
}
