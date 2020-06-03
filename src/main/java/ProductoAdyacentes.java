import java.math.BigInteger;

class ProductoAdyacentes {
    long productoAdyacentes(int[] arr) {
        BigInteger mayor = new BigInteger("0");
        if (!validacion(arr)) { // validacion del arreglo
            return 0;
        }
        if(arr.length==1){ //
            return arr[0];
        }else {
            BigInteger b1 = BigInteger.valueOf(arr[0]);
            BigInteger b2 = BigInteger.valueOf(arr[1]);
            mayor= b1.multiply(b2);
            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i] * arr[i + 1] > mayor.longValue()) {
                    b1 = BigInteger.valueOf(arr[i]);
                    b2 = BigInteger.valueOf(arr[i+1]);
                    mayor= b1.multiply(b2);
                }
            }
        }
        return mayor.longValue();
    }

    private boolean validacion(int[] arr) {
        try{
            int a = arr[0];
            return true;
        }catch (NullPointerException e){
            System.out.println("Error, arreglo vacio");
            return false;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error, arreglo muy corto");
            return false;
        }

    }
}