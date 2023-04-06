package estrutura.sequencial;

import java.util.Scanner;

public class Exercicio_2 {

  public static void main(String[] args) {
    // Faça um programa que receba o ano de nascimento
    // de uma pessoa, o ano atual e imprima:
    // A idade da pessoa no ano atual
    // A idade que a pessoa terá em 2050

    Scanner input = new Scanner(System.in);
    int anoNasc, anoAtual;

    System.out.print("Digite o ano de nascimento: ");
    anoNasc = input.nextInt();

    System.out.print("Digite o ano atual: ");
    anoAtual = input.nextInt();

    System.out.print("Você tem: " + calculaIdade(anoAtual, anoNasc) + " anos\n");
    System.out.print("Em 2050 você terá: " + calculaIdade(2050, anoNasc) + " anos");
    input.close();

  }

  static int calculaIdade(int ano, int nascimento) {
    return ano - nascimento;
  }
}
