import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double suma = 0;
        int num_valores = 0;

        System.out.println("¿Nota (-1 para terminar)?");

        double valor = teclado.nextDouble();
        while (valor != -1) {
            System.out.println("¿Nota (-1 para terminar)?");
            suma += valor;
            num_valores++;
            valor = teclado.nextDouble();
        }

        double media = suma / num_valores;
        System.out.println("La nota media es " + media);

    }
}