package LLD.SolidPrinciples.DependenctInversionPrinciple;

class GenreBased implements RecommendationStrategy {
    public void getRecommendations() {
        System.out.println("Showing content based on your favorite genres...");
    }
}