package LLD.SolidPrinciples.DependenctInversionPrinciple;

class RecentlyAdded implements RecommendationStrategy {
    public void getRecommendations() {
        System.out.println("Showing recently added content...");
    }
}
