package raytracer;

public class Environment {

    private final Vector gravity;
    private final Vector wind;

    Environment(Vector gravity, Vector wind){
        this.gravity = gravity;
        this.wind = wind;
    }

    public Vector getGravity() {
        return gravity;
    }

    public Vector getWind() {
        return wind;
    }
}
