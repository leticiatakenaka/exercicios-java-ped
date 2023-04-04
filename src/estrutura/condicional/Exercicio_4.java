package estrutura.condicional;

import java.util.Scanner;

public class Exercicio_4 {
  public static void main(String[] args) {
    // IMC= PESO/ALTURA^2

    double peso, altura, imc;
    String saudestatus;

    Scanner input = new Scanner(System.in);

    System.out.print("Digite o peso: ");
    peso = input.nextDouble();

    System.out.print("Digite a altura: ");
    altura = input.nextDouble();

    imc = calculaIMC(peso, altura);
    saudestatus = parametrosPeso(imc);

    System.out.format("\nIMC: %.2f\nSaude: %s\n", imc, saudestatus);

    input.close();
  }

  public static double calculaIMC(double p, double a) {
    return p / (Math.pow(a, 2));
  }

  public static String parametrosPeso(double imc) {
    // IMC abaixo de 20 Abaixo do peso
    // IMC de 20 até 25 Peso Normal
    // IMC de 25 até 30 Sobre Peso
    // IMC de 30 até 40 Obeso
    // IMC de 40 e acima Obeso Mórbido
    if (imc < 20) {
      return "Abaixo do peso";
    } else if (imc >= 20 && imc < 25) {
      return "Peso normal";
    } else if (imc >= 25 && imc < 30) {
      return "Sobre peso";
    } else if (imc >= 30 && imc < 40) {
      return "Obeso";
    } else {
      return "Obeso mórbido";
    }
  }
}
