public class ProductoAdyacente3 {

    public static int productoAdyacentes3(int[] arr){
        int mayor = 0;

        if(arr.length>=2) {
            mayor = arr[0]*arr[1];
            for (int i=1; i<arr.length-1; i++) {
                if (arr[i]*arr[i+1] > mayor) {
                    mayor = arr[i] * arr[i+1];
                }
            }
        }
        return mayor;
    }

}
