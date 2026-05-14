package LLD.SolidPrinciples.LiskovSubstitutionPrinciple.Violates;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Penguin();
        bird.fly();
    }
}
