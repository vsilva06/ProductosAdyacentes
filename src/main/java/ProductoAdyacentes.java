import java.util.ArrayList;

class ProductoAdyacentes {

    
    long productoAdyacentes(int[] arr){
        long mayor = 0;
        if(!validacion(arr)){ // validacion del arreglo
            return 0;
        }
        mayor = arr[0]*arr[1];
        for (int i=1; i<arr.length-1; i++) {
            if (arr[i]*arr[i+1] > mayor) {
                mayor = arr[i] * arr[i+1];
            }
        }
        return mayor;
    }

    private boolean validacion(int[] arr){
        if(arr==null){//arreglo vacion retorna error
            System.out.println("Error, arreglo vacio");
            return false;
        }

        else if(arr.length<2){// arreglo muy corto retorna error
            System.out.println("Error, arreglo muy corto");
            return false;
        }else{
            return true;
        }

    }

}
