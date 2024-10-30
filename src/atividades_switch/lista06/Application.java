package atividades_switch.lista06;

import java.util.Scanner;

public class Application {
    static Scanner read = new Scanner(System.in);

    public static class Cargo {
        String nome;
        String cargo;
        double salario;

        public Cargo(String nome, String cargo, double salario) {
            this.nome = nome;
            this.cargo = cargo;
            this.salario = salario;
        }


        @Override
        public String toString() {
            return "Nome do colaborador: " + nome + "\n" +
                    "\n" +
                    "Cargo: " + cargo + "\n" +
                    "\n" +
                    "Salário: R$" + salario;
        }
    }

    public static void main(String[] args) {

        Cargo cargo = null;
        while (true) {
            boolean valid = true;
            System.out.println("Digite seu nome:");
            String nome = read.nextLine();

            System.out.println("Digite seu Salario:");
            double salario = read.nextDouble();

            System.out.println("""
                    1 - Gerente
                    2 - Vendedor
                    3 - Supervisor
                    4 - Motorista
                    5 - Estoquista
                    6 - Técnico de TI
                    
                    Digite o numero do cargo:
                    """);
            int num = read.nextInt();


            switch (num) {
                case 1:
                    salario += (0.1 * salario);
                    cargo = new Cargo(nome, "Gerente", salario);
                    break;
                case 2:
                    salario += (0.07 * salario);
                    cargo = new Cargo(nome, "Vendedor", salario);
                    break;
                case 3:
                    salario += (0.09 * salario);
                    cargo = new Cargo(nome, "Supervisor", salario);
                    break;
                case 4:
                    salario += (0.06 * salario);
                    cargo = new Cargo(nome, "Motorista", salario);
                    break;
                case 5:
                    salario += (0.05 * salario);
                    cargo = new Cargo(nome, "Estoquista", salario);
                    break;
                case 6:
                    salario += (0.08 * salario);
                    cargo = new Cargo(nome, "Técnico de TI", salario);
                    break;
                default:
                    System.out.println("Opção invalida!!!");
                    valid = false;
            }
            if (valid) {
                break;
            }
        }

        System.out.println(cargo);
    }
}
