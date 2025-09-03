import java.util.Random;

public class AlgoritmoLista {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("=== PROGRAMA LISTA ALEATORIA ===");

        int[] lista = new int[10];

        
        for (int i = 0; i < lista.length; i++) {
            lista[i] = random.nextInt(10) + 1; 
        }

        System.out.println("Numero | Cuadrado | Cubo");
        System.out.println("--------------------------");

        for (int numero : lista) {
            int cuadrado = numero*numero;
            int cubo = numero*numero*numero;

            System.out.println(  numero+"--->"+cuadrado+"--->"+cubo);
        }
    }
}
