package estrutura.sequencial;

import java.util.Scanner;

public class Exercicio_1 {

  public static void main(String[] args) {
    // Faça um programa que receba três notas, calcule e
    // mostre a média aritmética entre elas.

    Scanner input = new Scanner(System.in);
    double nota1, nota2, nota3, media;

    System.out.print("Informe um número: ");
    nota1 = input.nextDouble();

    System.out.print("Informe um número: ");
    nota2 = input.nextDouble();

    System.out.print("Informe um número: ");
    nota3 = input.nextDouble();

    media = (nota1 + nota2 + nota3 / 3);

    System.out.format("A média é: %.2f", media);
    input.close();

  }

}
