package estrutura.condicional;

import java.util.Scanner;

public class Exercicio_2 {
  // Faça um programa que receba 3 notas de um aluno,
  // calcule e mostre uma mensagem de acordo com sua
  // média:
  // MÉDIA MENSAGEM

  // >= 0 e < 3 REPROVADO

  // >= 3 e < 7 EXAME

  // >= 7 e <= 10 APROVADO
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    double nota1, nota2, nota3, media;

    do {
      System.out.print("Digite a primeira nota: ");
      nota1 = input.nextDouble();
    } while (nota1 > 10);

    do {
      System.out.print("Digite a segunda nota: ");
      nota2 = input.nextDouble();
    } while (nota2 > 10);

    do {
      System.out.print("Digite a terceira nota: ");
      nota3 = input.nextDouble();
    } while (nota3 > 10);

    media = (nota1 + nota2 + nota3) / 3;

    if (media >= 0 && media < 3) {
      System.out.print("REPROVADO");
    }
    if (media >= 3 && media < 7) {
      System.out.print("EXAME");
    }
    if (media >= 7 && media <= 10) {
      System.out.print("APROVADO");
    }
    input.close();
  }
}
