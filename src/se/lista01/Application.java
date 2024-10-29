package se.lista01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        List<String> caracters = Arrays.asList("A", "B", "C");
        int total = 0;
        StringBuilder calculo = new StringBuilder();

        for (String caracter : caracters) {

            System.out.printf("Digite o número %s: \n", caracter);
            var value = read.nextInt();

            if (!caracter.equals("C")) {
                total += value;
                calculo.append(value).append(" + ");
                continue;
            }
            System.out.printf("%s = %s ", calculo.substring(0, 5), total);
            if (total > value) {
                System.out.printf("""
                        > %s
                        A Soma de A + B é Maior do que C
                        """, value);
            } else if (total < value) {
                System.out.printf("""
                        < %s
                        A Soma de A + B é Menor do que C
                        """, value);
            } else {
                System.out.printf("""
                        = %s
                        A Soma de A + B é Igual a C
                        """, value);
            }
        }


    }
}
