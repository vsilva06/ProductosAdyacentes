class ProductoAdyacentes {

    int productoAdyacentes(int[] arreglo){
        int producto=0;
        for(int i=0;i<arreglo.length-1;i++){
            if(arreglo[i]*arreglo[i+1]>producto){
                producto=arreglo[i]*arreglo[i+1];
            }
        }
        return producto;
    }
}
