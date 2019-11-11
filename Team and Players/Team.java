import java.util.ArrayList;;

public class Team {
    private String name;
    private ArrayList<Player> list = new ArrayList<Player>();
    private int maxSize = 16;
    // private int goalsScored;

    public Team(String name) {
        this.name = name;
        // this.list = new ArrayList<Player>();
    }

    public String getName() {
        return this.getName();
    }

    public void addPlayer(Player player) {
        if (list.size() <= this.maxSize) {
            this.list.add(player);
        }
    }

    public void printPlayers() {
        for (Player players : list) {
            System.out.println(players);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.list.size();
    }

    public int goals() {
        int goals = 0;
        for (Player play : list) {
            goals += play.goals();
        }
        return goals;
    }
}
