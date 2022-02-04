package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o dia de 1 a 7 considerando 1 como domingo para saber se é dia util ou não:");
        byte dia = scanner.nextByte();
        switch (dia) {
            case 1:
                System.out.println("Domingo, não útil");
                break;
            case 2:
                System.out.println("Segunda, dia útil");
                break;
            case 3:
                System.out.println("Terça, dia útil");
                break;
            case 4:
                System.out.println("Quarta, dia útil");
                break;
            case 5:
                System.out.println("Quinta, dia útil");
                break;
            case 6:
                System.out.println("Sexta, dia útil");
                break;
            case 7:
                System.out.println("Sábado, não útil");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
    }
}
