package raytracer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    
    double ANY_X;
    double ANY_Y;
    double ANY_Z;
    
    @Test
    void testPointCreation(){
        Point point = new Point(ANY_X, ANY_Y, ANY_Z);

        assertEquals(1.0, point.typeOfTuple());
    }

}