package tsmm;
import java.util.logging.*;

public class Main {
    public static void main(String[] args) {
        Piece[] wPieces;
        Piece[] bPieces;
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.setLevel(Level.INFO);
        logger.info("");
    }

    public static void boardSetup() {
        String[] xValues = {"a", "b", "c", "d", "e", "f", "g", "h"};
        String[] idenValues = {"R", "N", "B", "Q", "K"};
    }
}