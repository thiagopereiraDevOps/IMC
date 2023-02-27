package exercicios;
import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        // variáveis
        double peso,altura,imc;
        // objetos
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");
        System.out.println("Cálculo do IMC");
        // entrada
        System.out.print("Digite o seu peso: ");
        peso = teclado.nextDouble();
        System.out.print("Digite a sua altura: ");
        altura = teclado.nextDouble();
        // processamento
        imc = peso / (altura * altura);
        System.out.println("IMC: " + formatador.format(imc));
        teclado.close();
    }
}