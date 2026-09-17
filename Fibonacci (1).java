import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos termos da sequência de Fibonacci deseja calcular: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, digite um número maior que zero.");
        } else {
            System.out.println("Primeiros " + n + " termos da sequência de Fibonacci:");
            calcularFibonacci(n);
        }

        scanner.close();
    }

    public static void calcularFibonacci(int n) {
        long termoAnterior = 0;
        long termoAtual = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(termoAnterior + " ");

            long proximoTermo = termoAnterior + termoAtual;
            termoAnterior = termoAtual;
            termoAtual = proximoTermo;
        }

        System.out.println();
    }
}
