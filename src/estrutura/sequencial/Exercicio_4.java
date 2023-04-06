package estrutura.sequencial;

import java.util.Scanner;

public class Exercicio_4 {
  public static void main(String[] args) {
    // Faça um programa que receba o salário de um
    // funcionário, calcule e mostre o novo salário,
    // sabendo-se que este sofreu um aumento de 25%.

    Scanner input = new Scanner(System.in);
    double salario, novosalario;

    System.out.print("Digite o salário atual: ");
    salario = input.nextDouble();

    novosalario = salario + (salario * 0.25);

    System.out.print("O seu novo salário é " + novosalario);
    input.close();

  }
}
