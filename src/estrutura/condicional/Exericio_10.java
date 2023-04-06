package estrutura.condicional;

import java.util.Scanner;

public class Exericio_10 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int idade;
    String sexo;
    double mensalidade;

    System.out.print("Digite a idade: ");
    idade = input.nextInt();

    System.out.print("Digite o sexo: F/M: ");
    sexo = input.next().toUpperCase();

    mensalidade = calculaMensalidade(sexo, idade);
    System.out.format("A mensalidade é: R$ %s", mensalidade);

    input.close();
  }

  public static double calculaMensalidade(String sexo, int idade) {

    double mensalidade = 0;

    if (sexo.equals("F")) {
      if (idade <= 18) {
        System.out.println("idade");
        mensalidade = 60;
      } else if (idade <= 19 && idade <= 25) {
        mensalidade = 90;
      } else if (idade >= 26 && idade <= 40) {
        mensalidade = 85;
      } else {
        mensalidade = 80;
      }

    } else {
      if (idade <= 15) {
        mensalidade = 60;
      } else if (idade >= 16 && idade <= 18) {
        mensalidade = 75;
      } else if (idade >= 19 && idade <= 30) {
        mensalidade = 90;
      } else if (idade >= 31 && idade <= 40) {
        mensalidade = 85;
      } else {
        mensalidade = 80;
      }

    }
    return mensalidade;
  }
}
