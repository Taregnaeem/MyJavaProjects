import java.util.ArrayList;

public class Player {
    private String name;
    private int amountOfGoals;

    public Player(String name, int amountOfGoals) {
        this.name = name;
        this.amountOfGoals = amountOfGoals;

    }

    public Player(String name) {
        this(name, 0);
    }

    public String getName() {
        return this.name;
    }

    public int goals() {
        return this.amountOfGoals;
    }

    public String toString() {
        return this.name + "," + this.amountOfGoals;
    }

    public String getName(Player player) {
        return player.getName();
    }
}