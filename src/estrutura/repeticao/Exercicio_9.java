package estrutura.repeticao;

import java.util.Scanner;

public class Exercicio_9 {
  // 9. Faça um programa que leia 10 números inteiros, e que exiba o maior e o
  // menor número digitados.

  public static void main(String[] args) {
    int numeros = 10;
    int maior = -5000000;
    int menor = 3000000;
    int atual;

    Scanner input = new Scanner(System.in);

    for (int i = 0; i <= numeros; i++) {
      System.out.print("Digite o número: ");
      atual = input.nextInt();
      if (atual >= maior) {
        maior = atual;
      }
      if (atual <= menor) {
        menor = atual;
      }
    }

    System.out.format("\nO maior número é: %s\n", maior);
    System.out.format("O menor número é: %s", menor);
  }
}
