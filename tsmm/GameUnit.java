package tsmm;
import java.util.ArrayList;

public class GameUnit {
    private String x;
    private int y;
    private static ArrayList<Piece> wPieces = new ArrayList<>();

    public GameUnit(String x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getPosition() {
        return x + y;
    }

    public static void boardSetup() {
        wPieces.add(new Piece("a", 1, "R"));
    }

    public static String testing() {
        return wPieces.get(0).getPosition();
    }
}
