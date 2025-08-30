public class BusquedaBinariaRotacion {
    public static void main(String[] args) {
        int[] array = {6, 1, 2, 3, 4, 5};

        int primero = 0;
        int segundo = array.length - 1;
        int tamañoArrray = array.length;
        int rotacion = -1;

        while (primero <= segundo) {
            int medio = (primero + segundo) / 2;
            if (array[medio] <= array[(medio - 1 + tamañoArrray) % tamañoArrray] && 
                array[medio] <= array[(medio + 1) % tamañoArrray]) {
                rotacion = medio;
                break;
            }
            if (array[medio] <= array[segundo]) {
                segundo = medio - 1;
            } else {
                primero = medio + 1;
            }
        }

        System.out.println("El array esta rotado " + rotacion + " veces");
    }
    
}
