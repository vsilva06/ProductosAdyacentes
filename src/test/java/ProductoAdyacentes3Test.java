import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductoAdyacentes3Test {

    private ProductoAdyacentes3 p = new ProductoAdyacentes3();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void ProductoAdyacentes31(){
        int[] arr1 = {1, -4, 2, 2, 5, -1};
        int a =p.productoAdyacentes3(arr1);
        assertEquals(10, a);
    }

    @Test
    public void ProductoAdyacentes32() {
        int[] arr2 = {1, -1, 1, -1, 1, -1};
        assertEquals(120, p.productoAdyacentes3(arr2));
    }
}