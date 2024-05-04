package raytracer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {

    double ANY_X = 4.3;
    double ANY_Y = 1.2;
    double ANY_Z = 9.2;

    @Test
    void testVectorCreation(){
        Vector vector = new Vector(ANY_X, ANY_Y, ANY_Z);

        assertEquals(false, vector.isPoint());
    }

    @Test
    void testScalarMultiplication() {
        Vector vector = new Vector(ANY_X, ANY_Y, ANY_Z);

        vector.times(3.2);

        assertEquals(new Vector(
                3.2*ANY_X,
                3.2*ANY_Y,
                3.2*ANY_Z), vector);
    }

    @Test
    void testModulo() {
        Vector vector1 = new Vector(1, 0, 0);
        Vector vector2 = new Vector(0, 1, 0);
        Vector vector3 = new Vector(0, 0, 1);
        Vector vector4 = new Vector(1, 2, 3);
        Vector vector5 = new Vector(-1, -2, -3);

        assertEquals(1, vector1.modulo());
        assertEquals(1, vector2.modulo());
        assertEquals(1, vector3.modulo());
        assertEquals(Math.sqrt(14), vector4.modulo());
        assertEquals(Math.sqrt(14), vector5.modulo());
    }

    @Test
    void testNormalize(){
        // TODO
    }

    @Test
    void testDot(){
        // TODO
    }


    @Test
    void testCross(){
        // TODO
    }
}