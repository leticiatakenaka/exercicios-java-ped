package estrutura.sequencial;

import java.util.Scanner;

public class Exercicio_12 {
  public static void main(String[] args) {
    // Faça um programa que calcule e mostre a
    // tabuada de multiplicação de um número
    // digitado pelo usuário

    Scanner input = new Scanner(System.in);
    int numero;

    System.out.print("Digite um número: ");
    numero = input.nextInt();

    calculaTabuada(numero);
    input.close();

  }

  static void calculaTabuada(int n) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(n + " * " + i + " = " + n * i);
    }
  }
}
