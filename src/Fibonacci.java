import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (pertenceFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci!");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }

    private static boolean pertenceFibonacci(int numero) {
        int a = 0, b = 1, proximo;

        while (a <= numero) {
            if (a == numero) {
                return true;
            }
            proximo = a + b;
            a = b;
            b = proximo;
        }

        return false;
    }
}
