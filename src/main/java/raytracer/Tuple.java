package raytracer;

public interface Tuple {

    boolean isPoint();

    double[] getCoords();

    Tuple add(Tuple tuple);
    Tuple subtract(Tuple tuple);
}
