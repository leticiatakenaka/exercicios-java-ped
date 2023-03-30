package estrutura.sequencial;

import java.util.Scanner;

public class Exercicio_5 {
  public static void main(String[] argas) {
    // Faça um programa que calcule e mostre a
    // área de um losango AREA = (DIAGONAL MAIOR *
    // DIAGONAL MENOR)/2
    Scanner input = new Scanner(System.in);
    double maior, menor;

    System.out.print("Digite a diagonal maior: ");
    maior = input.nextDouble();

    System.out.print("Digite a diagonal menor: ");
    menor = input.nextDouble();

    System.out.print("A área é " + (maior + menor) / 2);
  }
}
