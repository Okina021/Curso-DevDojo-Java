package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.next();
        System.out.print("Digite seu endereço: ");
        String endereco = scanner.next();
        System.out.print("Digite seu salario: ");
        scanner.nextLine();
        float salario = scanner.nextFloat();
        System.out.print("Digite a data (dd/mm/aa): ");
        String data = scanner.next();
        System.out.print("Eu " + nome + ", morando no endereço " + endereco + "\nconfirmo que recebi o salário de " + salario + ", no data de " + data + ".");
        System.out.print("\nConfirma o Recebimento? (S/N): ");
        char confirmacao = scanner.next().charAt(0);
        if (confirmacao == 'S' || confirmacao == 's') {
            System.out.println("Salario confirmado");
        } else {
            System.out.println("Salario nao confirmado");

        }
        scanner.close();
    }
}
