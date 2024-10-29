package se.lista03;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        boolean opcao = false;

        System.out.println("Digite o seu nome: ");
        String nome = read.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = read.nextInt();

        if (idade >= 18 && idade < 69) {
            if (idade >= 60) {
                System.out.println("Primeira doação: ");
                opcao = read.nextBoolean();
            }

            if (!opcao) {
                System.out.printf("%s esta apto para doar sangue!", nome);
            } else {
                System.out.printf("%s não esta apto para doar sangue!", nome);
            }

        } else {
            System.out.printf("%s não esta apto para doar sangue!", nome);
        }
    }
}
