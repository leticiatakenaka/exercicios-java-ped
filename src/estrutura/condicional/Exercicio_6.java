package estrutura.condicional;

import java.util.Scanner;

public class Exercicio_6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double x, f = 0;

    System.out.print("Digite o valor de x: ");
    x = input.nextDouble();

    if (x < -2) {
      f = 2 * x + 2;
    } else if (-2 <= x && x < 3) {
      f = 3;
    } else {
      f = -x;
    }

    System.out.format("O resultado da função é %.2f", f);

    input.close();
  }
}
