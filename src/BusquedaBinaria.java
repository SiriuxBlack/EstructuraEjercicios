
public class BusquedaBinaria {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72, 91};
        int numeroBusqueda = 45;

        int primero = 0;
        int segundo = array.length -1;
        int posicion = -1; 

        while (primero <= segundo) {
            int centro = (primero + segundo) / 2;

            if (array[centro] == numeroBusqueda) {
                posicion = centro;
                
                break;
            } else if (array[centro] < numeroBusqueda) {
                primero = centro +1;
            } else {
                segundo = centro -1;
            }
        }

        if (posicion > -1) {
            System.out.println("numero encontrado en la posicion: " + posicion);
            System.out.println("El numero es = "+ array[posicion]);
        } else {
            System.out.println("numero no encontrado en el arreglo.");
        }
    }
}
