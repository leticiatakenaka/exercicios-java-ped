package estrutura.sequencial;

import java.util.Scanner;

public class Exercicio_6 {
  public static void main(String[] args) {
    // Faça um programa que receba uma
    // temperatura em Celsius, calcule e mostre
    // essa temperatura em Fahrenheit (F = (C*1,8) +
    // 32)

    Scanner input = new Scanner(System.in);
    double celsius, fahrenheit;

    System.out.print("Digite a temporatura em Celsius: ");
    celsius = input.nextDouble();

    fahrenheit = (celsius * 1.8) + 32;

    System.out.println(celsius + "° = " + fahrenheit + "F");
  }
}
