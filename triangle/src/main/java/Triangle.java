public class Triangle {

    private TriangleKind kind;

    public Triangle(double side1, double side2, double side3) throws Exception {
        if (Math.min(side1, Math.min(side2, side3)) <= 0) {
            throw new TriangleException();
        }
        if (side1 + side2 + side3 <= 2*Math.max(side1, Math.max(side2, side3))) {
            throw new TriangleException();
        }
        if ((side1 == side2) && (side1 == side3)) {
            kind = TriangleKind.EQUILATERAL;
        } else if ((side1 == side2) || (side1 == side3) || (side2 == side3)) {
            kind = TriangleKind.ISOSCELES;
        } else {
            kind = TriangleKind.SCALENE;
        }
    }

    public TriangleKind getKind() {
        return kind;
    }

}
