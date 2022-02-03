package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Categoria de Natação");
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        if (idade < 15) {
            System.out.println("Sua categoria é Infantil.");
        } else if (idade < 18) {
            System.out.println("Sua categoria é Juvenil.");
        } else {
            System.out.println("Sua categoria é Adulto.");
        }
        scanner.close();
    }
}
