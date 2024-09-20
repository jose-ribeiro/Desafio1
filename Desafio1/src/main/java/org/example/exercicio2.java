package org.example;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();

        int count = countOccurrencesOfA(input);
        System.out.println("A letra 'a' ocorre " + count + " vezes na string.");
    }

    public static int countOccurrencesOfA(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'A') {
                count++;
            }
        }
        return count;
    }
}

