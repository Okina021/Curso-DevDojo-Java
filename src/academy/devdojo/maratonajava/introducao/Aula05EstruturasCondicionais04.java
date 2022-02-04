package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        // €0 €34,712  - 9,70%
        //€34,713  €68,507 - 37,35%
        //€68,508 - 49,50%
        Scanner scanner = new Scanner(System.in);
        System.out.print("Base de calculo de imposto anual salarial\nDigite seu salário: ");
        double salarioAnual = scanner.nextDouble();
        double impostoMinimo = 9.70/100;
        double impostoMediano = 37.35/100;
        double impostoMaximo = 49.50/100;
        double impostoPagar = 0;

        if (salarioAnual < 34713) {
            impostoPagar = (salarioAnual*impostoMinimo);
            System.out.println("O imposto é de: €" + impostoPagar);
        } else if (salarioAnual < 68508) {
            impostoPagar = (salarioAnual*impostoMediano);
            System.out.println("O imposto é de: €" + impostoPagar);
        } else {
            impostoPagar = (salarioAnual*impostoMaximo);
            System.out.println("O imposto é de: €" + impostoPagar);
        }
    }
}
