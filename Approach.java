class Approach {
    private ApproachStrategy strategy;

    public void setStrategy(ApproachStrategy strategy) {
        this.strategy = strategy;
    }

    public void startApproach() {
        if (strategy != null) {
            strategy.approachPassengers();
        } else {
            System.out.println("Please select a strategy first!");
        }
    }
}