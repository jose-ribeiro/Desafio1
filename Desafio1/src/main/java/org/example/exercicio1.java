package org.example;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcao;

        do {
            System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
            int num = scanner.nextInt();

            if (isFibonacci(num)) {
                System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + num + " NÃO pertence à sequência de Fibonacci.");
            }

            // Validação da opção (s/n)
            do {
                System.out.print("Deseja realizar um novo teste? (s/n): ");
                opcao = scanner.next();
                if (!opcao.equalsIgnoreCase("s") && !opcao.equalsIgnoreCase("n")) {
                    System.out.println("Opção inválida! Digite 's' para Sim ou 'n' para Não.");
                }
            } while (!opcao.equalsIgnoreCase("s") && !opcao.equalsIgnoreCase("n"));

        } while (opcao.equalsIgnoreCase("s"));

        System.out.println("Programa finalizado.");
        scanner.close();
    }

    public static boolean isFibonacci(int n) {
        int a = 0, b = 1, c;
        if (n == 0 || n == 1) return true;
        while (b < n) {
            c = a + b;
            a = b;
            b = c;
        }
        return b == n;
    }
}



