package tsmm;
import java.util.logging.*;

public class Main {
    public static void main(String[] args) {
        Piece knight = new Piece("a", 1, "N");
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.setLevel(Level.INFO);
        logger.info(knight.getPosition());
    }
}