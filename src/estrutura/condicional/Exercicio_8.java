package estrutura.condicional;

import java.util.Scanner;

public class Exercicio_8 {
  public static void main(String[] args) {
    // 8. Faça um programa que receba 2 números e
    // mostre o seguinte menu:

    // 1 - Somar os dois números
    // 2 - Multiplicar os dois números
    // 3 - Subtrair o número maior pelo número menor (se os dois forem
    // iguais, retorne zero)
    // 4 - Dividir o primeiro número pelo segundo (lembre-se de que não
    // existe divisão por zero)

    // De acordo com a opção escolhida, exiba o resultado
    // correspondente.

    Scanner input = new Scanner(System.in);
    double num1, num2;

    System.out.print("Digite o primeiro número: ");
    num1 = input.nextDouble();

    System.out.print("Digite o segundo número: ");
    num2 = input.nextDouble();

    System.out.format("\n%s + %s = %s\n", num1, num2, (num1 + num2));
    System.out.format("%s * %s = %s\n", num1, num2, (num1 * num2));

    if (num1 > num2) {
      System.out.format("%s - %s = %s\n", num1, num2, (num1 - num2));
    } else if (num2 > num1) {
      System.out.format("%s - %s = %s\n", num2, num1, (num2 - num1));
    } else {
      System.out.format("0");
    }

    if (num2 != 0) {
      System.out.format("%s / %s = %s\n", num1, num2, (num1 / num2));
    }
  }
}
