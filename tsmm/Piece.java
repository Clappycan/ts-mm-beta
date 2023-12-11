package tsmm;

public class Piece extends GameUnit {
    private String identifier;

    public Piece(String x, int y, String identifier) {
        super(x, y);
        this.identifier = identifier;
    }

    public String getPosition() {
        return identifier + super.getPosition();
    }
}
