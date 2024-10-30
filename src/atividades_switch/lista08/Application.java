package atividades_switch.lista08;

import java.util.Scanner;

public class Application {
    public static class Conta {
        private float valor;

        public Conta(float saldo) {
            this.valor = saldo;
        }

        public void saldo() {
            System.out.printf("""
                    Operação - Saldo
                    
                    Saldo: R$ %.2f
                    """, this.valor);
        }

        public void saque(float valor) {
            this.valor -= valor;
            System.out.printf("""
                    Operação - Saque
                    
                    Saldo %s
                    """, (this.valor >= 0) ? ": R$ " + String.format("%.2f", valor) : "Insuficiente!");
        }

        public void depositar(float valor) {
            this.valor += valor;
            System.out.printf("""
                    Operação - Depósito
                    
                    Saldo: R$ %.2f
                    """, this.valor);
        }
    }

    public static void main(String[] args) {
        var read = new Scanner(System.in);
        Conta conta = new Conta(1000);
        float valor = 0;
        while (true) {
            boolean valid = true;
            System.out.println("""
                    1 - Saldo
                    2 - Saque
                    3 - Depósito
                    
                    Digite o numero do operação:
                    """);
            int opcao = read.nextInt();

            if (opcao != 1) {
                System.out.println("Digite o valor: ");
                valor = read.nextFloat();
            }

            switch (opcao) {
                case 1:
                    conta.saldo();
                    break;
                case 2:
                    conta.saque(valor);
                    break;
                case 3:
                    conta.depositar(valor);
                    break;
                default:
                    System.out.println("Operação Inválida!");
                    valid = false;
            }

            if (valid) {
                break;
            }
        }
    }
}
