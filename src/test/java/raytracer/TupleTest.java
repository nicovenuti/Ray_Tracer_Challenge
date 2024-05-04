package raytracer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TupleTest {

    double ANY_X_1 = 4.3;
    double ANY_Y_1 = 1.2;
    double ANY_Z_1 = 9.2;

    double ANY_X_2 = 9.1;
    double ANY_Y_2 = -4.3;
    double ANY_Z_2 = -2.4;
    @Test
    void testPointAndVectorAddition() {
        Tuple tuple1 = new Point(ANY_X_1, ANY_Y_1, ANY_Z_1);
        Tuple tuple2 = new Vector(ANY_X_2, ANY_Y_2, ANY_Z_2);

        Tuple actual = tuple1.add(tuple2);

        assertEquals(new Point(
                ANY_X_1 + ANY_X_2,
                ANY_Y_1 + ANY_Y_2,
                ANY_Z_1 + ANY_Z_2), actual);
    }

    @Test
    void testVectorAndVectorAddition() {
        Tuple tuple1 = new Vector(ANY_X_1, ANY_Y_1, ANY_Z_1);
        Tuple tuple2 = new Vector(ANY_X_2, ANY_Y_2, ANY_Z_2);

        Tuple actual = tuple1.add(tuple2);

        assertEquals(new Vector(
                ANY_X_1 + ANY_X_2,
                ANY_Y_1 + ANY_Y_2,
                ANY_Z_1 + ANY_Z_2), actual);
    }

    @Test
    void testPointAndPointAddition() {
        Tuple tuple1 = new Point(ANY_X_1, ANY_Y_1, ANY_Z_1);
        Tuple tuple2 = new Point(ANY_X_2, ANY_Y_2, ANY_Z_2);

        assertThrows(IllegalArgumentException.class, ()->tuple1.add(tuple2));
    }

    @Test
    void testPointAndVectorSubtraction() {
        Tuple tuple1 = new Point(ANY_X_1, ANY_Y_1, ANY_Z_1);
        Tuple tuple2 = new Vector(ANY_X_2, ANY_Y_2, ANY_Z_2);

        Tuple actual = tuple1.subtract(tuple2);

        assertEquals(new Point(
                ANY_X_1 - ANY_X_2,
                ANY_Y_1 - ANY_Y_2,
                ANY_Z_1 - ANY_Z_2), actual);
    }

    @Test
    void testVectorAndVectorSubtraction() {
        Tuple tuple1 = new Vector(ANY_X_1, ANY_Y_1, ANY_Z_1);
        Tuple tuple2 = new Vector(ANY_X_2, ANY_Y_2, ANY_Z_2);

        Tuple actual = tuple1.subtract(tuple2);

        assertEquals(new Vector(
                ANY_X_1 - ANY_X_2,
                ANY_Y_1 - ANY_Y_2,
                ANY_Z_1 - ANY_Z_2), actual);
    }

    @Test
    void testPointAndPointSubtraction() {
        Tuple tuple1 = new Point(ANY_X_1, ANY_Y_1, ANY_Z_1);
        Tuple tuple2 = new Point(ANY_X_2, ANY_Y_2, ANY_Z_2);

        Tuple actual = tuple1.subtract(tuple2);

        assertEquals(new Vector(
                ANY_X_1 - ANY_X_2,
                ANY_Y_1 - ANY_Y_2,
                ANY_Z_1 - ANY_Z_2), actual);
    }
    @Test
    void testVectorAndPointAddition() {
        Tuple tuple1 = new Vector(ANY_X_1, ANY_Y_1, ANY_Z_1);
        Tuple tuple2 = new Point(ANY_X_2, ANY_Y_2, ANY_Z_2);

        assertThrows(IllegalArgumentException.class, ()->tuple1.subtract(tuple2));
    }
}
