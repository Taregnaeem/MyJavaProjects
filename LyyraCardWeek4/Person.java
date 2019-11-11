public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
        this.height = 0;
        this.weight = 0;

    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightDividedByHundred = this.height / 100.0;
        return this.weight / (heightDividedByHundred * heightDividedByHundred);
    }
}