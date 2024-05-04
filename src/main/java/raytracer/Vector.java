package raytracer;

import java.util.Arrays;

public class Vector implements Tuple{


    final double[] coords = new double[4];

    Vector(double anyX, double anyY, double anyZ) {
        this.coords[0] = anyX;
        this.coords[1] = anyY;
        this.coords[2] = anyZ;
        this.coords[3] = 0.0;
    }

    @Override
    public boolean isPoint() {
        return false;
    }

    @Override
    public double[] getCoords() {
        return coords;
    }

    @Override
    public Tuple add(Tuple tuple) {
        double[] otherCoords = tuple.getCoords();
        if (tuple.isPoint()) {
            return new Point(coords[0]+otherCoords[0],
                    coords[1]+otherCoords[1],
                    coords[2]+otherCoords[2]);
        } else {
            return new Vector(coords[0]+otherCoords[0],
                    coords[1]+otherCoords[1],
                    coords[2]+otherCoords[2]);
        }
    }

    @Override
    public Tuple subtract(Tuple tuple) {
        if (tuple.isPoint()){
            throw new IllegalArgumentException("Cannot add two points");
        } else {
            double[] otherCoords = tuple.getCoords();
            return new Vector(coords[0]-otherCoords[0],
                    coords[1]-otherCoords[1],
                    coords[2]-otherCoords[2]);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return Arrays.equals(coords, vector.coords);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coords);
    }
}
