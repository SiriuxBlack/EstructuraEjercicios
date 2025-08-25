import java.util.Scanner;
public class CompararStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la primer palabra");
        String word_1 = sc.nextLine();
        System.out.println("ingrese la segunda palabra");
        String word_2 = sc.nextLine();
        sc.close();
        if (word_1.length() == word_2.length()) {
            System.out.println("las dos palabras tienen la misma cantidad de letras : "+word_1.length());         
        } else {
            int cant_letras = word_1.length()-word_2.length();
            cant_letras = Math.abs(cant_letras);
            System.out.println("las palabras no tiene la misma cantidad de letras, existe una diferencia de : "+ cant_letras);
        }
        char letra;
        int contador =0;
        int word_min = Math.min(word_1.length(), word_2.length());
        System.out.print("sus palabras coinciden en : ");
        for (int i = 0; i < word_min; i++) {
        
            if (word_1.charAt(i) == word_2.charAt(i)) {
                contador++;
                letra = word_1.charAt(i);
                System.out.print(letra);
            }
        }
        System.out.print(", un total de "+contador+" letras");
    }
}
