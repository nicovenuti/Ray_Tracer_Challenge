package raytracer;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static raytracer.RayTracerConst.EPSILON;

class VectorTest {

    double ANY_X = 4.3;
    double ANY_Y = 1.2;
    double ANY_Z = 9.2;

    double ANY_X_2 = 9.1;
    double ANY_Y_2 = -4.3;
    double ANY_Z_2 = -2.4;

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
        Random random = new Random();

        Vector vector = new Vector(random.nextInt(100), random.nextInt(100), random.nextInt(100) );
        vector.normalize();

        assertEquals(1, vector.modulo());
    }

    @Test
    void testDot(){
        Vector vector1 = new Vector(ANY_X, ANY_Y, ANY_Z);
        Vector vector2 = new Vector(ANY_X_2, ANY_Y_2, ANY_Z_2);
        Vector vector3 = new Vector(1, 0, 0);
        Vector vector4 = new Vector(0, 1, 0);

        double actual1 = vector1.dot(vector2);
        double actual2 = vector3.dot(vector4);

        assertEquals(ANY_X_2*ANY_X+
                ANY_Y_2*ANY_Y+
                ANY_Z_2*ANY_Z, actual1);
        assertEquals(0, actual2);
    }


    @Test
    void testCross(){
        Vector vector1 = new Vector(ANY_X, ANY_Y, ANY_Z);
        Vector vector2 = new Vector(ANY_X_2, ANY_Y_2, ANY_Z_2);

        Vector actual = vector1.cross(vector2);

        assertEquals(new Vector(
                ANY_Z_2*ANY_Y - ANY_Y_2*ANY_Z,
                ANY_X_2*ANY_Z - ANY_Z_2*ANY_X,
                ANY_Y_2*ANY_X - ANY_X_2*ANY_Y), actual);
        assertTrue(actual.dot(vector1) < EPSILON);
        assertTrue(actual.dot(vector2) < EPSILON);

    }
}