public class MediaVector {
    public static void main(String[] args) {
        int[] array = {4, 8, 6, 10, 2};
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        double media = (double) suma / array.length;
        System.out.println("La media de los elementos del vector es: " + media);
    }
}
