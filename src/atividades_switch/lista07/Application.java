package atividades_switch.lista07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        while (true) {
            boolean valid = true;
            System.out.println("""
                    1 - Soma
                    2 - Subtração
                    3 - Multiplicação
                    4 - Divisão
                    
                    Digite o numero do operação:
                    """);
            int opcao = read.nextInt();

            List<Float> num = new ArrayList<>();
            for (int i = 1; i <= 2; i++) {
                System.out.printf("Digite o %sº número: \n", i);
                num.add(read.nextFloat());
            }
            switch (opcao) {
                case 1:
                    System.out.printf("%s + %s = %s", num.get(0), num.get(1), (num.get(0) + num.get(1)));
                    break;
                case 2:
                    System.out.printf("%s + %s = %s", num.get(0), num.get(1), (num.get(0) - num.get(1)));
                    break;
                case 3:
                    System.out.printf("%s + %s = %s", num.get(0), num.get(1), (num.get(0) * num.get(1)));
                    break;
                case 4:
                    System.out.printf("%s + %s = %s", num.get(0), num.get(1), (num.get(0) / num.get(1)));
                    break;
                default:
                    System.out.println("Opção invalida");
                    valid = false;
            }
            if (valid) {
                break;
            }
        }
    }
}
