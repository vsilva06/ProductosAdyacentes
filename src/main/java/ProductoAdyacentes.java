import java.util.ArrayList;

class ProductoAdyacentes {

    
    long productoAdyacentes(int[] arr){
        long mayor = 0;
        validacion(arr);
        mayor = arr[0]*arr[1];
        for (int i=1; i<arr.length-1; i++) {
            if (arr[i]*arr[i+1] > mayor) {
                mayor = arr[i] * arr[i+1];
            }
        }
        return mayor;
    }

    private boolean validacion(int[] arr){
        if(arr==null){
            System.out.println("Error, arreglo vacio");
            return false;
        }

        else if(arr.length<2){
            System.out.println("Error, arreglo muy corto");
            return false;
        }else{
            return true;
        }

    }

}
