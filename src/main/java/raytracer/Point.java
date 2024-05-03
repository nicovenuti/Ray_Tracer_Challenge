package raytracer;

import javax.naming.OperationNotSupportedException;
import java.util.Arrays;

public class Point implements Tuple{
    final double[] coords = new double[4];

    Point(double anyX, double anyY, double anyZ) {
        this.coords[0] = anyX;
        this.coords[1] = anyY;
        this.coords[2] = anyZ;
        this.coords[3] = 1.0;
    }

    @Override
    public double typeOfTuple() {
        return coords[3];
    }

    @Override
    public double[] getCoords() {
        return coords;
    }

    @Override
    public Tuple add(Tuple tuple) {
        if (tuple.typeOfTuple() > 0.5){
            throw new IllegalArgumentException("Cannot add two points");
        } else {
            double[] otherCoords = tuple.getCoords();
            return new Point(coords[0]+otherCoords[0],
                    coords[1]+otherCoords[1],
                    coords[2]+otherCoords[2]);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Arrays.equals(coords, point.coords);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coords);
    }
}
