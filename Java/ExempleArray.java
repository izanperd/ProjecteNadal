public class ExempleArray {

    public static void main(String[] args) {
        int[] numeros = new int[5];
        for (int i = 0; i <= numeros.length; i++) {
            numeros[i] = i * 10;
            System.out.println("Posició " + i + ": " + numeros[i]);
        }
    }
}
