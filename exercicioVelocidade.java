import java.util.Scanner;

public class exercicioVelocidade {
  public static void main(String args[]) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Informe a velocidade do veículo: ");
    int velocidadeVeiculo = entrada.nextInt();

    System.out.print("Informe a velocidade máxima permitida: ");
    int velocidadeMaxima = entrada.nextInt();

    velocidadeMaxima = velocidadeMaxima + (velocidadeMaxima / 10);
    if (velocidadeVeiculo > velocidadeMaxima) {
      System.out.println("Multado!");
    } else {
      System.out.println("OK!");
    }
    entrada.close();
  }
}