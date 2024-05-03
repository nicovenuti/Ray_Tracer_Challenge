package raytracer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {

    double ANY_X;
    double ANY_Y;
    double ANY_Z;

    @Test
    void testVectorCreation(){
        Vector vector = new Vector(ANY_X, ANY_Y, ANY_Z);

        assertEquals(0.0, vector.typeOfTuple());
    }
}