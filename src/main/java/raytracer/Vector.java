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
    public Tuple negate() {
        return new Vector(-coords[0], -coords[1], -coords[2]);
    }

    public void times(double coeff){
        coords[0] *= coeff;
        coords[1] *= coeff;
        coords[2] *= coeff;
    }

    public double modulo(){
        return Math.sqrt(coords[0]*coords[0]
                + coords[1]*coords[1]
                + coords[2]*coords[2] );
    }

    public void normalize(){
        double modulo = Math.sqrt(coords[0]*coords[0]
                + coords[1]*coords[1]
                + coords[2]*coords[2] );
        times(modulo);
    }

    public double dot(Vector otherVector){
        double[] otherCoords = otherVector.getCoords();
        return (coords[0]*otherCoords[0]
                + coords[1]*otherCoords[1]
                + coords[2]*otherCoords[2] );
    }

    public Vector cross(Vector otherVector){
        double[] otherCoords = otherVector.getCoords();
        return new Vector (coords[1]*otherCoords[2] - coords[2]*otherCoords[1],
                coords[2]*otherCoords[0] - coords[0]*otherCoords[2],
                coords[0]*otherCoords[1] - coords[1]*otherCoords[0]);
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
