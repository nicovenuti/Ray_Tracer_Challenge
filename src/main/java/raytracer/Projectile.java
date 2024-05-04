package raytracer;

public class Projectile {

    private final Point position;
    private final Vector velocity;

    Projectile(Point initialPos, Vector initialVel){
        this.position = initialPos;
        this.velocity = initialVel;
    }

    public void tickTime(Environment environment){
        position.add(velocity);
        velocity.add(environment.getGravity());
        velocity.add(environment.getWind());
    }
}
