package se.lista04;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        var read = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    - Vertebrado
                    - Invertebrado
                    Escolha uma opção:
                    """);
            var opcao = read.nextLine().toLowerCase();
            if ("vertebrado".equals(opcao)) {
                System.out.println("""
                        - Ave
                        - Mamifero
                        Escolha uma opção:
                        """);
                opcao = read.nextLine().toLowerCase();
                if ("ave".equals(opcao)) {
                    System.out.println("""
                            - Carnivoro
                            - Onivoro
                            Escolha uma opção:
                            """);
                    opcao = read.nextLine().toLowerCase();
                    if ("carnivoro".equals(opcao)) {
                        System.out.println("Aguia");
                        break;
                    } else if ("onivoro".equals(opcao)) {
                        System.out.println("Pomba");
                        break;
                    }
                } else if ("mamifero".equals(opcao)) {
                    System.out.println("""
                            - Herbivoro
                            - Onivoro
                            Escolha uma opção:
                            """);
                    opcao = read.nextLine().toLowerCase();

                    if ("herbivoro".equals(opcao)) {
                        System.out.println("Vaca");
                        break;
                    } else if ("onivoro".equals(opcao)) {
                        System.out.println("Homem");
                        break;
                    }
                }
            } else if ("invertebrado".equals(opcao)) {
                System.out.println("""
                        - Inseto
                        - Anelideo
                        Escolha uma opção:
                        """);
                opcao = read.nextLine().toLowerCase();

                if ("inseto".equals(opcao)) {
                    System.out.println("""
                            - Hematofago
                            - Herbivoro
                            Escolha uma opção:
                            """);
                    opcao = read.nextLine().toLowerCase();

                    if ("hematofago".equals(opcao)) {
                        System.out.println("Pulga");
                        break;
                    } else if ("herbivoro".equals(opcao)) {
                        System.out.println("Lagarta");
                        break;
                    }
                } else if ("anelideo".equals(opcao)) {
                    System.out.println("""
                            - Hematofago
                            - Onivoro
                            Escolha uma opção:
                            """);
                    opcao = read.nextLine().toLowerCase();
                    if ("hematofago".equals(opcao)) {
                        System.out.println("Sanguessuga");
                        break;
                    } else if ("herbivoro".equals(opcao)) {
                        System.out.println("Minhoca");
                        break;
                    }
                }
            }
            System.out.println("Opcão invalida");
        }

    }
}
