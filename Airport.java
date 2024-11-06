public class Airport {
  public static void main(String[] args) {
    Approach approach = new Approach();

    approach.setStrategy(new ApproachByGroups());
    approach.startApproach();

    approach.setStrategy(new ApproachByLine());
    approach.startApproach();

    approach.setStrategy(new ApproachByPriority());
    approach.startApproach();
  }
}