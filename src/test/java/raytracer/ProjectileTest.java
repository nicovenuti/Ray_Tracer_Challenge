package raytracer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProjectileTest {

    Vector A_VECTOR = null;

    @Test
    void testTickTime(){
        Point pos = mock(Point.class);
        Vector vel = mock(Vector.class);
        Projectile projectile = new Projectile(pos, vel);

        Environment environment = mock(Environment.class);
        when(environment.getGravity()).thenReturn(A_VECTOR);
        when(environment.getWind()).thenReturn(A_VECTOR);


        projectile.tickTime(environment);

        verify(pos, times(1)).add(vel);
        verify(vel, times(2)).add(A_VECTOR);
    }

}