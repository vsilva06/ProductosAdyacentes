public class ProductoAdyacente3 {

    public int productoAdyacentes3(int[] arr){
        int mayor = 0;

        if(arr!=null && arr.length>=2) { // Arreglo no nulo y debe tener al menos 2 numeros
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
