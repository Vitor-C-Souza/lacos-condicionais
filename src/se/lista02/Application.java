package se.lista02;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String message = "O número ";

        System.out.println("Digite um numero: ");
        int numero = read.nextInt();

        message += numero;

        if (numero % 2 == 0)
            message += " é par ";
        else
            message += " é ímpar ";

        if (numero > 0)
            message += "e positivo.";
        else
            message += "e negativo.";

        System.out.println(message);

    }
}
