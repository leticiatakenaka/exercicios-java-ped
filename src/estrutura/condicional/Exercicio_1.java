package estrutura.condicional;

import java.util.Scanner;

public class Exercicio_1 {

  // Faça um programa que receba as duas notas
  // de um aluno, calcule sua média, e que
  // imprima a sua situação:
  // >= 7 -> Aprovado
  // < 7 -> Reprovado
  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner input = new Scanner(System.in);

    double media;

    System.out.print("Digite suas nota 1 :");

    double nota1 = input.nextDouble();

    System.out.print("Digite suas nota 2 :");
    double nota2 = input.nextDouble();

    media = (nota1 + nota2) / 2;

    if (media >= 7) {
      System.out.print("Parabens, voce foi aprovado!");

    }

    if (media < 7) {
      System.out.print("Sinto muito, voce foi reprovado.");
    }

  }

}