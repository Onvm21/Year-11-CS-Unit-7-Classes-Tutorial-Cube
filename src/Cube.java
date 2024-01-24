public class Cube {
    private int side;

    public Cube() {
        side = 1;
    }

    public Cube(int n) throws IllegalArgumentException {
        if (n < 1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        side = n;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) throws IllegalArgumentException {
        if (side < 1) {
            throw new IllegalArgumentException("A cube's side length cannot be less than 1!");
        }
        this.side = side;
    }

    public int calculateSurfaceArea() {
        return side * side * 6;
    }

    public int calculateVolume() {
        return side * side * side;
    }

    public String toString() {
        return "Cube{side=" + side + "}";
    }
}