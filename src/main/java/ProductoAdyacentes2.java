import java.util.ArrayList;

public class ProductoAdyacentes2 {

    public int productoAdyacente(int arreglo[]){
        int producto = 0;

        for (int i = 0; i < arreglo.length-1; i++) {
            if (arreglo[i]*arreglo[i+1]>producto)
                producto = arreglo[i]*arreglo[i+1];
        }
        return producto;
    }

    public double productoAdyacente(double arr[]){
        double producto = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]*arr[i+1]>producto)
                producto = arr[i]*arr[i+1];
        }
        return producto;
    }


    public long productoAdyacente(ArrayList<Integer> arr) {
        long producto = 0;

        for (int i = 0; i < arr.size()-1; i++) {
            if (arr.get(i)*arr.get(i+1)>producto)
                producto = arr.get(i)*arr.get(i+1);
        }
        return producto;
    }
}

