package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 20;
         while (count < 11){
            System.out.println(count);
            count++;
        }
        do {
            System.out.println("Dentro do While");
            count++;
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("Teste " + i);
        }
    }
}
