package estrutura.condicional;

import java.util.Scanner;

public class Exerciicio_7 {
  public static void main(String[] args) {

    /*
     * Dados três valores X,Y,Z, verificar se eles
     * podem ser os comprimentos dos lados de um
     * triângulo. Se eles não formarem um triângulo
     * escrever uma mensagem. Considerar que o
     * comprimento de cada lado de um triângulo é
     * menor que a soma dos outros dois lados.
     */

    Scanner input = new Scanner(System.in);
    double x, y, z;

    System.out.print("Digite o lado X: ");
    x = input.nextDouble();

    System.out.print("Digite o lado Z: ");
    z = input.nextDouble();

    System.out.print("Digite o lado Y: ");
    y = input.nextDouble();

    if (x > (y + z) || z > (y + x) || y > (x + z)) {
      System.out.println("Não é um triângulo");
    }
  }

}
