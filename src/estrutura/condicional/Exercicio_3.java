package estrutura.condicional;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio_3 {
  public static void main(String[] args) {
    // Faça um programa para resolver
    // equações de segundo grau (ax^2 + bx + c = 0)
    double b, a, c;
    double resultado;

    double raiz1, raiz2;

    Scanner input = new Scanner(System.in);

    System.out.print("Digite o valor B: ");
    b = input.nextDouble();

    System.out.print("Digite o valor A: ");
    a = input.nextDouble();

    System.out.print("Digite o valor C: ");
    c = input.nextDouble();

    resultado = b * b - 4 * a * c;

    if (resultado < 0) {
      System.out.println("Não existe raiz real!");
    } else if (resultado == 0) {
      raiz1 = -b / (2 * a);
      System.out.format("Só existe uma raiz real: %.3f", raiz1);
    } else {
      raiz1 = (-b + Math.sqrt(resultado)) / (2 * a);
      raiz2 = (-b - Math.sqrt(resultado)) / (2 * a);
      System.out.format("x1 = %.3f\nx2 = %.3f", raiz1, raiz2);
    }
  }
}
