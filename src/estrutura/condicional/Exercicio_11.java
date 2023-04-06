package estrutura.condicional;

import java.util.Scanner;

public class Exercicio_11 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int tipoApto, nDiarias;
    double valorDiaria;

    System.out.println("Informe o tipo de apartamento\nDigite\n1 - simples\n2 - duplo");
    tipoApto = input.nextInt();

    System.out.print("\nInforme número de diárias: ");
    nDiarias = input.nextInt();

    valorDiaria = calculaDiaria(tipoApto, nDiarias) * nDiarias;

    input.close();
    System.out.format("\nValor à pagar: R$ %s\n", valorDiaria);

  }

  public static double calculaDiaria(int tipoApto, int nDiarias) {

    double valorDiaria = 0;

    if (tipoApto == 1) {
      if (nDiarias < 10) {
        valorDiaria = 100;
      } else if (nDiarias >= 10 && nDiarias <= 15) {
        valorDiaria = 90;
      } else {
        valorDiaria = 80;
      }

    } else {
      if (nDiarias < 10) {
        valorDiaria = 140;
      } else if (nDiarias >= 10 && nDiarias <= 15) {
        valorDiaria = 120;
      } else {
        valorDiaria = 100;
      }
    }
    return valorDiaria;
  }
}
