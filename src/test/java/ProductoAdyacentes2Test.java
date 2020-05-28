import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductoAdyacentes2Test {
    private ProductoAdyacentes2 c;

    @Before
    public void setUp() throws Exception {
        c = new ProductoAdyacentes2();
    }

    @After
    public void tearDown() throws Exception {
        c = null;
    }

    @Test
    public void productoAdyacente() {
       double[] num0 = {1073741823, 1073741823, 1073741545};
        System.out.println(c.productoAdyacente(num0));

    }


}