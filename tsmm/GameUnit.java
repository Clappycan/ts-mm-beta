package tsmm;

public class GameUnit {
    private String x;
    private int y;

    public GameUnit(String x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getPosition() {
        return x + y;
    }

    public static void boardSetup() {

    }

}
