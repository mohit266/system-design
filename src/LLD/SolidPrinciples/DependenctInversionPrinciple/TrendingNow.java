package LLD.SolidPrinciples.DependenctInversionPrinciple;

class TrendingNow implements RecommendationStrategy {
    public void getRecommendations() {
        System.out.println("Showing trending content...");
    }
}