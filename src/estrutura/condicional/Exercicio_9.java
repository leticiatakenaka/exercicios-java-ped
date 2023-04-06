package estrutura.condicional;

import java.util.Scanner;

public class Exercicio_9 {
  public static void main(String[] args) {
    // Um determinado hotel cobra R$ 500,00 a
    // diária e mais uma taxa de serviços. Faça um
    // programa que leia o número de diárias e calcule
    // o total a ser pago pelo cliente, sabendo-se que a
    // taxa de serviços é de:
    // R$ 15,00 por dia, se número de diárias < 15
    // R$ 10,00 por dia, se número de diárias = 15
    // R$ 5,00 por dia, se número de diárias > 15

    Scanner input = new Scanner(System.in);

    double taxas, diaria = 500, valor;
    int dias;

    System.out.print("Digite o número de diárias: ");
    dias = input.nextInt();

    taxas = calculaTaxas(dias);

    valor = taxas + diaria;
    System.out.format("O valor a ser pago é: R$ %s", valor);

    input.close();
  }

  public static double calculaTaxas(int dias) {
    if (dias < 15) {
      return 15 * dias;
    } else if (dias > 15) {
      return 5 * dias;
    } else {
      return 10 * 5;
    }
  }

}
