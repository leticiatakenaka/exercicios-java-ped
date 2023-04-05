package estrutura.condicional;

import java.util.Scanner;

public class Exercicio_5 {
  public static void main(String[] args) {
    System.out.println("Escolha um planeta");
    Scanner input = new Scanner(System.in);

    int planeta;
    double gravidade, vo, t, v, h;

    do {
      System.out.println("Digite o número do planeta");
      System.out.println("1 - Mercúrio");
      System.out.println("2 - Vênus ");
      System.out.println("3 - Terra");
      System.out.println("4 - Marte");
      System.out.println("5 - Júpter");
      System.out.println("6 - Saturno");
      System.out.println("7 - Urano");
      System.out.println("8 - Netuno");
      System.out.println("9 - Plutão");

      planeta = input.nextInt();

      System.out.print("Insira o v0: ");
      vo = input.nextDouble();

      System.out.print("Insira o t: ");
      t = input.nextDouble();

      gravidade = calculaGravidade(planeta);
      input.close();

      v = vo - (gravidade * t);
      h = Math.pow(vo, t) - Math.pow((gravidade * t), t) / 2;

      System.out.format("\nVelocidade = %.3f\n", v);
      System.out.format("Altura = %.3f", h);

    } while (gravidade < 1 || gravidade > 9);

  }

  public static double calculaGravidade(int planeta) {
    switch (planeta) {
      case 1:
        return 3.7;
      case 2:
        return 8.8;
      case 3:
        return 9.8;
      case 4:
        return 3.8;
      case 5:
        return 26.4;
      case 6:
        return 11.5;
      case 7:
        return 9.3;
      case 8:
        return 12.2;
      case 9:
        return 0.6;
      default:
        return 0;
    }
  }
}
