package atividades_switch.lista05;

import java.util.Scanner;

public class Application {
    public static Scanner read = new Scanner(System.in);

    public static class Recibo {
        private String produto;
        private double valor;

        public void setProduto(String produto) {
            this.produto = produto;
        }

        public void setvalor(double valor, int quantidade) {
            this.valor = valor * quantidade;
        }

        public void exibir() {
            System.out.printf("""
                     Produto: %s
                                        \s
                     Valor total: %.2f
                    \s""", produto, valor);
        }

    }

    public static void main(String[] args) {
        Recibo recibo = new Recibo();


        while (true) {
            boolean valid = true;
            System.out.println("""
                    1 - Cachorro Quente - R$ 10,00
                    2 - X-Salada - R$ 15,00
                    3 - X-Bacon - R$ 18,00
                    4 - Bauru - R$ 12,00
                    5 - Refrigerante - R$ 8,00
                    6 - Suco de laranja - R$ 13,00
                    
                    Digite o numero do pedido:
                    """);
            int num = read.nextInt();

            System.out.println("Quantos: ");
            int quantidade = read.nextInt();

            switch (num) {
                case 1:
                    recibo.setProduto("Cachorro Quente");
                    recibo.setvalor(10, quantidade);
                    break;
                case 2:
                    recibo.setProduto("X-Salada");
                    recibo.setvalor(15, quantidade);
                    break;
                case 3:
                    recibo.setProduto("X-Bacon");
                    recibo.setvalor(18, quantidade);
                    break;
                case 4:
                    recibo.setProduto("Bauru");
                    recibo.setvalor(12, quantidade);
                    break;
                case 5:
                    recibo.setProduto("Refrigerante");
                    recibo.setvalor(8, quantidade);
                    break;
                case 6:
                    recibo.setProduto("Suco de laranja");
                    recibo.setvalor(13, quantidade);
                    break;
                default:
                    System.out.println("Opção invalida!");
                    valid = false;

            }

            if (valid) {
                break;
            }
        }

        recibo.exibir();


    }
}
