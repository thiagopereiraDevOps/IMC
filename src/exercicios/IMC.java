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
         // classificação
        if (imc < 18.5) {
            System.out.println("abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso ideal");
        } else if (imc < 30) {
            System.out.println("Levemente acima do peso");
        } else if (imc < 35) {
            System.out.println("Obesidade grau I");
        } else if (imc < 40) {
            System.out.println("Obesidade grau II (severa)");
        } else {
            System.out.println("Obesidade grau III (mórbida)");
        }
    }
}
