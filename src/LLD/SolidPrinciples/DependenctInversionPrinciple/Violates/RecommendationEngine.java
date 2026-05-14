package LLD.SolidPrinciples.DependenctInversionPrinciple.Violates;

class RecommendationEngine {
    private RecentlyAdded recommender = new RecentlyAdded();

    public void recommend() {
        recommender.getRecommendations();
    }
}