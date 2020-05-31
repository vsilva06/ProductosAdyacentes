import java.util.ArrayList;

class ProductoAdyacentes2 {


    long productoAdyacentes(int[] arr) {
        long mayor = 0;

        if (arr == null) {
            System.out.println("Error, arreglo vacio");
            return 0;
        } else if (arr.length < 2) {
            System.out.println("Error, arreglo muy corto");
            return 0;
        } else { // Arreglo no nulo y debe tener al menos 2 numeros
            mayor = arr[0] * arr[1];
            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i] * arr[i + 1] > mayor) {
                    mayor = arr[i] * arr[i + 1];
                }
            }
        }
        return mayor;
    }

    long productoAdyacentes(long[] arr) {
        long mayor = 0;

        if (arr == null) {
            System.out.println("Error, arreglo vacio");
            return 0;
        } else if (arr.length < 2) {
            System.out.println("Error, arreglo muy corto");
            return 0;
        } else { // Arreglo no nulo y debe tener al menos 2 numeros
            mayor = arr[0] * arr[1];
            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i] * arr[i + 1] > mayor) {
                    mayor = arr[i] * arr[i + 1];
                }
            }
        }
        return mayor;
    }

    double productoAdyacentes(float[] arr) {
        double mayor = 0;

        if (arr == null) {
            System.out.println("Error, arreglo vacio");
            return 0;
        } else if (arr.length < 2) {
            System.out.println("Error, arreglo muy corto");
            return 0;
        } else { // Arreglo no nulo y debe tener al menos 2 numeros
            mayor = arr[0] * arr[1];
            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i] * arr[i + 1] > mayor) {
                    mayor = arr[i] * arr[i + 1];
                }
            }
        }
        return mayor;
    }

    double productoAdyacentes(double[] arr) {
        double mayor = 0;

        if (arr == null) {
            System.out.println("Error, arreglo vacio");
            return 0;
        } else if (arr.length < 2) {
            System.out.println("Error, arreglo muy corto");
            return 0;
        } else { // Arreglo no nulo y debe tener al menos 2 numeros
            mayor = arr[0] * arr[1];
            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i] * arr[i + 1] > mayor) {
                    mayor = arr[i] * arr[i + 1];

                }
            }
        }
        return mayor;
    }

    public long productoAdyacente(ArrayList<Integer> arr) {
        long producto = 0;

        if (arr == null) {
            System.out.println("Error, arreglo vacio");
            return 0;
        } else if (arr.size() < 2) {
            System.out.println("Error, arreglo muy corto");
            return 0;
        }

        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) * arr.get(i + 1) > producto)
                producto = arr.get(i) * arr.get(i + 1);
        }
        return producto;
    }


}
