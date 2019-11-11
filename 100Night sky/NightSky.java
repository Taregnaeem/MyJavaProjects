import java.util.*;

public class NightSky {
    private int width;
    private int height;
    private double density;
    private int starsInLastPrint = 0;

    public NightSky(double density) {
        this(density, 20, 10);
    }

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine() {
        Random random = new Random();
        String toPrint = "";
        for (int i = 0; i < this.width; i++) {

            if (random.nextDouble() <= this.density) {
                toPrint += "*";
                starsInLastPrint++;
            } else {
                toPrint += " ";
            }

        }
        System.out.print(toPrint);
    }

    public void print() {
        starsInLastPrint = 0;
        for (int i = 0; i < height; i++) {
            printLine();
        }
        System.out.println("");
    }

    public int starsInLastPrint() {
        return starsInLastPrint;
    }
}