import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ProductoAdyacentesTest {
    private ProductoAdyacentes p;

    @Before
    public void setUp() throws Exception {
        p = new ProductoAdyacentes();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void productoAdyacentes() {
        int[] arreglo = {};
        assertEquals(p.productoAdyacentes(arreglo), 0);
        int[] arreglo0 = {0};
        assertEquals(p.productoAdyacentes(arreglo0), 0);
        int[] arreglo1 = {1, -4, 2, 2, 5, -1};
        assertEquals(p.productoAdyacentes(arreglo1), 10);
        int[] arreglo2 = {1, 2, -12, 10, -10, -12};
        assertEquals(p.productoAdyacentes(arreglo2), 120);
        int[] arreglo3 = {500, -500, -200, 4, 50, 1000, 12, -12};
        int[] arreglo4= null;
        p.productoAdyacentes(arreglo4);
        assertEquals(p.productoAdyacentes(arreglo3), 100000);
        int[] arr2 = {1, -1, 1, -1, 1, -1};
        assertEquals(-1, p.productoAdyacentes(arr2));
        int[] arr1 = {1, -4, 2, 2, 5, -1};
        int[] a = {1, 2, 69, 8, 6};
        assertEquals(10, p.productoAdyacentes(arr1));




    }
}