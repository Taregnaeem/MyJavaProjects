public class Reformatory {
    private int totalWeightsCount = 0;;

    public int weight(Person person) {
        
        person.getWeight();
        this.totalWeightsCount++;

        return -1;
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int totalWeightsMeasured() {
        return this.totalWeightsCount;

    }

}
