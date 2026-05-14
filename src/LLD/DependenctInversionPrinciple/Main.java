package LLD.DependenctInversionPrinciple;

class Main {
    public static void main(String[] args) {
        RecommendationStrategy strategy = new TrendingNow();
        RecommendationEngine engine = new RecommendationEngine(strategy);
        engine.recommend();
    }
}