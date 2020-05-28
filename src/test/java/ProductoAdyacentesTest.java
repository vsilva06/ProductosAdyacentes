import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
        int[] arreglo = {1, -4, 2, 2, 5, -1};
        assertEquals(p.productoAdyacentes(arreglo),10);
    }
}