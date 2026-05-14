package LLD.SolidPrinciples.LiskovSubstitutionPrinciple.Violates;

public class Penguin extends Bird{
    @Override
    void fly (){
        throw new UnsupportedOperationException("Penguin cannot fly");
    }
}
