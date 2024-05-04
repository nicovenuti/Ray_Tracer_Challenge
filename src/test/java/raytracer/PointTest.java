package raytracer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    double ANY_X = 4.3;
    double ANY_Y = 1.2;
    double ANY_Z = 9.2;
    
    @Test
    void testPointCreation(){
        Point point = new Point(ANY_X, ANY_Y, ANY_Z);

        assertEquals(true, point.isPoint());
    }

}